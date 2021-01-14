/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.ExpressRouteCircuit;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.ExpressRouteCircuitSku;
import com.microsoft.azure.management.network.v2020_07_01.ServiceProviderProvisioningState;
import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.ExpressRouteCircuitServiceProviderProperties;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_07_01.ExpressRouteCircuitAuthorization;
import com.microsoft.azure.management.network.v2020_07_01.ExpressRouteCircuitPeering;

class ExpressRouteCircuitImpl extends GroupableResourceCoreImpl<ExpressRouteCircuit, ExpressRouteCircuitInner, ExpressRouteCircuitImpl, NetworkManager> implements ExpressRouteCircuit, ExpressRouteCircuit.Definition, ExpressRouteCircuit.Update {
    ExpressRouteCircuitImpl(String name, ExpressRouteCircuitInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ExpressRouteCircuit> createResourceAsync() {
        ExpressRouteCircuitsInner client = this.manager().inner().expressRouteCircuits();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCircuit> updateResourceAsync() {
        ExpressRouteCircuitsInner client = this.manager().inner().expressRouteCircuits();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCircuitInner> getInnerAsync() {
        ExpressRouteCircuitsInner client = this.manager().inner().expressRouteCircuits();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean allowClassicOperations() {
        return this.inner().allowClassicOperations();
    }

    @Override
    public List<ExpressRouteCircuitAuthorization> authorizations() {
        List<ExpressRouteCircuitAuthorization> lst = new ArrayList<ExpressRouteCircuitAuthorization>();
        if (this.inner().authorizations() != null) {
            for (ExpressRouteCircuitAuthorizationInner inner : this.inner().authorizations()) {
                lst.add( new ExpressRouteCircuitAuthorizationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public Double bandwidthInGbps() {
        return this.inner().bandwidthInGbps();
    }

    @Override
    public String circuitProvisioningState() {
        return this.inner().circuitProvisioningState();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource expressRoutePort() {
        return this.inner().expressRoutePort();
    }

    @Override
    public String gatewayManagerEtag() {
        return this.inner().gatewayManagerEtag();
    }

    @Override
    public Boolean globalReachEnabled() {
        return this.inner().globalReachEnabled();
    }

    @Override
    public List<ExpressRouteCircuitPeering> peerings() {
        List<ExpressRouteCircuitPeering> lst = new ArrayList<ExpressRouteCircuitPeering>();
        if (this.inner().peerings() != null) {
            for (ExpressRouteCircuitPeeringInner inner : this.inner().peerings()) {
                lst.add( new ExpressRouteCircuitPeeringImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String serviceKey() {
        return this.inner().serviceKey();
    }

    @Override
    public String serviceProviderNotes() {
        return this.inner().serviceProviderNotes();
    }

    @Override
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.inner().serviceProviderProperties();
    }

    @Override
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.inner().serviceProviderProvisioningState();
    }

    @Override
    public ExpressRouteCircuitSku sku() {
        return this.inner().sku();
    }

    @Override
    public Integer stag() {
        return this.inner().stag();
    }

    @Override
    public ExpressRouteCircuitImpl withAllowClassicOperations(Boolean allowClassicOperations) {
        this.inner().withAllowClassicOperations(allowClassicOperations);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.inner().withAuthorizations(authorizations);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withBandwidthInGbps(Double bandwidthInGbps) {
        this.inner().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withCircuitProvisioningState(String circuitProvisioningState) {
        this.inner().withCircuitProvisioningState(circuitProvisioningState);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withExpressRoutePort(SubResource expressRoutePort) {
        this.inner().withExpressRoutePort(expressRoutePort);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withGatewayManagerEtag(String gatewayManagerEtag) {
        this.inner().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withGlobalReachEnabled(Boolean globalReachEnabled) {
        this.inner().withGlobalReachEnabled(globalReachEnabled);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.inner().withPeerings(peerings);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withServiceKey(String serviceKey) {
        this.inner().withServiceKey(serviceKey);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withServiceProviderNotes(String serviceProviderNotes) {
        this.inner().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.inner().withServiceProviderProperties(serviceProviderProperties);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.inner().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

    @Override
    public ExpressRouteCircuitImpl withSku(ExpressRouteCircuitSku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
