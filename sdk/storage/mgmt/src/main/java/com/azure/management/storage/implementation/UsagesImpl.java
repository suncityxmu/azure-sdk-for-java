// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.management.storage.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.management.storage.StorageManager;
import com.azure.management.storage.fluent.UsagesClient;
import com.azure.management.storage.models.Usages;
import com.azure.management.storage.fluent.inner.UsageInner;

/** The implementation of {@link Usages}. */
public class UsagesImpl implements Usages {

    private final StorageManager manager;

    public UsagesImpl(StorageManager storageManager) {
        this.manager = storageManager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public PagedIterable<UsageInner> list() {
        return null;
    }

    @Override
    public PagedFlux<UsageInner> listAsync() {
        return null;
    }

    @Override
    public UsagesClient inner() {
        return this.manager().inner().getUsages();
    }
}