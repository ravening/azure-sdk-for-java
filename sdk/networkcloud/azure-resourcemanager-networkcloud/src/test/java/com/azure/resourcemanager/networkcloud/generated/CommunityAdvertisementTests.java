// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.CommunityAdvertisement;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CommunityAdvertisementTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunityAdvertisement model =
            BinaryData
                .fromString(
                    "{\"communities\":[\"fqjhhkxbpvjymj\",\"xxjyngudivkrtsw\",\"xqzvszjfa\"],\"subnetPrefix\":\"vjfdx\"}")
                .toObject(CommunityAdvertisement.class);
        Assertions.assertEquals("fqjhhkxbpvjymj", model.communities().get(0));
        Assertions.assertEquals("vjfdx", model.subnetPrefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunityAdvertisement model =
            new CommunityAdvertisement()
                .withCommunities(Arrays.asList("fqjhhkxbpvjymj", "xxjyngudivkrtsw", "xqzvszjfa"))
                .withSubnetPrefix("vjfdx");
        model = BinaryData.fromObject(model).toObject(CommunityAdvertisement.class);
        Assertions.assertEquals("fqjhhkxbpvjymj", model.communities().get(0));
        Assertions.assertEquals("vjfdx", model.subnetPrefix());
    }
}