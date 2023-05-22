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

public class TrustListDataType extends ExtensionObjectDefinition implements Message {

  // Accessors for discriminator values.
  public String getIdentifier() {
    return (String) "12556";
  }

  // Properties.
  protected final long specifiedLists;
  protected final int noOfTrustedCertificates;
  protected final List<PascalByteString> trustedCertificates;
  protected final int noOfTrustedCrls;
  protected final List<PascalByteString> trustedCrls;
  protected final int noOfIssuerCertificates;
  protected final List<PascalByteString> issuerCertificates;
  protected final int noOfIssuerCrls;
  protected final List<PascalByteString> issuerCrls;

  public TrustListDataType(
      long specifiedLists,
      int noOfTrustedCertificates,
      List<PascalByteString> trustedCertificates,
      int noOfTrustedCrls,
      List<PascalByteString> trustedCrls,
      int noOfIssuerCertificates,
      List<PascalByteString> issuerCertificates,
      int noOfIssuerCrls,
      List<PascalByteString> issuerCrls) {
    super();
    this.specifiedLists = specifiedLists;
    this.noOfTrustedCertificates = noOfTrustedCertificates;
    this.trustedCertificates = trustedCertificates;
    this.noOfTrustedCrls = noOfTrustedCrls;
    this.trustedCrls = trustedCrls;
    this.noOfIssuerCertificates = noOfIssuerCertificates;
    this.issuerCertificates = issuerCertificates;
    this.noOfIssuerCrls = noOfIssuerCrls;
    this.issuerCrls = issuerCrls;
  }

  public long getSpecifiedLists() {
    return specifiedLists;
  }

  public int getNoOfTrustedCertificates() {
    return noOfTrustedCertificates;
  }

  public List<PascalByteString> getTrustedCertificates() {
    return trustedCertificates;
  }

  public int getNoOfTrustedCrls() {
    return noOfTrustedCrls;
  }

  public List<PascalByteString> getTrustedCrls() {
    return trustedCrls;
  }

  public int getNoOfIssuerCertificates() {
    return noOfIssuerCertificates;
  }

  public List<PascalByteString> getIssuerCertificates() {
    return issuerCertificates;
  }

  public int getNoOfIssuerCrls() {
    return noOfIssuerCrls;
  }

  public List<PascalByteString> getIssuerCrls() {
    return issuerCrls;
  }

  @Override
  protected void serializeExtensionObjectDefinitionChild(WriteBuffer writeBuffer)
      throws SerializationException {
    PositionAware positionAware = writeBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();
    writeBuffer.pushContext("TrustListDataType");

    // Simple Field (specifiedLists)
    writeSimpleField("specifiedLists", specifiedLists, writeUnsignedLong(writeBuffer, 32));

    // Simple Field (noOfTrustedCertificates)
    writeSimpleField(
        "noOfTrustedCertificates", noOfTrustedCertificates, writeSignedInt(writeBuffer, 32));

    // Array Field (trustedCertificates)
    writeComplexTypeArrayField("trustedCertificates", trustedCertificates, writeBuffer);

    // Simple Field (noOfTrustedCrls)
    writeSimpleField("noOfTrustedCrls", noOfTrustedCrls, writeSignedInt(writeBuffer, 32));

    // Array Field (trustedCrls)
    writeComplexTypeArrayField("trustedCrls", trustedCrls, writeBuffer);

    // Simple Field (noOfIssuerCertificates)
    writeSimpleField(
        "noOfIssuerCertificates", noOfIssuerCertificates, writeSignedInt(writeBuffer, 32));

    // Array Field (issuerCertificates)
    writeComplexTypeArrayField("issuerCertificates", issuerCertificates, writeBuffer);

    // Simple Field (noOfIssuerCrls)
    writeSimpleField("noOfIssuerCrls", noOfIssuerCrls, writeSignedInt(writeBuffer, 32));

    // Array Field (issuerCrls)
    writeComplexTypeArrayField("issuerCrls", issuerCrls, writeBuffer);

    writeBuffer.popContext("TrustListDataType");
  }

  @Override
  public int getLengthInBytes() {
    return (int) Math.ceil((float) getLengthInBits() / 8.0);
  }

