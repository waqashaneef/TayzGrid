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

package com.alachisoft.tayzgrid.common.datastructures;

/** 
 Enumeration that defines the status of the bucket.
*/
public class BucketStatus {
	/**  The bucket is yet to be state transferred from the source node. 
	*/
	public static final byte NeedTransfer = 1;

	/**  The bucket is being transfered from the source node to some target node.
	*/
	public static final byte UnderStateTxfr = 2;

	/**  The bucket is fully functional. 
	*/
	public static final byte Functional = 4;

	public static String StatusToString(byte status) {
		String toString = null;
		switch (status) {
			case NeedTransfer:
				toString = "NeedTransfer";
				break;

			case UnderStateTxfr:
				toString = "UnderStateTxfr";
				break;

			case Functional:
				toString = "Functional";
				break;

			default:
				toString = "UNDEFINED";
				break;
		}
		return toString;
	}
}
