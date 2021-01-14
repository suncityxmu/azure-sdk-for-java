// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresql.fluent.models.ServerAdministratorResourceInner;

/** An instance of this class provides access to all the operations defined in ServerAdministratorsClient. */
public interface ServerAdministratorsClient {
    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a AAD server administrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerAdministratorResourceInner get(String resourceGroupName, String serverName);

    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a AAD server administrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerAdministratorResourceInner> getWithResponse(
        String resourceGroupName, String serverName, Context context);

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the
     * existing administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a and external administrator to be created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerAdministratorResourceInner>, ServerAdministratorResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties);

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the
     * existing administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a and external administrator to be created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerAdministratorResourceInner>, ServerAdministratorResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties, Context context);

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the
     * existing administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a and external administrator to be created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerAdministratorResourceInner createOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties);

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the
     * existing administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a and external administrator to be created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerAdministratorResourceInner createOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties, Context context);

    /**
     * Deletes server active directory administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName);

    /**
     * Deletes server active directory administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, Context context);

    /**
     * Deletes server active directory administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName);

    /**
     * Deletes server active directory administrator.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, Context context);

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list Active Directory Administrators request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerAdministratorResourceInner> list(String resourceGroupName, String serverName);

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list Active Directory Administrators request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerAdministratorResourceInner> list(String resourceGroupName, String serverName, Context context);
}
