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
package org.apache.plc4x.java.modbus.readwrite;

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

public class ModbusPDUReadDeviceIdentificationResponse extends ModbusPDU implements Message {

  // Accessors for discriminator values.
  public Boolean getErrorFlag() {
    return (boolean) false;
  }

  public Short getFunctionFlag() {
    return (short) 0x2B;
  }

  public Boolean getResponse() {
    return (boolean) true;
  }

  // Constant values.
  public static final Short MEITYPE = 0x0E;

  // Properties.
  protected final ModbusDeviceInformationLevel level;
  protected final boolean individualAccess;
  protected final ModbusDeviceInformationConformityLevel conformityLevel;
  protected final ModbusDeviceInformationMoreFollows moreFollows;
  protected final short nextObjectId;
  protected final List<ModbusDeviceInformationObject> objects;

  public ModbusPDUReadDeviceIdentificationResponse(
      ModbusDeviceInformationLevel level,
      boolean individualAccess,
      ModbusDeviceInformationConformityLevel conformityLevel,
      ModbusDeviceInformationMoreFollows moreFollows,
      short nextObjectId,
      List<ModbusDeviceInformationObject> objects) {
    super();
    this.level = level;
    this.individualAccess = individualAccess;
    this.conformityLevel = conformityLevel;
    this.moreFollows = moreFollows;
    this.nextObjectId = nextObjectId;
    this.objects = objects;
  }

  public ModbusDeviceInformationLevel getLevel() {
    return level;
  }

  public boolean getIndividualAccess() {
    return individualAccess;
  }

  public ModbusDeviceInformationConformityLevel getConformityLevel() {
    return conformityLevel;
  }

  public ModbusDeviceInformationMoreFollows getMoreFollows() {
    return moreFollows;
  }

  public short getNextObjectId() {
    return nextObjectId;
  }

  public List<ModbusDeviceInformationObject> getObjects() {
    return objects;
  }

  public short getMeiType() {
    return MEITYPE;
  }

  @Override
  protected void serializeModbusPDUChild(WriteBuffer writeBuffer) throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("ModbusPDUReadDeviceIdentificationResponse");

    // Const Field (meiType)
    writeConstField("meiType", MEITYPE, writeUnsignedShort(writeBuffer, 8));

    // Simple Field (level)
    writeSimpleEnumField(
        "level",
        "ModbusDeviceInformationLevel",
        level,
        new DataWriterEnumDefault<>(
            ModbusDeviceInformationLevel::getValue,
            ModbusDeviceInformationLevel::name,
            writeUnsignedShort(writeBuffer, 8)));

    // Simple Field (individualAccess)
    writeSimpleField("individualAccess", individualAccess, writeBoolean(writeBuffer));

    // Simple Field (conformityLevel)
    writeSimpleEnumField(
        "conformityLevel",
        "ModbusDeviceInformationConformityLevel",
        conformityLevel,
        new DataWriterEnumDefault<>(
            ModbusDeviceInformationConformityLevel::getValue,
            ModbusDeviceInformationConformityLevel::name,
            writeUnsignedShort(writeBuffer, 7)));

    // Simple Field (moreFollows)
    writeSimpleEnumField(
        "moreFollows",
        "ModbusDeviceInformationMoreFollows",
        moreFollows,
        new DataWriterEnumDefault<>(
            ModbusDeviceInformationMoreFollows::getValue,
            ModbusDeviceInformationMoreFollows::name,
            writeUnsignedShort(writeBuffer, 8)));

    // Simple Field (nextObjectId)
    writeSimpleField("nextObjectId", nextObjectId, writeUnsignedShort(writeBuffer, 8));

    // Implicit Field (numberOfObjects) (Used for parsing, but its value is not stored as it's
    // implicitly given by the objects content)
    short numberOfObjects = (short) (COUNT(getObjects()));
    writeImplicitField("numberOfObjects", numberOfObjects, writeUnsignedShort(writeBuffer, 8));

    // Array Field (objects)
    writeComplexTypeArrayField("objects", objects, writeBuffer);

    writeBuffer.popContext("ModbusPDUReadDeviceIdentificationResponse");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    ModbusPDUReadDeviceIdentificationResponse _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Const Field (meiType)
    lengthInBits += 8;

    // Simple field (level)
    lengthInBits += 8;

    // Simple field (individualAccess)
    lengthInBits += 1;

    // Simple field (conformityLevel)
    lengthInBits += 7;

    // Simple field (moreFollows)
    lengthInBits += 8;

    // Simple field (nextObjectId)
    lengthInBits += 8;

