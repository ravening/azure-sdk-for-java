// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** KeySetUser represents the properties of the user in the key set. */
@Fluent
public final class KeySetUser {
    /*
     * The Azure Active Directory user name (email name).
     */
    @JsonProperty(value = "azureUserName", required = true)
    private String azureUsername;

    /*
     * The free-form description for this user.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * SshPublicKey represents the public key used to authenticate with the virtual machine through SSH.
     *
     * The SSH public key for this user.
     */
    @JsonProperty(value = "sshPublicKey", required = true)
    private SshPublicKey sshPublicKey;

    /** Creates an instance of KeySetUser class. */
    public KeySetUser() {
    }

    /**
     * Get the azureUsername property: The Azure Active Directory user name (email name).
     *
     * @return the azureUsername value.
     */
    public String azureUsername() {
        return this.azureUsername;
    }

    /**
     * Set the azureUsername property: The Azure Active Directory user name (email name).
     *
     * @param azureUsername the azureUsername value to set.
     * @return the KeySetUser object itself.
     */
    public KeySetUser withAzureUsername(String azureUsername) {
        this.azureUsername = azureUsername;
        return this;
    }

    /**
     * Get the description property: The free-form description for this user.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The free-form description for this user.
     *
     * @param description the description value to set.
     * @return the KeySetUser object itself.
     */
    public KeySetUser withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sshPublicKey property: SshPublicKey represents the public key used to authenticate with the virtual
     * machine through SSH.
     *
     * <p>The SSH public key for this user.
     *
     * @return the sshPublicKey value.
     */
    public SshPublicKey sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: SshPublicKey represents the public key used to authenticate with the virtual
     * machine through SSH.
     *
     * <p>The SSH public key for this user.
     *
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the KeySetUser object itself.
     */
    public KeySetUser withSshPublicKey(SshPublicKey sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureUsername() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property azureUsername in model KeySetUser"));
        }
        if (sshPublicKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sshPublicKey in model KeySetUser"));
        } else {
            sshPublicKey().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeySetUser.class);
}