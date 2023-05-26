// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.FunctionType;
import com.azure.resourcemanager.costmanagement.models.OperatorType;
import com.azure.resourcemanager.costmanagement.models.QueryColumnType;
import com.azure.resourcemanager.costmanagement.models.ReportConfigAggregation;
import com.azure.resourcemanager.costmanagement.models.ReportConfigComparisonExpression;
import com.azure.resourcemanager.costmanagement.models.ReportConfigDataset;
import com.azure.resourcemanager.costmanagement.models.ReportConfigDatasetConfiguration;
import com.azure.resourcemanager.costmanagement.models.ReportConfigFilter;
import com.azure.resourcemanager.costmanagement.models.ReportConfigGrouping;
import com.azure.resourcemanager.costmanagement.models.ReportConfigSorting;
import com.azure.resourcemanager.costmanagement.models.ReportConfigSortingType;
import com.azure.resourcemanager.costmanagement.models.ReportGranularityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ReportConfigDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReportConfigDataset model =
            BinaryData
                .fromString(
                    "{\"granularity\":\"Monthly\",\"configuration\":{\"columns\":[\"lyxwjkcprbnwbx\",\"jvtbvpyss\",\"dnrujqguhmuouqfp\",\"wzwbnguitn\"]},\"aggregation\":{\"ufizuckyf\":{\"name\":\"zga\",\"function\":\"Sum\"},\"dfvzwdzuhty\":{\"name\":\"hr\",\"function\":\"Sum\"}},\"grouping\":[{\"type\":\"TagKey\",\"name\":\"dkfthwxmnt\"},{\"type\":\"TagKey\",\"name\":\"waopvkmijcmmxd\"},{\"type\":\"TagKey\",\"name\":\"fufsrpymzi\"},{\"type\":\"TagKey\",\"name\":\"sezcxtb\"}],\"sorting\":[{\"direction\":\"Ascending\",\"name\":\"c\"},{\"direction\":\"Descending\",\"name\":\"ewmdw\"}],\"filter\":{\"and\":[{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]}],\"or\":[{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]},{\"and\":[],\"or\":[]}],\"dimensions\":{\"name\":\"ypyqrimzinp\",\"operator\":\"Contains\",\"values\":[\"jdkirsoodqx\"]},\"tags\":{\"name\":\"rmnohj\",\"operator\":\"In\",\"values\":[\"whdsoifiyip\"]}}}")
                .toObject(ReportConfigDataset.class);
        Assertions.assertEquals(ReportGranularityType.MONTHLY, model.granularity());
        Assertions.assertEquals("lyxwjkcprbnwbx", model.configuration().columns().get(0));
        Assertions.assertEquals("zga", model.aggregation().get("ufizuckyf").name());
        Assertions.assertEquals(FunctionType.SUM, model.aggregation().get("ufizuckyf").function());
        Assertions.assertEquals(QueryColumnType.TAG_KEY, model.grouping().get(0).type());
        Assertions.assertEquals("dkfthwxmnt", model.grouping().get(0).name());
        Assertions.assertEquals(ReportConfigSortingType.ASCENDING, model.sorting().get(0).direction());
        Assertions.assertEquals("c", model.sorting().get(0).name());
        Assertions.assertEquals("ypyqrimzinp", model.filter().dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.filter().dimensions().operator());
        Assertions.assertEquals("jdkirsoodqx", model.filter().dimensions().values().get(0));
        Assertions.assertEquals("rmnohj", model.filter().tags().name());
        Assertions.assertEquals(OperatorType.IN, model.filter().tags().operator());
        Assertions.assertEquals("whdsoifiyip", model.filter().tags().values().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReportConfigDataset model =
            new ReportConfigDataset()
                .withGranularity(ReportGranularityType.MONTHLY)
                .withConfiguration(
                    new ReportConfigDatasetConfiguration()
                        .withColumns(Arrays.asList("lyxwjkcprbnwbx", "jvtbvpyss", "dnrujqguhmuouqfp", "wzwbnguitn")))
                .withAggregation(
                    mapOf(
                        "ufizuckyf",
                        new ReportConfigAggregation().withName("zga").withFunction(FunctionType.SUM),
                        "dfvzwdzuhty",
                        new ReportConfigAggregation().withName("hr").withFunction(FunctionType.SUM)))
                .withGrouping(
                    Arrays
                        .asList(
                            new ReportConfigGrouping().withType(QueryColumnType.TAG_KEY).withName("dkfthwxmnt"),
                            new ReportConfigGrouping().withType(QueryColumnType.TAG_KEY).withName("waopvkmijcmmxd"),
                            new ReportConfigGrouping().withType(QueryColumnType.TAG_KEY).withName("fufsrpymzi"),
                            new ReportConfigGrouping().withType(QueryColumnType.TAG_KEY).withName("sezcxtb")))
                .withSorting(
                    Arrays
                        .asList(
                            new ReportConfigSorting().withDirection(ReportConfigSortingType.ASCENDING).withName("c"),
                            new ReportConfigSorting()
                                .withDirection(ReportConfigSortingType.DESCENDING)
                                .withName("ewmdw")))
                .withFilter(
                    new ReportConfigFilter()
                        .withAnd(
                            Arrays
                                .asList(
                                    new ReportConfigFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ReportConfigFilter().withAnd(Arrays.asList()).withOr(Arrays.asList())))
                        .withOr(
                            Arrays
                                .asList(
                                    new ReportConfigFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ReportConfigFilter().withAnd(Arrays.asList()).withOr(Arrays.asList()),
                                    new ReportConfigFilter().withAnd(Arrays.asList()).withOr(Arrays.asList())))
                        .withDimensions(
                            new ReportConfigComparisonExpression()
                                .withName("ypyqrimzinp")
                                .withOperator(OperatorType.CONTAINS)
                                .withValues(Arrays.asList("jdkirsoodqx")))
                        .withTags(
                            new ReportConfigComparisonExpression()
                                .withName("rmnohj")
                                .withOperator(OperatorType.IN)
                                .withValues(Arrays.asList("whdsoifiyip"))));
        model = BinaryData.fromObject(model).toObject(ReportConfigDataset.class);
        Assertions.assertEquals(ReportGranularityType.MONTHLY, model.granularity());
        Assertions.assertEquals("lyxwjkcprbnwbx", model.configuration().columns().get(0));
        Assertions.assertEquals("zga", model.aggregation().get("ufizuckyf").name());
        Assertions.assertEquals(FunctionType.SUM, model.aggregation().get("ufizuckyf").function());
        Assertions.assertEquals(QueryColumnType.TAG_KEY, model.grouping().get(0).type());
        Assertions.assertEquals("dkfthwxmnt", model.grouping().get(0).name());
        Assertions.assertEquals(ReportConfigSortingType.ASCENDING, model.sorting().get(0).direction());
        Assertions.assertEquals("c", model.sorting().get(0).name());
        Assertions.assertEquals("ypyqrimzinp", model.filter().dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.filter().dimensions().operator());
        Assertions.assertEquals("jdkirsoodqx", model.filter().dimensions().values().get(0));
        Assertions.assertEquals("rmnohj", model.filter().tags().name());
        Assertions.assertEquals(OperatorType.IN, model.filter().tags().operator());
        Assertions.assertEquals("whdsoifiyip", model.filter().tags().values().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}