  @Override
  public int getLengthInBits() {
    int lengthInBits = super.getLengthInBits();
    TrustListDataType _value = this;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    // Simple field (specifiedLists)
    lengthInBits += 32;

    // Simple field (noOfTrustedCertificates)
    lengthInBits += 32;

    // Array field
    if (trustedCertificates != null) {
      int i = 0;
      for (PascalByteString element : trustedCertificates) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= trustedCertificates.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    // Simple field (noOfTrustedCrls)
    lengthInBits += 32;

    // Array field
    if (trustedCrls != null) {
      int i = 0;
      for (PascalByteString element : trustedCrls) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= trustedCrls.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    // Simple field (noOfIssuerCertificates)
    lengthInBits += 32;

    // Array field
    if (issuerCertificates != null) {
      int i = 0;
      for (PascalByteString element : issuerCertificates) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= issuerCertificates.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    // Simple field (noOfIssuerCrls)
    lengthInBits += 32;

    // Array field
    if (issuerCrls != null) {
      int i = 0;
      for (PascalByteString element : issuerCrls) {
        ThreadLocalHelper.lastItemThreadLocal.set(++i >= issuerCrls.size());
        lengthInBits += element.getLengthInBits();
      }
    }

    return lengthInBits;
  }

  public static ExtensionObjectDefinitionBuilder staticParseExtensionObjectDefinitionBuilder(
      ReadBuffer readBuffer, String identifier) throws ParseException {
    readBuffer.pullContext("TrustListDataType");
    PositionAware positionAware = readBuffer;
    boolean _lastItem = ThreadLocalHelper.lastItemThreadLocal.get();

    long specifiedLists = readSimpleField("specifiedLists", readUnsignedLong(readBuffer, 32));

    int noOfTrustedCertificates =
        readSimpleField("noOfTrustedCertificates", readSignedInt(readBuffer, 32));

    List<PascalByteString> trustedCertificates =
        readCountArrayField(
            "trustedCertificates",
            new DataReaderComplexDefault<>(
                () -> PascalByteString.staticParse(readBuffer), readBuffer),
            noOfTrustedCertificates);

    int noOfTrustedCrls = readSimpleField("noOfTrustedCrls", readSignedInt(readBuffer, 32));

    List<PascalByteString> trustedCrls =
        readCountArrayField(
            "trustedCrls",
            new DataReaderComplexDefault<>(
                () -> PascalByteString.staticParse(readBuffer), readBuffer),
            noOfTrustedCrls);

    int noOfIssuerCertificates =
        readSimpleField("noOfIssuerCertificates", readSignedInt(readBuffer, 32));

    List<PascalByteString> issuerCertificates =
        readCountArrayField(
            "issuerCertificates",
            new DataReaderComplexDefault<>(
                () -> PascalByteString.staticParse(readBuffer), readBuffer),
            noOfIssuerCertificates);

    int noOfIssuerCrls = readSimpleField("noOfIssuerCrls", readSignedInt(readBuffer, 32));

    List<PascalByteString> issuerCrls =
        readCountArrayField(
            "issuerCrls",
            new DataReaderComplexDefault<>(
                () -> PascalByteString.staticParse(readBuffer), readBuffer),
            noOfIssuerCrls);

    readBuffer.closeContext("TrustListDataType");
    // Create the instance
    return new TrustListDataTypeBuilderImpl(
        specifiedLists,
        noOfTrustedCertificates,
        trustedCertificates,
        noOfTrustedCrls,
        trustedCrls,
        noOfIssuerCertificates,
        issuerCertificates,
        noOfIssuerCrls,
        issuerCrls);
  }

  public static class TrustListDataTypeBuilderImpl
      implements ExtensionObjectDefinition.ExtensionObjectDefinitionBuilder {
    private final long specifiedLists;
    private final int noOfTrustedCertificates;
    private final List<PascalByteString> trustedCertificates;
    private final int noOfTrustedCrls;
    private final List<PascalByteString> trustedCrls;
    private final int noOfIssuerCertificates;
    private final List<PascalByteString> issuerCertificates;
    private final int noOfIssuerCrls;
    private final List<PascalByteString> issuerCrls;

    public TrustListDataTypeBuilderImpl(
        long specifiedLists,
        int noOfTrustedCertificates,
        List<PascalByteString> trustedCertificates,
        int noOfTrustedCrls,
        List<PascalByteString> trustedCrls,
        int noOfIssuerCertificates,
        List<PascalByteString> issuerCertificates,
        int noOfIssuerCrls,
        List<PascalByteString> issuerCrls) {
      this.specifiedLists = specifiedLists;
      this.noOfTrustedCertificates = noOfTrustedCertificates;
      this.trustedCertificates = trustedCertificates;
      this.noOfTrustedCrls = noOfTrustedCrls;
      this.trustedCrls = trustedCrls;
      this.noOfIssuerCertificates = noOfIssuerCertificates;
      this.issuerCertificates = issuerCertificates;
      this.noOfIssuerCrls = noOfIssuerCrls;
      this.issuerCrls = issuerCrls;
    }

    public TrustListDataType build() {
      TrustListDataType trustListDataType =
          new TrustListDataType(
              specifiedLists,
              noOfTrustedCertificates,
              trustedCertificates,
              noOfTrustedCrls,
              trustedCrls,
              noOfIssuerCertificates,
              issuerCertificates,
              noOfIssuerCrls,
              issuerCrls);
      return trustListDataType;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TrustListDataType)) {
      return false;
    }
    TrustListDataType that = (TrustListDataType) o;
    return (getSpecifiedLists() == that.getSpecifiedLists())
        && (getNoOfTrustedCertificates() == that.getNoOfTrustedCertificates())
        && (getTrustedCertificates() == that.getTrustedCertificates())
        && (getNoOfTrustedCrls() == that.getNoOfTrustedCrls())
        && (getTrustedCrls() == that.getTrustedCrls())
        && (getNoOfIssuerCertificates() == that.getNoOfIssuerCertificates())
        && (getIssuerCertificates() == that.getIssuerCertificates())
        && (getNoOfIssuerCrls() == that.getNoOfIssuerCrls())
        && (getIssuerCrls() == that.getIssuerCrls())
        && super.equals(that)
        && true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getSpecifiedLists(),
        getNoOfTrustedCertificates(),
        getTrustedCertificates(),
        getNoOfTrustedCrls(),
        getTrustedCrls(),
        getNoOfIssuerCertificates(),
        getIssuerCertificates(),
        getNoOfIssuerCrls(),
        getIssuerCrls());
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
