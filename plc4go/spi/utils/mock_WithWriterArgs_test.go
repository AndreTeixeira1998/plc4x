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

package utils

import mock "github.com/stretchr/testify/mock"

// MockWithWriterArgs is an autogenerated mock type for the WithWriterArgs type
type MockWithWriterArgs struct {
	mock.Mock
}

type MockWithWriterArgs_Expecter struct {
	mock *mock.Mock
}

func (_m *MockWithWriterArgs) EXPECT() *MockWithWriterArgs_Expecter {
	return &MockWithWriterArgs_Expecter{mock: &_m.Mock}
}

// isWriterArgs provides a mock function with given fields:
func (_m *MockWithWriterArgs) isWriterArgs() bool {
	ret := _m.Called()

	var r0 bool
	if rf, ok := ret.Get(0).(func() bool); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(bool)
	}

	return r0
}

// MockWithWriterArgs_isWriterArgs_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'isWriterArgs'
type MockWithWriterArgs_isWriterArgs_Call struct {
	*mock.Call
}

// isWriterArgs is a helper method to define mock.On call
func (_e *MockWithWriterArgs_Expecter) isWriterArgs() *MockWithWriterArgs_isWriterArgs_Call {
	return &MockWithWriterArgs_isWriterArgs_Call{Call: _e.mock.On("isWriterArgs")}
}

func (_c *MockWithWriterArgs_isWriterArgs_Call) Run(run func()) *MockWithWriterArgs_isWriterArgs_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockWithWriterArgs_isWriterArgs_Call) Return(_a0 bool) *MockWithWriterArgs_isWriterArgs_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockWithWriterArgs_isWriterArgs_Call) RunAndReturn(run func() bool) *MockWithWriterArgs_isWriterArgs_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockWithWriterArgs interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockWithWriterArgs creates a new instance of MockWithWriterArgs. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockWithWriterArgs(t mockConstructorTestingTNewMockWithWriterArgs) *MockWithWriterArgs {
	mock := &MockWithWriterArgs{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
