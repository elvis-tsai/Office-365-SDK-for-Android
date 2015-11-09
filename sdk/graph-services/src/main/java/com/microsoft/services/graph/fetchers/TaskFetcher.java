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
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Task
 */
public class TaskFetcher extends OrcEntityFetcher<Task,TaskOperations> 
                                     implements Readable<Task> {

     /**
     * Instantiates a new TaskFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public TaskFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Task.class, TaskOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public TaskFetcher addParameter(String name, Object value) {
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
    public TaskFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
         /**
     * Gets details.
     *
     * @return the details
     */
    public TaskDetailsFetcher getDetail() {
        return new TaskDetailsFetcher("details", this);
    }
     /**
     * Gets assignedtotaskboardformat.
     *
     * @return the assigned to task board format
     */
    public TaskBoardTaskFormatFetcher getAssignedToTaskBoardFormat() {
        return new TaskBoardTaskFormatFetcher("assignedToTaskBoardFormat", this);
    }
     /**
     * Gets progresstaskboardformat.
     *
     * @return the progress task board format
     */
    public TaskBoardTaskFormatFetcher getProgressTaskBoardFormat() {
        return new TaskBoardTaskFormatFetcher("progressTaskBoardFormat", this);
    }
     /**
     * Gets buckettaskboardformat.
     *
     * @return the bucket task board format
     */
    public TaskBoardTaskFormatFetcher getBucketTaskBoardFormat() {
        return new TaskBoardTaskFormatFetcher("bucketTaskBoardFormat", this);
    }

}
