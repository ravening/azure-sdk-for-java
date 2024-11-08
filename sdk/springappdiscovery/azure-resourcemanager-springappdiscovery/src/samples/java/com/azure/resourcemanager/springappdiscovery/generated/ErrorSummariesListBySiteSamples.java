// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.generated;

/**
 * Samples for ErrorSummaries ListBySite.
 */
public final class ErrorSummariesListBySiteSamples {
    /*
     * x-ms-original-file:
     * specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/
     * examples/ErrorSummaries_ListBySite_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_ListBySite_MaximumSet_Gen.
     * 
     * @param manager Entry point to SpringAppDiscoveryManager.
     */
    public static void errorSummariesListBySiteMaximumSetGen(
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager) {
        manager.errorSummaries()
            .listBySite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/
     * examples/ErrorSummaries_ListBySite_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_ListBySite_MinimumSet_Gen.
     * 
     * @param manager Entry point to SpringAppDiscoveryManager.
     */
    public static void errorSummariesListBySiteMinimumSetGen(
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager) {
        manager.errorSummaries()
            .listBySite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                com.azure.core.util.Context.NONE);
    }
}
