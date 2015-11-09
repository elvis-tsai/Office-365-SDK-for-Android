/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Inference Classification Override.
*/
public class InferenceClassificationOverride extends Entity {

    public InferenceClassificationOverride(){
        setODataType("#Microsoft.Graph.InferenceClassificationOverride");
    }
            
    private InferenceClassificationType ClassifyAs;
     
    /**
    * Gets the Classify As.
    *
    * @return the InferenceClassificationType
    */
    public InferenceClassificationType getClassifyAs() {
        return this.ClassifyAs; 
    }

    /**
    * Sets the Classify As.
    *
    * @param value the InferenceClassificationType
    */
    public void setClassifyAs(InferenceClassificationType value) { 
        this.ClassifyAs = value; 
        valueChanged("ClassifyAs", value);

    }
            
    private EmailAddress SenderEmailAddress;
     
    /**
    * Gets the Sender Email Address.
    *
    * @return the EmailAddress
    */
    public EmailAddress getSenderEmailAddress() {
        return this.SenderEmailAddress; 
    }

    /**
    * Sets the Sender Email Address.
    *
    * @param value the EmailAddress
    */
    public void setSenderEmailAddress(EmailAddress value) { 
        this.SenderEmailAddress = value; 
        valueChanged("SenderEmailAddress", value);

    }
}

