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
import java.util.HashMap;
import java.util.Map;

/** workbookWorksheetProtectionOptions. */
@Fluent
public final class MicrosoftGraphWorkbookWorksheetProtectionOptions {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookWorksheetProtectionOptions.class);

    /*
     * Represents the worksheet protection option of allowing using auto filter
     * feature.
     */
    @JsonProperty(value = "allowAutoFilter")
    private Boolean allowAutoFilter;

    /*
     * Represents the worksheet protection option of allowing deleting columns.
     */
    @JsonProperty(value = "allowDeleteColumns")
    private Boolean allowDeleteColumns;

    /*
     * Represents the worksheet protection option of allowing deleting rows.
     */
    @JsonProperty(value = "allowDeleteRows")
    private Boolean allowDeleteRows;

    /*
     * Represents the worksheet protection option of allowing formatting cells.
     */
    @JsonProperty(value = "allowFormatCells")
    private Boolean allowFormatCells;

    /*
     * Represents the worksheet protection option of allowing formatting
     * columns.
     */
    @JsonProperty(value = "allowFormatColumns")
    private Boolean allowFormatColumns;

    /*
     * Represents the worksheet protection option of allowing formatting rows.
     */
    @JsonProperty(value = "allowFormatRows")
    private Boolean allowFormatRows;

    /*
     * Represents the worksheet protection option of allowing inserting
     * columns.
     */
    @JsonProperty(value = "allowInsertColumns")
    private Boolean allowInsertColumns;

    /*
     * Represents the worksheet protection option of allowing inserting
     * hyperlinks.
     */
    @JsonProperty(value = "allowInsertHyperlinks")
    private Boolean allowInsertHyperlinks;

    /*
     * Represents the worksheet protection option of allowing inserting rows.
     */
    @JsonProperty(value = "allowInsertRows")
    private Boolean allowInsertRows;

    /*
     * Represents the worksheet protection option of allowing using pivot table
     * feature.
     */
    @JsonProperty(value = "allowPivotTables")
    private Boolean allowPivotTables;

    /*
     * Represents the worksheet protection option of allowing using sort
     * feature.
     */
    @JsonProperty(value = "allowSort")
    private Boolean allowSort;

    /*
     * workbookWorksheetProtectionOptions
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowAutoFilter property: Represents the worksheet protection option of allowing using auto filter
     * feature.
     *
     * @return the allowAutoFilter value.
     */
    public Boolean allowAutoFilter() {
        return this.allowAutoFilter;
    }

    /**
     * Set the allowAutoFilter property: Represents the worksheet protection option of allowing using auto filter
     * feature.
     *
     * @param allowAutoFilter the allowAutoFilter value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowAutoFilter(Boolean allowAutoFilter) {
        this.allowAutoFilter = allowAutoFilter;
        return this;
    }

    /**
     * Get the allowDeleteColumns property: Represents the worksheet protection option of allowing deleting columns.
     *
     * @return the allowDeleteColumns value.
     */
    public Boolean allowDeleteColumns() {
        return this.allowDeleteColumns;
    }

    /**
     * Set the allowDeleteColumns property: Represents the worksheet protection option of allowing deleting columns.
     *
     * @param allowDeleteColumns the allowDeleteColumns value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowDeleteColumns(Boolean allowDeleteColumns) {
        this.allowDeleteColumns = allowDeleteColumns;
        return this;
    }

    /**
     * Get the allowDeleteRows property: Represents the worksheet protection option of allowing deleting rows.
     *
     * @return the allowDeleteRows value.
     */
    public Boolean allowDeleteRows() {
        return this.allowDeleteRows;
    }

    /**
     * Set the allowDeleteRows property: Represents the worksheet protection option of allowing deleting rows.
     *
     * @param allowDeleteRows the allowDeleteRows value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowDeleteRows(Boolean allowDeleteRows) {
        this.allowDeleteRows = allowDeleteRows;
        return this;
    }

    /**
     * Get the allowFormatCells property: Represents the worksheet protection option of allowing formatting cells.
     *
     * @return the allowFormatCells value.
     */
    public Boolean allowFormatCells() {
        return this.allowFormatCells;
    }

    /**
     * Set the allowFormatCells property: Represents the worksheet protection option of allowing formatting cells.
     *
     * @param allowFormatCells the allowFormatCells value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowFormatCells(Boolean allowFormatCells) {
        this.allowFormatCells = allowFormatCells;
        return this;
    }

    /**
     * Get the allowFormatColumns property: Represents the worksheet protection option of allowing formatting columns.
     *
     * @return the allowFormatColumns value.
     */
    public Boolean allowFormatColumns() {
        return this.allowFormatColumns;
    }

    /**
     * Set the allowFormatColumns property: Represents the worksheet protection option of allowing formatting columns.
     *
     * @param allowFormatColumns the allowFormatColumns value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowFormatColumns(Boolean allowFormatColumns) {
        this.allowFormatColumns = allowFormatColumns;
        return this;
    }

    /**
     * Get the allowFormatRows property: Represents the worksheet protection option of allowing formatting rows.
     *
     * @return the allowFormatRows value.
     */
    public Boolean allowFormatRows() {
        return this.allowFormatRows;
    }

    /**
     * Set the allowFormatRows property: Represents the worksheet protection option of allowing formatting rows.
     *
     * @param allowFormatRows the allowFormatRows value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowFormatRows(Boolean allowFormatRows) {
        this.allowFormatRows = allowFormatRows;
        return this;
    }

    /**
     * Get the allowInsertColumns property: Represents the worksheet protection option of allowing inserting columns.
     *
     * @return the allowInsertColumns value.
     */
    public Boolean allowInsertColumns() {
        return this.allowInsertColumns;
    }

    /**
     * Set the allowInsertColumns property: Represents the worksheet protection option of allowing inserting columns.
     *
     * @param allowInsertColumns the allowInsertColumns value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowInsertColumns(Boolean allowInsertColumns) {
        this.allowInsertColumns = allowInsertColumns;
        return this;
    }

    /**
     * Get the allowInsertHyperlinks property: Represents the worksheet protection option of allowing inserting
     * hyperlinks.
     *
     * @return the allowInsertHyperlinks value.
     */
    public Boolean allowInsertHyperlinks() {
        return this.allowInsertHyperlinks;
    }

    /**
     * Set the allowInsertHyperlinks property: Represents the worksheet protection option of allowing inserting
     * hyperlinks.
     *
     * @param allowInsertHyperlinks the allowInsertHyperlinks value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowInsertHyperlinks(Boolean allowInsertHyperlinks) {
        this.allowInsertHyperlinks = allowInsertHyperlinks;
        return this;
    }

    /**
     * Get the allowInsertRows property: Represents the worksheet protection option of allowing inserting rows.
     *
     * @return the allowInsertRows value.
     */
    public Boolean allowInsertRows() {
        return this.allowInsertRows;
    }

    /**
     * Set the allowInsertRows property: Represents the worksheet protection option of allowing inserting rows.
     *
     * @param allowInsertRows the allowInsertRows value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowInsertRows(Boolean allowInsertRows) {
        this.allowInsertRows = allowInsertRows;
        return this;
    }

    /**
     * Get the allowPivotTables property: Represents the worksheet protection option of allowing using pivot table
     * feature.
     *
     * @return the allowPivotTables value.
     */
    public Boolean allowPivotTables() {
        return this.allowPivotTables;
    }

    /**
     * Set the allowPivotTables property: Represents the worksheet protection option of allowing using pivot table
     * feature.
     *
     * @param allowPivotTables the allowPivotTables value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowPivotTables(Boolean allowPivotTables) {
        this.allowPivotTables = allowPivotTables;
        return this;
    }

    /**
     * Get the allowSort property: Represents the worksheet protection option of allowing using sort feature.
     *
     * @return the allowSort value.
     */
    public Boolean allowSort() {
        return this.allowSort;
    }

    /**
     * Set the allowSort property: Represents the worksheet protection option of allowing using sort feature.
     *
     * @param allowSort the allowSort value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAllowSort(Boolean allowSort) {
        this.allowSort = allowSort;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookWorksheetProtectionOptions.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookWorksheetProtectionOptions.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookWorksheetProtectionOptions object itself.
     */
    public MicrosoftGraphWorkbookWorksheetProtectionOptions withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
