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
public enum KalturaMediaEntryOrderBy implements KalturaEnumAsString {
    MEDIA_TYPE_ASC ("+mediaType"),
    MEDIA_TYPE_DESC ("-mediaType"),
    PLAYS_ASC ("+plays"),
    PLAYS_DESC ("-plays"),
    VIEWS_ASC ("+views"),
    VIEWS_DESC ("-views"),
    DURATION_ASC ("+duration"),
    DURATION_DESC ("-duration"),
    MS_DURATION_ASC ("+msDuration"),
    MS_DURATION_DESC ("-msDuration"),
    NAME_ASC ("+name"),
    NAME_DESC ("-name"),
    MODERATION_COUNT_ASC ("+moderationCount"),
    MODERATION_COUNT_DESC ("-moderationCount"),
    CREATED_AT_ASC ("+createdAt"),
    CREATED_AT_DESC ("-createdAt"),
    UPDATED_AT_ASC ("+updatedAt"),
    UPDATED_AT_DESC ("-updatedAt"),
    RANK_ASC ("+rank"),
    RANK_DESC ("-rank"),
    TOTAL_RANK_ASC ("+totalRank"),
    TOTAL_RANK_DESC ("-totalRank"),
    START_DATE_ASC ("+startDate"),
    START_DATE_DESC ("-startDate"),
    END_DATE_ASC ("+endDate"),
    END_DATE_DESC ("-endDate"),
    PARTNER_SORT_VALUE_ASC ("+partnerSortValue"),
    PARTNER_SORT_VALUE_DESC ("-partnerSortValue"),
    RECENT_ASC ("+recent"),
    RECENT_DESC ("-recent"),
    WEIGHT_ASC ("+weight"),
    WEIGHT_DESC ("-weight");

    public String hashCode;

    KalturaMediaEntryOrderBy(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public static KalturaMediaEntryOrderBy get(String hashCode) {
        if (hashCode.equals("+mediaType"))
        {
           return MEDIA_TYPE_ASC;
        }
        else 
        if (hashCode.equals("-mediaType"))
        {
           return MEDIA_TYPE_DESC;
        }
        else 
        if (hashCode.equals("+plays"))
        {
           return PLAYS_ASC;
        }
        else 
        if (hashCode.equals("-plays"))
        {
           return PLAYS_DESC;
        }
        else 
        if (hashCode.equals("+views"))
        {
           return VIEWS_ASC;
        }
        else 
        if (hashCode.equals("-views"))
        {
           return VIEWS_DESC;
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
        if (hashCode.equals("+msDuration"))
        {
           return MS_DURATION_ASC;
        }
        else 
        if (hashCode.equals("-msDuration"))
        {
           return MS_DURATION_DESC;
        }
        else 
        if (hashCode.equals("+name"))
        {
           return NAME_ASC;
        }
        else 
        if (hashCode.equals("-name"))
        {
           return NAME_DESC;
        }
        else 
        if (hashCode.equals("+moderationCount"))
        {
           return MODERATION_COUNT_ASC;
        }
        else 
        if (hashCode.equals("-moderationCount"))
        {
           return MODERATION_COUNT_DESC;
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
        if (hashCode.equals("+rank"))
        {
           return RANK_ASC;
        }
        else 
        if (hashCode.equals("-rank"))
        {
           return RANK_DESC;
        }
        else 
        if (hashCode.equals("+totalRank"))
        {
           return TOTAL_RANK_ASC;
        }
        else 
        if (hashCode.equals("-totalRank"))
        {
           return TOTAL_RANK_DESC;
        }
        else 
        if (hashCode.equals("+startDate"))
        {
           return START_DATE_ASC;
        }
        else 
        if (hashCode.equals("-startDate"))
        {
           return START_DATE_DESC;
        }
        else 
        if (hashCode.equals("+endDate"))
        {
           return END_DATE_ASC;
        }
        else 
        if (hashCode.equals("-endDate"))
        {
           return END_DATE_DESC;
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
        if (hashCode.equals("+recent"))
        {
           return RECENT_ASC;
        }
        else 
        if (hashCode.equals("-recent"))
        {
           return RECENT_DESC;
        }
        else 
        if (hashCode.equals("+weight"))
        {
           return WEIGHT_ASC;
        }
        else 
        if (hashCode.equals("-weight"))
        {
           return WEIGHT_DESC;
        }
        else 
        {
           return MEDIA_TYPE_ASC;
        }
    }
}
