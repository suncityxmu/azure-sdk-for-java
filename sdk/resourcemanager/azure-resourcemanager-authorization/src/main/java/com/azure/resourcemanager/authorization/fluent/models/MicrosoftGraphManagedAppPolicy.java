// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The ManagedAppPolicy resource represents a base type for platform specific policies. */
@Fluent
public final class MicrosoftGraphManagedAppPolicy extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphManagedAppPolicy.class);

    /*
     * The date and time the policy was created.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * The policy's description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Policy display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Last time the policy was modified.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * Version of the entity.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The ManagedAppPolicy resource represents a base type for platform
     * specific policies.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the createdDateTime property: The date and time the policy was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date and time the policy was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the description property: The policy's description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The policy's description.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Policy display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Policy display name.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: Last time the policy was modified.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: Last time the policy was modified.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the version property: Version of the entity.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the entity.
     *
     * @param version the version value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: The ManagedAppPolicy resource represents a base type for platform specific
     * policies.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The ManagedAppPolicy resource represents a base type for platform specific
     * policies.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphManagedAppPolicy object itself.
     */
    public MicrosoftGraphManagedAppPolicy withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphManagedAppPolicy withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
