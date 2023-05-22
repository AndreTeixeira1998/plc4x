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

public class ModbusPDUReadFileRecordResponseItem implements Message {

  // Properties.
  protected final short referenceType;
  protected final byte[] data;

  public ModbusPDUReadFileRecordResponseItem(short referenceType, byte[] data) {
    super();
    this.referenceType = referenceType;
    this.data = data;
  }

  public short getReferenceType() {
    return referenceType;
  }

  public byte[] getData() {
    return data;
  }

  public void serialize(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("ModbusPDUReadFileRecordResponseItem");

    // Implicit Field (dataLength) (Used for parsing, but its value is not stored as it's implicitly
    // given by the objects content)
    short dataLength = (short) ((COUNT(getData())) + (1));
    writeImplicitField("dataLength", dataLength, writeUnsignedShort(writeBuffer, 8));

    // Simple Field (referenceType)
    writeSimpleField("referenceType", referenceType, writeUnsignedShort(writeBuffer, 8));

    // Array Field (data)
    writeByteArrayField("data", data, writeByteArray(writeBuffer, 8));

    writeBuffer.popContext("ModbusPDUReadFileRecordResponseItem");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = 0;
    ModbusPDUReadFileRecordResponseItem _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Implicit Field (dataLength)
    lengthInBits += 8;

    // Simple field (referenceType)
    lengthInBits += 8;

    // Array field
    if (data != null) {
      lengthInBits += 8 * data.length;
    }

    return lengthInBits;
  }

  public static ModbusPDUReadFileRecordResponseItem staticParse(
      ReadBuffer readBuffer, Object... args) throws ParseException {
    PositionAware positionAware = readBuffer;
    return staticParse(readBuffer);
  }

  public static ModbusPDUReadFileRecordResponseItem staticParse(ReadBuffer readBuffer)
      throws ParseException {
    readBuffer.pullContext("ModbusPDUReadFileRecordResponseItem");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    short dataLength = readImplicitField("dataLength", readUnsignedShort(readBuffer, 8));

    short referenceType = readSimpleField("referenceType", readUnsignedShort(readBuffer, 8));

    byte[] data = readBuffer.readByteArray("data", Math.toIntExact((dataLength) - (1)));

    readBuffer.closeContext("ModbusPDUReadFileRecordResponseItem");
    // Create the instance
    ModbusPDUReadFileRecordResponseItem _modbusPDUReadFileRecordResponseItem;
    _modbusPDUReadFileRecordResponseItem =
        new ModbusPDUReadFileRecordResponseItem(referenceType, data);
    return _modbusPDUReadFileRecordResponseItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModbusPDUReadFileRecordResponseItem)) {
      return false;
    }
    ModbusPDUReadFileRecordResponseItem that = (ModbusPDUReadFileRecordResponseItem) o;
    return (getReferenceType() == that.getReferenceType()) && (getData() == that.getData()) && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getReferenceType(), getData());
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
