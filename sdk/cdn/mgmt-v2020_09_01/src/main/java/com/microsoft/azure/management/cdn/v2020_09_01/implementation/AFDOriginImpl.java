/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.AFDOrigin;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDOriginUpdateParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourceReference;
import com.microsoft.azure.management.cdn.v2020_09_01.EnabledState;
import com.microsoft.azure.management.cdn.v2020_09_01.AfdProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.DeploymentStatus;
import rx.functions.Func1;

class AFDOriginImpl extends CreatableUpdatableImpl<AFDOrigin, AFDOriginInner, AFDOriginImpl> implements AFDOrigin, AFDOrigin.Definition, AFDOrigin.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String originGroupName;
    private String originName;
    private AFDOriginUpdateParameters updateParameter;

    AFDOriginImpl(String name, CdnManager manager) {
        super(name, new AFDOriginInner());
        this.manager = manager;
        // Set resource name
        this.originName = name;
        //
        this.updateParameter = new AFDOriginUpdateParameters();
    }

    AFDOriginImpl(AFDOriginInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.originName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.originGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "originGroups");
        this.originName = IdParsingUtils.getValueFromIdByName(inner.id(), "origins");
        //
        this.updateParameter = new AFDOriginUpdateParameters();
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AFDOrigin> createResourceAsync() {
        AFDOriginsInner client = this.manager().inner().aFDOrigins();
        return client.createAsync(this.resourceGroupName, this.profileName, this.originGroupName, this.originName, this.inner())
            .map(new Func1<AFDOriginInner, AFDOriginInner>() {
               @Override
               public AFDOriginInner call(AFDOriginInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AFDOrigin> updateResourceAsync() {
        AFDOriginsInner client = this.manager().inner().aFDOrigins();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.originGroupName, this.originName, this.updateParameter)
            .map(new Func1<AFDOriginInner, AFDOriginInner>() {
               @Override
               public AFDOriginInner call(AFDOriginInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AFDOriginInner> getInnerAsync() {
        AFDOriginsInner client = this.manager().inner().aFDOrigins();
        return client.getAsync(this.resourceGroupName, this.profileName, this.originGroupName, this.originName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AFDOriginUpdateParameters();
    }

    @Override
    public ResourceReference azureOrigin() {
        return this.inner().azureOrigin();
    }

    @Override
    public DeploymentStatus deploymentStatus() {
        return this.inner().deploymentStatus();
    }

    @Override
    public EnabledState enabledState() {
        return this.inner().enabledState();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public Integer httpPort() {
        return this.inner().httpPort();
    }

    @Override
    public Integer httpsPort() {
        return this.inner().httpsPort();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String originHostHeader() {
        return this.inner().originHostHeader();
    }

    @Override
    public Integer priority() {
        return this.inner().priority();
    }

    @Override
    public AfdProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Object sharedPrivateLinkResource() {
        return this.inner().sharedPrivateLinkResource();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Integer weight() {
        return this.inner().weight();
    }

    @Override
    public AFDOriginImpl withExistingOriginGroup(String resourceGroupName, String profileName, String originGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.originGroupName = originGroupName;
        return this;
    }

    @Override
    public AFDOriginImpl withHostName(String hostName) {
        if (isInCreateMode()) {
            this.inner().withHostName(hostName);
        } else {
            this.updateParameter.withHostName(hostName);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withAzureOrigin(ResourceReference azureOrigin) {
        if (isInCreateMode()) {
            this.inner().withAzureOrigin(azureOrigin);
        } else {
            this.updateParameter.withAzureOrigin(azureOrigin);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withEnabledState(EnabledState enabledState) {
        if (isInCreateMode()) {
            this.inner().withEnabledState(enabledState);
        } else {
            this.updateParameter.withEnabledState(enabledState);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withHttpPort(Integer httpPort) {
        if (isInCreateMode()) {
            this.inner().withHttpPort(httpPort);
        } else {
            this.updateParameter.withHttpPort(httpPort);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withHttpsPort(Integer httpsPort) {
        if (isInCreateMode()) {
            this.inner().withHttpsPort(httpsPort);
        } else {
            this.updateParameter.withHttpsPort(httpsPort);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withOriginHostHeader(String originHostHeader) {
        if (isInCreateMode()) {
            this.inner().withOriginHostHeader(originHostHeader);
        } else {
            this.updateParameter.withOriginHostHeader(originHostHeader);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withPriority(Integer priority) {
        if (isInCreateMode()) {
            this.inner().withPriority(priority);
        } else {
            this.updateParameter.withPriority(priority);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withSharedPrivateLinkResource(Object sharedPrivateLinkResource) {
        if (isInCreateMode()) {
            this.inner().withSharedPrivateLinkResource(sharedPrivateLinkResource);
        } else {
            this.updateParameter.withSharedPrivateLinkResource(sharedPrivateLinkResource);
        }
        return this;
    }

    @Override
    public AFDOriginImpl withWeight(Integer weight) {
        if (isInCreateMode()) {
            this.inner().withWeight(weight);
        } else {
            this.updateParameter.withWeight(weight);
        }
        return this;
    }

}
