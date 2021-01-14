/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.ExpressRouteCircuitAuthorization;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.AuthorizationUseStatus;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;

class ExpressRouteCircuitAuthorizationImpl extends CreatableUpdatableImpl<ExpressRouteCircuitAuthorization, ExpressRouteCircuitAuthorizationInner, ExpressRouteCircuitAuthorizationImpl> implements ExpressRouteCircuitAuthorization, ExpressRouteCircuitAuthorization.Definition, ExpressRouteCircuitAuthorization.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String circuitName;
    private String authorizationName;

    ExpressRouteCircuitAuthorizationImpl(String name, NetworkManager manager) {
        super(name, new ExpressRouteCircuitAuthorizationInner());
        this.manager = manager;
        // Set resource name
        this.authorizationName = name;
        //
    }

    ExpressRouteCircuitAuthorizationImpl(ExpressRouteCircuitAuthorizationInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.authorizationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.circuitName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteCircuits");
        this.authorizationName = IdParsingUtils.getValueFromIdByName(inner.id(), "authorizations");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteCircuitAuthorization> createResourceAsync() {
        ExpressRouteCircuitAuthorizationsInner client = this.manager().inner().expressRouteCircuitAuthorizations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.authorizationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCircuitAuthorization> updateResourceAsync() {
        ExpressRouteCircuitAuthorizationsInner client = this.manager().inner().expressRouteCircuitAuthorizations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.authorizationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCircuitAuthorizationInner> getInnerAsync() {
        ExpressRouteCircuitAuthorizationsInner client = this.manager().inner().expressRouteCircuitAuthorizations();
        return client.getAsync(this.resourceGroupName, this.circuitName, this.authorizationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String authorizationKey() {
        return this.inner().authorizationKey();
    }

    @Override
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.inner().authorizationUseStatus();
    }

    @Override
    public String etag() {
        return this.inner().etag();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl withExistingExpressRouteCircuit(String resourceGroupName, String circuitName) {
        this.resourceGroupName = resourceGroupName;
        this.circuitName = circuitName;
        return this;
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl withAuthorizationKey(String authorizationKey) {
        this.inner().withAuthorizationKey(authorizationKey);
        return this;
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus) {
        this.inner().withAuthorizationUseStatus(authorizationUseStatus);
        return this;
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

}
