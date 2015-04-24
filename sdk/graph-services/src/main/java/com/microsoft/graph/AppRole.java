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
 * The type App Role.
*/
public class AppRole extends ODataBaseEntity {

    public AppRole(){
        setODataType("#Microsoft.Graph.AppRole");
    }

    private java.util.List<String> allowedMemberTypes;

    /**
    * Gets the allowed Member Types.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getallowedMemberTypes() {
        return this.allowedMemberTypes; 
    }

    /**
    * Sets the allowed Member Types.
    *
    * @param value the java.util.List<String>
    */
    public void setallowedMemberTypes(java.util.List<String> value) { 
        this.allowedMemberTypes = value; 
    }

    private String description;

    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getdescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setdescription(String value) { 
        this.description = value; 
    }

    private String displayName;

    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getdisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setdisplayName(String value) { 
        this.displayName = value; 
    }

    private java.util.UUID id;

    /**
    * Gets the id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the java.util.UUID
    */
    public void setid(java.util.UUID value) { 
        this.id = value; 
    }

    private Boolean isEnabled;

    /**
    * Gets the is Enabled.
    *
    * @return the Boolean
    */
    public Boolean getisEnabled() {
        return this.isEnabled; 
    }

    /**
    * Sets the is Enabled.
    *
    * @param value the Boolean
    */
    public void setisEnabled(Boolean value) { 
        this.isEnabled = value; 
    }

    private String value;

    /**
    * Gets the value.
    *
    * @return the String
    */
    public String getvalue() {
        return this.value; 
    }

    /**
    * Sets the value.
    *
    * @param value the String
    */
    public void setvalue(String value) { 
        this.value = value; 
    }
}
