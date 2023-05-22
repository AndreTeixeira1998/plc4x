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

public class BACnetAuthenticationPolicyListEntry implements Message {

  // Properties.
  protected final BACnetDeviceObjectReferenceEnclosed credentialDataInput;
  protected final BACnetContextTagUnsignedInteger index;

  public BACnetAuthenticationPolicyListEntry(
      BACnetDeviceObjectReferenceEnclosed credentialDataInput,
      BACnetContextTagUnsignedInteger index) {
    super();
    this.credentialDataInput = credentialDataInput;
    this.index = index;
  }

  public BACnetDeviceObjectReferenceEnclosed getCredentialDataInput() {
    return credentialDataInput;
  }

  public BACnetContextTagUnsignedInteger getIndex() {
    return index;
  }

  public void serialize(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("BACnetAuthenticationPolicyListEntry");

    // Simple Field (credentialDataInput)
    writeSimpleField(
        "credentialDataInput", credentialDataInput, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (index)
    writeSimpleField("index", index, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("BACnetAuthenticationPolicyListEntry");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = 0;
    BACnetAuthenticationPolicyListEntry _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (credentialDataInput)
    lengthInBits += credentialDataInput.getLengthInBits();

    // Simple field (index)
    lengthInBits += index.getLengthInBits();

    return lengthInBits;
  }

  public static BACnetAuthenticationPolicyListEntry staticParse(
      ReadBuffer readBuffer, Object... args) throws ParseException {
    PositionAware positionAware = readBuffer;
    return staticParse(readBuffer);
  }

  public static BACnetAuthenticationPolicyListEntry staticParse(ReadBuffer readBuffer)
      throws ParseException {
    readBuffer.pullContext("BACnetAuthenticationPolicyListEntry");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    BACnetDeviceObjectReferenceEnclosed credentialDataInput =
        readSimpleField(
            "credentialDataInput",
            new DataReaderComplexDefault<>(
                () -> BACnetDeviceObjectReferenceEnclosed.staticParse(readBuffer, (short) (0)),
                readBuffer));

    BACnetContextTagUnsignedInteger index =
        readSimpleField(
            "index",
            new DataReaderComplexDefault<>(
                () ->
                    (BACnetContextTagUnsignedInteger)
                        BACnetContextTag.staticParse(
                            readBuffer,
                            (short) (1),
                            (BACnetDataType) (BACnetDataType.UNSIGNED_INTEGER)),
                readBuffer));

    readBuffer.closeContext("BACnetAuthenticationPolicyListEntry");
    // Create the instance
    BACnetAuthenticationPolicyListEntry _bACnetAuthenticationPolicyListEntry;
    _bACnetAuthenticationPolicyListEntry =
        new BACnetAuthenticationPolicyListEntry(credentialDataInput, index);
    return _bACnetAuthenticationPolicyListEntry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BACnetAuthenticationPolicyListEntry)) {
      return false;
    }
    BACnetAuthenticationPolicyListEntry that = (BACnetAuthenticationPolicyListEntry) o;
    return (getCredentialDataInput() == that.getCredentialDataInput())
        && (getIndex() == that.getIndex())
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCredentialDataInput(), getIndex());
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
