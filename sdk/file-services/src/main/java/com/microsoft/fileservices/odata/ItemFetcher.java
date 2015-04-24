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
package com.microsoft.fileservices.odata;

import com.microsoft.fileservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;

/**
 * The type  ItemFetcher.
 */
public class ItemFetcher extends ODataEntityFetcher<Item,ItemOperations> 
                                     implements Readable<Item> {

     /**
     * Instantiates a new ItemFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ItemFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Item.class, ItemOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    public FileFetcher asFile(){
        return new FileFetcher(this.urlComponent, this.parent);
    }   

    public FolderFetcher asFolder(){
        return new FolderFetcher(this.urlComponent, this.parent);
    }   
    
}
