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
	context "context"

	model "github.com/apache/plc4x/plc4go/pkg/api/model"
	mock "github.com/stretchr/testify/mock"

	options "github.com/apache/plc4x/plc4go/spi/options"

	plc4go "github.com/apache/plc4x/plc4go/pkg/api"

	spi "github.com/apache/plc4x/plc4go/spi"

	transports "github.com/apache/plc4x/plc4go/spi/transports"

	url "net/url"
)

// MockDefaultDriver is an autogenerated mock type for the DefaultDriver type
type MockDefaultDriver struct {
	mock.Mock
}

type MockDefaultDriver_Expecter struct {
	mock *mock.Mock
}

func (_m *MockDefaultDriver) EXPECT() *MockDefaultDriver_Expecter {
	return &MockDefaultDriver_Expecter{mock: &_m.Mock}
}

// CheckQuery provides a mock function with given fields: query
func (_m *MockDefaultDriver) CheckQuery(query string) error {
	ret := _m.Called(query)

	var r0 error
	if rf, ok := ret.Get(0).(func(string) error); ok {
		r0 = rf(query)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDefaultDriver_CheckQuery_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'CheckQuery'
type MockDefaultDriver_CheckQuery_Call struct {
	*mock.Call
}

// CheckQuery is a helper method to define mock.On call
//   - query string
func (_e *MockDefaultDriver_Expecter) CheckQuery(query interface{}) *MockDefaultDriver_CheckQuery_Call {
	return &MockDefaultDriver_CheckQuery_Call{Call: _e.mock.On("CheckQuery", query)}
}

func (_c *MockDefaultDriver_CheckQuery_Call) Run(run func(query string)) *MockDefaultDriver_CheckQuery_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(string))
	})
	return _c
}

func (_c *MockDefaultDriver_CheckQuery_Call) Return(_a0 error) *MockDefaultDriver_CheckQuery_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_CheckQuery_Call) RunAndReturn(run func(string) error) *MockDefaultDriver_CheckQuery_Call {
	_c.Call.Return(run)
	return _c
}

// CheckTagAddress provides a mock function with given fields: tagAddress
func (_m *MockDefaultDriver) CheckTagAddress(tagAddress string) error {
	ret := _m.Called(tagAddress)

	var r0 error
	if rf, ok := ret.Get(0).(func(string) error); ok {
		r0 = rf(tagAddress)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDefaultDriver_CheckTagAddress_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'CheckTagAddress'
type MockDefaultDriver_CheckTagAddress_Call struct {
	*mock.Call
}

// CheckTagAddress is a helper method to define mock.On call
//   - tagAddress string
func (_e *MockDefaultDriver_Expecter) CheckTagAddress(tagAddress interface{}) *MockDefaultDriver_CheckTagAddress_Call {
	return &MockDefaultDriver_CheckTagAddress_Call{Call: _e.mock.On("CheckTagAddress", tagAddress)}
}

func (_c *MockDefaultDriver_CheckTagAddress_Call) Run(run func(tagAddress string)) *MockDefaultDriver_CheckTagAddress_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(string))
	})
	return _c
}

func (_c *MockDefaultDriver_CheckTagAddress_Call) Return(_a0 error) *MockDefaultDriver_CheckTagAddress_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_CheckTagAddress_Call) RunAndReturn(run func(string) error) *MockDefaultDriver_CheckTagAddress_Call {
	_c.Call.Return(run)
	return _c
}

