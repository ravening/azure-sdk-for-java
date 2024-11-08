// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.BalancesClient;
import com.azure.resourcemanager.consumption.fluent.models.BalanceInner;
import com.azure.resourcemanager.consumption.models.Balance;
import com.azure.resourcemanager.consumption.models.Balances;

public final class BalancesImpl implements Balances {
    private static final ClientLogger LOGGER = new ClientLogger(BalancesImpl.class);

    private final BalancesClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public BalancesImpl(BalancesClient innerClient,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Balance> getByBillingAccountWithResponse(String billingAccountId, Context context) {
        Response<BalanceInner> inner = this.serviceClient().getByBillingAccountWithResponse(billingAccountId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BalanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Balance getByBillingAccount(String billingAccountId) {
        BalanceInner inner = this.serviceClient().getByBillingAccount(billingAccountId);
        if (inner != null) {
            return new BalanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Balance> getForBillingPeriodByBillingAccountWithResponse(String billingAccountId,
        String billingPeriodName, Context context) {
        Response<BalanceInner> inner = this.serviceClient()
            .getForBillingPeriodByBillingAccountWithResponse(billingAccountId, billingPeriodName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BalanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Balance getForBillingPeriodByBillingAccount(String billingAccountId, String billingPeriodName) {
        BalanceInner inner
            = this.serviceClient().getForBillingPeriodByBillingAccount(billingAccountId, billingPeriodName);
        if (inner != null) {
            return new BalanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BalancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
