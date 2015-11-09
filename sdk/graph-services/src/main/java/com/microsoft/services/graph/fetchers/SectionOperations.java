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
 * The type SectionOperations.
 */
public class SectionOperations extends OrcOperations {

     /**
      * Instantiates a new SectionOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public SectionOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public SectionOperations addParameter(String name, Object value) {
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
    public SectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * CopyToNotebook listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId @param renameAs the renameAs 
     * @return the listenable future
     */         
    public ListenableFuture<CopySectionModel> copyToNotebook(String id, String siteCollectionId, String siteId, String renameAs) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedid = serializer.serialize(id);
		String serializedsiteCollectionId = serializer.serialize(siteCollectionId);
		String serializedsiteId = serializer.serialize(siteId);
		String serializedrenameAs = serializer.serialize(renameAs);
		  
        
        ListenableFuture<String> future = copyToNotebookRaw(serializedid, serializedsiteCollectionId, serializedsiteId, serializedrenameAs);
        return transformToEntityListenableFuture(future, CopySectionModel.class, getResolver());
        
    }

     /**
     * CopyToNotebookRaw listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId @param renameAs the renameAs 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyToNotebookRaw(String id, String siteCollectionId, String siteId, String renameAs){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("id", id);
		map.put("siteCollectionId", siteCollectionId);
		map.put("siteId", siteId);
		map.put("renameAs", renameAs);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.CopyToNotebook");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * CopyToSectionGroup listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId @param renameAs the renameAs 
     * @return the listenable future
     */         
    public ListenableFuture<CopySectionModel> copyToSectionGroup(String id, String siteCollectionId, String siteId, String renameAs) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedid = serializer.serialize(id);
		String serializedsiteCollectionId = serializer.serialize(siteCollectionId);
		String serializedsiteId = serializer.serialize(siteId);
		String serializedrenameAs = serializer.serialize(renameAs);
		  
        
        ListenableFuture<String> future = copyToSectionGroupRaw(serializedid, serializedsiteCollectionId, serializedsiteId, serializedrenameAs);
        return transformToEntityListenableFuture(future, CopySectionModel.class, getResolver());
        
    }

     /**
     * CopyToSectionGroupRaw listenable future.
     * @param id the id @param siteCollectionId the siteCollectionId @param siteId the siteId @param renameAs the renameAs 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyToSectionGroupRaw(String id, String siteCollectionId, String siteId, String renameAs){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("id", id);
		map.put("siteCollectionId", siteCollectionId);
		map.put("siteId", siteId);
		map.put("renameAs", renameAs);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.CopyToSectionGroup");
        
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
