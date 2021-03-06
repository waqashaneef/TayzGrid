/*
* Copyright (c) 2015, Alachisoft. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.alachisoft.tayzgrid.socketserver.command;

import com.alachisoft.tayzgrid.caching.OperationContext;
import com.alachisoft.tayzgrid.caching.OperationContextFieldName;
import com.alachisoft.tayzgrid.caching.OperationContextOperationType;

import com.alachisoft.tayzgrid.common.util.ResponseHelper;

import com.alachisoft.tayzgrid.common.protobuf.GetGroupKeysResponseProtocol;
import com.alachisoft.tayzgrid.common.protobuf.ResponseProtocol;
import com.alachisoft.tayzgrid.common.util.CacheKeyUtil;
import com.alachisoft.tayzgrid.common.util.ResponseHelper;
import com.alachisoft.tayzgrid.socketserver.ClientManager;
import com.alachisoft.tayzgrid.socketserver.ICommandExecuter;
import com.alachisoft.tayzgrid.socketserver.TayzGrid;
import com.google.protobuf.ByteString;

import java.util.ArrayList;
public class GetGroupKeys extends GetGroupCommandBase {
	//PROTOBUF
	@Override
	public void ExecuteCommand(ClientManager clientManager, com.alachisoft.tayzgrid.common.protobuf.CommandProtocol.Command command) {
		CommandInfo cmdInfo = new CommandInfo();

		try {
			cmdInfo = super.ParseCommand(command, clientManager).clone();
		} catch (Exception exc) {
			if (!super.immatureId.equals("-2"))
			{
				_serializedResponsePackets.add(ResponseHelper.SerializeExceptionResponse(exc, command.getRequestID()));
			}
			return;
		}

		byte[] data = null;

		try {

			ICommandExecuter tempVar = clientManager.getCmdExecuter();
			TayzGrid nCache = (TayzGrid)((tempVar instanceof TayzGrid) ? tempVar : null);
			OperationContext operationContext = new OperationContext(OperationContextFieldName.OperationType, OperationContextOperationType.CacheOperation);

			if (cmdInfo.CommandVersion < 1) {
				operationContext.Add(OperationContextFieldName.ClientLastViewId, forcedViewId);
			}
			else { 
				operationContext.Add(OperationContextFieldName.ClientLastViewId, cmdInfo.ClientLastViewId);
			}

			operationContext.Add(OperationContextFieldName.ClientLastViewId, cmdInfo.ClientLastViewId);

			java.util.ArrayList keysList = nCache.getCache().GetGroupKeys(cmdInfo.Group, cmdInfo.SubGroup, operationContext);

                        ArrayList<ByteString> byteStringKeys  = new ArrayList<ByteString>();
                        for(Object key : keysList)
                            byteStringKeys.add(CacheKeyUtil.toByteString(key, nCache.getCache().getContext().getSerializationContext()));
                        GetGroupKeysResponseProtocol.GetGroupKeysResponse.Builder getGroupKeysResponse=GetGroupKeysResponseProtocol.GetGroupKeysResponse.newBuilder();
                        getGroupKeysResponse.addAllKeys(byteStringKeys);
                        ResponseProtocol.Response response= ResponseProtocol.Response.newBuilder().setGetGroupKeys(getGroupKeysResponse.build())
                                                                                                  .setRequestId(Long.parseLong(cmdInfo.RequestId))
                                                                                                  .setResponseType(ResponseProtocol.Response.Type.GET_GROUP_KEYS).build();
			_serializedResponsePackets.add(ResponseHelper.SerializeResponse(response));

		} catch (Exception exc) {
			_serializedResponsePackets.add(ResponseHelper.SerializeExceptionResponse(exc, command.getRequestID()));
		}
	}


}
