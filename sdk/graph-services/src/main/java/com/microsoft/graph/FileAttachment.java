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
 * The type File Attachment.
*/
public class FileAttachment extends Attachment {

    public FileAttachment(){
        setODataType("#Microsoft.Graph.FileAttachment");
    }
            
    private String ContentId;
     
    /**
    * Gets the Content Id.
    *
    * @return the String
    */
    public String getContentId() {
        return this.ContentId; 
    }

    /**
    * Sets the Content Id.
    *
    * @param value the String
    */
    public void setContentId(String value) { 
        this.ContentId = value; 
    }
            
    private String ContentLocation;
     
    /**
    * Gets the Content Location.
    *
    * @return the String
    */
    public String getContentLocation() {
        return this.ContentLocation; 
    }

    /**
    * Sets the Content Location.
    *
    * @param value the String
    */
    public void setContentLocation(String value) { 
        this.ContentLocation = value; 
    }
            
    private Boolean IsContactPhoto;
     
    /**
    * Gets the Is Contact Photo.
    *
    * @return the Boolean
    */
    public Boolean getIsContactPhoto() {
        return this.IsContactPhoto; 
    }

    /**
    * Sets the Is Contact Photo.
    *
    * @param value the Boolean
    */
    public void setIsContactPhoto(Boolean value) { 
        this.IsContactPhoto = value; 
    }
            
    private byte[] ContentBytes;
     
    /**
    * Gets the Content Bytes.
    *
    * @return the byte[]
    */
    public byte[] getContentBytes() {
        return this.ContentBytes; 
    }

    /**
    * Sets the Content Bytes.
    *
    * @param value the byte[]
    */
    public void setContentBytes(byte[] value) { 
        this.ContentBytes = value; 
    }
}

