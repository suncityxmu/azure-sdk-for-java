// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TasksStateTasksKeyPhraseExtractionTasksItem model. */
@Fluent
public final class TasksStateTasksKeyPhraseExtractionTasksItem extends TaskState {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private KeyPhraseResult results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public KeyPhraseResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the TasksStateTasksKeyPhraseExtractionTasksItem object itself.
     */
    public TasksStateTasksKeyPhraseExtractionTasksItem setResults(KeyPhraseResult results) {
        this.results = results;
        return this;
    }
}
