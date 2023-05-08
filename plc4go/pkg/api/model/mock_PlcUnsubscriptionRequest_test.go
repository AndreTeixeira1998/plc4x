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

import (
	context "context"

	mock "github.com/stretchr/testify/mock"
)

// MockPlcUnsubscriptionRequest is an autogenerated mock type for the PlcUnsubscriptionRequest type
type MockPlcUnsubscriptionRequest struct {
	mock.Mock
}

type MockPlcUnsubscriptionRequest_Expecter struct {
	mock *mock.Mock
}

func (_m *MockPlcUnsubscriptionRequest) EXPECT() *MockPlcUnsubscriptionRequest_Expecter {
	return &MockPlcUnsubscriptionRequest_Expecter{mock: &_m.Mock}
}

// Execute provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequest) Execute() <-chan PlcUnsubscriptionRequestResult {
	ret := _m.Called()

	var r0 <-chan PlcUnsubscriptionRequestResult
	if rf, ok := ret.Get(0).(func() <-chan PlcUnsubscriptionRequestResult); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(<-chan PlcUnsubscriptionRequestResult)
		}
	}

	return r0
}

// MockPlcUnsubscriptionRequest_Execute_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'Execute'
type MockPlcUnsubscriptionRequest_Execute_Call struct {
	*mock.Call
}

// Execute is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequest_Expecter) Execute() *MockPlcUnsubscriptionRequest_Execute_Call {
	return &MockPlcUnsubscriptionRequest_Execute_Call{Call: _e.mock.On("Execute")}
}

func (_c *MockPlcUnsubscriptionRequest_Execute_Call) Run(run func()) *MockPlcUnsubscriptionRequest_Execute_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_Execute_Call) Return(_a0 <-chan PlcUnsubscriptionRequestResult) *MockPlcUnsubscriptionRequest_Execute_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_Execute_Call) RunAndReturn(run func() <-chan PlcUnsubscriptionRequestResult) *MockPlcUnsubscriptionRequest_Execute_Call {
	_c.Call.Return(run)
	return _c
}

// ExecuteWithContext provides a mock function with given fields: ctx
func (_m *MockPlcUnsubscriptionRequest) ExecuteWithContext(ctx context.Context) <-chan PlcUnsubscriptionRequestResult {
	ret := _m.Called(ctx)

	var r0 <-chan PlcUnsubscriptionRequestResult
	if rf, ok := ret.Get(0).(func(context.Context) <-chan PlcUnsubscriptionRequestResult); ok {
		r0 = rf(ctx)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(<-chan PlcUnsubscriptionRequestResult)
		}
	}

	return r0
}

// MockPlcUnsubscriptionRequest_ExecuteWithContext_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'ExecuteWithContext'
type MockPlcUnsubscriptionRequest_ExecuteWithContext_Call struct {
	*mock.Call
}

// ExecuteWithContext is a helper method to define mock.On call
//   - ctx context.Context
func (_e *MockPlcUnsubscriptionRequest_Expecter) ExecuteWithContext(ctx interface{}) *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call {
	return &MockPlcUnsubscriptionRequest_ExecuteWithContext_Call{Call: _e.mock.On("ExecuteWithContext", ctx)}
}

func (_c *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call) Run(run func(ctx context.Context)) *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(context.Context))
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call) Return(_a0 <-chan PlcUnsubscriptionRequestResult) *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call) RunAndReturn(run func(context.Context) <-chan PlcUnsubscriptionRequestResult) *MockPlcUnsubscriptionRequest_ExecuteWithContext_Call {
	_c.Call.Return(run)
	return _c
}

// IsAPlcMessage provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequest) IsAPlcMessage() bool {
	ret := _m.Called()

	var r0 bool
	if rf, ok := ret.Get(0).(func() bool); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(bool)
	}

	return r0
}

// MockPlcUnsubscriptionRequest_IsAPlcMessage_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'IsAPlcMessage'
type MockPlcUnsubscriptionRequest_IsAPlcMessage_Call struct {
	*mock.Call
}

// IsAPlcMessage is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequest_Expecter) IsAPlcMessage() *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call {
	return &MockPlcUnsubscriptionRequest_IsAPlcMessage_Call{Call: _e.mock.On("IsAPlcMessage")}
}

func (_c *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call) Run(run func()) *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call) Return(_a0 bool) *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call) RunAndReturn(run func() bool) *MockPlcUnsubscriptionRequest_IsAPlcMessage_Call {
	_c.Call.Return(run)
	return _c
}

// String provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequest) String() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockPlcUnsubscriptionRequest_String_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'String'
type MockPlcUnsubscriptionRequest_String_Call struct {
	*mock.Call
}

// String is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequest_Expecter) String() *MockPlcUnsubscriptionRequest_String_Call {
	return &MockPlcUnsubscriptionRequest_String_Call{Call: _e.mock.On("String")}
}

func (_c *MockPlcUnsubscriptionRequest_String_Call) Run(run func()) *MockPlcUnsubscriptionRequest_String_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_String_Call) Return(_a0 string) *MockPlcUnsubscriptionRequest_String_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequest_String_Call) RunAndReturn(run func() string) *MockPlcUnsubscriptionRequest_String_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockPlcUnsubscriptionRequest interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockPlcUnsubscriptionRequest creates a new instance of MockPlcUnsubscriptionRequest. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockPlcUnsubscriptionRequest(t mockConstructorTestingTNewMockPlcUnsubscriptionRequest) *MockPlcUnsubscriptionRequest {
	mock := &MockPlcUnsubscriptionRequest{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
