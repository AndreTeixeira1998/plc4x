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

public class QueryDataDescription extends ExtensionObjectDefinition implements Message {

  // Accessors for discriminator values.
  public String getIdentifier() {
    return (String) "572";
  }

  // Properties.
  protected final ExtensionObjectDefinition relativePath;
  protected final long attributeId;
  protected final PascalString indexRange;

  public QueryDataDescription(
      ExtensionObjectDefinition relativePath, long attributeId, PascalString indexRange) {
    super();
    this.relativePath = relativePath;
    this.attributeId = attributeId;
    this.indexRange = indexRange;
  }

  public ExtensionObjectDefinition getRelativePath() {
    return relativePath;
  }

  public long getAttributeId() {
    return attributeId;
  }

  public PascalString getIndexRange() {
    return indexRange;
  }

  @Override
  protected void serializeExtensionObjectDefinitionChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("QueryDataDescription");

    // Simple Field (relativePath)
    writeSimpleField("relativePath", relativePath, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (attributeId)
    writeSimpleField("attributeId", attributeId, writeUnsignedLong(writeBuffer, 32));

    // Simple Field (indexRange)
    writeSimpleField("indexRange", indexRange, new DataWriterComplexDefault<>(writeBuffer));

    writeBuffer.popContext("QueryDataDescription");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    QueryDataDescription _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (relativePath)
    lengthInBits += relativePath.getLengthInBits();

    // Simple field (attributeId)
    lengthInBits += 32;

    // Simple field (indexRange)
    lengthInBits += indexRange.getLengthInBits();

    return lengthInBits;
  }

  public static ExtensionObjectDefinitionBuilder staticParseExtensionObjectDefinitionBuilder(
      ReadBuffer readBuffer, String identifier) throws ParseException {
    readBuffer.pullContext("QueryDataDescription");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    ExtensionObjectDefinition relativePath =
        readSimpleField(
            "relativePath",
            new DataReaderComplexDefault<>(
                () -> ExtensionObjectDefinition.staticParse(readBuffer, (String) ("542")),
                readBuffer));

    long attributeId = readSimpleField("attributeId", readUnsignedLong(readBuffer, 32));

    PascalString indexRange =
        readSimpleField(
            "indexRange",
            new DataReaderComplexDefault<>(() -> PascalString.staticParse(readBuffer), readBuffer));

    readBuffer.closeContext("QueryDataDescription");
    // Create the instance
    return new QueryDataDescriptionBuilderImpl(relativePath, attributeId, indexRange);
  }

  public static class QueryDataDescriptionBuilderImpl
      implements ExtensionObjectDefinition.ExtensionObjectDefinitionBuilder {
    private final ExtensionObjectDefinition relativePath;
    private final long attributeId;
    private final PascalString indexRange;

    public QueryDataDescriptionBuilderImpl(
        ExtensionObjectDefinition relativePath, long attributeId, PascalString indexRange) {
      this.relativePath = relativePath;
      this.attributeId = attributeId;
      this.indexRange = indexRange;
    }

    public QueryDataDescription build() {
      QueryDataDescription queryDataDescription =
          new QueryDataDescription(relativePath, attributeId, indexRange);
      return queryDataDescription;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryDataDescription)) {
      return false;
    }
    QueryDataDescription that = (QueryDataDescription) o;
    return (getRelativePath() == that.getRelativePath())
        && (getAttributeId() == that.getAttributeId())
        && (getIndexRange() == that.getIndexRange())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getRelativePath(), getAttributeId(), getIndexRange());
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
