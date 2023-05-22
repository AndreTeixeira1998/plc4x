/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.plc4x.java.modbus.readwrite;

import static org.apache.plc4x.java.spi.codegen.fields.FieldReaderFactory.*;
import static org.apache.plc4x.java.spi.codegen.fields.FieldWriterFactory.*;
import static org.apache.plc4x.java.spi.codegen.io.DataReaderFactory.*;
import static org.apache.plc4x.java.spi.codegen.io.DataWriterFactory.*;
import static org.apache.plc4x.java.spi.generation.StaticHelper.*;

import java.time.*;
import java.util.*;
import org.apache.plc4x.java.api.exceptions.*;
import org.apache.plc4x.java.api.value.*;
import org.apache.plc4x.java.spi.codegen.*;
import org.apache.plc4x.java.spi.codegen.fields.*;
import org.apache.plc4x.java.spi.codegen.io.*;
import org.apache.plc4x.java.spi.generation.*;

// Code generated by code-generation. DO NOT EDIT.

public class ModbusDeviceInformationObject implements Message {

  // Properties.
  protected final short objectId;
  protected final byte[] data;

  public ModbusDeviceInformationObject(short objectId, byte[] data) {
    super();
    this.objectId = objectId;
    this.data = data;
  }

  public short getObjectId() {
    return objectId;
  }

  public byte[] getData() {
    return data;
  }

  public void serialize(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("ModbusDeviceInformationObject");

    // Simple Field (objectId)
    writeSimpleField("objectId", objectId, writeUnsignedShort(writeBuffer, 8));

    // Implicit Field (objectLength) (Used for parsing, but its value is not stored as it's
    // implicitly given by the objects content)
    short objectLength = (short) (COUNT(getData()));
    writeImplicitField("objectLength", objectLength, writeUnsignedShort(writeBuffer, 8));

    // Array Field (data)
    writeByteArrayField("data", data, writeByteArray(writeBuffer, 8));

    writeBuffer.popContext("ModbusDeviceInformationObject");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = 0;
    ModbusDeviceInformationObject _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (objectId)
    lengthInBits += 8;

    // Implicit Field (objectLength)
    lengthInBits += 8;

    // Array field
    if (data != null) {
      lengthInBits += 8 * data.length;
    }

    return lengthInBits;
  }

  public static ModbusDeviceInformationObject staticParse(ReadBuffer readBuffer, Object... args)
      throws ParseException {
    PositionAware positionAware = readBuffer;
    return staticParse(readBuffer);
  }

  public static ModbusDeviceInformationObject staticParse(ReadBuffer readBuffer)
      throws ParseException {
    readBuffer.pullContext("ModbusDeviceInformationObject");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    short objectId = readSimpleField("objectId", readUnsignedShort(readBuffer, 8));

    short objectLength = readImplicitField("objectLength", readUnsignedShort(readBuffer, 8));

    byte[] data = readBuffer.readByteArray("data", Math.toIntExact(objectLength));

    readBuffer.closeContext("ModbusDeviceInformationObject");
    // Create the instance
    ModbusDeviceInformationObject _modbusDeviceInformationObject;
    _modbusDeviceInformationObject = new ModbusDeviceInformationObject(objectId, data);
    return _modbusDeviceInformationObject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModbusDeviceInformationObject)) {
      return false;
    }
    ModbusDeviceInformationObject that = (ModbusDeviceInformationObject) o;
    return (getObjectId() == that.getObjectId()) && (getData() == that.getData()) && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getObjectId(), getData());
  }

  @Override
  public String toString() {
    WriteBufferBoxBased writeBufferBoxBased = new WriteBufferBoxBased(true, true);
    try {
      writeBufferBoxBased.writeSerializable(this);
    } catch (SerializationException e) {
      throw new RuntimeException(e);
    }
    return "\n" + writeBufferBoxBased.getBox().toString() + "\n";
  }
}
