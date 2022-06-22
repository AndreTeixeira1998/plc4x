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
	"github.com/rs/zerolog/log"
	"io"
)

// Code generated by code-generation. DO NOT EDIT.

// BACnetConstructedDataAssignedLandingCalls is the corresponding interface of BACnetConstructedDataAssignedLandingCalls
type BACnetConstructedDataAssignedLandingCalls interface {
	utils.LengthAware
	utils.Serializable
	BACnetConstructedData
	// GetNumberOfDataElements returns NumberOfDataElements (property field)
	GetNumberOfDataElements() BACnetApplicationTagUnsignedInteger
	// GetAssignedLandingCalls returns AssignedLandingCalls (property field)
	GetAssignedLandingCalls() []BACnetAssignedLandingCalls
	// GetZero returns Zero (virtual field)
	GetZero() uint64
}

// BACnetConstructedDataAssignedLandingCallsExactly can be used when we want exactly this type and not a type which fulfills BACnetConstructedDataAssignedLandingCalls.
// This is useful for switch cases.
type BACnetConstructedDataAssignedLandingCallsExactly interface {
	BACnetConstructedDataAssignedLandingCalls
	isBACnetConstructedDataAssignedLandingCalls() bool
}

// _BACnetConstructedDataAssignedLandingCalls is the data-structure of this message
type _BACnetConstructedDataAssignedLandingCalls struct {
	*_BACnetConstructedData
	NumberOfDataElements BACnetApplicationTagUnsignedInteger
	AssignedLandingCalls []BACnetAssignedLandingCalls

	// Arguments.
	TagNumber          uint8
	ArrayIndexArgument BACnetTagPayloadUnsignedInteger
}

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
/////////////////////// Accessors for discriminator values.
///////////////////////

