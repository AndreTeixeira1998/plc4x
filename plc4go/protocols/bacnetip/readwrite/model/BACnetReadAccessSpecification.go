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

package model

import (
	"github.com/apache/plc4x/plc4go/internal/spi/utils"
	"github.com/pkg/errors"
)

// Code generated by code-generation. DO NOT EDIT.

// BACnetReadAccessSpecification is the corresponding interface of BACnetReadAccessSpecification
type BACnetReadAccessSpecification interface {
	utils.LengthAware
	utils.Serializable
	// GetObjectIdentifier returns ObjectIdentifier (property field)
	GetObjectIdentifier() BACnetContextTagObjectIdentifier
	// GetOpeningTag returns OpeningTag (property field)
	GetOpeningTag() BACnetOpeningTag
	// GetListOfPropertyReferences returns ListOfPropertyReferences (property field)
	GetListOfPropertyReferences() []BACnetPropertyReference
	// GetClosingTag returns ClosingTag (property field)
	GetClosingTag() BACnetClosingTag
}

// BACnetReadAccessSpecificationExactly can be used when we want exactly this type and not a type which fulfills BACnetReadAccessSpecification.
// This is useful for switch cases.
type BACnetReadAccessSpecificationExactly interface {
	BACnetReadAccessSpecification
	isBACnetReadAccessSpecification() bool
}

// _BACnetReadAccessSpecification is the data-structure of this message
type _BACnetReadAccessSpecification struct {
	ObjectIdentifier         BACnetContextTagObjectIdentifier
	OpeningTag               BACnetOpeningTag
	ListOfPropertyReferences []BACnetPropertyReference
	ClosingTag               BACnetClosingTag
}

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
/////////////////////// Accessors for property fields.
///////////////////////

func (m *_BACnetReadAccessSpecification) GetObjectIdentifier() BACnetContextTagObjectIdentifier {
	return m.ObjectIdentifier
}

func (m *_BACnetReadAccessSpecification) GetOpeningTag() BACnetOpeningTag {
	return m.OpeningTag
}

func (m *_BACnetReadAccessSpecification) GetListOfPropertyReferences() []BACnetPropertyReference {
	return m.ListOfPropertyReferences
}

func (m *_BACnetReadAccessSpecification) GetClosingTag() BACnetClosingTag {
	return m.ClosingTag
}

///////////////////////
///////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// NewBACnetReadAccessSpecification factory function for _BACnetReadAccessSpecification
func NewBACnetReadAccessSpecification(objectIdentifier BACnetContextTagObjectIdentifier, openingTag BACnetOpeningTag, listOfPropertyReferences []BACnetPropertyReference, closingTag BACnetClosingTag) *_BACnetReadAccessSpecification {
	return &_BACnetReadAccessSpecification{ObjectIdentifier: objectIdentifier, OpeningTag: openingTag, ListOfPropertyReferences: listOfPropertyReferences, ClosingTag: closingTag}
}

// Deprecated: use the interface for direct cast
func CastBACnetReadAccessSpecification(structType interface{}) BACnetReadAccessSpecification {
	if casted, ok := structType.(BACnetReadAccessSpecification); ok {
		return casted
	}
	if casted, ok := structType.(*BACnetReadAccessSpecification); ok {
		return *casted
	}
	return nil
}

func (m *_BACnetReadAccessSpecification) GetTypeName() string {
	return "BACnetReadAccessSpecification"
}

func (m *_BACnetReadAccessSpecification) GetLengthInBits() uint16 {
	return m.GetLengthInBitsConditional(false)
}

func (m *_BACnetReadAccessSpecification) GetLengthInBitsConditional(lastItem bool) uint16 {
	lengthInBits := uint16(0)

	// Simple field (objectIdentifier)
	lengthInBits += m.ObjectIdentifier.GetLengthInBits()

	// Simple field (openingTag)
	lengthInBits += m.OpeningTag.GetLengthInBits()

	// Array field
	if len(m.ListOfPropertyReferences) > 0 {
		for _, element := range m.ListOfPropertyReferences {
			lengthInBits += element.GetLengthInBits()
		}
	}

	// Simple field (closingTag)
	lengthInBits += m.ClosingTag.GetLengthInBits()

	return lengthInBits
}

func (m *_BACnetReadAccessSpecification) GetLengthInBytes() uint16 {
	return m.GetLengthInBits() / 8
}

