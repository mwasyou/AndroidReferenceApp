// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2011  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 17 Aug 12 06:33:26 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaAnnotationOrderBy implements KalturaEnumAsString {
    END_TIME_ASC ("+endTime"),
    END_TIME_DESC ("-endTime"),
    DURATION_ASC ("+duration"),
    DURATION_DESC ("-duration"),
    CREATED_AT_ASC ("+createdAt"),
    CREATED_AT_DESC ("-createdAt"),
    UPDATED_AT_ASC ("+updatedAt"),
    UPDATED_AT_DESC ("-updatedAt"),
    START_TIME_ASC ("+startTime"),
    START_TIME_DESC ("-startTime"),
    PARTNER_SORT_VALUE_ASC ("+partnerSortValue"),
    PARTNER_SORT_VALUE_DESC ("-partnerSortValue");

    public String hashCode;

    KalturaAnnotationOrderBy(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public static KalturaAnnotationOrderBy get(String hashCode) {
        if (hashCode.equals("+endTime"))
        {
           return END_TIME_ASC;
        }
        else 
        if (hashCode.equals("-endTime"))
        {
           return END_TIME_DESC;
        }
        else 
        if (hashCode.equals("+duration"))
        {
           return DURATION_ASC;
        }
        else 
        if (hashCode.equals("-duration"))
        {
           return DURATION_DESC;
        }
        else 
        if (hashCode.equals("+createdAt"))
        {
           return CREATED_AT_ASC;
        }
        else 
        if (hashCode.equals("-createdAt"))
        {
           return CREATED_AT_DESC;
        }
        else 
        if (hashCode.equals("+updatedAt"))
        {
           return UPDATED_AT_ASC;
        }
        else 
        if (hashCode.equals("-updatedAt"))
        {
           return UPDATED_AT_DESC;
        }
        else 
        if (hashCode.equals("+startTime"))
        {
           return START_TIME_ASC;
        }
        else 
        if (hashCode.equals("-startTime"))
        {
           return START_TIME_DESC;
        }
        else 
        if (hashCode.equals("+partnerSortValue"))
        {
           return PARTNER_SORT_VALUE_ASC;
        }
        else 
        if (hashCode.equals("-partnerSortValue"))
        {
           return PARTNER_SORT_VALUE_DESC;
        }
        else 
        {
           return END_TIME_ASC;
        }
    }
}
