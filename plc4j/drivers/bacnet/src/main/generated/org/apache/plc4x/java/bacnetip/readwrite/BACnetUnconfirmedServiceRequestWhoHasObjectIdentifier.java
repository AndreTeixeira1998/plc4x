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

public class BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier
    extends BACnetUnconfirmedServiceRequestWhoHasObject implements Message {

  // Accessors for discriminator values.

  // Properties.
  protected final BACnetContextTagObjectIdentifier objectIdentifier;

  public BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier(
      BACnetTagHeader peekedTagHeader, BACnetContextTagObjectIdentifier objectIdentifier) {
    super(peekedTagHeader);
    this.objectIdentifier = objectIdentifier;
  }

  public BACnetContextTagObjectIdentifier getObjectIdentifier() {
    return objectIdentifier;
  }

  @Override
  protected void serializeBACnetUnconfirmedServiceRequestWhoHasObjectChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier");

    // Simple Field (objectIdentifier)
    writeSimpleField(
        "objectIdentifier", objectIdentifier, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (objectIdentifier)
    lengthInBits += objectIdentifier.getLengthInBits();

    return lengthInBits;
  }

  public static BACnetUnconfirmedServiceRequestWhoHasObjectBuilder
      staticParseBACnetUnconfirmedServiceRequestWhoHasObjectBuilder(ReadBuffer readBuffer)
          throws ParseException {
    readBuffer.pullContext("BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    BACnetContextTagObjectIdentifier objectIdentifier =
        readSimpleField(
            "objectIdentifier",
            new DataReaderComplexDefault<>(
                () ->
                    (BACnetContextTagObjectIdentifier)
                        BACnetContextTag.staticParse(
                            readBuffer,
                            (short) (2),
                            (BACnetDataType) (BACnetDataType.BACNET_OBJECT_IDENTIFIER)),
                readBuffer));

    readBuffer.closeContext("BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier");
    // Create the instance
    return new BACnetUnconfirmedServiceRequestWhoHasObjectIdentifierBuilderImpl(objectIdentifier);
  }

  public static class BACnetUnconfirmedServiceRequestWhoHasObjectIdentifierBuilderImpl
      implements BACnetUnconfirmedServiceRequestWhoHasObject
          .BACnetUnconfirmedServiceRequestWhoHasObjectBuilder {
    private final BACnetContextTagObjectIdentifier objectIdentifier;

    public BACnetUnconfirmedServiceRequestWhoHasObjectIdentifierBuilderImpl(
        BACnetContextTagObjectIdentifier objectIdentifier) {
      this.objectIdentifier = objectIdentifier;
    }

    public BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier build(
        BACnetTagHeader peekedTagHeader) {
      BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier
          bACnetUnconfirmedServiceRequestWhoHasObjectIdentifier =
              new BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier(
                  peekedTagHeader, objectIdentifier);
      return bACnetUnconfirmedServiceRequestWhoHasObjectIdentifier;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier)) {
      return false;
    }
    BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier that =
        (BACnetUnconfirmedServiceRequestWhoHasObjectIdentifier) o;
    return (getObjectIdentifier() == that.getObjectIdentifier()) && super.equals(that) && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getObjectIdentifier());
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
