// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.HybridAksClusterProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class HybridAksClusterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HybridAksClusterProperties model =
            BinaryData
                .fromString(
                    "{\"associatedNetworkIds\":[\"qxwbpokulpiu\",\"waasip\"],\"cloudServicesNetworkId\":\"iobyu\",\"clusterId\":\"rpqlp\",\"controlPlaneCount\":3089233038709008061,\"controlPlaneNodes\":[{\"agentPoolId\":\"qgbdbuta\",\"agentPoolName\":\"fbtkuwhhmhyk\",\"cpuCores\":5084521144740681912,\"diskSizeGB\":5239157603654291571,\"memorySizeGB\":8907066178205616506,\"nodePoolName\":\"ichkoymkcdyhb\",\"nodes\":[],\"vmCount\":6135641576986595049,\"vmSize\":\"eqnovvqfovl\"},{\"agentPoolId\":\"ywsuwsy\",\"agentPoolName\":\"ndsytgadg\",\"cpuCores\":4788176872253697893,\"diskSizeGB\":1506102374253246749,\"memorySizeGB\":8790170709983104417,\"nodePoolName\":\"arrwlquu\",\"nodes\":[],\"vmCount\":1802422075284970664,\"vmSize\":\"e\"},{\"agentPoolId\":\"ipfpubji\",\"agentPoolName\":\"wifto\",\"cpuCores\":9125422272496243205,\"diskSizeGB\":9141549963095066004,\"memorySizeGB\":9121743488248477749,\"nodePoolName\":\"lsa\",\"nodes\":[],\"vmCount\":3402828126111711911,\"vmSize\":\"n\"}],\"defaultCniNetworkId\":\"ph\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"odlqiyntor\",\"hybridAksProvisionedClusterId\":\"ihleos\",\"provisioningState\":\"Failed\",\"volumes\":[\"mslyzrpzbchckqqz\",\"ioxiysuiizyn\",\"edyatrwyhqmibzyh\",\"itsmypyyn\"],\"workerCount\":4085302065865673737,\"workerNodes\":[{\"agentPoolId\":\"nzgmwznmabik\",\"agentPoolName\":\"orgjhxbldt\",\"cpuCores\":8467924740961026044,\"diskSizeGB\":5101849209530474984,\"memorySizeGB\":8333296555804808635,\"nodePoolName\":\"vokotllxdyh\",\"nodes\":[],\"vmCount\":1838173386679400772,\"vmSize\":\"jlt\"},{\"agentPoolId\":\"bnnhadoocrkvcik\",\"agentPoolName\":\"vpa\",\"cpuCores\":1095041786802242377,\"diskSizeGB\":7776859938318021776,\"memorySizeGB\":7998596794981360743,\"nodePoolName\":\"ywggx\",\"nodes\":[],\"vmCount\":8276594751557118493,\"vmSize\":\"elwuipi\"},{\"agentPoolId\":\"jzkzi\",\"agentPoolName\":\"vvcnayr\",\"cpuCores\":467704229465988206,\"diskSizeGB\":6786073010042821527,\"memorySizeGB\":8141122622506603180,\"nodePoolName\":\"ndrdvstkwq\",\"nodes\":[],\"vmCount\":8383180360280433492,\"vmSize\":\"mfmtdaaygdvw\"},{\"agentPoolId\":\"piohgwxrtfu\",\"agentPoolName\":\"epxgyqagvr\",\"cpuCores\":4744038705838577883,\"diskSizeGB\":3489008762785982392,\"memorySizeGB\":6566741920348285642,\"nodePoolName\":\"dblx\",\"nodes\":[],\"vmCount\":7611617377471579634,\"vmSize\":\"hfjx\"}]}")
                .toObject(HybridAksClusterProperties.class);
        Assertions.assertEquals("qxwbpokulpiu", model.associatedNetworkIds().get(0));
        Assertions.assertEquals(3089233038709008061L, model.controlPlaneCount());
        Assertions.assertEquals("ihleos", model.hybridAksProvisionedClusterId());
        Assertions.assertEquals(4085302065865673737L, model.workerCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HybridAksClusterProperties model =
            new HybridAksClusterProperties()
                .withAssociatedNetworkIds(Arrays.asList("qxwbpokulpiu", "waasip"))
                .withControlPlaneCount(3089233038709008061L)
                .withHybridAksProvisionedClusterId("ihleos")
                .withWorkerCount(4085302065865673737L);
        model = BinaryData.fromObject(model).toObject(HybridAksClusterProperties.class);
        Assertions.assertEquals("qxwbpokulpiu", model.associatedNetworkIds().get(0));
        Assertions.assertEquals(3089233038709008061L, model.controlPlaneCount());
        Assertions.assertEquals("ihleos", model.hybridAksProvisionedClusterId());
        Assertions.assertEquals(4085302065865673737L, model.workerCount());
    }
}