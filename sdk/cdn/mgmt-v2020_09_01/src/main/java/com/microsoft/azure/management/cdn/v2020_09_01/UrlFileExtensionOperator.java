/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UrlFileExtensionOperator.
 */
public final class UrlFileExtensionOperator extends ExpandableStringEnum<UrlFileExtensionOperator> {
    /** Static value Any for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator ANY = fromString("Any");

    /** Static value Equal for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator EQUAL = fromString("Equal");

    /** Static value Contains for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for UrlFileExtensionOperator. */
    public static final UrlFileExtensionOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a UrlFileExtensionOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding UrlFileExtensionOperator
     */
    @JsonCreator
    public static UrlFileExtensionOperator fromString(String name) {
        return fromString(name, UrlFileExtensionOperator.class);
    }

    /**
     * @return known UrlFileExtensionOperator values
     */
    public static Collection<UrlFileExtensionOperator> values() {
        return values(UrlFileExtensionOperator.class);
    }
}
