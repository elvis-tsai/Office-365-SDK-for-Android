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
package com.microsoft.outlookservices.odata;

import com.microsoft.outlookservices.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;

/**
 * The type  CalendarGroupFetcher.
 */
public class CalendarGroupFetcher extends ODataEntityFetcher<CalendarGroup,CalendarGroupOperations> 
                                     implements Readable<CalendarGroup> {

     /**
     * Instantiates a new CalendarGroupFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public CalendarGroupFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, CalendarGroup.class, CalendarGroupOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public CalendarGroupFetcher addParameter(String name, Object value) {
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
    public CalendarGroupFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets calendars.
     *
     * @return the calendars
     */
    public ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations> getCalendars() {
        return new ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class);
    }

    /**
     * Gets calendar.
     *
     * @return the calendar
     */
    public CalendarFetcher getCalendar(String id){
         return new ODataCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class).getById(id);
    }

}
