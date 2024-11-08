// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batchai.fluent.models.FileServerInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Values returned by the File Server List operation. */
@Fluent
public final class FileServerListResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(FileServerListResult.class);

    /*
     * The collection of File Servers.
     */
    @JsonProperty(value = "value")
    private List<FileServerInner> value;

    /*
     * The continuation token.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The collection of File Servers.
     *
     * @return the value value.
     */
    public List<FileServerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of File Servers.
     *
     * @param value the value value to set.
     * @return the FileServerListResult object itself.
     */
    public FileServerListResult withValue(List<FileServerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