func BACnetReadAccessSpecificationParse(readBuffer utils.ReadBuffer) (BACnetReadAccessSpecification, error) {
	positionAware := readBuffer
	_ = positionAware
	if pullErr := readBuffer.PullContext("BACnetReadAccessSpecification"); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for BACnetReadAccessSpecification")
	}
	currentPos := positionAware.GetPos()
	_ = currentPos

	// Simple Field (objectIdentifier)
	if pullErr := readBuffer.PullContext("objectIdentifier"); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for objectIdentifier")
	}
	_objectIdentifier, _objectIdentifierErr := BACnetContextTagParse(readBuffer, uint8(uint8(0)), BACnetDataType(BACnetDataType_BACNET_OBJECT_IDENTIFIER))
	if _objectIdentifierErr != nil {
		return nil, errors.Wrap(_objectIdentifierErr, "Error parsing 'objectIdentifier' field")
	}
	objectIdentifier := _objectIdentifier.(BACnetContextTagObjectIdentifier)
	if closeErr := readBuffer.CloseContext("objectIdentifier"); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for objectIdentifier")
	}

	// Simple Field (openingTag)
	if pullErr := readBuffer.PullContext("openingTag"); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for openingTag")
	}
	_openingTag, _openingTagErr := BACnetOpeningTagParse(readBuffer, uint8(uint8(1)))
	if _openingTagErr != nil {
		return nil, errors.Wrap(_openingTagErr, "Error parsing 'openingTag' field")
	}
	openingTag := _openingTag.(BACnetOpeningTag)
	if closeErr := readBuffer.CloseContext("openingTag"); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for openingTag")
	}

	// Array field (listOfPropertyReferences)
	if pullErr := readBuffer.PullContext("listOfPropertyReferences", utils.WithRenderAsList(true)); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for listOfPropertyReferences")
	}
	// Terminated array
	var listOfPropertyReferences []BACnetPropertyReference
	{
		for !bool(IsBACnetConstructedDataClosingTag(readBuffer, false, 1)) {
			_item, _err := BACnetPropertyReferenceParse(readBuffer)
			if _err != nil {
				return nil, errors.Wrap(_err, "Error parsing 'listOfPropertyReferences' field")
			}
			listOfPropertyReferences = append(listOfPropertyReferences, _item.(BACnetPropertyReference))

		}
	}
	if closeErr := readBuffer.CloseContext("listOfPropertyReferences", utils.WithRenderAsList(true)); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for listOfPropertyReferences")
	}

	// Simple Field (closingTag)
	if pullErr := readBuffer.PullContext("closingTag"); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for closingTag")
	}
	_closingTag, _closingTagErr := BACnetClosingTagParse(readBuffer, uint8(uint8(1)))
	if _closingTagErr != nil {
		return nil, errors.Wrap(_closingTagErr, "Error parsing 'closingTag' field")
	}
	closingTag := _closingTag.(BACnetClosingTag)
	if closeErr := readBuffer.CloseContext("closingTag"); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for closingTag")
	}

	if closeErr := readBuffer.CloseContext("BACnetReadAccessSpecification"); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for BACnetReadAccessSpecification")
	}

	// Create the instance
	return NewBACnetReadAccessSpecification(objectIdentifier, openingTag, listOfPropertyReferences, closingTag), nil
}

func (m *_BACnetReadAccessSpecification) Serialize(writeBuffer utils.WriteBuffer) error {
	positionAware := writeBuffer
	_ = positionAware
	if pushErr := writeBuffer.PushContext("BACnetReadAccessSpecification"); pushErr != nil {
		return errors.Wrap(pushErr, "Error pushing for BACnetReadAccessSpecification")
	}

	// Simple Field (objectIdentifier)
	if pushErr := writeBuffer.PushContext("objectIdentifier"); pushErr != nil {
		return errors.Wrap(pushErr, "Error pushing for objectIdentifier")
	}
	_objectIdentifierErr := writeBuffer.WriteSerializable(m.GetObjectIdentifier())
	if popErr := writeBuffer.PopContext("objectIdentifier"); popErr != nil {
		return errors.Wrap(popErr, "Error popping for objectIdentifier")
	}
	if _objectIdentifierErr != nil {
		return errors.Wrap(_objectIdentifierErr, "Error serializing 'objectIdentifier' field")
	}

	// Simple Field (openingTag)
	if pushErr := writeBuffer.PushContext("openingTag"); pushErr != nil {
		return errors.Wrap(pushErr, "Error pushing for openingTag")
	}
	_openingTagErr := writeBuffer.WriteSerializable(m.GetOpeningTag())
	if popErr := writeBuffer.PopContext("openingTag"); popErr != nil {
		return errors.Wrap(popErr, "Error popping for openingTag")
	}
	if _openingTagErr != nil {
		return errors.Wrap(_openingTagErr, "Error serializing 'openingTag' field")
	}

	// Array Field (listOfPropertyReferences)
	if pushErr := writeBuffer.PushContext("listOfPropertyReferences", utils.WithRenderAsList(true)); pushErr != nil {
		return errors.Wrap(pushErr, "Error pushing for listOfPropertyReferences")
	}
	for _, _element := range m.GetListOfPropertyReferences() {
		_elementErr := writeBuffer.WriteSerializable(_element)
		if _elementErr != nil {
			return errors.Wrap(_elementErr, "Error serializing 'listOfPropertyReferences' field")
		}
	}
	if popErr := writeBuffer.PopContext("listOfPropertyReferences", utils.WithRenderAsList(true)); popErr != nil {
		return errors.Wrap(popErr, "Error popping for listOfPropertyReferences")
	}

	// Simple Field (closingTag)
	if pushErr := writeBuffer.PushContext("closingTag"); pushErr != nil {
		return errors.Wrap(pushErr, "Error pushing for closingTag")
	}
	_closingTagErr := writeBuffer.WriteSerializable(m.GetClosingTag())
	if popErr := writeBuffer.PopContext("closingTag"); popErr != nil {
		return errors.Wrap(popErr, "Error popping for closingTag")
	}
	if _closingTagErr != nil {
		return errors.Wrap(_closingTagErr, "Error serializing 'closingTag' field")
	}

	if popErr := writeBuffer.PopContext("BACnetReadAccessSpecification"); popErr != nil {
		return errors.Wrap(popErr, "Error popping for BACnetReadAccessSpecification")
	}
	return nil
}

func (m *_BACnetReadAccessSpecification) isBACnetReadAccessSpecification() bool {
	return true
}

func (m *_BACnetReadAccessSpecification) String() string {
	if m == nil {
		return "<nil>"
	}
	writeBuffer := utils.NewBoxedWriteBufferWithOptions(true, true)
	if err := writeBuffer.WriteSerializable(m); err != nil {
		return err.Error()
	}
	return writeBuffer.GetBox().String()
}
