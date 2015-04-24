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
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type FileOperations.
 */
public class FileOperations extends ItemOperations {

     /**
      * Instantiates a new FileOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public FileOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public FileOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public FileOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * copy listenable future.
     * @param destFolderId the destFolderId @param destFolderPath the destFolderPath @param newName the newName 
     * @return the listenable future
     */         
    public ListenableFuture<File> copy(String destFolderId, String destFolderPath, String newName) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializeddestFolderId = serializer.serialize(destFolderId);
		String serializeddestFolderPath = serializer.serialize(destFolderPath);
		String serializednewName = serializer.serialize(newName);
		  
        
        ListenableFuture<String> future = copyRaw(serializeddestFolderId, serializeddestFolderPath, serializednewName);
        return transformToEntityListenableFuture(future, File.class, getResolver());
        
    }

     /**
     * copyRaw listenable future.
     * @param destFolderId the destFolderId @param destFolderPath the destFolderPath @param newName the newName 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String destFolderId, String destFolderPath, String newName){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("destFolderId", destFolderId);
		map.put("destFolderPath", destFolderPath);
		map.put("newName", newName);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.FileServices.copy");
        
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
