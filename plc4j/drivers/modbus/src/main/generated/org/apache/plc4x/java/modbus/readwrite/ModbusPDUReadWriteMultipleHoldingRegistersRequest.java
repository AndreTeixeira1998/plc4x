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

public class ModbusPDUReadWriteMultipleHoldingRegistersRequest extends ModbusPDU
    implements Message {

  // Accessors for discriminator values.
  public Boolean getErrorFlag() {
    return (boolean) false;
  }

  public Short getFunctionFlag() {
    return (short) 0x17;
  }

  public Boolean getResponse() {
    return (boolean) false;
  }

  // Properties.
  protected final int readStartingAddress;
  protected final int readQuantity;
  protected final int writeStartingAddress;
  protected final int writeQuantity;
  protected final byte[] value;

  public ModbusPDUReadWriteMultipleHoldingRegistersRequest(
      int readStartingAddress,
      int readQuantity,
      int writeStartingAddress,
      int writeQuantity,
      byte[] value) {
    super();
    this.readStartingAddress = readStartingAddress;
    this.readQuantity = readQuantity;
    this.writeStartingAddress = writeStartingAddress;
    this.writeQuantity = writeQuantity;
    this.value = value;
  }

  public int getReadStartingAddress() {
    return readStartingAddress;
  }

  public int getReadQuantity() {
    return readQuantity;
  }

  public int getWriteStartingAddress() {
    return writeStartingAddress;
  }

  public int getWriteQuantity() {
    return writeQuantity;
  }

  public byte[] getValue() {
    return value;
  }

  @Override
  protected void serializeModbusPDUChild(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("ModbusPDUReadWriteMultipleHoldingRegistersRequest");

    // Simple Field (readStartingAddress)
    writeSimpleField("readStartingAddress", readStartingAddress, writeUnsignedInt(writeBuffer, 16));

    // Simple Field (readQuantity)
    writeSimpleField("readQuantity", readQuantity, writeUnsignedInt(writeBuffer, 16));

    // Simple Field (writeStartingAddress)
    writeSimpleField(
        "writeStartingAddress", writeStartingAddress, writeUnsignedInt(writeBuffer, 16));

    // Simple Field (writeQuantity)
    writeSimpleField("writeQuantity", writeQuantity, writeUnsignedInt(writeBuffer, 16));

    // Implicit Field (byteCount) (Used for parsing, but its value is not stored as it's implicitly
    // given by the objects content)
    short byteCount = (short) (COUNT(getValue()));
    writeImplicitField("byteCount", byteCount, writeUnsignedShort(writeBuffer, 8));

    // Array Field (value)
    writeByteArrayField("value", value, writeByteArray(writeBuffer, 8));

    writeBuffer.popContext("ModbusPDUReadWriteMultipleHoldingRegistersRequest");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    ModbusPDUReadWriteMultipleHoldingRegistersRequest _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (readStartingAddress)
    lengthInBits += 16;

    // Simple field (readQuantity)
    lengthInBits += 16;

    // Simple field (writeStartingAddress)
    lengthInBits += 16;

    // Simple field (writeQuantity)
    lengthInBits += 16;

    // Implicit Field (byteCount)
    lengthInBits += 8;

    // Array field
    if (value != null) {
      lengthInBits += 8 * value.length;
    }

    return lengthInBits;
  }

  public static ModbusPDUBuilder staticParseModbusPDUBuilder(
      ReadBuffer readBuffer, Boolean response) throws ParseException {
    readBuffer.pullContext("ModbusPDUReadWriteMultipleHoldingRegistersRequest");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    int readStartingAddress =
        readSimpleField("readStartingAddress", readUnsignedInt(readBuffer, 16));

    int readQuantity = readSimpleField("readQuantity", readUnsignedInt(readBuffer, 16));

    int writeStartingAddress =
        readSimpleField("writeStartingAddress", readUnsignedInt(readBuffer, 16));

    int writeQuantity = readSimpleField("writeQuantity", readUnsignedInt(readBuffer, 16));

    short byteCount = readImplicitField("byteCount", readUnsignedShort(readBuffer, 8));

    byte[] value = readBuffer.readByteArray("value", Math.toIntExact(byteCount));

    readBuffer.closeContext("ModbusPDUReadWriteMultipleHoldingRegistersRequest");
    // Create the instance
    return new ModbusPDUReadWriteMultipleHoldingRegistersRequestBuilderImpl(
        readStartingAddress, readQuantity, writeStartingAddress, writeQuantity, value);
  }

  public static class ModbusPDUReadWriteMultipleHoldingRegistersRequestBuilderImpl
      implements ModbusPDU.ModbusPDUBuilder {
    private final int readStartingAddress;
    private final int readQuantity;
    private final int writeStartingAddress;
    private final int writeQuantity;
    private final byte[] value;

    public ModbusPDUReadWriteMultipleHoldingRegistersRequestBuilderImpl(
        int readStartingAddress,
        int readQuantity,
        int writeStartingAddress,
        int writeQuantity,
        byte[] value) {
      this.readStartingAddress = readStartingAddress;
      this.readQuantity = readQuantity;
      this.writeStartingAddress = writeStartingAddress;
      this.writeQuantity = writeQuantity;
      this.value = value;
    }

    public ModbusPDUReadWriteMultipleHoldingRegistersRequest build() {
      ModbusPDUReadWriteMultipleHoldingRegistersRequest
          modbusPDUReadWriteMultipleHoldingRegistersRequest =
              new ModbusPDUReadWriteMultipleHoldingRegistersRequest(
                  readStartingAddress, readQuantity, writeStartingAddress, writeQuantity, value);
      return modbusPDUReadWriteMultipleHoldingRegistersRequest;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModbusPDUReadWriteMultipleHoldingRegistersRequest)) {
      return false;
    }
    ModbusPDUReadWriteMultipleHoldingRegistersRequest that =
        (ModbusPDUReadWriteMultipleHoldingRegistersRequest) o;
    return (getReadStartingAddress() == that.getReadStartingAddress())
        && (getReadQuantity() == that.getReadQuantity())
        && (getWriteStartingAddress() == that.getWriteStartingAddress())
        && (getWriteQuantity() == that.getWriteQuantity())
        && (getValue() == that.getValue())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getReadStartingAddress(),
        getReadQuantity(),
        getWriteStartingAddress(),
        getWriteQuantity(),
        getValue());
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
