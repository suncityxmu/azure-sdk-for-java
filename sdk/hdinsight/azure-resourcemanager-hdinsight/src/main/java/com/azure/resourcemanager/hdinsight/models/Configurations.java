// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.Map;

/** Resource collection API of Configurations. */
public interface Configurations {
    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    ClusterConfigurations list(String resourceGroupName, String clusterName);

    /**
     * Gets all configuration information for an HDI cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all configuration information for an HDI cluster.
     */
    Response<ClusterConfigurations> listWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The cluster configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters);

    /**
     * Configures the HTTP settings on the specified cluster. This API is deprecated, please use UpdateGatewaySettings
     * in cluster endpoint instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param parameters The cluster configurations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context);

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    Map<String, String> get(String resourceGroupName, String clusterName, String configurationName);

    /**
     * The configuration object for the specified cluster. This API is not recommended and might be removed in the
     * future. Please consider using List configurations API instead.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param configurationName The name of the cluster configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration object for the specified configuration for the specified cluster.
     */
    Response<Map<String, String>> getWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context);
}
