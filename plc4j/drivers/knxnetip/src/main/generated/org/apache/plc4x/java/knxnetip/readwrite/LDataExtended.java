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
package org.apache.plc4x.java.knxnetip.readwrite;

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

public class LDataExtended extends LDataFrame implements Message {

  // Accessors for discriminator values.
  public Boolean getNotAckFrame() {
    return (boolean) true;
  }

  public Boolean getPolling() {
    return (boolean) false;
  }

  // Properties.
  protected final boolean groupAddress;
  protected final byte hopCount;
  protected final byte extendedFrameFormat;
  protected final KnxAddress sourceAddress;
  protected final byte[] destinationAddress;
  protected final Apdu apdu;

  public LDataExtended(
      boolean frameType,
      boolean notRepeated,
      CEMIPriority priority,
      boolean acknowledgeRequested,
      boolean errorFlag,
      boolean groupAddress,
      byte hopCount,
      byte extendedFrameFormat,
      KnxAddress sourceAddress,
      byte[] destinationAddress,
      Apdu apdu) {
    super(frameType, notRepeated, priority, acknowledgeRequested, errorFlag);
    this.groupAddress = groupAddress;
    this.hopCount = hopCount;
    this.extendedFrameFormat = extendedFrameFormat;
    this.sourceAddress = sourceAddress;
    this.destinationAddress = destinationAddress;
    this.apdu = apdu;
  }

  public boolean getGroupAddress() {
    return groupAddress;
  }

  public byte getHopCount() {
    return hopCount;
  }

  public byte getExtendedFrameFormat() {
    return extendedFrameFormat;
  }

  public KnxAddress getSourceAddress() {
    return sourceAddress;
  }

  public byte[] getDestinationAddress() {
    return destinationAddress;
  }

  public Apdu getApdu() {
    return apdu;
  }

  @Override
  protected void serializeLDataFrameChild(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("LDataExtended");

    // Simple Field (groupAddress)
    writeSimpleField("groupAddress", groupAddress, writeBoolean(writeBuffer));

    // Simple Field (hopCount)
    writeSimpleField("hopCount", hopCount, writeUnsignedByte(writeBuffer, 3));

    // Simple Field (extendedFrameFormat)
    writeSimpleField("extendedFrameFormat", extendedFrameFormat, writeUnsignedByte(writeBuffer, 4));

    // Simple Field (sourceAddress)
    writeSimpleField("sourceAddress", sourceAddress, new DataWriterComplexDefault<>(writeBuffer));

    // Array Field (destinationAddress)
    writeByteArrayField("destinationAddress", destinationAddress, writeByteArray(writeBuffer, 8));

    // Implicit Field (dataLength) (Used for parsing, but its value is not stored as it's implicitly
    // given by the objects content)
    short dataLength = (short) ((getApdu().getLengthInBytes()) - (1));
    writeImplicitField("dataLength", dataLength, writeUnsignedShort(writeBuffer, 8));

    // Simple Field (apdu)
    writeSimpleField("apdu", apdu, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("LDataExtended");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    LDataExtended _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (groupAddress)
    lengthInBits += 1;

    // Simple field (hopCount)
    lengthInBits += 3;

    // Simple field (extendedFrameFormat)
    lengthInBits += 4;

    // Simple field (sourceAddress)
    lengthInBits += sourceAddress.getLengthInBits();

    // Array field
    if (destinationAddress != null) {
      lengthInBits += 8 * destinationAddress.length;
    }

    // Implicit Field (dataLength)
    lengthInBits += 8;

    // Simple field (apdu)
    lengthInBits += apdu.getLengthInBits();

    return lengthInBits;
  }

  public static LDataFrameBuilder staticParseLDataFrameBuilder(ReadBuffer readBuffer)
      throws ParseException {
    readBuffer.pullContext("LDataExtended");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    boolean groupAddress = readSimpleField("groupAddress", readBoolean(readBuffer));

    byte hopCount = readSimpleField("hopCount", readUnsignedByte(readBuffer, 3));

    byte extendedFrameFormat =
        readSimpleField("extendedFrameFormat", readUnsignedByte(readBuffer, 4));

    KnxAddress sourceAddress =
        readSimpleField(
            "sourceAddress",
            new DataReaderComplexDefault<>(() -> KnxAddress.staticParse(readBuffer), readBuffer));

    byte[] destinationAddress = readBuffer.readByteArray("destinationAddress", Math.toIntExact(2));

    short dataLength = readImplicitField("dataLength", readUnsignedShort(readBuffer, 8));

    Apdu apdu =
        readSimpleField(
            "apdu",
            new DataReaderComplexDefault<>(
                () -> Apdu.staticParse(readBuffer, (short) (dataLength)), readBuffer));

    readBuffer.closeContext("LDataExtended");
    // Create the instance
    return new LDataExtendedBuilderImpl(
        groupAddress, hopCount, extendedFrameFormat, sourceAddress, destinationAddress, apdu);
  }

  public static class LDataExtendedBuilderImpl implements LDataFrame.LDataFrameBuilder {
    private final boolean groupAddress;
    private final byte hopCount;
    private final byte extendedFrameFormat;
    private final KnxAddress sourceAddress;
    private final byte[] destinationAddress;
    private final Apdu apdu;

    public LDataExtendedBuilderImpl(
        boolean groupAddress,
        byte hopCount,
        byte extendedFrameFormat,
        KnxAddress sourceAddress,
        byte[] destinationAddress,
        Apdu apdu) {
      this.groupAddress = groupAddress;
      this.hopCount = hopCount;
      this.extendedFrameFormat = extendedFrameFormat;
      this.sourceAddress = sourceAddress;
      this.destinationAddress = destinationAddress;
      this.apdu = apdu;
    }

    public LDataExtended build(
        boolean frameType,
        boolean notRepeated,
        CEMIPriority priority,
        boolean acknowledgeRequested,
        boolean errorFlag) {
      LDataExtended lDataExtended =
          new LDataExtended(
              frameType,
              notRepeated,
              priority,
              acknowledgeRequested,
              errorFlag,
              groupAddress,
              hopCount,
              extendedFrameFormat,
              sourceAddress,
              destinationAddress,
              apdu);
      return lDataExtended;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof LDataExtended)) {
      return false;
    }
    LDataExtended that = (LDataExtended) o;
    return (getGroupAddress() == that.getGroupAddress())
        && (getHopCount() == that.getHopCount())
        && (getExtendedFrameFormat() == that.getExtendedFrameFormat())
        && (getSourceAddress() == that.getSourceAddress())
        && (getDestinationAddress() == that.getDestinationAddress())
        && (getApdu() == that.getApdu())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getGroupAddress(),
        getHopCount(),
        getExtendedFrameFormat(),
        getSourceAddress(),
        getDestinationAddress(),
        getApdu());
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
