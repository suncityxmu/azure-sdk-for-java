/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.ResourceUsageInner;

/**
 * Type representing ResourceUsage.
 */
public interface ResourceUsage extends HasInner<ResourceUsageInner>, HasManager<CdnManager> {
    /**
     * @return the currentValue value.
     */
    Integer currentValue();

    /**
     * @return the limit value.
     */
    Integer limit();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the unit value.
     */
    String unit();

}
