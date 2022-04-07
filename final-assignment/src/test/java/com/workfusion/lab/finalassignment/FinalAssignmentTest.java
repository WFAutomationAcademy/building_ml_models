/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.finalassignment;

import com.workfusion.lab.finalassignment.config.FinalAssignmentModelConfiguration;
import com.workfusion.lab.finalassignment.run.FinalAssignmentModelExecutionRunner;
import com.workfusion.lab.finalassignment.run.FinalAssignmentModelTrainingRunner;
import com.workfusion.lab.utils.BaseLessonTest;
import org.junit.Test;

import java.util.Map;

public class FinalAssignmentTest extends BaseLessonTest {

    /**
     * Final Assignment:
     * Check the provided data and provide the configuration for custom model
     * The test runs the model training runner, and check the avg-evaluation-results.txt.
     * You need to provide the annotators/FE/processors configuration that gives:
     * for all fields: P>0.9 and R>0.6
     * <p>
     * Then test runs the model execution runner, and check the per-field-statistics.csv.
     * for all fields: P>0.9 and R>0.6
     * List of fields:
     * - "price"
     * - "product"
     * - "client_name"
     */
    @Test
    public void assignment() throws Exception {

        // Obtains training statistics
        executeRunner(FinalAssignmentModelTrainingRunner.class);
        Map<String, FieldStatistic> trainingStatistics = getTrainingFieldStatistics(FinalAssignmentModelTrainingRunner.OUTPUT_DIR_PATH);

        // Check the field statistics
        checkFieldStatistics(trainingStatistics, FinalAssignmentModelConfiguration.FIELD_PRICE, 0.9, 0.6);
        checkFieldStatistics(trainingStatistics, FinalAssignmentModelConfiguration.FIELD_PRODUCT, 0.9, 0.6);
        checkFieldStatistics(trainingStatistics, FinalAssignmentModelConfiguration.FIELD_CLIENT_NAME, 0.9, 0.6);

        executeRunner(FinalAssignmentModelExecutionRunner.class);
        Map<String, FieldStatistic> executionStatistics = getExecutionFieldStatistics(FinalAssignmentModelTrainingRunner.OUTPUT_DIR_PATH + "/extract");

        // Check the field statistics
        checkFieldStatistics(executionStatistics, FinalAssignmentModelConfiguration.FIELD_PRICE, 0.9, 0.6);
        checkFieldStatistics(executionStatistics, FinalAssignmentModelConfiguration.FIELD_PRODUCT, 0.9, 0.6);
        checkFieldStatistics(executionStatistics, FinalAssignmentModelConfiguration.FIELD_CLIENT_NAME, 0.9, 0.6);
    }

}