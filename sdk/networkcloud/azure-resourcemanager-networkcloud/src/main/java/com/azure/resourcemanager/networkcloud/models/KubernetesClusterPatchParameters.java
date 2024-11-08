// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterPatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** KubernetesClusterPatchParameters represents the body of the request to patch the Hybrid AKS cluster. */
@Fluent
public final class KubernetesClusterPatchParameters {
    /*
     * KubernetesClusterPatchProperties represents the properties of the Kubernetes cluster that can be patched.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private KubernetesClusterPatchProperties innerProperties;

    /*
     * The Azure resource tags that will replace the existing ones.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of KubernetesClusterPatchParameters class. */
    public KubernetesClusterPatchParameters() {
    }

    /**
     * Get the innerProperties property: KubernetesClusterPatchProperties represents the properties of the Kubernetes
     * cluster that can be patched.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private KubernetesClusterPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @param tags the tags value to set.
     * @return the KubernetesClusterPatchParameters object itself.
     */
    public KubernetesClusterPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the controlPlaneNodeConfiguration property: ControlPlaneNodePatchConfiguration represents the properties of
     * the control plane that can be patched for this Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
     *
     * @return the controlPlaneNodeConfiguration value.
     */
    public ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneNodeConfiguration();
    }

    /**
     * Set the controlPlaneNodeConfiguration property: ControlPlaneNodePatchConfiguration represents the properties of
     * the control plane that can be patched for this Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
     *
     * @param controlPlaneNodeConfiguration the controlPlaneNodeConfiguration value to set.
     * @return the KubernetesClusterPatchParameters object itself.
     */
    public KubernetesClusterPatchParameters
        withControlPlaneNodeConfiguration(ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterPatchProperties();
        }
        this.innerProperties().withControlPlaneNodeConfiguration(controlPlaneNodeConfiguration);
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the KubernetesClusterPatchParameters object itself.
     */
    public KubernetesClusterPatchParameters withKubernetesVersion(String kubernetesVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterPatchProperties();
        }
        this.innerProperties().withKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
