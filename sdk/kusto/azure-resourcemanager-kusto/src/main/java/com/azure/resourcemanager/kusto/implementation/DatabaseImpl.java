// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import com.azure.resourcemanager.kusto.models.Database;

public final class DatabaseImpl implements Database {
    private DatabaseInner innerObject;

    private final KustoManager serviceManager;

    DatabaseImpl(DatabaseInner innerObject, KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public DatabaseInner innerModel() {
        return this.innerObject;
    }

    private KustoManager manager() {
        return this.serviceManager;
    }
}
