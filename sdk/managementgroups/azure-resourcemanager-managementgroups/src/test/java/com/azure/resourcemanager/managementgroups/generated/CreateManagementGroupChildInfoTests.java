// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupChildInfo;

public final class CreateManagementGroupChildInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateManagementGroupChildInfo model = BinaryData.fromString(
            "{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"htxfvgxbfsmxnehm\",\"name\":\"ec\",\"displayName\":\"odebfqkkrbmpu\",\"children\":[{\"type\":\"/subscriptions\",\"id\":\"lzlfbxzpuz\",\"name\":\"ispnqzahmgkbrp\",\"displayName\":\"dhibnuq\",\"children\":[{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"drgvtqagn\",\"name\":\"ynhijggme\",\"displayName\":\"siarbutrcvpn\",\"children\":[{},{},{}]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"runmp\",\"name\":\"tdbhrbnla\",\"displayName\":\"xmyskp\",\"children\":[{},{},{}]}]},{\"type\":\"/subscriptions\",\"id\":\"kcxywnyt\",\"name\":\"synlqidybyxczfc\",\"displayName\":\"aaxdbabphlwrq\",\"children\":[{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"hsucoc\",\"name\":\"yyazttbt\",\"displayName\":\"rq\",\"children\":[{},{},{},{}]},{\"type\":\"/subscriptions\",\"id\":\"zywbiex\",\"name\":\"eyueaxibxujwb\",\"displayName\":\"walm\",\"children\":[{}]},{\"type\":\"/subscriptions\",\"id\":\"epdkzja\",\"name\":\"ux\",\"displayName\":\"d\",\"children\":[{},{},{},{}]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"niwdjsw\",\"name\":\"s\",\"displayName\":\"pgn\",\"children\":[{}]}]},{\"type\":\"/subscriptions\",\"id\":\"zxbzpfzabglc\",\"name\":\"xwtctyqiklbbovpl\",\"displayName\":\"bhvgy\",\"children\":[{\"type\":\"/subscriptions\",\"id\":\"mkfssxqukkfplgm\",\"name\":\"xnkjzkdesl\",\"displayName\":\"lopwiyig\",\"children\":[{},{}]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"zb\",\"name\":\"uebbaumnyqup\",\"displayName\":\"eojnabc\",\"children\":[{},{},{}]},{\"type\":\"Microsoft.Management/managementGroups\",\"id\":\"psiebtfhvpes\",\"name\":\"skrdqmhjj\",\"displayName\":\"tldwkyzxuutk\",\"children\":[{}]},{\"type\":\"/subscriptions\",\"id\":\"svlxotogtwrup\",\"name\":\"xvnmicykvceov\",\"displayName\":\"lo\",\"children\":[{}]}]}]}")
            .toObject(CreateManagementGroupChildInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateManagementGroupChildInfo model = new CreateManagementGroupChildInfo();
        model = BinaryData.fromObject(model).toObject(CreateManagementGroupChildInfo.class);
    }
}
