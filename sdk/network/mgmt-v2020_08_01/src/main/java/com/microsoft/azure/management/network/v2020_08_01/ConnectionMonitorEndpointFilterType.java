/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionMonitorEndpointFilterType.
 */
public final class ConnectionMonitorEndpointFilterType extends ExpandableStringEnum<ConnectionMonitorEndpointFilterType> {
    /** Static value Include for ConnectionMonitorEndpointFilterType. */
    public static final ConnectionMonitorEndpointFilterType INCLUDE = fromString("Include");

    /**
     * Creates or finds a ConnectionMonitorEndpointFilterType from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionMonitorEndpointFilterType
     */
    @JsonCreator
    public static ConnectionMonitorEndpointFilterType fromString(String name) {
        return fromString(name, ConnectionMonitorEndpointFilterType.class);
    }

    /**
     * @return known ConnectionMonitorEndpointFilterType values
     */
    public static Collection<ConnectionMonitorEndpointFilterType> values() {
        return values(ConnectionMonitorEndpointFilterType.class);
    }
}
