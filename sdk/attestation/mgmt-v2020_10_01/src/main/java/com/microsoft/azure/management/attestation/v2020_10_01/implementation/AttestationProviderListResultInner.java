/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01.implementation;

import com.microsoft.azure.management.attestation.v2020_10_01.SystemData;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Attestation Providers List.
 */
public class AttestationProviderListResultInner {
    /**
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Attestation Provider array.
     */
    @JsonProperty(value = "value")
    private List<AttestationProviderInner> value;

    /**
     * Get the system metadata relating to this resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get attestation Provider array.
     *
     * @return the value value
     */
    public List<AttestationProviderInner> value() {
        return this.value;
    }

    /**
     * Set attestation Provider array.
     *
     * @param value the value value to set
     * @return the AttestationProviderListResultInner object itself.
     */
    public AttestationProviderListResultInner withValue(List<AttestationProviderInner> value) {
        this.value = value;
        return this;
    }

}
