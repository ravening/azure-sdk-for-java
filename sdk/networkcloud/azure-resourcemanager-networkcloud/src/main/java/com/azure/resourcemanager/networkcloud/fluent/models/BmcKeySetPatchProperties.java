// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** BmcKeySetPatchProperties represents the properties of baseboard management controller key set that are patchable. */
@Fluent
public final class BmcKeySetPatchProperties {
    /*
     * The date and time after which the users in this key set will be removed from the baseboard management
     * controllers.
     */
    @JsonProperty(value = "expiration")
    private OffsetDateTime expiration;

    /*
     * The unique list of permitted users.
     */
    @JsonProperty(value = "userList")
    private List<KeySetUser> userList;

    /** Creates an instance of BmcKeySetPatchProperties class. */
    public BmcKeySetPatchProperties() {
    }

    /**
     * Get the expiration property: The date and time after which the users in this key set will be removed from the
     * baseboard management controllers.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: The date and time after which the users in this key set will be removed from the
     * baseboard management controllers.
     *
     * @param expiration the expiration value to set.
     * @return the BmcKeySetPatchProperties object itself.
     */
    public BmcKeySetPatchProperties withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    public List<KeySetUser> userList() {
        return this.userList;
    }

    /**
     * Set the userList property: The unique list of permitted users.
     *
     * @param userList the userList value to set.
     * @return the BmcKeySetPatchProperties object itself.
     */
    public BmcKeySetPatchProperties withUserList(List<KeySetUser> userList) {
        this.userList = userList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userList() != null) {
            userList().forEach(e -> e.validate());
        }
    }
}