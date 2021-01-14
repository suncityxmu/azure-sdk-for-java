// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Namespaces. */
public interface Namespaces {
    /**
     * Check the specified namespace name availability.
     *
     * @param parameters Parameters to check availability of the specified namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the check name availability request properties.
     */
    CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailability parameters);

    /**
     * Check the specified namespace name availability.
     *
     * @param parameters Parameters to check availability of the specified namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the check name availability request properties.
     */
    Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailability parameters, Context context);

    /**
     * Lists all the available namespaces within the subscription regardless of the resourceGroups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<RelayNamespace> list();

    /**
     * Lists all the available namespaces within the subscription regardless of the resourceGroups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<RelayNamespace> list(Context context);

    /**
     * Lists all the available namespaces within the ResourceGroup.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<RelayNamespace> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available namespaces within the ResourceGroup.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<RelayNamespace> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, Context context);

    /**
     * Returns the description for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace resource.
     */
    RelayNamespace getByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Returns the description for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace resource.
     */
    Response<RelayNamespace> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName);

    /**
     * Authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the list namespace operation.
     */
    PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Authorization rule for a namespace by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Authorization rule for a namespace by name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Primary and secondary connection strings to the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Regenerates the primary or secondary connection strings to the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/Relay Connection String.
     */
    Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Returns the description for the specified namespace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace resource.
     */
    RelayNamespace getById(String id);

    /**
     * Returns the description for the specified namespace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace resource.
     */
    Response<RelayNamespace> getByIdWithResponse(String id, Context context);

    /**
     * Authorization rule for a namespace by name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    AuthorizationRule getAuthorizationRuleById(String id);

    /**
     * Authorization rule for a namespace by name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    Response<AuthorizationRule> getAuthorizationRuleByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAuthorizationRuleById(String id);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAuthorizationRuleByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RelayNamespace resource.
     *
     * @param name resource name.
     * @return the first stage of the new RelayNamespace definition.
     */
    RelayNamespace.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new AuthorizationRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    AuthorizationRule.DefinitionStages.Blank defineAuthorizationRule(String name);
}
