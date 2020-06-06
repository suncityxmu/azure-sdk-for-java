// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with ServiceBusManagementError information. */
public final class ServiceBusManagementErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the ServiceBusManagementErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ServiceBusManagementErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ServiceBusManagementErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ServiceBusManagementErrorException(String message, HttpResponse response, ServiceBusManagementError value) {
        super(message, response, value);
    }

    @Override
    public ServiceBusManagementError getValue() {
        return (ServiceBusManagementError) super.getValue();
    }
}