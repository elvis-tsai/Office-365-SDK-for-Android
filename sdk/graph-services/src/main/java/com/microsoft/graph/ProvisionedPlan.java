/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

/**
 * The type Provisioned Plan.
*/
public class ProvisionedPlan extends ODataBaseEntity {

    public ProvisionedPlan(){
        setODataType("#Microsoft.Graph.ProvisionedPlan");
    }

    private String capabilityStatus;

    /**
    * Gets the capability Status.
    *
    * @return the String
    */
    public String getcapabilityStatus() {
        return this.capabilityStatus; 
    }

    /**
    * Sets the capability Status.
    *
    * @param value the String
    */
    public void setcapabilityStatus(String value) { 
        this.capabilityStatus = value; 
    }

    private String provisioningStatus;

    /**
    * Gets the provisioning Status.
    *
    * @return the String
    */
    public String getprovisioningStatus() {
        return this.provisioningStatus; 
    }

    /**
    * Sets the provisioning Status.
    *
    * @param value the String
    */
    public void setprovisioningStatus(String value) { 
        this.provisioningStatus = value; 
    }

    private String service;

    /**
    * Gets the service.
    *
    * @return the String
    */
    public String getservice() {
        return this.service; 
    }

    /**
    * Sets the service.
    *
    * @param value the String
    */
    public void setservice(String value) { 
        this.service = value; 
    }
}
