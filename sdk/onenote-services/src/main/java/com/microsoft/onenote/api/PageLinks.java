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
package com.microsoft.onenote.api;

/**
 * The type Page Links.
*/
public class PageLinks extends ODataBaseEntity {

    public PageLinks(){
        setODataType("#Microsoft.OneNote.Api.PageLinks");
    }

    private ExternalLink oneNoteClientUrl;

    /**
    * Gets the one Note Client Url.
    *
    * @return the ExternalLink
    */
    public ExternalLink getoneNoteClientUrl() {
        return this.oneNoteClientUrl; 
    }

    /**
    * Sets the one Note Client Url.
    *
    * @param value the ExternalLink
    */
    public void setoneNoteClientUrl(ExternalLink value) { 
        this.oneNoteClientUrl = value; 
    }

    private ExternalLink oneNoteWebUrl;

    /**
    * Gets the one Note Web Url.
    *
    * @return the ExternalLink
    */
    public ExternalLink getoneNoteWebUrl() {
        return this.oneNoteWebUrl; 
    }

    /**
    * Sets the one Note Web Url.
    *
    * @param value the ExternalLink
    */
    public void setoneNoteWebUrl(ExternalLink value) { 
        this.oneNoteWebUrl = value; 
    }
}
