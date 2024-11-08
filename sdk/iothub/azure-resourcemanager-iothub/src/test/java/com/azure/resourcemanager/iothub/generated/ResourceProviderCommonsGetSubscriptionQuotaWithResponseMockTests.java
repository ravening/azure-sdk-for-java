// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.models.UserSubscriptionQuotaListResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceProviderCommonsGetSubscriptionQuotaWithResponseMockTests {
    @Test
    public void testGetSubscriptionQuotaWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"id\":\"m\",\"type\":\"elfk\",\"unit\":\"plcrpwjxeznoig\",\"currentValue\":1629929143,\"limit\":78326163,\"name\":{\"value\":\"kpnb\",\"localizedValue\":\"zejjoqk\"}},{\"id\":\"fhsxttaugz\",\"type\":\"faazpxdtnkdmkqjj\",\"unit\":\"uenvrkp\",\"currentValue\":1149694160,\"limit\":1074259109,\"name\":{\"value\":\"ebqaaysjkixqtnq\",\"localizedValue\":\"ezl\"}},{\"id\":\"ffiakp\",\"type\":\"qqmtedltmmji\",\"unit\":\"eozphv\",\"currentValue\":1760801565,\"limit\":404997188,\"name\":{\"value\":\"ygupkv\",\"localizedValue\":\"mdscwxqupev\"}}],\"nextLink\":\"f\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        IotHubManager manager = IotHubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        UserSubscriptionQuotaListResult response = manager.resourceProviderCommons()
            .getSubscriptionQuotaWithResponse(com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("m", response.value().get(0).id());
        Assertions.assertEquals("elfk", response.value().get(0).type());
        Assertions.assertEquals("plcrpwjxeznoig", response.value().get(0).unit());
        Assertions.assertEquals(1629929143, response.value().get(0).currentValue());
        Assertions.assertEquals(78326163, response.value().get(0).limit());
        Assertions.assertEquals("kpnb", response.value().get(0).name().value());
        Assertions.assertEquals("zejjoqk", response.value().get(0).name().localizedValue());
    }
}
