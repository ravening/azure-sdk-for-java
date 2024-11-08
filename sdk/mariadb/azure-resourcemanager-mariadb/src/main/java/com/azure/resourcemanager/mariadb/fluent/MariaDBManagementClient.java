// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for MariaDBManagementClient class.
 */
public interface MariaDBManagementClient {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ServersClient object to access its operations.
     * 
     * @return the ServersClient object.
     */
    ServersClient getServers();

    /**
     * Gets the ReplicasClient object to access its operations.
     * 
     * @return the ReplicasClient object.
     */
    ReplicasClient getReplicas();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the VirtualNetworkRulesClient object to access its operations.
     * 
     * @return the VirtualNetworkRulesClient object.
     */
    VirtualNetworkRulesClient getVirtualNetworkRules();

    /**
     * Gets the DatabasesClient object to access its operations.
     * 
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the ConfigurationsClient object to access its operations.
     * 
     * @return the ConfigurationsClient object.
     */
    ConfigurationsClient getConfigurations();

    /**
     * Gets the ServerParametersClient object to access its operations.
     * 
     * @return the ServerParametersClient object.
     */
    ServerParametersClient getServerParameters();

    /**
     * Gets the LogFilesClient object to access its operations.
     * 
     * @return the LogFilesClient object.
     */
    LogFilesClient getLogFiles();

    /**
     * Gets the RecoverableServersClient object to access its operations.
     * 
     * @return the RecoverableServersClient object.
     */
    RecoverableServersClient getRecoverableServers();

    /**
     * Gets the ServerBasedPerformanceTiersClient object to access its operations.
     * 
     * @return the ServerBasedPerformanceTiersClient object.
     */
    ServerBasedPerformanceTiersClient getServerBasedPerformanceTiers();

    /**
     * Gets the LocationBasedPerformanceTiersClient object to access its operations.
     * 
     * @return the LocationBasedPerformanceTiersClient object.
     */
    LocationBasedPerformanceTiersClient getLocationBasedPerformanceTiers();

    /**
     * Gets the CheckNameAvailabilitiesClient object to access its operations.
     * 
     * @return the CheckNameAvailabilitiesClient object.
     */
    CheckNameAvailabilitiesClient getCheckNameAvailabilities();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the QueryTextsClient object to access its operations.
     * 
     * @return the QueryTextsClient object.
     */
    QueryTextsClient getQueryTexts();

    /**
     * Gets the TopQueryStatisticsClient object to access its operations.
     * 
     * @return the TopQueryStatisticsClient object.
     */
    TopQueryStatisticsClient getTopQueryStatistics();

    /**
     * Gets the WaitStatisticsClient object to access its operations.
     * 
     * @return the WaitStatisticsClient object.
     */
    WaitStatisticsClient getWaitStatistics();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     * 
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the AdvisorsClient object to access its operations.
     * 
     * @return the AdvisorsClient object.
     */
    AdvisorsClient getAdvisors();

    /**
     * Gets the RecommendedActionsClient object to access its operations.
     * 
     * @return the RecommendedActionsClient object.
     */
    RecommendedActionsClient getRecommendedActions();

    /**
     * Gets the LocationBasedRecommendedActionSessionsOperationStatusClient object to access its operations.
     * 
     * @return the LocationBasedRecommendedActionSessionsOperationStatusClient object.
     */
    LocationBasedRecommendedActionSessionsOperationStatusClient
        getLocationBasedRecommendedActionSessionsOperationStatus();

    /**
     * Gets the LocationBasedRecommendedActionSessionsResultsClient object to access its operations.
     * 
     * @return the LocationBasedRecommendedActionSessionsResultsClient object.
     */
    LocationBasedRecommendedActionSessionsResultsClient getLocationBasedRecommendedActionSessionsResults();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the ServerSecurityAlertPoliciesClient object to access its operations.
     * 
     * @return the ServerSecurityAlertPoliciesClient object.
     */
    ServerSecurityAlertPoliciesClient getServerSecurityAlertPolicies();
}
