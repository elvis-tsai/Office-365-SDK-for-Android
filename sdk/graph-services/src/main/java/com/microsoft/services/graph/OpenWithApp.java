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

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Open With App.
*/
public class OpenWithApp extends ODataBaseEntity {

    public OpenWithApp(){
        setODataType("#Microsoft.Graph.openWithApp");
    }

    private Identity app;

    /**
    * Gets the app.
    *
    * @return the Identity
    */
    public Identity getApp() {
        return this.app; 
    }

    /**
    * Sets the app.
    *
    * @param value the Identity
    */
    public void setApp(Identity value) { 
        this.app = value;
        valueChanged("app", value);

    }

    private String viewUrl;

    /**
    * Gets the view Url.
    *
    * @return the String
    */
    public String getViewUrl() {
        return this.viewUrl; 
    }

    /**
    * Sets the view Url.
    *
    * @param value the String
    */
    public void setViewUrl(String value) { 
        this.viewUrl = value;
        valueChanged("viewUrl", value);

    }

    private String editUrl;

    /**
    * Gets the edit Url.
    *
    * @return the String
    */
    public String getEditUrl() {
        return this.editUrl; 
    }

    /**
    * Sets the edit Url.
    *
    * @param value the String
    */
    public void setEditUrl(String value) { 
        this.editUrl = value;
        valueChanged("editUrl", value);

    }

    private String viewPostParameters;

    /**
    * Gets the view Post Parameters.
    *
    * @return the String
    */
    public String getViewPostParameters() {
        return this.viewPostParameters; 
    }

    /**
    * Sets the view Post Parameters.
    *
    * @param value the String
    */
    public void setViewPostParameters(String value) { 
        this.viewPostParameters = value;
        valueChanged("viewPostParameters", value);

    }

    private String editPostParameters;

    /**
    * Gets the edit Post Parameters.
    *
    * @return the String
    */
    public String getEditPostParameters() {
        return this.editPostParameters; 
    }

    /**
    * Sets the edit Post Parameters.
    *
    * @param value the String
    */
    public void setEditPostParameters(String value) { 
        this.editPostParameters = value;
        valueChanged("editPostParameters", value);

    }
}
