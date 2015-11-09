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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type PageOperations.
 */
public class PageOperations extends OrcOperations {

     /**
      * Instantiates a new PageOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public PageOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public PageOperations addParameter(String name, Object value) {
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
    public PageOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * PatchContent listenable future.
     * @param commands the commands 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> patchContent(java.util.List<PatchContentCommand> commands) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedcommands = serializer.serialize(commands);
		  
        
        ListenableFuture<String> future = patchContentRaw(serializedcommands);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * PatchContentRaw listenable future.
     * @param commands the commands 
     * @return the listenable future
     */ 
    public ListenableFuture<String> patchContentRaw(String commands){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("commands", commands);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.PatchContent");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * CopyToSection listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId 
     * @return the listenable future
     */         
    public ListenableFuture<CopyPageModel> copyToSection(String id, String siteCollectionId, String siteId) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedid = serializer.serialize(id);
		String serializedsiteCollectionId = serializer.serialize(siteCollectionId);
		String serializedsiteId = serializer.serialize(siteId);
		  
        
        ListenableFuture<String> future = copyToSectionRaw(serializedid, serializedsiteCollectionId, serializedsiteId);
        return transformToEntityListenableFuture(future, CopyPageModel.class, getResolver());
        
    }

     /**
     * CopyToSectionRaw listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyToSectionRaw(String id, String siteCollectionId, String siteId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("id", id);
		map.put("siteCollectionId", siteCollectionId);
		map.put("siteId", siteId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.CopyToSection");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * Thumbnail listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<ODataStream> thumbnail() { 
              
          
        
        ListenableFuture<String> future = thumbnailRaw();
        return transformToEntityListenableFuture(future, ODataStream.class, getResolver());
        
    }

     /**
     * ThumbnailRaw listenable future.
     * 
     * @return the listenable future
     */ 
    public ListenableFuture<String> thumbnailRaw(){
        
        
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.Thumbnail");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
