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

package _default

import (
	plc4go "github.com/apache/plc4x/plc4go/pkg/api"
	mock "github.com/stretchr/testify/mock"

	spi "github.com/apache/plc4x/plc4go/spi"
)

// MockDefaultPlcConnectionCloseResult is an autogenerated mock type for the DefaultPlcConnectionCloseResult type
type MockDefaultPlcConnectionCloseResult struct {
	mock.Mock
}

type MockDefaultPlcConnectionCloseResult_Expecter struct {
	mock *mock.Mock
}

func (_m *MockDefaultPlcConnectionCloseResult) EXPECT() *MockDefaultPlcConnectionCloseResult_Expecter {
	return &MockDefaultPlcConnectionCloseResult_Expecter{mock: &_m.Mock}
}

// GetConnection provides a mock function with given fields:
func (_m *MockDefaultPlcConnectionCloseResult) GetConnection() plc4go.PlcConnection {
	ret := _m.Called()

	var r0 plc4go.PlcConnection
	if rf, ok := ret.Get(0).(func() plc4go.PlcConnection); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(plc4go.PlcConnection)
		}
	}

	return r0
}

// MockDefaultPlcConnectionCloseResult_GetConnection_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetConnection'
type MockDefaultPlcConnectionCloseResult_GetConnection_Call struct {
	*mock.Call
}

// GetConnection is a helper method to define mock.On call
func (_e *MockDefaultPlcConnectionCloseResult_Expecter) GetConnection() *MockDefaultPlcConnectionCloseResult_GetConnection_Call {
	return &MockDefaultPlcConnectionCloseResult_GetConnection_Call{Call: _e.mock.On("GetConnection")}
}

func (_c *MockDefaultPlcConnectionCloseResult_GetConnection_Call) Run(run func()) *MockDefaultPlcConnectionCloseResult_GetConnection_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetConnection_Call) Return(_a0 plc4go.PlcConnection) *MockDefaultPlcConnectionCloseResult_GetConnection_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetConnection_Call) RunAndReturn(run func() plc4go.PlcConnection) *MockDefaultPlcConnectionCloseResult_GetConnection_Call {
	_c.Call.Return(run)
	return _c
}

// GetErr provides a mock function with given fields:
func (_m *MockDefaultPlcConnectionCloseResult) GetErr() error {
	ret := _m.Called()

	var r0 error
	if rf, ok := ret.Get(0).(func() error); ok {
		r0 = rf()
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDefaultPlcConnectionCloseResult_GetErr_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetErr'
type MockDefaultPlcConnectionCloseResult_GetErr_Call struct {
	*mock.Call
}

// GetErr is a helper method to define mock.On call
func (_e *MockDefaultPlcConnectionCloseResult_Expecter) GetErr() *MockDefaultPlcConnectionCloseResult_GetErr_Call {
	return &MockDefaultPlcConnectionCloseResult_GetErr_Call{Call: _e.mock.On("GetErr")}
}

func (_c *MockDefaultPlcConnectionCloseResult_GetErr_Call) Run(run func()) *MockDefaultPlcConnectionCloseResult_GetErr_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetErr_Call) Return(_a0 error) *MockDefaultPlcConnectionCloseResult_GetErr_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetErr_Call) RunAndReturn(run func() error) *MockDefaultPlcConnectionCloseResult_GetErr_Call {
	_c.Call.Return(run)
	return _c
}

// GetTraces provides a mock function with given fields:
func (_m *MockDefaultPlcConnectionCloseResult) GetTraces() []spi.TraceEntry {
	ret := _m.Called()

	var r0 []spi.TraceEntry
	if rf, ok := ret.Get(0).(func() []spi.TraceEntry); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).([]spi.TraceEntry)
		}
	}

	return r0
}

// MockDefaultPlcConnectionCloseResult_GetTraces_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetTraces'
type MockDefaultPlcConnectionCloseResult_GetTraces_Call struct {
	*mock.Call
}

// GetTraces is a helper method to define mock.On call
func (_e *MockDefaultPlcConnectionCloseResult_Expecter) GetTraces() *MockDefaultPlcConnectionCloseResult_GetTraces_Call {
	return &MockDefaultPlcConnectionCloseResult_GetTraces_Call{Call: _e.mock.On("GetTraces")}
}

func (_c *MockDefaultPlcConnectionCloseResult_GetTraces_Call) Run(run func()) *MockDefaultPlcConnectionCloseResult_GetTraces_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetTraces_Call) Return(_a0 []spi.TraceEntry) *MockDefaultPlcConnectionCloseResult_GetTraces_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultPlcConnectionCloseResult_GetTraces_Call) RunAndReturn(run func() []spi.TraceEntry) *MockDefaultPlcConnectionCloseResult_GetTraces_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockDefaultPlcConnectionCloseResult interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockDefaultPlcConnectionCloseResult creates a new instance of MockDefaultPlcConnectionCloseResult. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockDefaultPlcConnectionCloseResult(t mockConstructorTestingTNewMockDefaultPlcConnectionCloseResult) *MockDefaultPlcConnectionCloseResult {
	mock := &MockDefaultPlcConnectionCloseResult{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
