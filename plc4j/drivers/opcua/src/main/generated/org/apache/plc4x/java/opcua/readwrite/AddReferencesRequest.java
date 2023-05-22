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
package org.apache.plc4x.java.opcua.readwrite;

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

public class AddReferencesRequest extends ExtensionObjectDefinition implements Message {

  // Accessors for discriminator values.
  public String getIdentifier() {
    return (String) "494";
  }

  // Properties.
  protected final ExtensionObjectDefinition requestHeader;
  protected final int noOfReferencesToAdd;
  protected final List<ExtensionObjectDefinition> referencesToAdd;

  public AddReferencesRequest(
      ExtensionObjectDefinition requestHeader,
      int noOfReferencesToAdd,
      List<ExtensionObjectDefinition> referencesToAdd) {
    super();
    this.requestHeader = requestHeader;
    this.noOfReferencesToAdd = noOfReferencesToAdd;
    this.referencesToAdd = referencesToAdd;
  }

  public ExtensionObjectDefinition getRequestHeader() {
    return requestHeader;
  }

  public int getNoOfReferencesToAdd() {
    return noOfReferencesToAdd;
  }

  public List<ExtensionObjectDefinition> getReferencesToAdd() {
    return referencesToAdd;
  }

  @Override
  protected void serializeExtensionObjectDefinitionChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("AddReferencesRequest");

    // Simple Field (requestHeader)
    writeSimpleField("requestHeader", requestHeader, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (noOfReferencesToAdd)
    writeSimpleField("noOfReferencesToAdd", noOfReferencesToAdd, writeSignedInt(writeBuffer, 32));

    // Array Field (referencesToAdd)
    writeComplexTypeArrayField("referencesToAdd", referencesToAdd, writeBuffer);

    writeBuffer.popContext("AddReferencesRequest");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    AddReferencesRequest _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (requestHeader)
    lengthInBits += requestHeader.getLengthInBits();

    // Simple field (noOfReferencesToAdd)
    lengthInBits += 32;

    // Array field
    if (referencesToAdd != null) {
      int i = 0;
      for (ExtensionObjectDefinition element : referencesToAdd) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= referencesToAdd.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    return lengthInBits;
  }

  public static ExtensionObjectDefinitionBuilder staticParseExtensionObjectDefinitionBuilder(
      ReadBuffer readBuffer, String identifier) throws ParseException {
    readBuffer.pullContext("AddReferencesRequest");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    ExtensionObjectDefinition requestHeader =
        readSimpleField(
            "requestHeader",
            new DataReaderComplexDefault<>(
                () -> ExtensionObjectDefinition.staticParse(readBuffer, (String) ("391")),
                readBuffer));

    int noOfReferencesToAdd = readSimpleField("noOfReferencesToAdd", readSignedInt(readBuffer, 32));

    List<ExtensionObjectDefinition> referencesToAdd =
        readCountArrayField(
            "referencesToAdd",
            new DataReaderComplexDefault<>(
                () -> ExtensionObjectDefinition.staticParse(readBuffer, (String) ("381")),
                readBuffer),
            noOfReferencesToAdd);

    readBuffer.closeContext("AddReferencesRequest");
    // Create the instance
    return new AddReferencesRequestBuilderImpl(requestHeader, noOfReferencesToAdd, referencesToAdd);
  }

  public static class AddReferencesRequestBuilderImpl
      implements ExtensionObjectDefinition.ExtensionObjectDefinitionBuilder {
    private final ExtensionObjectDefinition requestHeader;
    private final int noOfReferencesToAdd;
    private final List<ExtensionObjectDefinition> referencesToAdd;

    public AddReferencesRequestBuilderImpl(
        ExtensionObjectDefinition requestHeader,
        int noOfReferencesToAdd,
        List<ExtensionObjectDefinition> referencesToAdd) {
      this.requestHeader = requestHeader;
      this.noOfReferencesToAdd = noOfReferencesToAdd;
      this.referencesToAdd = referencesToAdd;
    }

    public AddReferencesRequest build() {
      AddReferencesRequest addReferencesRequest =
          new AddReferencesRequest(requestHeader, noOfReferencesToAdd, referencesToAdd);
      return addReferencesRequest;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AddReferencesRequest)) {
      return false;
    }
    AddReferencesRequest that = (AddReferencesRequest) o;
    return (getRequestHeader() == that.getRequestHeader())
        && (getNoOfReferencesToAdd() == that.getNoOfReferencesToAdd())
        && (getReferencesToAdd() == that.getReferencesToAdd())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(), getRequestHeader(), getNoOfReferencesToAdd(), getReferencesToAdd());
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
