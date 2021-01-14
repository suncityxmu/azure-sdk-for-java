// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineGroupInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachineGroupUpdate;

/** An instance of this class provides access to all the operations defined in SqlVirtualMachineGroupsClient. */
public interface SqlVirtualMachineGroupsClient {
    /**
     * Gets a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineGroupInner getByResourceGroup(String resourceGroupName, String sqlVirtualMachineGroupName);

    /**
     * Gets a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlVirtualMachineGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context);

    /**
     * Creates or updates a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineGroupInner>, SqlVirtualMachineGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String sqlVirtualMachineGroupName, SqlVirtualMachineGroupInner parameters);

    /**
     * Creates or updates a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineGroupInner>, SqlVirtualMachineGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        SqlVirtualMachineGroupInner parameters,
        Context context);

    /**
     * Creates or updates a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineGroupInner createOrUpdate(
        String resourceGroupName, String sqlVirtualMachineGroupName, SqlVirtualMachineGroupInner parameters);

    /**
     * Creates or updates a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineGroupInner createOrUpdate(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        SqlVirtualMachineGroupInner parameters,
        Context context);

    /**
     * Deletes a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String sqlVirtualMachineGroupName);

    /**
     * Deletes a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context);

    /**
     * Deletes a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineGroupName);

    /**
     * Deletes a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineGroupName, Context context);

    /**
     * Updates SQL virtual machine group tags.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineGroupInner>, SqlVirtualMachineGroupInner> beginUpdate(
        String resourceGroupName, String sqlVirtualMachineGroupName, SqlVirtualMachineGroupUpdate parameters);

    /**
     * Updates SQL virtual machine group tags.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineGroupInner>, SqlVirtualMachineGroupInner> beginUpdate(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        SqlVirtualMachineGroupUpdate parameters,
        Context context);

    /**
     * Updates SQL virtual machine group tags.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineGroupInner update(
        String resourceGroupName, String sqlVirtualMachineGroupName, SqlVirtualMachineGroupUpdate parameters);

    /**
     * Updates SQL virtual machine group tags.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param parameters The SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineGroupInner update(
        String resourceGroupName,
        String sqlVirtualMachineGroupName,
        SqlVirtualMachineGroupUpdate parameters,
        Context context);

    /**
     * Gets all SQL virtual machine groups in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machine groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all SQL virtual machine groups in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machine groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineGroupInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all SQL virtual machine groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machine groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineGroupInner> list();

    /**
     * Gets all SQL virtual machine groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machine groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineGroupInner> list(Context context);
}
