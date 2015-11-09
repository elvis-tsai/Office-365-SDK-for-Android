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
 * The type Conversation Thread.
*/
public class ConversationThread extends Entity {

    public ConversationThread(){
        setODataType("#Microsoft.Graph.ConversationThread");
    }
    
        
    private java.util.List<Recipient> ToRecipients = null;
    
    
     
    /**
    * Gets the To Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getToRecipients() {
        return this.ToRecipients; 
    }

    /**
    * Sets the To Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setToRecipients(java.util.List<Recipient> value) { 
        this.ToRecipients = value; 
        valueChanged("ToRecipients", value);

    }
            
    private String Topic;
     
    /**
    * Gets the Topic.
    *
    * @return the String
    */
    public String getTopic() {
        return this.Topic; 
    }

    /**
    * Sets the Topic.
    *
    * @param value the String
    */
    public void setTopic(String value) { 
        this.Topic = value; 
        valueChanged("Topic", value);

    }
            
    private Boolean HasAttachments;
     
    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments; 
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.HasAttachments = value; 
        valueChanged("HasAttachments", value);

    }
            
    private java.util.Calendar LastDeliveredDateTime;
     
    /**
    * Gets the Last Delivered Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastDeliveredDateTime() {
        return this.LastDeliveredDateTime; 
    }

    /**
    * Sets the Last Delivered Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastDeliveredDateTime(java.util.Calendar value) { 
        this.LastDeliveredDateTime = value; 
        valueChanged("LastDeliveredDateTime", value);

    }
    
        
    private java.util.List<String> UniqueSenders = null;
    
    
     
    /**
    * Gets the Unique Senders.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getUniqueSenders() {
        return this.UniqueSenders; 
    }

    /**
    * Sets the Unique Senders.
    *
    * @param value the java.util.List<String>
    */
    public void setUniqueSenders(java.util.List<String> value) { 
        this.UniqueSenders = value; 
        valueChanged("UniqueSenders", value);

    }
    
        
    private java.util.List<Recipient> CcRecipients = null;
    
    
     
    /**
    * Gets the Cc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getCcRecipients() {
        return this.CcRecipients; 
    }

    /**
    * Sets the Cc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setCcRecipients(java.util.List<Recipient> value) { 
        this.CcRecipients = value; 
        valueChanged("CcRecipients", value);

    }
            
    private String Preview;
     
    /**
    * Gets the Preview.
    *
    * @return the String
    */
    public String getPreview() {
        return this.Preview; 
    }

    /**
    * Sets the Preview.
    *
    * @param value the String
    */
    public void setPreview(String value) { 
        this.Preview = value; 
        valueChanged("Preview", value);

    }
            
    private Boolean IsLocked;
     
    /**
    * Gets the Is Locked.
    *
    * @return the Boolean
    */
    public Boolean getIsLocked() {
        return this.IsLocked; 
    }

    /**
    * Sets the Is Locked.
    *
    * @param value the Boolean
    */
    public void setIsLocked(Boolean value) { 
        this.IsLocked = value; 
        valueChanged("IsLocked", value);

    }
    
        
    private java.util.List<Post> Posts = null;
    
    
     
    /**
    * Gets the Posts.
    *
    * @return the java.util.List<Post>
    */
    public java.util.List<Post> getPosts() {
        return this.Posts; 
    }

    /**
    * Sets the Posts.
    *
    * @param value the java.util.List<Post>
    */
    public void setPosts(java.util.List<Post> value) { 
        this.Posts = value; 
        valueChanged("Posts", value);

    }
}

