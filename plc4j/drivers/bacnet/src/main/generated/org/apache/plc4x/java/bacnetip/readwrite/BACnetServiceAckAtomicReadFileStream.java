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
package org.apache.plc4x.java.bacnetip.readwrite;

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

public class BACnetServiceAckAtomicReadFileStream
    extends BACnetServiceAckAtomicReadFileStreamOrRecord implements Message {

  // Accessors for discriminator values.

  // Properties.
  protected final BACnetApplicationTagSignedInteger fileStartPosition;
  protected final BACnetApplicationTagOctetString fileData;

  public BACnetServiceAckAtomicReadFileStream(
      BACnetTagHeader peekedTagHeader,
      BACnetOpeningTag openingTag,
      BACnetClosingTag closingTag,
      BACnetApplicationTagSignedInteger fileStartPosition,
      BACnetApplicationTagOctetString fileData) {
    super(peekedTagHeader, openingTag, closingTag);
    this.fileStartPosition = fileStartPosition;
    this.fileData = fileData;
  }

  public BACnetApplicationTagSignedInteger getFileStartPosition() {
    return fileStartPosition;
  }

  public BACnetApplicationTagOctetString getFileData() {
    return fileData;
  }

  @Override
  protected void serializeBACnetServiceAckAtomicReadFileStreamOrRecordChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("BACnetServiceAckAtomicReadFileStream");

    // Simple Field (fileStartPosition)
    writeSimpleField(
        "fileStartPosition", fileStartPosition, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (fileData)
    writeSimpleField("fileData", fileData, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("BACnetServiceAckAtomicReadFileStream");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    BACnetServiceAckAtomicReadFileStream _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (fileStartPosition)
    lengthInBits += fileStartPosition.getLengthInBits();

    // Simple field (fileData)
    lengthInBits += fileData.getLengthInBits();

    return lengthInBits;
  }

  public static BACnetServiceAckAtomicReadFileStreamOrRecordBuilder
      staticParseBACnetServiceAckAtomicReadFileStreamOrRecordBuilder(ReadBuffer readBuffer)
          throws ParseException {
    readBuffer.pullContext("BACnetServiceAckAtomicReadFileStream");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    BACnetApplicationTagSignedInteger fileStartPosition =
        readSimpleField(
            "fileStartPosition",
            new DataReaderComplexDefault<>(
                () ->
                    (BACnetApplicationTagSignedInteger)
                        BACnetApplicationTag.staticParse(readBuffer),
                readBuffer));

    BACnetApplicationTagOctetString fileData =
        readSimpleField(
            "fileData",
            new DataReaderComplexDefault<>(
                () ->
                    (BACnetApplicationTagOctetString) BACnetApplicationTag.staticParse(readBuffer),
                readBuffer));

    readBuffer.closeContext("BACnetServiceAckAtomicReadFileStream");
    // Create the instance
    return new BACnetServiceAckAtomicReadFileStreamBuilderImpl(fileStartPosition, fileData);
  }

  public static class BACnetServiceAckAtomicReadFileStreamBuilderImpl
      implements BACnetServiceAckAtomicReadFileStreamOrRecord
          .BACnetServiceAckAtomicReadFileStreamOrRecordBuilder {
    private final BACnetApplicationTagSignedInteger fileStartPosition;
    private final BACnetApplicationTagOctetString fileData;

    public BACnetServiceAckAtomicReadFileStreamBuilderImpl(
        BACnetApplicationTagSignedInteger fileStartPosition,
        BACnetApplicationTagOctetString fileData) {
      this.fileStartPosition = fileStartPosition;
      this.fileData = fileData;
    }

    public BACnetServiceAckAtomicReadFileStream build(
        BACnetTagHeader peekedTagHeader, BACnetOpeningTag openingTag, BACnetClosingTag closingTag) {
      BACnetServiceAckAtomicReadFileStream bACnetServiceAckAtomicReadFileStream =
          new BACnetServiceAckAtomicReadFileStream(
              peekedTagHeader, openingTag, closingTag, fileStartPosition, fileData);
      return bACnetServiceAckAtomicReadFileStream;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BACnetServiceAckAtomicReadFileStream)) {
      return false;
    }
    BACnetServiceAckAtomicReadFileStream that = (BACnetServiceAckAtomicReadFileStream) o;
    return (getFileStartPosition() == that.getFileStartPosition())
        && (getFileData() == that.getFileData())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getFileStartPosition(), getFileData());
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