// Discover provides a mock function with given fields: callback, discoveryOptions
func (_m *MockDefaultDriver) Discover(callback func(model.PlcDiscoveryItem), discoveryOptions ...options.WithDiscoveryOption) error {
	_va := make([]interface{}, len(discoveryOptions))
	for _i := range discoveryOptions {
		_va[_i] = discoveryOptions[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, callback)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 error
	if rf, ok := ret.Get(0).(func(func(model.PlcDiscoveryItem), ...options.WithDiscoveryOption) error); ok {
		r0 = rf(callback, discoveryOptions...)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDefaultDriver_Discover_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'Discover'
type MockDefaultDriver_Discover_Call struct {
	*mock.Call
}

// Discover is a helper method to define mock.On call
//   - callback func(model.PlcDiscoveryItem)
//   - discoveryOptions ...options.WithDiscoveryOption
func (_e *MockDefaultDriver_Expecter) Discover(callback interface{}, discoveryOptions ...interface{}) *MockDefaultDriver_Discover_Call {
	return &MockDefaultDriver_Discover_Call{Call: _e.mock.On("Discover",
		append([]interface{}{callback}, discoveryOptions...)...)}
}

func (_c *MockDefaultDriver_Discover_Call) Run(run func(callback func(model.PlcDiscoveryItem), discoveryOptions ...options.WithDiscoveryOption)) *MockDefaultDriver_Discover_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]options.WithDiscoveryOption, len(args)-1)
		for i, a := range args[1:] {
			if a != nil {
				variadicArgs[i] = a.(options.WithDiscoveryOption)
			}
		}
		run(args[0].(func(model.PlcDiscoveryItem)), variadicArgs...)
	})
	return _c
}

func (_c *MockDefaultDriver_Discover_Call) Return(_a0 error) *MockDefaultDriver_Discover_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_Discover_Call) RunAndReturn(run func(func(model.PlcDiscoveryItem), ...options.WithDiscoveryOption) error) *MockDefaultDriver_Discover_Call {
	_c.Call.Return(run)
	return _c
}

// DiscoverWithContext provides a mock function with given fields: ctx, callback, discoveryOptions
func (_m *MockDefaultDriver) DiscoverWithContext(ctx context.Context, callback func(model.PlcDiscoveryItem), discoveryOptions ...options.WithDiscoveryOption) error {
	_va := make([]interface{}, len(discoveryOptions))
	for _i := range discoveryOptions {
		_va[_i] = discoveryOptions[_i]
	}
	var _ca []interface{}
	_ca = append(_ca, ctx, callback)
	_ca = append(_ca, _va...)
	ret := _m.Called(_ca...)

	var r0 error
	if rf, ok := ret.Get(0).(func(context.Context, func(model.PlcDiscoveryItem), ...options.WithDiscoveryOption) error); ok {
		r0 = rf(ctx, callback, discoveryOptions...)
	} else {
		r0 = ret.Error(0)
	}

	return r0
}

// MockDefaultDriver_DiscoverWithContext_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'DiscoverWithContext'
type MockDefaultDriver_DiscoverWithContext_Call struct {
	*mock.Call
}

// DiscoverWithContext is a helper method to define mock.On call
//   - ctx context.Context
//   - callback func(model.PlcDiscoveryItem)
//   - discoveryOptions ...options.WithDiscoveryOption
func (_e *MockDefaultDriver_Expecter) DiscoverWithContext(ctx interface{}, callback interface{}, discoveryOptions ...interface{}) *MockDefaultDriver_DiscoverWithContext_Call {
	return &MockDefaultDriver_DiscoverWithContext_Call{Call: _e.mock.On("DiscoverWithContext",
		append([]interface{}{ctx, callback}, discoveryOptions...)...)}
}

func (_c *MockDefaultDriver_DiscoverWithContext_Call) Run(run func(ctx context.Context, callback func(model.PlcDiscoveryItem), discoveryOptions ...options.WithDiscoveryOption)) *MockDefaultDriver_DiscoverWithContext_Call {
	_c.Call.Run(func(args mock.Arguments) {
		variadicArgs := make([]options.WithDiscoveryOption, len(args)-2)
		for i, a := range args[2:] {
			if a != nil {
				variadicArgs[i] = a.(options.WithDiscoveryOption)
			}
		}
		run(args[0].(context.Context), args[1].(func(model.PlcDiscoveryItem)), variadicArgs...)
	})
	return _c
}

