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
 * The type Item Reference.
*/
public class ItemReference extends ODataBaseEntity {

    public ItemReference(){
        setODataType("#Microsoft.Graph.ItemReference");
    }

    private String driveId;

    /**
    * Gets the drive Id.
    *
    * @return the String
    */
    public String getdriveId() {
        return this.driveId; 
    }

    /**
    * Sets the drive Id.
    *
    * @param value the String
    */
    public void setdriveId(String value) { 
        this.driveId = value; 
    }

    private String id;

    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }

    private String path;

    /**
    * Gets the path.
    *
    * @return the String
    */
    public String getpath() {
        return this.path; 
    }

    /**
    * Sets the path.
    *
    * @param value the String
    */
    public void setpath(String value) { 
        this.path = value; 
    }
}
