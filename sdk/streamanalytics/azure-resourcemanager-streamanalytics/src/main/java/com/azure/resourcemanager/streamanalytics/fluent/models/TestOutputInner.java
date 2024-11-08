// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A stream analytics output.
 */
@Fluent
public final class TestOutputInner implements JsonSerializable<TestOutputInner> {
    /*
     * The stream analytics output to test.
     */
    private OutputInner output;

    /**
     * Creates an instance of TestOutputInner class.
     */
    public TestOutputInner() {
    }

    /**
     * Get the output property: The stream analytics output to test.
     * 
     * @return the output value.
     */
    public OutputInner output() {
        return this.output;
    }

    /**
     * Set the output property: The stream analytics output to test.
     * 
     * @param output the output value to set.
     * @return the TestOutputInner object itself.
     */
    public TestOutputInner withOutput(OutputInner output) {
        this.output = output;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (output() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property output in model TestOutputInner"));
        } else {
            output().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TestOutputInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("output", this.output);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestOutputInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestOutputInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TestOutputInner.
     */
    public static TestOutputInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TestOutputInner deserializedTestOutputInner = new TestOutputInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("output".equals(fieldName)) {
                    deserializedTestOutputInner.output = OutputInner.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTestOutputInner;
        });
    }
}
