// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * The location of the certificate store on the compute node into which to install the certificate.
 * 
 * The default value is currentUser. This property is applicable only for pools configured with Windows compute nodes.
 * For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an
 * environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates
 * with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g.,
 * /home/{user-name}/certs) and certificates are placed in that directory.
 */
public enum CertificateStoreLocation {
    /**
     * Enum value CurrentUser.
     */
    CURRENT_USER("CurrentUser"),

    /**
     * Enum value LocalMachine.
     */
    LOCAL_MACHINE("LocalMachine");

    /**
     * The actual serialized value for a CertificateStoreLocation instance.
     */
    private final String value;

    CertificateStoreLocation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CertificateStoreLocation instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CertificateStoreLocation object, or null if unable to parse.
     */
    public static CertificateStoreLocation fromString(String value) {
        if (value == null) {
            return null;
        }
        CertificateStoreLocation[] items = CertificateStoreLocation.values();
        for (CertificateStoreLocation item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
