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

public class AddReferencesItem extends ExtensionObjectDefinition implements Message {

  // Accessors for discriminator values.
  public String getIdentifier() {
    return (String) "381";
  }

  // Properties.
  protected final NodeId sourceNodeId;
  protected final NodeId referenceTypeId;
  protected final boolean isForward;
  protected final PascalString targetServerUri;
  protected final ExpandedNodeId targetNodeId;
  protected final NodeClass targetNodeClass;

  public AddReferencesItem(
      NodeId sourceNodeId,
      NodeId referenceTypeId,
      boolean isForward,
      PascalString targetServerUri,
      ExpandedNodeId targetNodeId,
      NodeClass targetNodeClass) {
    super();
    this.sourceNodeId = sourceNodeId;
    this.referenceTypeId = referenceTypeId;
    this.isForward = isForward;
    this.targetServerUri = targetServerUri;
    this.targetNodeId = targetNodeId;
    this.targetNodeClass = targetNodeClass;
  }

  public NodeId getSourceNodeId() {
    return sourceNodeId;
  }

  public NodeId getReferenceTypeId() {
    return referenceTypeId;
  }

  public boolean getIsForward() {
    return isForward;
  }

  public PascalString getTargetServerUri() {
    return targetServerUri;
  }

  public ExpandedNodeId getTargetNodeId() {
    return targetNodeId;
  }

  public NodeClass getTargetNodeClass() {
    return targetNodeClass;
  }

  @Override
  protected void serializeExtensionObjectDefinitionChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("AddReferencesItem");

    // Simple Field (sourceNodeId)
    writeSimpleField("sourceNodeId", sourceNodeId, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (referenceTypeId)
    writeSimpleField(
        "referenceTypeId", referenceTypeId, new DataWriterComplexDefault<>(writeBuffer));

    // Reserved Field (reserved)
    writeReservedField("reserved", (short) 0x00, writeUnsignedShort(writeBuffer, 7));

    // Simple Field (isForward)
    writeSimpleField("isForward", isForward, writeBoolean(writeBuffer));

    // Simple Field (targetServerUri)
    writeSimpleField(
        "targetServerUri", targetServerUri, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (targetNodeId)
    writeSimpleField("targetNodeId", targetNodeId, new DataWriterComplexDefault<>(writeBuffer));

    // Simple Field (targetNodeClass)
    writeSimpleEnumField(
        "targetNodeClass",
        "NodeClass",
        targetNodeClass,
        new DataWriterEnumDefault<>(
            NodeClass::getValue, NodeClass::name, writeUnsignedLong(writeBuffer, 32)));

    writeBuffer.popContext("AddReferencesItem");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    AddReferencesItem _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (sourceNodeId)
    lengthInBits += sourceNodeId.getLengthInBits();

    // Simple field (referenceTypeId)
    lengthInBits += referenceTypeId.getLengthInBits();

    // Reserved Field (reserved)
    lengthInBits += 7;

    // Simple field (isForward)
    lengthInBits += 1;

    // Simple field (targetServerUri)
    lengthInBits += targetServerUri.getLengthInBits();

    // Simple field (targetNodeId)
    lengthInBits += targetNodeId.getLengthInBits();

    // Simple field (targetNodeClass)
    lengthInBits += 32;

    return lengthInBits;
  }

  public static ExtensionObjectDefinitionBuilder staticParseExtensionObjectDefinitionBuilder(
      ReadBuffer readBuffer, String identifier) throws ParseException {
    readBuffer.pullContext("AddReferencesItem");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    NodeId sourceNodeId =
        readSimpleField(
            "sourceNodeId",
            new DataReaderComplexDefault<>(() -> NodeId.staticParse(readBuffer), readBuffer));

    NodeId referenceTypeId =
        readSimpleField(
            "referenceTypeId",
            new DataReaderComplexDefault<>(() -> NodeId.staticParse(readBuffer), readBuffer));

    Short reservedField0 =
        readReservedField("reserved", readUnsignedShort(readBuffer, 7), (short) 0x00);

    boolean isForward = readSimpleField("isForward", readBoolean(readBuffer));

    PascalString targetServerUri =
        readSimpleField(
            "targetServerUri",
            new DataReaderComplexDefault<>(() -> PascalString.staticParse(readBuffer), readBuffer));

    ExpandedNodeId targetNodeId =
        readSimpleField(
            "targetNodeId",
            new DataReaderComplexDefault<>(
                () -> ExpandedNodeId.staticParse(readBuffer), readBuffer));

    NodeClass targetNodeClass =
        readEnumField(
            "targetNodeClass",
            "NodeClass",
            new DataReaderEnumDefault<>(NodeClass::enumForValue, readUnsignedLong(readBuffer, 32)));

    readBuffer.closeContext("AddReferencesItem");
    // Create the instance
    return new AddReferencesItemBuilderImpl(
        sourceNodeId, referenceTypeId, isForward, targetServerUri, targetNodeId, targetNodeClass);
  }

  public static class AddReferencesItemBuilderImpl
      implements ExtensionObjectDefinition.ExtensionObjectDefinitionBuilder {
    private final NodeId sourceNodeId;
    private final NodeId referenceTypeId;
    private final boolean isForward;
    private final PascalString targetServerUri;
    private final ExpandedNodeId targetNodeId;
    private final NodeClass targetNodeClass;

    public AddReferencesItemBuilderImpl(
        NodeId sourceNodeId,
        NodeId referenceTypeId,
        boolean isForward,
        PascalString targetServerUri,
        ExpandedNodeId targetNodeId,
        NodeClass targetNodeClass) {
      this.sourceNodeId = sourceNodeId;
      this.referenceTypeId = referenceTypeId;
      this.isForward = isForward;
      this.targetServerUri = targetServerUri;
      this.targetNodeId = targetNodeId;
      this.targetNodeClass = targetNodeClass;
    }

    public AddReferencesItem build() {
      AddReferencesItem addReferencesItem =
          new AddReferencesItem(
              sourceNodeId,
              referenceTypeId,
              isForward,
              targetServerUri,
              targetNodeId,
              targetNodeClass);
      return addReferencesItem;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AddReferencesItem)) {
      return false;
    }
    AddReferencesItem that = (AddReferencesItem) o;
    return (getSourceNodeId() == that.getSourceNodeId())
        && (getReferenceTypeId() == that.getReferenceTypeId())
        && (getIsForward() == that.getIsForward())
        && (getTargetServerUri() == that.getTargetServerUri())
        && (getTargetNodeId() == that.getTargetNodeId())
        && (getTargetNodeClass() == that.getTargetNodeClass())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getSourceNodeId(),
        getReferenceTypeId(),
        getIsForward(),
        getTargetServerUri(),
        getTargetNodeId(),
        getTargetNodeClass());
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
