/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Managed Identity Sql Control Settings.
 * Sql Control Settings for workspace managed identity.
 */
@JsonFlatten
public class ManagedIdentitySqlControlSettingsModelInner extends ProxyResource {
    /**
     * Grant sql control to managed identity.
     */
    @JsonProperty(value = "properties.grantSqlControlToManagedIdentity")
    private ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity grantSqlControlToManagedIdentity;

    /**
     * Get grant sql control to managed identity.
     *
     * @return the grantSqlControlToManagedIdentity value
     */
    public ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity grantSqlControlToManagedIdentity() {
        return this.grantSqlControlToManagedIdentity;
    }

    /**
     * Set grant sql control to managed identity.
     *
     * @param grantSqlControlToManagedIdentity the grantSqlControlToManagedIdentity value to set
     * @return the ManagedIdentitySqlControlSettingsModelInner object itself.
     */
    public ManagedIdentitySqlControlSettingsModelInner withGrantSqlControlToManagedIdentity(ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity grantSqlControlToManagedIdentity) {
        this.grantSqlControlToManagedIdentity = grantSqlControlToManagedIdentity;
        return this;
    }

}