func (_c *MockDefaultDriver_DiscoverWithContext_Call) Return(_a0 error) *MockDefaultDriver_DiscoverWithContext_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_DiscoverWithContext_Call) RunAndReturn(run func(context.Context, func(model.PlcDiscoveryItem), ...options.WithDiscoveryOption) error) *MockDefaultDriver_DiscoverWithContext_Call {
	_c.Call.Return(run)
	return _c
}

// GetConnection provides a mock function with given fields: transportUrl, _a1, _a2
func (_m *MockDefaultDriver) GetConnection(transportUrl url.URL, _a1 map[string]transports.Transport, _a2 map[string][]string) <-chan plc4go.PlcConnectionConnectResult {
	ret := _m.Called(transportUrl, _a1, _a2)

	var r0 <-chan plc4go.PlcConnectionConnectResult
	if rf, ok := ret.Get(0).(func(url.URL, map[string]transports.Transport, map[string][]string) <-chan plc4go.PlcConnectionConnectResult); ok {
		r0 = rf(transportUrl, _a1, _a2)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(<-chan plc4go.PlcConnectionConnectResult)
		}
	}

	return r0
}

// MockDefaultDriver_GetConnection_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetConnection'
type MockDefaultDriver_GetConnection_Call struct {
	*mock.Call
}

// GetConnection is a helper method to define mock.On call
//   - transportUrl url.URL
//   - _a1 map[string]transports.Transport
//   - _a2 map[string][]string
func (_e *MockDefaultDriver_Expecter) GetConnection(transportUrl interface{}, _a1 interface{}, _a2 interface{}) *MockDefaultDriver_GetConnection_Call {
	return &MockDefaultDriver_GetConnection_Call{Call: _e.mock.On("GetConnection", transportUrl, _a1, _a2)}
}

func (_c *MockDefaultDriver_GetConnection_Call) Run(run func(transportUrl url.URL, _a1 map[string]transports.Transport, _a2 map[string][]string)) *MockDefaultDriver_GetConnection_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(url.URL), args[1].(map[string]transports.Transport), args[2].(map[string][]string))
	})
	return _c
}

func (_c *MockDefaultDriver_GetConnection_Call) Return(_a0 <-chan plc4go.PlcConnectionConnectResult) *MockDefaultDriver_GetConnection_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetConnection_Call) RunAndReturn(run func(url.URL, map[string]transports.Transport, map[string][]string) <-chan plc4go.PlcConnectionConnectResult) *MockDefaultDriver_GetConnection_Call {
	_c.Call.Return(run)
	return _c
}

// GetConnectionWithContext provides a mock function with given fields: ctx, transportUrl, _a2, _a3
func (_m *MockDefaultDriver) GetConnectionWithContext(ctx context.Context, transportUrl url.URL, _a2 map[string]transports.Transport, _a3 map[string][]string) <-chan plc4go.PlcConnectionConnectResult {
	ret := _m.Called(ctx, transportUrl, _a2, _a3)

	var r0 <-chan plc4go.PlcConnectionConnectResult
	if rf, ok := ret.Get(0).(func(context.Context, url.URL, map[string]transports.Transport, map[string][]string) <-chan plc4go.PlcConnectionConnectResult); ok {
		r0 = rf(ctx, transportUrl, _a2, _a3)
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(<-chan plc4go.PlcConnectionConnectResult)
		}
	}

	return r0
}

// MockDefaultDriver_GetConnectionWithContext_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetConnectionWithContext'
type MockDefaultDriver_GetConnectionWithContext_Call struct {
	*mock.Call
}

// GetConnectionWithContext is a helper method to define mock.On call
//   - ctx context.Context
//   - transportUrl url.URL
//   - _a2 map[string]transports.Transport
//   - _a3 map[string][]string
func (_e *MockDefaultDriver_Expecter) GetConnectionWithContext(ctx interface{}, transportUrl interface{}, _a2 interface{}, _a3 interface{}) *MockDefaultDriver_GetConnectionWithContext_Call {
	return &MockDefaultDriver_GetConnectionWithContext_Call{Call: _e.mock.On("GetConnectionWithContext", ctx, transportUrl, _a2, _a3)}
}

