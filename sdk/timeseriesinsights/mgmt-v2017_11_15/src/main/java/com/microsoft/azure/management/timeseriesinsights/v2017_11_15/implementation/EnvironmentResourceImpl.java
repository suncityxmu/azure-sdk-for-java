/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EnvironmentResource;
import rx.Observable;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EnvironmentUpdateParameters;
import org.joda.time.Period;
import java.util.List;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EnvironmentCreateOrUpdateParameters;
import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.PartitionKeyProperty;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.ProvisioningState;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.Sku;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EnvironmentStatus;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.StorageLimitExceededBehavior;
import rx.functions.Func1;

class EnvironmentResourceImpl extends GroupableResourceCoreImpl<EnvironmentResource, EnvironmentResourceInner, EnvironmentResourceImpl, TimeSeriesInsightsManager> implements EnvironmentResource, EnvironmentResource.Definition, EnvironmentResource.Update {
    private EnvironmentCreateOrUpdateParameters createParameter;
    private EnvironmentUpdateParameters updateParameter;
    EnvironmentResourceImpl(String name, EnvironmentResourceInner inner, TimeSeriesInsightsManager manager) {
        super(name, inner, manager);
        this.createParameter = new EnvironmentCreateOrUpdateParameters();
        this.updateParameter = new EnvironmentUpdateParameters();
    }

    @Override
    public Observable<EnvironmentResource> createResourceAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<EnvironmentResourceInner, EnvironmentResourceInner>() {
               @Override
               public EnvironmentResourceInner call(EnvironmentResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EnvironmentResource> updateResourceAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<EnvironmentResourceInner, EnvironmentResourceInner>() {
               @Override
               public EnvironmentResourceInner call(EnvironmentResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EnvironmentResourceInner> getInnerAsync() {
        EnvironmentsInner client = this.manager().inner().environments();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new EnvironmentCreateOrUpdateParameters();
        this.updateParameter = new EnvironmentUpdateParameters();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String dataAccessFqdn() {
        return this.inner().dataAccessFqdn();
    }

    @Override
    public UUID dataAccessId() {
        return this.inner().dataAccessId();
    }

    @Override
    public Period dataRetentionTime() {
        return this.inner().dataRetentionTime();
    }

    @Override
    public List<PartitionKeyProperty> partitionKeyProperties() {
        return this.inner().partitionKeyProperties();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public EnvironmentStatus status() {
        return this.inner().status();
    }

    @Override
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.inner().storageLimitExceededBehavior();
    }

    @Override
    public EnvironmentResourceImpl withDataRetentionTime(Period dataRetentionTime) {
        if (isInCreateMode()) {
            this.createParameter.withDataRetentionTime(dataRetentionTime);
        } else {
            this.updateParameter.withDataRetentionTime(dataRetentionTime);
        }
        return this;
    }

    @Override
    public EnvironmentResourceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public EnvironmentResourceImpl withPartitionKeyProperties(List<PartitionKeyProperty> partitionKeyProperties) {
        if (isInCreateMode()) {
            this.createParameter.withPartitionKeyProperties(partitionKeyProperties);
        } else {
            this.updateParameter.withPartitionKeyProperties(partitionKeyProperties);
        }
        return this;
    }

    @Override
    public EnvironmentResourceImpl withStorageLimitExceededBehavior(StorageLimitExceededBehavior storageLimitExceededBehavior) {
        if (isInCreateMode()) {
            this.createParameter.withStorageLimitExceededBehavior(storageLimitExceededBehavior);
        } else {
            this.updateParameter.withStorageLimitExceededBehavior(storageLimitExceededBehavior);
        }
        return this;
    }

}