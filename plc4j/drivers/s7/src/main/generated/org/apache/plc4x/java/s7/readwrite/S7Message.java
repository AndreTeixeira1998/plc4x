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
package org.apache.plc4x.java.s7.readwrite;

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

public abstract class S7Message implements Message {

  // Abstract accessors for discriminator values.
  public abstract Short getMessageType();

  // Constant values.
  public static final Short PROTOCOLID = 0x32;

  // Properties.
  protected final int tpduReference;
  protected final S7Parameter parameter;
  protected final S7Payload payload;
  // Reserved Fields
  private Integer reservedField0;

  public S7Message(int tpduReference, S7Parameter parameter, S7Payload payload) {
    super();
    this.tpduReference = tpduReference;
    this.parameter = parameter;
    this.payload = payload;
  }

  public int getTpduReference() {
    return tpduReference;
  }

  public S7Parameter getParameter() {
    return parameter;
  }

  public S7Payload getPayload() {
    return payload;
  }

  public short getProtocolId() {
    return PROTOCOLID;
  }

  protected abstract void serializeS7MessageChild(WriteBuffer writeBuffer)
      throws SerializationException;

  public void serialize(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    int startPos = positionAware.getPos();
    writeBuffer.pushContext("S7Message");

    // Const Field (protocolId)
    writeConstField("protocolId", PROTOCOLID, writeUnsignedShort(writeBuffer, 8));

    // Discriminator Field (messageType) (Used as input to a switch field)
    writeDiscriminatorField("messageType", getMessageType(), writeUnsignedShort(writeBuffer, 8));

    // Reserved Field (reserved)
    writeReservedField(
        "reserved",
        reservedField0 != null ? reservedField0 : (int) 0x0000,
        writeUnsignedInt(writeBuffer, 16));

    // Simple Field (tpduReference)
    writeSimpleField("tpduReference", tpduReference, writeUnsignedInt(writeBuffer, 16));

    // Implicit Field (parameterLength) (Used for parsing, but its value is not stored as it's
    // implicitly given by the objects content)
    int parameterLength =
        (int) ((((getParameter()) != (null)) ? getParameter().getLengthInBytes() : 0));
    writeImplicitField("parameterLength", parameterLength, writeUnsignedInt(writeBuffer, 16));

    // Implicit Field (payloadLength) (Used for parsing, but its value is not stored as it's
    // implicitly given by the objects content)
    int payloadLength = (int) ((((getPayload()) != (null)) ? getPayload().getLengthInBytes() : 0));
    writeImplicitField("payloadLength", payloadLength, writeUnsignedInt(writeBuffer, 16));

    // Switch field (Serialize the sub-type)
    serializeS7MessageChild(writeBuffer);

    // Optional Field (parameter) (Can be skipped, if the value is null)
    writeOptionalField(
        "parameter",
        parameter,
        new DataWriterComplexDefault<>(writeBuffer),
        ((((getParameter()) != (null)) ? getParameter().getLengthInBytes() : 0)) > (0));

    // Optional Field (payload) (Can be skipped, if the value is null)
    writeOptionalField(
        "payload",
        payload,
        new DataWriterComplexDefault<>(writeBuffer),
        ((((getPayload()) != (null)) ? getPayload().getLengthInBytes() : 0)) > (0));

    writeBuffer.popContext("S7Message");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = 0;
    S7Message _value = this;

    // Const Field (protocolId)
    lengthInBits += 8;

    // Discriminator Field (messageType)
    lengthInBits += 8;

    // Reserved Field (reserved)
    lengthInBits += 16;

    // Simple field (tpduReference)
    lengthInBits += 16;

    // Implicit Field (parameterLength)
    lengthInBits += 16;

    // Implicit Field (payloadLength)
    lengthInBits += 16;

    // Length of sub-type elements will be added by sub-type...

    // Optional Field (parameter)
    if (parameter != null) {
      lengthInBits += parameter.getLengthInBits();
    }

    // Optional Field (payload)
    if (payload != null) {
      lengthInBits += payload.getLengthInBits();
    }

    return lengthInBits;
  }

  public static S7Message staticParse(ReadBuffer readBuffer, Object... args) throws ParseException {
    PositionAware positionAware = readBuffer;
    return staticParse(readBuffer);
  }

  public static S7Message staticParse(ReadBuffer readBuffer) throws ParseException {
    readBuffer.pullContext("S7Message");
    PositionAware positionAware = readBuffer;
    int startPos = positionAware.getPos();
    int curPos;

    short protocolId =
        readConstField("protocolId", readUnsignedShort(readBuffer, 8), S7Message.PROTOCOLID);

    short messageType = readDiscriminatorField("messageType", readUnsignedShort(readBuffer, 8));

    Integer reservedField0 =
        readReservedField("reserved", readUnsignedInt(readBuffer, 16), (int) 0x0000);

    int tpduReference = readSimpleField("tpduReference", readUnsignedInt(readBuffer, 16));

    int parameterLength = readImplicitField("parameterLength", readUnsignedInt(readBuffer, 16));

    int payloadLength = readImplicitField("payloadLength", readUnsignedInt(readBuffer, 16));

    // Switch Field (Depending on the discriminator values, passes the instantiation to a sub-type)
    S7MessageBuilder builder = null;
    if (EvaluationHelper.equals(messageType, (short) 0x01)) {
      builder = S7MessageRequest.staticParseBuilder(readBuffer);
    } else if (EvaluationHelper.equals(messageType, (short) 0x02)) {
      builder = S7MessageResponse.staticParseBuilder(readBuffer);
    } else if (EvaluationHelper.equals(messageType, (short) 0x03)) {
      builder = S7MessageResponseData.staticParseBuilder(readBuffer);
    } else if (EvaluationHelper.equals(messageType, (short) 0x07)) {
      builder = S7MessageUserData.staticParseBuilder(readBuffer);
    }
    if (builder == null) {
      throw new ParseException(
          "Unsupported case for discriminated type"
              + " parameters ["
              + "messageType="
              + messageType
              + "]");
    }

    S7Parameter parameter =
        readOptionalField(
            "parameter",
            new DataReaderComplexDefault<>(
                () -> S7Parameter.staticParse(readBuffer, (short) (messageType)), readBuffer),
            (parameterLength) > (0));

    S7Payload payload =
        readOptionalField(
            "payload",
            new DataReaderComplexDefault<>(
                () ->
                    S7Payload.staticParse(
                        readBuffer, (short) (messageType), (S7Parameter) (parameter)),
                readBuffer),
            (payloadLength) > (0));

    readBuffer.closeContext("S7Message");
    // Create the instance
    S7Message _s7Message = builder.build(tpduReference, parameter, payload);
    _s7Message.reservedField0 = reservedField0;
    return _s7Message;
  }

  public static interface S7MessageBuilder {
    S7Message build(int tpduReference, S7Parameter parameter, S7Payload payload);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof S7Message)) {
      return false;
    }
    S7Message that = (S7Message) o;
    return (getTpduReference() == that.getTpduReference())
        && (getParameter() == that.getParameter())
        && (getPayload() == that.getPayload())
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTpduReference(), getParameter(), getPayload());
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