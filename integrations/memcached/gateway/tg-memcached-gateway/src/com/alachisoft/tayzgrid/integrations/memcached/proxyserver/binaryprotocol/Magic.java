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

package com.alachisoft.tayzgrid.integrations.memcached.proxyserver.binaryprotocol;

public enum Magic 
{
	Request((byte)0x80),
	Response((byte)0x81);

	private byte intValue;
	private static java.util.HashMap<Byte, Magic> mappings;
	private static java.util.HashMap<Byte, Magic> getMappings()
	{
		if (mappings == null)
		{
			synchronized (Magic.class)
			{
				if (mappings == null)
				{
					mappings = new java.util.HashMap<Byte, Magic>();
				}
			}
		}
		return mappings;
	}

	private Magic(byte value)
	{
		intValue = value;
		Magic.getMappings().put(value, this);
	}

	public byte getValue()
	{
		return intValue;
	}

	public static Magic forValue(byte value)
	{
		return getMappings().get(value);
	}
}