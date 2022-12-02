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

public class NLMRouterAvailableToNetwork extends NLM implements Message {

  // Accessors for discriminator values.
  public Short getMessageType() {
    return (short) 0x05;
  }

  // Properties.
  protected final List<Integer> destinationNetworkAddresses;

  // Arguments.
  protected final Integer apduLength;

  public NLMRouterAvailableToNetwork(
      List<Integer> destinationNetworkAddresses, Integer apduLength) {
    super(apduLength);
    this.destinationNetworkAddresses = destinationNetworkAddresses;
    this.apduLength = apduLength;
  }

  public List<Integer> getDestinationNetworkAddresses() {
    return destinationNetworkAddresses;
  }

  @Override
  protected void serializeNLMChild(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    int startPos = positionAware.getPos();
    writeBuffer.pushContext("NLMRouterAvailableToNetwork");

    // Array Field (destinationNetworkAddresses)
    writeSimpleTypeArrayField(
        "destinationNetworkAddresses",
        destinationNetworkAddresses,
        writeUnsignedInt(writeBuffer, 16));

    writeBuffer.popContext("NLMRouterAvailableToNetwork");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    NLMRouterAvailableToNetwork _value = this;

    // Array field
    if (destinationNetworkAddresses != null) {
      lengthInBits += 16 * destinationNetworkAddresses.size();
    }

    return lengthInBits;
  }

  public static NLMRouterAvailableToNetworkBuilder staticParseBuilder(
      ReadBuffer readBuffer, Integer apduLength) throws ParseException {
    readBuffer.pullContext("NLMRouterAvailableToNetwork");
    PositionAware positionAware = readBuffer;
    int startPos = positionAware.getPos();
    int curPos;

    List<Integer> destinationNetworkAddresses =
        readLengthArrayField(
            "destinationNetworkAddresses", readUnsignedInt(readBuffer, 16), (apduLength) - (1));

    readBuffer.closeContext("NLMRouterAvailableToNetwork");
    // Create the instance
    return new NLMRouterAvailableToNetworkBuilder(destinationNetworkAddresses, apduLength);
  }

  public static class NLMRouterAvailableToNetworkBuilder implements NLM.NLMBuilder {
    private final List<Integer> destinationNetworkAddresses;
    private final Integer apduLength;

    public NLMRouterAvailableToNetworkBuilder(
        List<Integer> destinationNetworkAddresses, Integer apduLength) {

      this.destinationNetworkAddresses = destinationNetworkAddresses;
      this.apduLength = apduLength;
    }

    public NLMRouterAvailableToNetwork build(Integer apduLength) {

      NLMRouterAvailableToNetwork nLMRouterAvailableToNetwork =
          new NLMRouterAvailableToNetwork(destinationNetworkAddresses, apduLength);
      return nLMRouterAvailableToNetwork;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NLMRouterAvailableToNetwork)) {
      return false;
    }
    NLMRouterAvailableToNetwork that = (NLMRouterAvailableToNetwork) o;
    return (getDestinationNetworkAddresses() == that.getDestinationNetworkAddresses())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getDestinationNetworkAddresses());
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