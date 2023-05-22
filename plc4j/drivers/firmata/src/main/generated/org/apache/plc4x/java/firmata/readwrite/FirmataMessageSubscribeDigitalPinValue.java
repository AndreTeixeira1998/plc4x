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
package org.apache.plc4x.java.firmata.readwrite;

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

public class FirmataMessageSubscribeDigitalPinValue extends FirmataMessage implements Message {

  // Accessors for discriminator values.
  public Byte getMessageType() {
    return (byte) 0xD;
  }

  // Properties.
  protected final byte pin;
  protected final boolean enable;

  public FirmataMessageSubscribeDigitalPinValue(byte pin, boolean enable) {
    super();
    this.pin = pin;
    this.enable = enable;
  }

  public byte getPin() {
    return pin;
  }

  public boolean getEnable() {
    return enable;
  }

  @Override
  protected void serializeFirmataMessageChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("FirmataMessageSubscribeDigitalPinValue");

    // Simple Field (pin)
    writeSimpleField(
        "pin",
        pin,
        writeUnsignedByte(writeBuffer, 4),
        WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    // Reserved Field (reserved)
    writeReservedField(
        "reserved",
        (short) 0x00,
        writeUnsignedShort(writeBuffer, 7),
        WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    // Simple Field (enable)
    writeSimpleField(
        "enable",
        enable,
        writeBoolean(writeBuffer),
        WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    writeBuffer.popContext("FirmataMessageSubscribeDigitalPinValue");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    FirmataMessageSubscribeDigitalPinValue _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (pin)
    lengthInBits += 4;

    // Reserved Field (reserved)
    lengthInBits += 7;

    // Simple field (enable)
    lengthInBits += 1;

    return lengthInBits;
  }

  public static FirmataMessageBuilder staticParseFirmataMessageBuilder(
      ReadBuffer readBuffer, Boolean response) throws ParseException {
    readBuffer.pullContext("FirmataMessageSubscribeDigitalPinValue");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    byte pin =
        readSimpleField(
            "pin", readUnsignedByte(readBuffer, 4), WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    Short reservedField0 =
        readReservedField(
            "reserved",
            readUnsignedShort(readBuffer, 7),
            (short) 0x00,
            WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    boolean enable =
        readSimpleField(
            "enable", readBoolean(readBuffer), WithOption.WithByteOrder(ByteOrder.BIG_ENDIAN));

    readBuffer.closeContext("FirmataMessageSubscribeDigitalPinValue");
    // Create the instance
    return new FirmataMessageSubscribeDigitalPinValueBuilderImpl(pin, enable);
  }

  public static class FirmataMessageSubscribeDigitalPinValueBuilderImpl
      implements FirmataMessage.FirmataMessageBuilder {
    private final byte pin;
    private final boolean enable;

    public FirmataMessageSubscribeDigitalPinValueBuilderImpl(byte pin, boolean enable) {
      this.pin = pin;
      this.enable = enable;
    }

    public FirmataMessageSubscribeDigitalPinValue build() {
      FirmataMessageSubscribeDigitalPinValue firmataMessageSubscribeDigitalPinValue =
          new FirmataMessageSubscribeDigitalPinValue(pin, enable);
      return firmataMessageSubscribeDigitalPinValue;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FirmataMessageSubscribeDigitalPinValue)) {
      return false;
    }
    FirmataMessageSubscribeDigitalPinValue that = (FirmataMessageSubscribeDigitalPinValue) o;
    return (getPin() == that.getPin())
        && (getEnable() == that.getEnable())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getPin(), getEnable());
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
