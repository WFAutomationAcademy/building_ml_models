/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.lesson7.config;

import com.workfusion.vds.sdk.api.hypermodel.annotation.ModelConfiguration;
import com.workfusion.vds.sdk.api.nlp.model.Field;
import com.workfusion.vds.sdk.api.nlp.model.Token;

/**
 * The model configuration class.
 * Here you can configure set of Feature Extractors, Annotators.
 */
@ModelConfiguration
public class Assignment4ModelConfiguration {

    /**
     * Regex pattern to use for matching {@link Token} elements.
     */
    private final static String TOKEN_REGEX = "[\\w@.,$%’-]+";

    /**
     * Name of {@link Field} representing a price.
     */
    public final static String FIELD_PRICE = "price";

    /**
     * Regex pattern to match a price.
     */
    private final static String PRICE_REGEX = "(\\$[0-9]{1,3}[.][0-9]{2})";

    // TODO:  PUT YOU CODE HERE

}