// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ObjectStatusConditionDefinition;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ObjectStatusConditionDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ObjectStatusConditionDefinition model =
            BinaryData
                .fromString(
                    "{\"lastTransitionTime\":\"2021-04-08T23:48:15Z\",\"message\":\"gdtopbobjogh\",\"reason\":\"w\",\"status\":\"m\",\"type\":\"hrzayvvtpgvdf\"}")
                .toObject(ObjectStatusConditionDefinition.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-08T23:48:15Z"), model.lastTransitionTime());
        Assertions.assertEquals("gdtopbobjogh", model.message());
        Assertions.assertEquals("w", model.reason());
        Assertions.assertEquals("m", model.status());
        Assertions.assertEquals("hrzayvvtpgvdf", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ObjectStatusConditionDefinition model =
            new ObjectStatusConditionDefinition()
                .withLastTransitionTime(OffsetDateTime.parse("2021-04-08T23:48:15Z"))
                .withMessage("gdtopbobjogh")
                .withReason("w")
                .withStatus("m")
                .withType("hrzayvvtpgvdf");
        model = BinaryData.fromObject(model).toObject(ObjectStatusConditionDefinition.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-08T23:48:15Z"), model.lastTransitionTime());
        Assertions.assertEquals("gdtopbobjogh", model.message());
        Assertions.assertEquals("w", model.reason());
        Assertions.assertEquals("m", model.status());
        Assertions.assertEquals("hrzayvvtpgvdf", model.type());
    }
}