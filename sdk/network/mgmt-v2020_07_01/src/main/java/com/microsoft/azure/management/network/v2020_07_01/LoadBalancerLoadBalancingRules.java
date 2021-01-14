/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.LoadBalancerLoadBalancingRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LoadBalancerLoadBalancingRules.
 */
public interface LoadBalancerLoadBalancingRules extends HasInner<LoadBalancerLoadBalancingRulesInner> {
    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancingRule> getAsync(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName);

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LoadBalancingRule> listAsync(final String resourceGroupName, final String loadBalancerName);

}
