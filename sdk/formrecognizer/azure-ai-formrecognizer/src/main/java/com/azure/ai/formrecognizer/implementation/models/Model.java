// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response to the get custom model operation. */
@Fluent
public final class Model {
    /*
     * Basic custom model information.
     */
    @JsonProperty(value = "modelInfo", required = true)
    private ModelInfo modelInfo;

    /*
     * Keys extracted by the custom model.
     */
    @JsonProperty(value = "keys")
    private KeysResult keys;

    /*
     * Training result for custom model.
     */
    @JsonProperty(value = "trainResult")
    private TrainResult trainResult;

    /*
     * Training result for composed model.
     */
    @JsonProperty(value = "composedTrainResults")
    private List<TrainResult> composedTrainResults;

    /**
     * Get the modelInfo property: Basic custom model information.
     *
     * @return the modelInfo value.
     */
    public ModelInfo getModelInfo() {
        return this.modelInfo;
    }

    /**
     * Set the modelInfo property: Basic custom model information.
     *
     * @param modelInfo the modelInfo value to set.
     * @return the Model object itself.
     */
    public Model setModelInfo(ModelInfo modelInfo) {
        this.modelInfo = modelInfo;
        return this;
    }

    /**
     * Get the keys property: Keys extracted by the custom model.
     *
     * @return the keys value.
     */
    public KeysResult getKeys() {
        return this.keys;
    }

    /**
     * Set the keys property: Keys extracted by the custom model.
     *
     * @param keys the keys value to set.
     * @return the Model object itself.
     */
    public Model setKeys(KeysResult keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get the trainResult property: Training result for custom model.
     *
     * @return the trainResult value.
     */
    public TrainResult getTrainResult() {
        return this.trainResult;
    }

    /**
     * Set the trainResult property: Training result for custom model.
     *
     * @param trainResult the trainResult value to set.
     * @return the Model object itself.
     */
    public Model setTrainResult(TrainResult trainResult) {
        this.trainResult = trainResult;
        return this;
    }

    /**
     * Get the composedTrainResults property: Training result for composed model.
     *
     * @return the composedTrainResults value.
     */
    public List<TrainResult> getComposedTrainResults() {
        return this.composedTrainResults;
    }

    /**
     * Set the composedTrainResults property: Training result for composed model.
     *
     * @param composedTrainResults the composedTrainResults value to set.
     * @return the Model object itself.
     */
    public Model setComposedTrainResults(List<TrainResult> composedTrainResults) {
        this.composedTrainResults = composedTrainResults;
        return this;
    }
}
