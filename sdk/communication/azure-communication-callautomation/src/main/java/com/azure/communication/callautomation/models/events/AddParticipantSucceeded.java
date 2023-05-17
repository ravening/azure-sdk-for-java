// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.communication.callautomation.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.callautomation.implementation.models.CommunicationIdentifierModel;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/** The AddParticipantSucceeded model. */
@Immutable
public final class AddParticipantSucceeded extends CallAutomationEventBase {
    /*
     * Participant added
     */
    @JsonIgnore
    private final CommunicationIdentifier participant;

    /*
     * Contains the resulting SIP code, sub-code and message.
     */
    @JsonProperty(value = "resultInformation")
    private final ResultInformation resultInformation;

    @JsonCreator
    private AddParticipantSucceeded(@JsonProperty("participant") Map<String, Object> participant) {
        this.resultInformation = null;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.participant = CommunicationIdentifierConverter.convert(mapper.convertValue(participant, CommunicationIdentifierModel.class));
    }

    /**
     * Get the participant property: Participant added.
     *
     * @return the participant value.
     */
    public CommunicationIdentifier getParticipant() {
        return this.participant;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code, sub-code and message.
     *
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }
}