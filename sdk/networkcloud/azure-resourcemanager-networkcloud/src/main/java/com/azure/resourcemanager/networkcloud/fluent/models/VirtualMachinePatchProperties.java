// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.models.ImageRepositoryCredentials;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VirtualMachinePatchProperties represents the properties of the virtual machine that can be patched. */
@Fluent
public final class VirtualMachinePatchProperties {
    /*
     * ImageRepositoryCredentials represents the credentials used to login to the image repository.
     *
     * The credentials used to login to the image repository that has access to the specified image.
     */
    @JsonProperty(value = "vmImageRepositoryCredentials")
    private ImageRepositoryCredentials vmImageRepositoryCredentials;

    /** Creates an instance of VirtualMachinePatchProperties class. */
    public VirtualMachinePatchProperties() {
    }

    /**
     * Get the vmImageRepositoryCredentials property: ImageRepositoryCredentials represents the credentials used to
     * login to the image repository.
     *
     * <p>The credentials used to login to the image repository that has access to the specified image.
     *
     * @return the vmImageRepositoryCredentials value.
     */
    public ImageRepositoryCredentials vmImageRepositoryCredentials() {
        return this.vmImageRepositoryCredentials;
    }

    /**
     * Set the vmImageRepositoryCredentials property: ImageRepositoryCredentials represents the credentials used to
     * login to the image repository.
     *
     * <p>The credentials used to login to the image repository that has access to the specified image.
     *
     * @param vmImageRepositoryCredentials the vmImageRepositoryCredentials value to set.
     * @return the VirtualMachinePatchProperties object itself.
     */
    public VirtualMachinePatchProperties
        withVmImageRepositoryCredentials(ImageRepositoryCredentials vmImageRepositoryCredentials) {
        this.vmImageRepositoryCredentials = vmImageRepositoryCredentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmImageRepositoryCredentials() != null) {
            vmImageRepositoryCredentials().validate();
        }
    }
}
