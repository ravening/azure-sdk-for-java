// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for SecurityOperators Delete. */
public final class SecurityOperatorsDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-01-01-preview/examples/SecurityOperators/DeleteSecurityOperatorByName_example.json
     */
    /**
     * Sample code: Delete SecurityOperator on subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteSecurityOperatorOnSubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .securityOperators()
            .deleteByResourceGroupWithResponse(
                "CloudPosture", "DefenderCSPMSecurityOperator", com.azure.core.util.Context.NONE);
    }
}