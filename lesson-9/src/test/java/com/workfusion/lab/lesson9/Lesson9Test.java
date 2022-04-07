/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.lesson9;

import java.util.Map;

import org.junit.Test;

import com.workfusion.lab.lesson9.config.Assignment1ModelConfiguration;
import com.workfusion.lab.lesson9.run.Assignment1ModelExecutionRunner;
import com.workfusion.lab.lesson9.run.Assignment1ModelTrainingRunner;
import com.workfusion.lab.utils.BaseLessonTest;

public class Lesson9Test extends BaseLessonTest {

    /**
     * Assignment 1:
     * Provide annotators, FEs and post-processor(for 'date' field) configuration for fields:
     * - "invoice_number".
     * - "date"
     * Use solutions from the previous lessons.
     * The configuration must be the fields content depended (revise the Lesson 5).
     * Define field configuration and provided paths in the provided Assignment1ModelExecutionRunner.
     * <p>
     * The test runs the model training runner, and check the avg-evaluation-results.txt.
     * You need to provide the annotators/FE configuration that gives:
     * - "invoice_number": P>0.9 and R>0.6
     * - "date": P>0.9 and R>0.6
     * <p>
     * Then test runs the model execution runner, and check the per-field-statistics.csv.
     * - "invoice_number": P>0.9 and R>0.6
     * - "date": P>0.9 and R>0.6
     */
    @Test
    public void assignment1() throws Exception {

        // Obtains training statistics
        executeRunner(Assignment1ModelTrainingRunner.class);
        Map<String, FieldStatistic> trainingStatistics = getTrainingFieldStatistics(Assignment1ModelTrainingRunner.OUTPUT_DIR_PATH);

        // Check the field statistics
        checkFieldStatistics(trainingStatistics, Assignment1ModelConfiguration.FIELD_INVOICE_NUMBER, 0.9, 0.6);
        checkFieldStatistics(trainingStatistics, Assignment1ModelConfiguration.FIELD_DATE, 0.9, 0.6);

        executeRunner(Assignment1ModelExecutionRunner.class);
        Map<String, FieldStatistic> executionStatistics = getExecutionFieldStatistics(Assignment1ModelTrainingRunner.OUTPUT_DIR_PATH + "/extract");

        // Check the field statistics
        checkFieldStatistics(executionStatistics, Assignment1ModelConfiguration.FIELD_INVOICE_NUMBER, 0.9, 0.6);
        checkFieldStatistics(executionStatistics, Assignment1ModelConfiguration.FIELD_DATE, 0.9, 0.6);

    }

}