//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
package model

import (
	"errors"
	"plc4x.apache.org/plc4go-modbus-driver/0.8.0/internal/plc4go/spi"
	"reflect"
)

// The data-structure of this message
type S7PayloadReadVarResponse struct {
	Items []IS7VarPayloadDataItem
	S7Payload
}

// The corresponding interface
type IS7PayloadReadVarResponse interface {
	IS7Payload
	Serialize(io spi.WriteBuffer) error
}

// Accessors for discriminator values.
func (m S7PayloadReadVarResponse) ParameterParameterType() uint8 {
	return 0x04
}

func (m S7PayloadReadVarResponse) MessageType() uint8 {
	return 0x03
}

func (m S7PayloadReadVarResponse) initialize() spi.Message {
	return m
}

func NewS7PayloadReadVarResponse(items []IS7VarPayloadDataItem) S7PayloadInitializer {
	return &S7PayloadReadVarResponse{Items: items}
}

func CastIS7PayloadReadVarResponse(structType interface{}) IS7PayloadReadVarResponse {
	castFunc := func(typ interface{}) IS7PayloadReadVarResponse {
		if iS7PayloadReadVarResponse, ok := typ.(IS7PayloadReadVarResponse); ok {
			return iS7PayloadReadVarResponse
		}
		return nil
	}
	return castFunc(structType)
}

func CastS7PayloadReadVarResponse(structType interface{}) S7PayloadReadVarResponse {
	castFunc := func(typ interface{}) S7PayloadReadVarResponse {
		if sS7PayloadReadVarResponse, ok := typ.(S7PayloadReadVarResponse); ok {
			return sS7PayloadReadVarResponse
		}
		return S7PayloadReadVarResponse{}
	}
	return castFunc(structType)
}

func (m S7PayloadReadVarResponse) LengthInBits() uint16 {
	var lengthInBits = m.S7Payload.LengthInBits()

	// Array field
	if len(m.Items) > 0 {
		for _, element := range m.Items {
			lengthInBits += element.LengthInBits()
		}
	}

	return lengthInBits
}

func (m S7PayloadReadVarResponse) LengthInBytes() uint16 {
	return m.LengthInBits() / 8
}

func S7PayloadReadVarResponseParse(io *spi.ReadBuffer, parameter IS7Parameter) (S7PayloadInitializer, error) {

	// Array field (items)
	// Count array
	items := make([]IS7VarPayloadDataItem, CastS7ParameterReadVarResponse(parameter).NumItems)
	for curItem := uint16(0); curItem < uint16(CastS7ParameterReadVarResponse(parameter).NumItems); curItem++ {
		lastItem := curItem == uint16(CastS7ParameterReadVarResponse(parameter).NumItems-1)
		_message, _err := S7VarPayloadDataItemParse(io, lastItem)
		if _err != nil {
			return nil, errors.New("Error parsing 'items' field " + _err.Error())
		}
		var _item IS7VarPayloadDataItem
		_item, _ok := _message.(IS7VarPayloadDataItem)
		if !_ok {
			return nil, errors.New("Couldn't cast message of type " + reflect.TypeOf(_item).Name() + " to S7VarPayloadDataItem")
		}
		items[curItem] = _item
	}

	// Create the instance
	return NewS7PayloadReadVarResponse(items), nil
}

func (m S7PayloadReadVarResponse) Serialize(io spi.WriteBuffer) error {
	ser := func() error {

		// Array Field (items)
		if m.Items != nil {
			itemCount := uint16(len(m.Items))
			var curItem uint16 = 0
			for _, _element := range m.Items {
				var lastItem = curItem == (itemCount - 1)
				_elementErr := _element.Serialize(io, lastItem)
				if _elementErr != nil {
					return errors.New("Error serializing 'items' field " + _elementErr.Error())
				}
				curItem++
			}
		}

		return nil
	}
	return S7PayloadSerialize(io, m.S7Payload, CastIS7Payload(m), ser)
}