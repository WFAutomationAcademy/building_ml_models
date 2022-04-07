/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.finalassignment.config;

import com.workfusion.vds.sdk.api.hypermodel.annotation.ModelConfiguration;
import com.workfusion.vds.sdk.api.hypermodel.annotation.Named;
import com.workfusion.vds.sdk.api.nlp.annotator.Annotator;
import com.workfusion.vds.sdk.api.nlp.configuration.IeConfigurationContext;
import com.workfusion.vds.sdk.api.nlp.fe.FeatureExtractor;
import com.workfusion.vds.sdk.api.nlp.model.*;
import com.workfusion.vds.sdk.api.nlp.processing.Processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The model configuration class.
 * Here you can configure set of Feature Extractors, Annotators and Post-Processors.
 * Also you can import configuration with set of predefined components or your own configuration
 */
@ModelConfiguration
public class FinalAssignmentModelConfiguration {

    /**
     * Regex pattern to use for matching {@link Token} elements.
     */
    private final static String TOKEN_REGEX = "[\\w@.,$%’-]+";

    /**
     * Name of {@link Field} representing a client name.
     */
    public final static String FIELD_CLIENT_NAME = "client_name";

    /**
     * Name of {@link Field} representing a price.
     */
    public final static String FIELD_PRICE = "price";

    /**
     * Name of {@link Field} representing a product.
     */
    public final static String FIELD_PRODUCT = "product";

    /**
     * Regex pattern to match a price.
     */
    private final static String PRICE_REGEX = "(\\$[0-9]{1,3}[.][0-9]{2})";

    /**
     * Regex pattern to match a client name.
     */
    private static final String CLIENT_NAME_REGEX = "([A-Z][a-z ]{3,11}){3,4}";

    @Named("annotators")
    public List<Annotator<Document>> getAnnotators(IeConfigurationContext context) {
        List<Annotator<Document>> annotators = new ArrayList<>();

        // TODO:  PUT YOU CODE HERE

        return annotators;
    }

    @Named("featureExtractors")
    public List<FeatureExtractor<Element>> getFeatureExtractors(IeConfigurationContext context) {
        List<FeatureExtractor<Element>> featuresExtractors = new ArrayList<>();

            // TODO:  PUT YOU CODE HERE

        return featuresExtractors;
    }

    @Named("processors")
    public List<Processor<IeDocument>> getProcessors() {

        // TODO:  PUT YOU CODE HERE (IF NEEDED)

        return Arrays.asList();
    }

}