    // Implicit Field (numberOfObjects)
    lengthInBits += 8;

    // Array field
    if (objects != null) {
      int i = 0;
      for (ModbusDeviceInformationObject element : objects) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= objects.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    return lengthInBits;
  }

  public static ModbusPDUBuilder staticParseModbusPDUBuilder(
      ReadBuffer readBuffer, Boolean response) throws ParseException {
    readBuffer.pullContext("ModbusPDUReadDeviceIdentificationResponse");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    short meiType =
        readConstField(
            "meiType",
            readUnsignedShort(readBuffer, 8),
            ModbusPDUReadDeviceIdentificationResponse.MEITYPE);

    ModbusDeviceInformationLevel level =
        readEnumField(
            "level",
            "ModbusDeviceInformationLevel",
            new DataReaderEnumDefault<>(
                ModbusDeviceInformationLevel::enumForValue, readUnsignedShort(readBuffer, 8)));

    boolean individualAccess = readSimpleField("individualAccess", readBoolean(readBuffer));

    ModbusDeviceInformationConformityLevel conformityLevel =
        readEnumField(
            "conformityLevel",
            "ModbusDeviceInformationConformityLevel",
            new DataReaderEnumDefault<>(
                ModbusDeviceInformationConformityLevel::enumForValue,
                readUnsignedShort(readBuffer, 7)));

    ModbusDeviceInformationMoreFollows moreFollows =
        readEnumField(
            "moreFollows",
            "ModbusDeviceInformationMoreFollows",
            new DataReaderEnumDefault<>(
                ModbusDeviceInformationMoreFollows::enumForValue,
                readUnsignedShort(readBuffer, 8)));

    short nextObjectId = readSimpleField("nextObjectId", readUnsignedShort(readBuffer, 8));

    short numberOfObjects = readImplicitField("numberOfObjects", readUnsignedShort(readBuffer, 8));

    List<ModbusDeviceInformationObject> objects =
        readCountArrayField(
            "objects",
            new DataReaderComplexDefault<>(
                () -> ModbusDeviceInformationObject.staticParse(readBuffer), readBuffer),
            numberOfObjects);

    readBuffer.closeContext("ModbusPDUReadDeviceIdentificationResponse");
    // Create the instance
    return new ModbusPDUReadDeviceIdentificationResponseBuilderImpl(
        level, individualAccess, conformityLevel, moreFollows, nextObjectId, objects);
  }

  public static class ModbusPDUReadDeviceIdentificationResponseBuilderImpl
      implements ModbusPDU.ModbusPDUBuilder {
    private final ModbusDeviceInformationLevel level;
    private final boolean individualAccess;
    private final ModbusDeviceInformationConformityLevel conformityLevel;
    private final ModbusDeviceInformationMoreFollows moreFollows;
    private final short nextObjectId;
    private final List<ModbusDeviceInformationObject> objects;

    public ModbusPDUReadDeviceIdentificationResponseBuilderImpl(
        ModbusDeviceInformationLevel level,
        boolean individualAccess,
        ModbusDeviceInformationConformityLevel conformityLevel,
        ModbusDeviceInformationMoreFollows moreFollows,
        short nextObjectId,
        List<ModbusDeviceInformationObject> objects) {
      this.level = level;
      this.individualAccess = individualAccess;
      this.conformityLevel = conformityLevel;
      this.moreFollows = moreFollows;
      this.nextObjectId = nextObjectId;
      this.objects = objects;
    }

    public ModbusPDUReadDeviceIdentificationResponse build() {
      ModbusPDUReadDeviceIdentificationResponse modbusPDUReadDeviceIdentificationResponse =
          new ModbusPDUReadDeviceIdentificationResponse(
              level, individualAccess, conformityLevel, moreFollows, nextObjectId, objects);
      return modbusPDUReadDeviceIdentificationResponse;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModbusPDUReadDeviceIdentificationResponse)) {
      return false;
    }
    ModbusPDUReadDeviceIdentificationResponse that = (ModbusPDUReadDeviceIdentificationResponse) o;
    return (getLevel() == that.getLevel())
        && (getIndividualAccess() == that.getIndividualAccess())
        && (getConformityLevel() == that.getConformityLevel())
        && (getMoreFollows() == that.getMoreFollows())
        && (getNextObjectId() == that.getNextObjectId())
        && (getObjects() == that.getObjects())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getLevel(),
        getIndividualAccess(),
        getConformityLevel(),
        getMoreFollows(),
        getNextObjectId(),
        getObjects());
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