func (_c *MockDefaultDriver_GetConnectionWithContext_Call) Run(run func(ctx context.Context, transportUrl url.URL, _a2 map[string]transports.Transport, _a3 map[string][]string)) *MockDefaultDriver_GetConnectionWithContext_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run(args[0].(context.Context), args[1].(url.URL), args[2].(map[string]transports.Transport), args[3].(map[string][]string))
	})
	return _c
}

func (_c *MockDefaultDriver_GetConnectionWithContext_Call) Return(_a0 <-chan plc4go.PlcConnectionConnectResult) *MockDefaultDriver_GetConnectionWithContext_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetConnectionWithContext_Call) RunAndReturn(run func(context.Context, url.URL, map[string]transports.Transport, map[string][]string) <-chan plc4go.PlcConnectionConnectResult) *MockDefaultDriver_GetConnectionWithContext_Call {
	_c.Call.Return(run)
	return _c
}

// GetDefaultTransport provides a mock function with given fields:
func (_m *MockDefaultDriver) GetDefaultTransport() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockDefaultDriver_GetDefaultTransport_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetDefaultTransport'
type MockDefaultDriver_GetDefaultTransport_Call struct {
	*mock.Call
}

// GetDefaultTransport is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) GetDefaultTransport() *MockDefaultDriver_GetDefaultTransport_Call {
	return &MockDefaultDriver_GetDefaultTransport_Call{Call: _e.mock.On("GetDefaultTransport")}
}

func (_c *MockDefaultDriver_GetDefaultTransport_Call) Run(run func()) *MockDefaultDriver_GetDefaultTransport_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_GetDefaultTransport_Call) Return(_a0 string) *MockDefaultDriver_GetDefaultTransport_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetDefaultTransport_Call) RunAndReturn(run func() string) *MockDefaultDriver_GetDefaultTransport_Call {
	_c.Call.Return(run)
	return _c
}

// GetPlcTagHandler provides a mock function with given fields:
func (_m *MockDefaultDriver) GetPlcTagHandler() spi.PlcTagHandler {
	ret := _m.Called()

	var r0 spi.PlcTagHandler
	if rf, ok := ret.Get(0).(func() spi.PlcTagHandler); ok {
		r0 = rf()
	} else {
		if ret.Get(0) != nil {
			r0 = ret.Get(0).(spi.PlcTagHandler)
		}
	}

	return r0
}

// MockDefaultDriver_GetPlcTagHandler_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetPlcTagHandler'
type MockDefaultDriver_GetPlcTagHandler_Call struct {
	*mock.Call
}

// GetPlcTagHandler is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) GetPlcTagHandler() *MockDefaultDriver_GetPlcTagHandler_Call {
	return &MockDefaultDriver_GetPlcTagHandler_Call{Call: _e.mock.On("GetPlcTagHandler")}
}

func (_c *MockDefaultDriver_GetPlcTagHandler_Call) Run(run func()) *MockDefaultDriver_GetPlcTagHandler_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_GetPlcTagHandler_Call) Return(_a0 spi.PlcTagHandler) *MockDefaultDriver_GetPlcTagHandler_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetPlcTagHandler_Call) RunAndReturn(run func() spi.PlcTagHandler) *MockDefaultDriver_GetPlcTagHandler_Call {
	_c.Call.Return(run)
	return _c
}

// GetProtocolCode provides a mock function with given fields:
func (_m *MockDefaultDriver) GetProtocolCode() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockDefaultDriver_GetProtocolCode_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetProtocolCode'
type MockDefaultDriver_GetProtocolCode_Call struct {
	*mock.Call
}

// GetProtocolCode is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) GetProtocolCode() *MockDefaultDriver_GetProtocolCode_Call {
	return &MockDefaultDriver_GetProtocolCode_Call{Call: _e.mock.On("GetProtocolCode")}
}

func (_c *MockDefaultDriver_GetProtocolCode_Call) Run(run func()) *MockDefaultDriver_GetProtocolCode_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_GetProtocolCode_Call) Return(_a0 string) *MockDefaultDriver_GetProtocolCode_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetProtocolCode_Call) RunAndReturn(run func() string) *MockDefaultDriver_GetProtocolCode_Call {
	_c.Call.Return(run)
	return _c
}