func (m *_BACnetConstructedDataAssignedLandingCalls) GetObjectTypeArgument() BACnetObjectType {
	return 0
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetPropertyIdentifierArgument() BACnetPropertyIdentifier {
	return BACnetPropertyIdentifier_ASSIGNED_LANDING_CALLS
}

///////////////////////
///////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

func (m *_BACnetConstructedDataAssignedLandingCalls) InitializeParent(parent BACnetConstructedData, openingTag BACnetOpeningTag, peekedTagHeader BACnetTagHeader, closingTag BACnetClosingTag) {
	m.OpeningTag = openingTag
	m.PeekedTagHeader = peekedTagHeader
	m.ClosingTag = closingTag
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetParent() BACnetConstructedData {
	return m._BACnetConstructedData
}

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
/////////////////////// Accessors for property fields.
///////////////////////

func (m *_BACnetConstructedDataAssignedLandingCalls) GetNumberOfDataElements() BACnetApplicationTagUnsignedInteger {
	return m.NumberOfDataElements
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetAssignedLandingCalls() []BACnetAssignedLandingCalls {
	return m.AssignedLandingCalls
}

///////////////////////
///////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
/////////////////////// Accessors for virtual fields.
///////////////////////

func (m *_BACnetConstructedDataAssignedLandingCalls) GetZero() uint64 {
	numberOfDataElements := m.NumberOfDataElements
	_ = numberOfDataElements
	return uint64(uint64(0))
}

///////////////////////
///////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// NewBACnetConstructedDataAssignedLandingCalls factory function for _BACnetConstructedDataAssignedLandingCalls
func NewBACnetConstructedDataAssignedLandingCalls(numberOfDataElements BACnetApplicationTagUnsignedInteger, assignedLandingCalls []BACnetAssignedLandingCalls, openingTag BACnetOpeningTag, peekedTagHeader BACnetTagHeader, closingTag BACnetClosingTag, tagNumber uint8, arrayIndexArgument BACnetTagPayloadUnsignedInteger) *_BACnetConstructedDataAssignedLandingCalls {
	_result := &_BACnetConstructedDataAssignedLandingCalls{
		NumberOfDataElements:   numberOfDataElements,
		AssignedLandingCalls:   assignedLandingCalls,
		_BACnetConstructedData: NewBACnetConstructedData(openingTag, peekedTagHeader, closingTag, tagNumber, arrayIndexArgument),
	}
	_result._BACnetConstructedData._BACnetConstructedDataChildRequirements = _result
	return _result
}

// Deprecated: use the interface for direct cast
func CastBACnetConstructedDataAssignedLandingCalls(structType interface{}) BACnetConstructedDataAssignedLandingCalls {
	if casted, ok := structType.(BACnetConstructedDataAssignedLandingCalls); ok {
		return casted
	}
	if casted, ok := structType.(*BACnetConstructedDataAssignedLandingCalls); ok {
		return *casted
	}
	return nil
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetTypeName() string {
	return "BACnetConstructedDataAssignedLandingCalls"
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetLengthInBits() uint16 {
	return m.GetLengthInBitsConditional(false)
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetLengthInBitsConditional(lastItem bool) uint16 {
	lengthInBits := uint16(m.GetParentLengthInBits())

	// A virtual field doesn't have any in- or output.

	// Optional Field (numberOfDataElements)
	if m.NumberOfDataElements != nil {
		lengthInBits += m.NumberOfDataElements.GetLengthInBits()
	}

	// Array field
	if len(m.AssignedLandingCalls) > 0 {
		for _, element := range m.AssignedLandingCalls {
			lengthInBits += element.GetLengthInBits()
		}
	}

	return lengthInBits
}

func (m *_BACnetConstructedDataAssignedLandingCalls) GetLengthInBytes() uint16 {
	return m.GetLengthInBits() / 8
}

func BACnetConstructedDataAssignedLandingCallsParse(readBuffer utils.ReadBuffer, tagNumber uint8, objectTypeArgument BACnetObjectType, propertyIdentifierArgument BACnetPropertyIdentifier, arrayIndexArgument BACnetTagPayloadUnsignedInteger) (BACnetConstructedDataAssignedLandingCalls, error) {
	positionAware := readBuffer
	_ = positionAware
	if pullErr := readBuffer.PullContext("BACnetConstructedDataAssignedLandingCalls"); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for BACnetConstructedDataAssignedLandingCalls")
	}
	currentPos := positionAware.GetPos()
	_ = currentPos

	// Virtual field
	_zero := uint64(0)
	zero := uint64(_zero)
	_ = zero

	// Optional Field (numberOfDataElements) (Can be skipped, if a given expression evaluates to false)
	var numberOfDataElements BACnetApplicationTagUnsignedInteger = nil
	if bool(bool((arrayIndexArgument) != (nil))) && bool(bool((arrayIndexArgument.GetActualValue()) == (zero))) {
		currentPos = positionAware.GetPos()
		if pullErr := readBuffer.PullContext("numberOfDataElements"); pullErr != nil {
			return nil, errors.Wrap(pullErr, "Error pulling for numberOfDataElements")
		}
		_val, _err := BACnetApplicationTagParse(readBuffer)
		switch {
		case errors.Is(_err, utils.ParseAssertError{}) || errors.Is(_err, io.EOF):
			log.Debug().Err(_err).Msg("Resetting position because optional threw an error")
			readBuffer.Reset(currentPos)
		case _err != nil:
			return nil, errors.Wrap(_err, "Error parsing 'numberOfDataElements' field")
		default:
			numberOfDataElements = _val.(BACnetApplicationTagUnsignedInteger)
			if closeErr := readBuffer.CloseContext("numberOfDataElements"); closeErr != nil {
				return nil, errors.Wrap(closeErr, "Error closing for numberOfDataElements")
			}
		}
	}

	// Array field (assignedLandingCalls)
	if pullErr := readBuffer.PullContext("assignedLandingCalls", utils.WithRenderAsList(true)); pullErr != nil {
		return nil, errors.Wrap(pullErr, "Error pulling for assignedLandingCalls")
	}
	// Terminated array
	var assignedLandingCalls []BACnetAssignedLandingCalls
	{
		for !bool(IsBACnetConstructedDataClosingTag(readBuffer, false, tagNumber)) {
			_item, _err := BACnetAssignedLandingCallsParse(readBuffer)
			if _err != nil {
				return nil, errors.Wrap(_err, "Error parsing 'assignedLandingCalls' field")
			}
			assignedLandingCalls = append(assignedLandingCalls, _item.(BACnetAssignedLandingCalls))

		}
	}
	if closeErr := readBuffer.CloseContext("assignedLandingCalls", utils.WithRenderAsList(true)); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for assignedLandingCalls")
	}

	if closeErr := readBuffer.CloseContext("BACnetConstructedDataAssignedLandingCalls"); closeErr != nil {
		return nil, errors.Wrap(closeErr, "Error closing for BACnetConstructedDataAssignedLandingCalls")
	}

	// Create a partially initialized instance
	_child := &_BACnetConstructedDataAssignedLandingCalls{
		NumberOfDataElements:   numberOfDataElements,
		AssignedLandingCalls:   assignedLandingCalls,
		_BACnetConstructedData: &_BACnetConstructedData{},
	}
	_child._BACnetConstructedData._BACnetConstructedDataChildRequirements = _child
	return _child, nil
}

func (m *_BACnetConstructedDataAssignedLandingCalls) Serialize(writeBuffer utils.WriteBuffer) error {
	positionAware := writeBuffer
	_ = positionAware
	ser := func() error {
		if pushErr := writeBuffer.PushContext("BACnetConstructedDataAssignedLandingCalls"); pushErr != nil {
			return errors.Wrap(pushErr, "Error pushing for BACnetConstructedDataAssignedLandingCalls")
		}
		// Virtual field
		if _zeroErr := writeBuffer.WriteVirtual("zero", m.GetZero()); _zeroErr != nil {
			return errors.Wrap(_zeroErr, "Error serializing 'zero' field")
		}

		// Optional Field (numberOfDataElements) (Can be skipped, if the value is null)
		var numberOfDataElements BACnetApplicationTagUnsignedInteger = nil
		if m.GetNumberOfDataElements() != nil {
			if pushErr := writeBuffer.PushContext("numberOfDataElements"); pushErr != nil {
				return errors.Wrap(pushErr, "Error pushing for numberOfDataElements")
			}
			numberOfDataElements = m.GetNumberOfDataElements()
			_numberOfDataElementsErr := writeBuffer.WriteSerializable(numberOfDataElements)
			if popErr := writeBuffer.PopContext("numberOfDataElements"); popErr != nil {
				return errors.Wrap(popErr, "Error popping for numberOfDataElements")
			}
			if _numberOfDataElementsErr != nil {
				return errors.Wrap(_numberOfDataElementsErr, "Error serializing 'numberOfDataElements' field")
			}
		}

		// Array Field (assignedLandingCalls)
		if pushErr := writeBuffer.PushContext("assignedLandingCalls", utils.WithRenderAsList(true)); pushErr != nil {
			return errors.Wrap(pushErr, "Error pushing for assignedLandingCalls")
		}
		for _, _element := range m.GetAssignedLandingCalls() {
			_elementErr := writeBuffer.WriteSerializable(_element)
			if _elementErr != nil {
				return errors.Wrap(_elementErr, "Error serializing 'assignedLandingCalls' field")
			}
		}
		if popErr := writeBuffer.PopContext("assignedLandingCalls", utils.WithRenderAsList(true)); popErr != nil {
			return errors.Wrap(popErr, "Error popping for assignedLandingCalls")
		}

		if popErr := writeBuffer.PopContext("BACnetConstructedDataAssignedLandingCalls"); popErr != nil {
			return errors.Wrap(popErr, "Error popping for BACnetConstructedDataAssignedLandingCalls")
		}
		return nil
	}
	return m.SerializeParent(writeBuffer, m, ser)
}

func (m *_BACnetConstructedDataAssignedLandingCalls) isBACnetConstructedDataAssignedLandingCalls() bool {
	return true
}

func (m *_BACnetConstructedDataAssignedLandingCalls) String() string {
	if m == nil {
		return "<nil>"
	}
	writeBuffer := utils.NewBoxedWriteBufferWithOptions(true, true)
	if err := writeBuffer.WriteSerializable(m); err != nil {
		return err.Error()
	}
	return writeBuffer.GetBox().String()
}
