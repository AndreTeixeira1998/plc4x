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

public class BACnetServiceAckGetAlarmSummary extends BACnetServiceAck implements Message {

  // Accessors for discriminator values.
  public BACnetConfirmedServiceChoice getServiceChoice() {
    return BACnetConfirmedServiceChoice.GET_ALARM_SUMMARY;
  }

  // Properties.
  protected final BACnetApplicationTagObjectIdentifier objectIdentifier;
  protected final BACnetEventStateTagged eventState;
  protected final BACnetEventTransitionBitsTagged acknowledgedTransitions;

  // Arguments.
  protected final Long serviceAckLength;

  public BACnetServiceAckGetAlarmSummary(
      BACnetApplicationTagObjectIdentifier objectIdentifier,
      BACnetEventStateTagged eventState,
      BACnetEventTransitionBitsTagged acknowledgedTransitions,
      Long serviceAckLength) {
    super(serviceAckLength);
    this.objectIdentifier = objectIdentifier;
    this.eventState = eventState;
    this.acknowledgedTransitions = acknowledgedTransitions;
    this.serviceAckLength = serviceAckLength;
  }

  public BACnetApplicationTagObjectIdentifier getObjectIdentifier() {
    return objectIdentifier;
  }

  public BACnetEventStateTagged getEventState() {
    return eventState;
  }

  public BACnetEventTransitionBitsTagged getAcknowledgedTransitions() {
    return acknowledgedTransitions;
  }

  @Override
  protected void serializeBACnetServiceAckChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("BACnetServiceAckGetAlarmSummary");

    // Simple Field (objectIdentifier)
    writeSimpleField(
        "objectIdentifier", objectIdentifier, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (eventState)
    writeSimpleField("eventState", eventState, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (acknowledgedTransitions)
    writeSimpleField(
        "acknowledgedTransitions",
        acknowledgedTransitions,
        new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("BACnetServiceAckGetAlarmSummary");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    BACnetServiceAckGetAlarmSummary _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (objectIdentifier)
    lengthInBits += objectIdentifier.getLengthInBits();

    // Simple field (eventState)
    lengthInBits += eventState.getLengthInBits();

    // Simple field (acknowledgedTransitions)
    lengthInBits += acknowledgedTransitions.getLengthInBits();

    return lengthInBits;
  }

  public static BACnetServiceAckBuilder staticParseBACnetServiceAckBuilder(
      ReadBuffer readBuffer, Long serviceAckLength) throws ParseException {
    readBuffer.pullContext("BACnetServiceAckGetAlarmSummary");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    BACnetApplicationTagObjectIdentifier objectIdentifier =
        readSimpleField(
            "objectIdentifier",
            new DataReaderComplexDefault<>(
                () ->
                    (BACnetApplicationTagObjectIdentifier)
                        BACnetApplicationTag.staticParse(readBuffer),
                readBuffer));

    BACnetEventStateTagged eventState =
        readSimpleField(
            "eventState",
            new DataReaderComplexDefault<>(
                () ->
                    BACnetEventStateTagged.staticParse(
                        readBuffer, (short) (0), (TagClass) (TagClass.APPLICATION_TAGS)),
                readBuffer));

    BACnetEventTransitionBitsTagged acknowledgedTransitions =
        readSimpleField(
            "acknowledgedTransitions",
            new DataReaderComplexDefault<>(
                () ->
                    BACnetEventTransitionBitsTagged.staticParse(
                        readBuffer, (short) (0), (TagClass) (TagClass.APPLICATION_TAGS)),
                readBuffer));

    readBuffer.closeContext("BACnetServiceAckGetAlarmSummary");
    // Create the instance
    return new BACnetServiceAckGetAlarmSummaryBuilderImpl(
        objectIdentifier, eventState, acknowledgedTransitions, serviceAckLength);
  }

  public static class BACnetServiceAckGetAlarmSummaryBuilderImpl
      implements BACnetServiceAck.BACnetServiceAckBuilder {
    private final BACnetApplicationTagObjectIdentifier objectIdentifier;
    private final BACnetEventStateTagged eventState;
    private final BACnetEventTransitionBitsTagged acknowledgedTransitions;
    private final Long serviceAckLength;

    public BACnetServiceAckGetAlarmSummaryBuilderImpl(
        BACnetApplicationTagObjectIdentifier objectIdentifier,
        BACnetEventStateTagged eventState,
        BACnetEventTransitionBitsTagged acknowledgedTransitions,
        Long serviceAckLength) {
      this.objectIdentifier = objectIdentifier;
      this.eventState = eventState;
      this.acknowledgedTransitions = acknowledgedTransitions;
      this.serviceAckLength = serviceAckLength;
    }

    public BACnetServiceAckGetAlarmSummary build(Long serviceAckLength) {

      BACnetServiceAckGetAlarmSummary bACnetServiceAckGetAlarmSummary =
          new BACnetServiceAckGetAlarmSummary(
              objectIdentifier, eventState, acknowledgedTransitions, serviceAckLength);
      return bACnetServiceAckGetAlarmSummary;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BACnetServiceAckGetAlarmSummary)) {
      return false;
    }
    BACnetServiceAckGetAlarmSummary that = (BACnetServiceAckGetAlarmSummary) o;
    return (getObjectIdentifier() == that.getObjectIdentifier())
        && (getEventState() == that.getEventState())
        && (getAcknowledgedTransitions() == that.getAcknowledgedTransitions())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(), getObjectIdentifier(), getEventState(), getAcknowledgedTransitions());
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
