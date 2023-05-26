// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The more detailed status of the cloud services network. */
public final class CloudServicesNetworkDetailedStatus extends ExpandableStringEnum<CloudServicesNetworkDetailedStatus> {
    /** Static value Error for CloudServicesNetworkDetailedStatus. */
    public static final CloudServicesNetworkDetailedStatus ERROR = fromString("Error");

    /** Static value Available for CloudServicesNetworkDetailedStatus. */
    public static final CloudServicesNetworkDetailedStatus AVAILABLE = fromString("Available");

    /** Static value Provisioning for CloudServicesNetworkDetailedStatus. */
    public static final CloudServicesNetworkDetailedStatus PROVISIONING = fromString("Provisioning");

    /**
     * Creates a new instance of CloudServicesNetworkDetailedStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CloudServicesNetworkDetailedStatus() {
    }

    /**
     * Creates or finds a CloudServicesNetworkDetailedStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CloudServicesNetworkDetailedStatus.
     */
    @JsonCreator
    public static CloudServicesNetworkDetailedStatus fromString(String name) {
        return fromString(name, CloudServicesNetworkDetailedStatus.class);
    }

    /**
     * Gets known CloudServicesNetworkDetailedStatus values.
     *
     * @return known CloudServicesNetworkDetailedStatus values.
     */
    public static Collection<CloudServicesNetworkDetailedStatus> values() {
        return values(CloudServicesNetworkDetailedStatus.class);
    }
}