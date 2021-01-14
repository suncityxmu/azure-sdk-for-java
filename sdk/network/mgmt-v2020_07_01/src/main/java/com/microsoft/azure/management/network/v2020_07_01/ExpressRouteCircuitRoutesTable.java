/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The routes table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitRoutesTable {
    /**
     * IP address of a network entity.
     */
    @JsonProperty(value = "network")
    private String network;

    /**
     * NextHop address.
     */
    @JsonProperty(value = "nextHop")
    private String nextHop;

    /**
     * Local preference value as set with the set local-preference route-map
     * configuration command.
     */
    @JsonProperty(value = "locPrf")
    private String locPrf;

    /**
     * Route Weight.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /**
     * Autonomous system paths to the destination network.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get iP address of a network entity.
     *
     * @return the network value
     */
    public String network() {
        return this.network;
    }

    /**
     * Set iP address of a network entity.
     *
     * @param network the network value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * Get nextHop address.
     *
     * @return the nextHop value
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set nextHop address.
     *
     * @param nextHop the nextHop value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Get local preference value as set with the set local-preference route-map configuration command.
     *
     * @return the locPrf value
     */
    public String locPrf() {
        return this.locPrf;
    }

    /**
     * Set local preference value as set with the set local-preference route-map configuration command.
     *
     * @param locPrf the locPrf value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withLocPrf(String locPrf) {
        this.locPrf = locPrf;
        return this;
    }

    /**
     * Get route Weight.
     *
     * @return the weight value
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set route Weight.
     *
     * @param weight the weight value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get autonomous system paths to the destination network.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set autonomous system paths to the destination network.
     *
     * @param path the path value to set
     * @return the ExpressRouteCircuitRoutesTable object itself.
     */
    public ExpressRouteCircuitRoutesTable withPath(String path) {
        this.path = path;
        return this;
    }

}
