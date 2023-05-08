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

// Code generated by mockery v2.26.1. DO NOT EDIT.

package model

import mock "github.com/stretchr/testify/mock"

// MockPlcBrowseResponse is an autogenerated mock type for the PlcBrowseResponse type
type MockPlcBrowseResponse struct {
	mock.Mock
}

type MockPlcBrowseResponse_Expecter struct {
	mock *mock.Mock
}

func (_m *MockPlcBrowseResponse) EXPECT() *MockPlcBrowseResponse_Expecter {
	return &MockPlcBrowseResponse_Expecter{mock: &_m.Mock}
}

// GetQueryNames provides a mock function with given fields:
func (_m *MockPlcBrowseResponse) GetQueryNames() []string {
	ret := _m.Called()

	var r0 []string
	if rf, ok := ret.Get(0).(func() []string); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).([]string)
		}
	}

	return r0
}

// MockPlcBrowseResponse_GetQueryNames_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetQueryNames'
type MockPlcBrowseResponse_GetQueryNames_Call struct {
	*mock.Call
}

// GetQueryNames is a helper method to define mock.On call
func (_e *MockPlcBrowseResponse_Expecter) GetQueryNames() *MockPlcBrowseResponse_GetQueryNames_Call {
	return &MockPlcBrowseResponse_GetQueryNames_Call{Call: _e.mock.On("GetQueryNames")}
}

func (_c *MockPlcBrowseResponse_GetQueryNames_Call) Run(run func()) *MockPlcBrowseResponse_GetQueryNames_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcBrowseResponse_GetQueryNames_Call) Return(_a0 []string) *MockPlcBrowseResponse_GetQueryNames_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_GetQueryNames_Call) RunAndReturn(run func() []string) *MockPlcBrowseResponse_GetQueryNames_Call {
	_c.Call.Return(run)
	return _c
}

// GetQueryResults provides a mock function with given fields: name
func (_m *MockPlcBrowseResponse) GetQueryResults(name string) []PlcBrowseItem {
	ret := _m.Called(name)

	var r0 []PlcBrowseItem
	if rf, ok := ret.Get(0).(func(string) []PlcBrowseItem); ok {
		r0 = rf(name)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).([]PlcBrowseItem)
		}
	}

	return r0
}

// MockPlcBrowseResponse_GetQueryResults_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetQueryResults'
type MockPlcBrowseResponse_GetQueryResults_Call struct {
	*mock.Call
}

// GetQueryResults is a helper method to define mock.On call
//   - name string
func (_e *MockPlcBrowseResponse_Expecter) GetQueryResults(name interface{}) *MockPlcBrowseResponse_GetQueryResults_Call {
	return &MockPlcBrowseResponse_GetQueryResults_Call{Call: _e.mock.On("GetQueryResults", name)}
}

func (_c *MockPlcBrowseResponse_GetQueryResults_Call) Run(run func(name string)) *MockPlcBrowseResponse_GetQueryResults_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(string))
	})
	return _c
}

func (_c *MockPlcBrowseResponse_GetQueryResults_Call) Return(_a0 []PlcBrowseItem) *MockPlcBrowseResponse_GetQueryResults_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_GetQueryResults_Call) RunAndReturn(run func(string) []PlcBrowseItem) *MockPlcBrowseResponse_GetQueryResults_Call {
	_c.Call.Return(run)
	return _c
}

// GetRequest provides a mock function with given fields:
func (_m *MockPlcBrowseResponse) GetRequest() PlcBrowseRequest {
	ret := _m.Called()

	var r0 PlcBrowseRequest
	if rf, ok := ret.Get(0).(func() PlcBrowseRequest); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(PlcBrowseRequest)
		}
	}

	return r0
}

// MockPlcBrowseResponse_GetRequest_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetRequest'
type MockPlcBrowseResponse_GetRequest_Call struct {
	*mock.Call
}

// GetRequest is a helper method to define mock.On call
func (_e *MockPlcBrowseResponse_Expecter) GetRequest() *MockPlcBrowseResponse_GetRequest_Call {
	return &MockPlcBrowseResponse_GetRequest_Call{Call: _e.mock.On("GetRequest")}
}

