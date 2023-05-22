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

public class BACnetEventLogRecordLogDatumNotification extends BACnetEventLogRecordLogDatum
    implements Message {

  // Accessors for discriminator values.

  // Properties.
  protected final BACnetOpeningTag innerOpeningTag;
  protected final ConfirmedEventNotificationRequest notification;
  protected final BACnetClosingTag innerClosingTag;

  // Arguments.
  protected final Short tagNumber;

  public BACnetEventLogRecordLogDatumNotification(
      BACnetOpeningTag openingTag,
      BACnetTagHeader peekedTagHeader,
      BACnetClosingTag closingTag,
      BACnetOpeningTag innerOpeningTag,
      ConfirmedEventNotificationRequest notification,
      BACnetClosingTag innerClosingTag,
      Short tagNumber) {
    super(openingTag, peekedTagHeader, closingTag, tagNumber);
    this.innerOpeningTag = innerOpeningTag;
    this.notification = notification;
    this.innerClosingTag = innerClosingTag;
    this.tagNumber = tagNumber;
  }

  public BACnetOpeningTag getInnerOpeningTag() {
    return innerOpeningTag;
  }

  public ConfirmedEventNotificationRequest getNotification() {
    return notification;
  }

  public BACnetClosingTag getInnerClosingTag() {
    return innerClosingTag;
  }

  @Override
  protected void serializeBACnetEventLogRecordLogDatumChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("BACnetEventLogRecordLogDatumNotification");

    // Simple Field (innerOpeningTag)
    writeSimpleField(
        "innerOpeningTag", innerOpeningTag, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (notification)
    writeSimpleField("notification", notification, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (innerClosingTag)
    writeSimpleField(
        "innerClosingTag", innerClosingTag, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("BACnetEventLogRecordLogDatumNotification");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    BACnetEventLogRecordLogDatumNotification _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (innerOpeningTag)
    lengthInBits += innerOpeningTag.getLengthInBits();

    // Simple field (notification)
    lengthInBits += notification.getLengthInBits();

    // Simple field (innerClosingTag)
    lengthInBits += innerClosingTag.getLengthInBits();

    return lengthInBits;
  }

  public static BACnetEventLogRecordLogDatumBuilder staticParseBACnetEventLogRecordLogDatumBuilder(
      ReadBuffer readBuffer, Short tagNumber) throws ParseException {
    readBuffer.pullContext("BACnetEventLogRecordLogDatumNotification");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    BACnetOpeningTag innerOpeningTag =
        readSimpleField(
            "innerOpeningTag",
            new DataReaderComplexDefault<>(
                () -> BACnetOpeningTag.staticParse(readBuffer, (short) (1)), readBuffer));

    ConfirmedEventNotificationRequest notification =
        readSimpleField(
            "notification",
            new DataReaderComplexDefault<>(
                () -> ConfirmedEventNotificationRequest.staticParse(readBuffer), readBuffer));

    BACnetClosingTag innerClosingTag =
        readSimpleField(
            "innerClosingTag",
            new DataReaderComplexDefault<>(
                () -> BACnetClosingTag.staticParse(readBuffer, (short) (tagNumber)), readBuffer));

    readBuffer.closeContext("BACnetEventLogRecordLogDatumNotification");
    // Create the instance
    return new BACnetEventLogRecordLogDatumNotificationBuilderImpl(
        innerOpeningTag, notification, innerClosingTag, tagNumber);
  }

  public static class BACnetEventLogRecordLogDatumNotificationBuilderImpl
      implements BACnetEventLogRecordLogDatum.BACnetEventLogRecordLogDatumBuilder {
    private final BACnetOpeningTag innerOpeningTag;
    private final ConfirmedEventNotificationRequest notification;
    private final BACnetClosingTag innerClosingTag;
    private final Short tagNumber;

    public BACnetEventLogRecordLogDatumNotificationBuilderImpl(
        BACnetOpeningTag innerOpeningTag,
        ConfirmedEventNotificationRequest notification,
        BACnetClosingTag innerClosingTag,
        Short tagNumber) {
      this.innerOpeningTag = innerOpeningTag;
      this.notification = notification;
      this.innerClosingTag = innerClosingTag;
      this.tagNumber = tagNumber;
    }

    public BACnetEventLogRecordLogDatumNotification build(
        BACnetOpeningTag openingTag,
        BACnetTagHeader peekedTagHeader,
        BACnetClosingTag closingTag,
        Short tagNumber) {
      BACnetEventLogRecordLogDatumNotification bACnetEventLogRecordLogDatumNotification =
          new BACnetEventLogRecordLogDatumNotification(
              openingTag,
              peekedTagHeader,
              closingTag,
              innerOpeningTag,
              notification,
              innerClosingTag,
              tagNumber);
      return bACnetEventLogRecordLogDatumNotification;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BACnetEventLogRecordLogDatumNotification)) {
      return false;
    }
    BACnetEventLogRecordLogDatumNotification that = (BACnetEventLogRecordLogDatumNotification) o;
    return (getInnerOpeningTag() == that.getInnerOpeningTag())
        && (getNotification() == that.getNotification())
        && (getInnerClosingTag() == that.getInnerClosingTag())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(), getInnerOpeningTag(), getNotification(), getInnerClosingTag());
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
