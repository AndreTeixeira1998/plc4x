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

// MockPlcUnsubscriptionRequestResult is an autogenerated mock type for the PlcUnsubscriptionRequestResult type
type MockPlcUnsubscriptionRequestResult struct {
	mock.Mock
}

type MockPlcUnsubscriptionRequestResult_Expecter struct {
	mock *mock.Mock
}

func (_m *MockPlcUnsubscriptionRequestResult) EXPECT() *MockPlcUnsubscriptionRequestResult_Expecter {
	return &MockPlcUnsubscriptionRequestResult_Expecter{mock: &_m.Mock}
}

// GetErr provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequestResult) GetErr() error {
	ret := _m.Called()

	var r0 error
	if rf, ok := ret.Get(0).(func() error); ok {
		r0 = rf()
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockPlcUnsubscriptionRequestResult_GetErr_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetErr'
type MockPlcUnsubscriptionRequestResult_GetErr_Call struct {
	*mock.Call
}

// GetErr is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequestResult_Expecter) GetErr() *MockPlcUnsubscriptionRequestResult_GetErr_Call {
	return &MockPlcUnsubscriptionRequestResult_GetErr_Call{Call: _e.mock.On("GetErr")}
}

func (_c *MockPlcUnsubscriptionRequestResult_GetErr_Call) Run(run func()) *MockPlcUnsubscriptionRequestResult_GetErr_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetErr_Call) Return(_a0 error) *MockPlcUnsubscriptionRequestResult_GetErr_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetErr_Call) RunAndReturn(run func() error) *MockPlcUnsubscriptionRequestResult_GetErr_Call {
	_c.Call.Return(run)
	return _c
}

// GetRequest provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequestResult) GetRequest() PlcUnsubscriptionRequest {
	ret := _m.Called()

	var r0 PlcUnsubscriptionRequest
	if rf, ok := ret.Get(0).(func() PlcUnsubscriptionRequest); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(PlcUnsubscriptionRequest)
		}
	}

	return r0
}

// MockPlcUnsubscriptionRequestResult_GetRequest_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetRequest'
type MockPlcUnsubscriptionRequestResult_GetRequest_Call struct {
	*mock.Call
}

// GetRequest is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequestResult_Expecter) GetRequest() *MockPlcUnsubscriptionRequestResult_GetRequest_Call {
	return &MockPlcUnsubscriptionRequestResult_GetRequest_Call{Call: _e.mock.On("GetRequest")}
}

func (_c *MockPlcUnsubscriptionRequestResult_GetRequest_Call) Run(run func()) *MockPlcUnsubscriptionRequestResult_GetRequest_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetRequest_Call) Return(_a0 PlcUnsubscriptionRequest) *MockPlcUnsubscriptionRequestResult_GetRequest_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetRequest_Call) RunAndReturn(run func() PlcUnsubscriptionRequest) *MockPlcUnsubscriptionRequestResult_GetRequest_Call {
	_c.Call.Return(run)
	return _c
}

// GetResponse provides a mock function with given fields:
func (_m *MockPlcUnsubscriptionRequestResult) GetResponse() PlcUnsubscriptionResponse {
	ret := _m.Called()

	var r0 PlcUnsubscriptionResponse
	if rf, ok := ret.Get(0).(func() PlcUnsubscriptionResponse); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(PlcUnsubscriptionResponse)
		}
	}

	return r0
}

// MockPlcUnsubscriptionRequestResult_GetResponse_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetResponse'
type MockPlcUnsubscriptionRequestResult_GetResponse_Call struct {
	*mock.Call
}

// GetResponse is a helper method to define mock.On call
func (_e *MockPlcUnsubscriptionRequestResult_Expecter) GetResponse() *MockPlcUnsubscriptionRequestResult_GetResponse_Call {
	return &MockPlcUnsubscriptionRequestResult_GetResponse_Call{Call: _e.mock.On("GetResponse")}
}

func (_c *MockPlcUnsubscriptionRequestResult_GetResponse_Call) Run(run func()) *MockPlcUnsubscriptionRequestResult_GetResponse_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetResponse_Call) Return(_a0 PlcUnsubscriptionResponse) *MockPlcUnsubscriptionRequestResult_GetResponse_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockPlcUnsubscriptionRequestResult_GetResponse_Call) RunAndReturn(run func() PlcUnsubscriptionResponse) *MockPlcUnsubscriptionRequestResult_GetResponse_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockPlcUnsubscriptionRequestResult interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockPlcUnsubscriptionRequestResult creates a new instance of MockPlcUnsubscriptionRequestResult. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockPlcUnsubscriptionRequestResult(t mockConstructorTestingTNewMockPlcUnsubscriptionRequestResult) *MockPlcUnsubscriptionRequestResult {
	mock := &MockPlcUnsubscriptionRequestResult{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
