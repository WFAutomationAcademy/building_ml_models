/*
 * Copyright (C) WorkFusion 2018. All rights reserved.
 */
package com.workfusion.lab.finalassignment.model;

import com.workfusion.automl.hypermodel.ie.IeGenericSe30Hypermodel;
import com.workfusion.lab.finalassignment.config.FinalAssignmentModelConfiguration;
import com.workfusion.vds.sdk.api.hypermodel.ModelType;
import com.workfusion.vds.sdk.api.hypermodel.annotation.HypermodelConfiguration;
import com.workfusion.vds.sdk.api.hypermodel.annotation.ModelDescription;

/**
 * The model class. Define here you model details like code, version etc.
 */
@ModelDescription(
        code = "wf-lab-ml-sdk-final-assignment-model",
        title = "WF Lab ML-SDK Final Assignment Model (1.0)",
        description = "WF Lab ML-SDK Final Assignment Model (1.0)",
        version = "1.0",
        type = ModelType.IE
)
@HypermodelConfiguration(FinalAssignmentModelConfiguration.class)
public class FinalAssignmentModel extends IeGenericSe30Hypermodel {

    public FinalAssignmentModel() throws Exception {
    }

}