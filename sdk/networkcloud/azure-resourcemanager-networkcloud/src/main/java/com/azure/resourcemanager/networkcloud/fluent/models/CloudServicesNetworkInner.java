// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkProvisioningState;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * CloudServicesNetwork represents additional egress information that will be used by associated virtual machines or
 * hybrid AKS clusters.
 *
 * <p>Upon creation, the additional services that are provided by the platform will be allocated and represented in the
 * status of this resource. All resources associated with this cloud services network will be part of the same layer 2
 * (L2) isolation domain. At least one service network must be created but may be reused across many virtual machines
 * and/or Hybrid AKS clusters.
 */
@Fluent
public final class CloudServicesNetworkInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * CloudServicesNetworkProperties represents properties of the cloud services network.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private CloudServicesNetworkProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CloudServicesNetworkInner class. */
    public CloudServicesNetworkInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the CloudServicesNetworkInner object itself.
     */
    public CloudServicesNetworkInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: CloudServicesNetworkProperties represents properties of the cloud services
     * network.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private CloudServicesNetworkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public CloudServicesNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CloudServicesNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the additionalEgressEndpoints property: The list of egress endpoints. This allows for connection from a
     * Hybrid AKS cluster to the specified endpoint.
     *
     * @return the additionalEgressEndpoints value.
     */
    public List<EgressEndpoint> additionalEgressEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalEgressEndpoints();
    }

    /**
     * Set the additionalEgressEndpoints property: The list of egress endpoints. This allows for connection from a
     * Hybrid AKS cluster to the specified endpoint.
     *
     * @param additionalEgressEndpoints the additionalEgressEndpoints value to set.
     * @return the CloudServicesNetworkInner object itself.
     */
    public CloudServicesNetworkInner withAdditionalEgressEndpoints(List<EgressEndpoint> additionalEgressEndpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CloudServicesNetworkProperties();
        }
        this.innerProperties().withAdditionalEgressEndpoints(additionalEgressEndpoints);
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the Network Cloud cluster this cloud services network is
     * associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the detailedStatus property: The more detailed status of the cloud services network.
     *
     * @return the detailedStatus value.
     */
    public CloudServicesNetworkDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the enableDefaultEgressEndpoints property: The indicator of whether the platform default endpoints are
     * allowed for the egress traffic.
     *
     * @return the enableDefaultEgressEndpoints value.
     */
    public CloudServicesNetworkEnableDefaultEgressEndpoints enableDefaultEgressEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().enableDefaultEgressEndpoints();
    }

    /**
     * Set the enableDefaultEgressEndpoints property: The indicator of whether the platform default endpoints are
     * allowed for the egress traffic.
     *
     * @param enableDefaultEgressEndpoints the enableDefaultEgressEndpoints value to set.
     * @return the CloudServicesNetworkInner object itself.
     */
    public CloudServicesNetworkInner withEnableDefaultEgressEndpoints(
        CloudServicesNetworkEnableDefaultEgressEndpoints enableDefaultEgressEndpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CloudServicesNetworkProperties();
        }
        this.innerProperties().withEnableDefaultEgressEndpoints(enableDefaultEgressEndpoints);
        return this;
    }

    /**
     * Get the enabledEgressEndpoints property: The full list of additional and default egress endpoints that are
     * currently enabled.
     *
     * @return the enabledEgressEndpoints value.
     */
    public List<EgressEndpoint> enabledEgressEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledEgressEndpoints();
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: The list of Hybrid AKS cluster resource IDs that are associated
     * with this cloud services network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksClustersAssociatedIds();
    }

    /**
     * Get the interfaceName property: The name of the interface that will be present in the virtual machine to
     * represent this network.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceName();
    }

    /**
     * Get the provisioningState property: The provisioning state of the cloud services network.
     *
     * @return the provisioningState value.
     */
    public CloudServicesNetworkProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the virtualMachinesAssociatedIds property: The list of virtual machine resource IDs, excluding any Hybrid AKS
     * virtual machines, that are currently using this cloud services network.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociatedIds();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property extendedLocation in model CloudServicesNetworkInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CloudServicesNetworkInner.class);
}