// GetProtocolName provides a mock function with given fields:
func (_m *MockDefaultDriver) GetProtocolName() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockDefaultDriver_GetProtocolName_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'GetProtocolName'
type MockDefaultDriver_GetProtocolName_Call struct {
	*mock.Call
}

// GetProtocolName is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) GetProtocolName() *MockDefaultDriver_GetProtocolName_Call {
	return &MockDefaultDriver_GetProtocolName_Call{Call: _e.mock.On("GetProtocolName")}
}

func (_c *MockDefaultDriver_GetProtocolName_Call) Run(run func()) *MockDefaultDriver_GetProtocolName_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_GetProtocolName_Call) Return(_a0 string) *MockDefaultDriver_GetProtocolName_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_GetProtocolName_Call) RunAndReturn(run func() string) *MockDefaultDriver_GetProtocolName_Call {
	_c.Call.Return(run)
	return _c
}

// String provides a mock function with given fields:
func (_m *MockDefaultDriver) String() string {
	ret := _m.Called()

	var r0 string
	if rf, ok := ret.Get(0).(func() string); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(string)
	}

	return r0
}

// MockDefaultDriver_String_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'String'
type MockDefaultDriver_String_Call struct {
	*mock.Call
}

// String is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) String() *MockDefaultDriver_String_Call {
	return &MockDefaultDriver_String_Call{Call: _e.mock.On("String")}
}

func (_c *MockDefaultDriver_String_Call) Run(run func()) *MockDefaultDriver_String_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_String_Call) Return(_a0 string) *MockDefaultDriver_String_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_String_Call) RunAndReturn(run func() string) *MockDefaultDriver_String_Call {
	_c.Call.Return(run)
	return _c
}

// SupportsDiscovery provides a mock function with given fields:
func (_m *MockDefaultDriver) SupportsDiscovery() bool {
	ret := _m.Called()

	var r0 bool
	if rf, ok := ret.Get(0).(func() bool); ok {
		r0 = rf()
	} else {
		r0 = ret.Get(0).(bool)
	}

	return r0
}

// MockDefaultDriver_SupportsDiscovery_Call is a *mock.Call that shadows Run/Return methods with type explicit version for method 'SupportsDiscovery'
type MockDefaultDriver_SupportsDiscovery_Call struct {
	*mock.Call
}

// SupportsDiscovery is a helper method to define mock.On call
func (_e *MockDefaultDriver_Expecter) SupportsDiscovery() *MockDefaultDriver_SupportsDiscovery_Call {
	return &MockDefaultDriver_SupportsDiscovery_Call{Call: _e.mock.On("SupportsDiscovery")}
}

func (_c *MockDefaultDriver_SupportsDiscovery_Call) Run(run func()) *MockDefaultDriver_SupportsDiscovery_Call {
	_c.Call.Run(func(args mock.Arguments) {
		run()
	})
	return _c
}

func (_c *MockDefaultDriver_SupportsDiscovery_Call) Return(_a0 bool) *MockDefaultDriver_SupportsDiscovery_Call {
	_c.Call.Return(_a0)
	return _c
}

func (_c *MockDefaultDriver_SupportsDiscovery_Call) RunAndReturn(run func() bool) *MockDefaultDriver_SupportsDiscovery_Call {
	_c.Call.Return(run)
	return _c
}

type mockConstructorTestingTNewMockDefaultDriver interface {
	mock.TestingT
	Cleanup(func())
}

// NewMockDefaultDriver creates a new instance of MockDefaultDriver. It also registers a testing interface on the mock and a cleanup function to assert the mocks expectations.
func NewMockDefaultDriver(t mockConstructorTestingTNewMockDefaultDriver) *MockDefaultDriver {
	mock := &MockDefaultDriver{}
	mock.Mock.Test(t)

	t.Cleanup(func() { mock.AssertExpectations(t) })

	return mock
}
