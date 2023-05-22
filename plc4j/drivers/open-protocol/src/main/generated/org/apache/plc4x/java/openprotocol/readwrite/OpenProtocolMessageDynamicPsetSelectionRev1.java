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
package org.apache.plc4x.java.openprotocol.readwrite;

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

public class OpenProtocolMessageDynamicPsetSelectionRev1
    extends OpenProtocolMessageDynamicPsetSelection implements Message {

  // Accessors for discriminator values.
  public Long getRevision() {
    return (long) 1;
  }

  // Properties.
  protected final long parameterSetId;
  protected final List<VariableDataField> dataFields;

  public OpenProtocolMessageDynamicPsetSelectionRev1(
      Long midRevision,
      Short noAckFlag,
      Integer targetStationId,
      Integer targetSpindleId,
      Integer sequenceNumber,
      Short numberOfMessageParts,
      Short messagePartNumber,
      long parameterSetId,
      List<VariableDataField> dataFields) {
    super(
        midRevision,
        noAckFlag,
        targetStationId,
        targetSpindleId,
        sequenceNumber,
        numberOfMessageParts,
        messagePartNumber);
    this.parameterSetId = parameterSetId;
    this.dataFields = dataFields;
  }

  public long getParameterSetId() {
    return parameterSetId;
  }

  public List<VariableDataField> getDataFields() {
    return dataFields;
  }

  @Override
  protected void serializeOpenProtocolMessageDynamicPsetSelectionChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("OpenProtocolMessageDynamicPsetSelectionRev1");

    // Simple Field (parameterSetId)
    writeSimpleField(
        "parameterSetId",
        parameterSetId,
        writeUnsignedLong(writeBuffer, 24),
        WithOption.WithEncoding("ASCII"));

    // Implicit Field (numberOfParameterDataFields) (Used for parsing, but its value is not stored
    // as it's implicitly given by the objects content)
    long numberOfParameterDataFields = (long) (COUNT(getDataFields()));
    writeImplicitField(
        "numberOfParameterDataFields",
        numberOfParameterDataFields,
        writeUnsignedLong(writeBuffer, 24),
        WithOption.WithEncoding("ASCII"));

    // Array Field (dataFields)
    writeComplexTypeArrayField(
        "dataFields", dataFields, writeBuffer, WithOption.WithEncoding("ASCII"));

    writeBuffer.popContext("OpenProtocolMessageDynamicPsetSelectionRev1");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    OpenProtocolMessageDynamicPsetSelectionRev1 _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (parameterSetId)
    lengthInBits += 24;

    // Implicit Field (numberOfParameterDataFields)
    lengthInBits += 24;

    // Array field
    if (dataFields != null) {
      int i = 0;
      for (VariableDataField element : dataFields) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= dataFields.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    return lengthInBits;
  }

  public static OpenProtocolMessageDynamicPsetSelectionBuilder
      staticParseOpenProtocolMessageDynamicPsetSelectionBuilder(
          ReadBuffer readBuffer, Long revision) throws ParseException {
    readBuffer.pullContext("OpenProtocolMessageDynamicPsetSelectionRev1");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    long parameterSetId =
        readSimpleField(
            "parameterSetId", readUnsignedLong(readBuffer, 24), WithOption.WithEncoding("ASCII"));

    long numberOfParameterDataFields =
        readImplicitField(
            "numberOfParameterDataFields",
            readUnsignedLong(readBuffer, 24),
            WithOption.WithEncoding("ASCII"));

    List<VariableDataField> dataFields =
        readCountArrayField(
            "dataFields",
            new DataReaderComplexDefault<>(
                () -> VariableDataField.staticParse(readBuffer), readBuffer),
            numberOfParameterDataFields,
            WithOption.WithEncoding("ASCII"));

    readBuffer.closeContext("OpenProtocolMessageDynamicPsetSelectionRev1");
    // Create the instance
    return new OpenProtocolMessageDynamicPsetSelectionRev1BuilderImpl(parameterSetId, dataFields);
  }

  public static class OpenProtocolMessageDynamicPsetSelectionRev1BuilderImpl
      implements OpenProtocolMessageDynamicPsetSelection
          .OpenProtocolMessageDynamicPsetSelectionBuilder {
    private final long parameterSetId;
    private final List<VariableDataField> dataFields;

    public OpenProtocolMessageDynamicPsetSelectionRev1BuilderImpl(
        long parameterSetId, List<VariableDataField> dataFields) {
      this.parameterSetId = parameterSetId;
      this.dataFields = dataFields;
    }

    public OpenProtocolMessageDynamicPsetSelectionRev1 build(
        Long midRevision,
        Short noAckFlag,
        Integer targetStationId,
        Integer targetSpindleId,
        Integer sequenceNumber,
        Short numberOfMessageParts,
        Short messagePartNumber) {
      OpenProtocolMessageDynamicPsetSelectionRev1 openProtocolMessageDynamicPsetSelectionRev1 =
          new OpenProtocolMessageDynamicPsetSelectionRev1(
              midRevision,
              noAckFlag,
              targetStationId,
              targetSpindleId,
              sequenceNumber,
              numberOfMessageParts,
              messagePartNumber,
              parameterSetId,
              dataFields);
      return openProtocolMessageDynamicPsetSelectionRev1;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof OpenProtocolMessageDynamicPsetSelectionRev1)) {
      return false;
    }
    OpenProtocolMessageDynamicPsetSelectionRev1 that =
        (OpenProtocolMessageDynamicPsetSelectionRev1) o;
    return (getParameterSetId() == that.getParameterSetId())
        && (getDataFields() == that.getDataFields())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getParameterSetId(), getDataFields());
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