func (_c *MockPlcBrowseResponse_GetRequest_Call) Run(run func()) *MockPlcBrowseResponse_GetRequest_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcBrowseResponse_GetRequest_Call) Return(_a0 PlcBrowseRequest) *MockPlcBrowseResponse_GetRequest_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_GetRequest_Call) RunAndReturn(run func() PlcBrowseRequest) *MockPlcBrowseResponse_GetRequest_Call {
	_c.Call.Return(run)
	return _c
}

// GetResponseCode provides a mock function with given fields: name
func (_m *MockPlcBrowseResponse) GetResponseCode(name string) PlcResponseCode {
	ret := _m.Called(name)

	var r0 PlcResponseCode
	if rf, ok := ret.Get(0).(func(string) PlcResponseCode); ok {
		r0 = rf(name)
	} else {
		r0 = ret.Get(0).(PlcResponseCode)
	}

	return r0
}

// MockPlcBrowseResponse_GetResponseCode_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetResponseCode'
type MockPlcBrowseResponse_GetResponseCode_Call struct {
	*mock.Call
}

// GetResponseCode is a helper method to define mock.On call
//   - name string
func (_e *MockPlcBrowseResponse_Expecter) GetResponseCode(name interface{}) *MockPlcBrowseResponse_GetResponseCode_Call {
	return &MockPlcBrowseResponse_GetResponseCode_Call{Call: _e.mock.On("GetResponseCode", name)}
}

func (_c *MockPlcBrowseResponse_GetResponseCode_Call) Run(run func(name string)) *MockPlcBrowseResponse_GetResponseCode_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(string))
	})
	return _c
}

func (_c *MockPlcBrowseResponse_GetResponseCode_Call) Return(_a0 PlcResponseCode) *MockPlcBrowseResponse_GetResponseCode_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_GetResponseCode_Call) RunAndReturn(run func(string) PlcResponseCode) *MockPlcBrowseResponse_GetResponseCode_Call {
	_c.Call.Return(run)
	return _c
}

// IsAPlcMessage provides a mock function with given fields:
func (_m *MockPlcBrowseResponse) IsAPlcMessage() bool {
	ret := _m.Called()

	var r0 bool
	if rf, ok := ret.Get(0).(func() bool); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(bool)
	}

	return r0
}

// MockPlcBrowseResponse_IsAPlcMessage_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'IsAPlcMessage'
type MockPlcBrowseResponse_IsAPlcMessage_Call struct {
	*mock.Call
}

// IsAPlcMessage is a helper method to define mock.On call
func (_e *MockPlcBrowseResponse_Expecter) IsAPlcMessage() *MockPlcBrowseResponse_IsAPlcMessage_Call {
	return &MockPlcBrowseResponse_IsAPlcMessage_Call{Call: _e.mock.On("IsAPlcMessage")}
}

func (_c *MockPlcBrowseResponse_IsAPlcMessage_Call) Run(run func()) *MockPlcBrowseResponse_IsAPlcMessage_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcBrowseResponse_IsAPlcMessage_Call) Return(_a0 bool) *MockPlcBrowseResponse_IsAPlcMessage_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_IsAPlcMessage_Call) RunAndReturn(run func() bool) *MockPlcBrowseResponse_IsAPlcMessage_Call {
	_c.Call.Return(run)
	return _c
}

// String provides a mock function with given fields:
func (_m *MockPlcBrowseResponse) String() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockPlcBrowseResponse_String_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'String'
type MockPlcBrowseResponse_String_Call struct {
	*mock.Call
}

// String is a helper method to define mock.On call
func (_e *MockPlcBrowseResponse_Expecter) String() *MockPlcBrowseResponse_String_Call {
	return &MockPlcBrowseResponse_String_Call{Call: _e.mock.On("String")}
}

func (_c *MockPlcBrowseResponse_String_Call) Run(run func()) *MockPlcBrowseResponse_String_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcBrowseResponse_String_Call) Return(_a0 string) *MockPlcBrowseResponse_String_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcBrowseResponse_String_Call) RunAndReturn(run func() string) *MockPlcBrowseResponse_String_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockPlcBrowseResponse interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockPlcBrowseResponse creates a new instance of MockPlcBrowseResponse. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockPlcBrowseResponse(t mockConstructorTestingTNewMockPlcBrowseResponse) *MockPlcBrowseResponse {
	mock := &MockPlcBrowseResponse{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
