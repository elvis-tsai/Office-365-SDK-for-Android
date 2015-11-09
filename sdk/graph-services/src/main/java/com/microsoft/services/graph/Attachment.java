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
 * The type Attachment.
*/
public class Attachment extends Entity {

    public Attachment(){
        setODataType("#Microsoft.Graph.Attachment");
    }
            
    private java.util.Calendar LastModifiedDateTime;
     
    /**
    * Gets the Last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.LastModifiedDateTime; 
    }

    /**
    * Sets the Last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.LastModifiedDateTime = value; 
        valueChanged("LastModifiedDateTime", value);

    }
            
    private String Name;
     
    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value; 
        valueChanged("Name", value);

    }
            
    private String ContentType;
     
    /**
    * Gets the Content Type.
    *
    * @return the String
    */
    public String getContentType() {
        return this.ContentType; 
    }

    /**
    * Sets the Content Type.
    *
    * @param value the String
    */
    public void setContentType(String value) { 
        this.ContentType = value; 
        valueChanged("ContentType", value);

    }
            
    private Integer Size;
     
    /**
    * Gets the Size.
    *
    * @return the Integer
    */
    public Integer getSize() {
        return this.Size; 
    }

    /**
    * Sets the Size.
    *
    * @param value the Integer
    */
    public void setSize(Integer value) { 
        this.Size = value; 
        valueChanged("Size", value);

    }
            
    private Boolean IsInline;
     
    /**
    * Gets the Is Inline.
    *
    * @return the Boolean
    */
    public Boolean getIsInline() {
        return this.IsInline; 
    }

    /**
    * Sets the Is Inline.
    *
    * @param value the Boolean
    */
    public void setIsInline(Boolean value) { 
        this.IsInline = value; 
        valueChanged("IsInline", value);

    }
}

