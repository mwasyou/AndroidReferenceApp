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
public enum KalturaFileSyncObjectType implements KalturaEnumAsString {
    ENTRY ("1"),
    UICONF ("2"),
    BATCHJOB ("3"),
    ASSET ("4"),
    METADATA ("5"),
    METADATA_PROFILE ("6"),
    SYNDICATION_FEED ("7"),
    CONVERSION_PROFILE ("8"),
    GENERIC_DISTRIBUTION_ACTION ("contentDistribution.GenericDistributionAction"),
    ENTRY_DISTRIBUTION ("contentDistribution.EntryDistribution"),
    DISTRIBUTION_PROFILE ("contentDistribution.DistributionProfile"),
    EMAIL_NOTIFICATION_TEMPLATE ("emailNotification.EmailNotificationTemplate");

    public String hashCode;

    KalturaFileSyncObjectType(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public static KalturaFileSyncObjectType get(String hashCode) {
        if (hashCode.equals("1"))
        {
           return ENTRY;
        }
        else 
        if (hashCode.equals("2"))
        {
           return UICONF;
        }
        else 
        if (hashCode.equals("3"))
        {
           return BATCHJOB;
        }
        else 
        if (hashCode.equals("4"))
        {
           return ASSET;
        }
        else 
        if (hashCode.equals("5"))
        {
           return METADATA;
        }
        else 
        if (hashCode.equals("6"))
        {
           return METADATA_PROFILE;
        }
        else 
        if (hashCode.equals("7"))
        {
           return SYNDICATION_FEED;
        }
        else 
        if (hashCode.equals("8"))
        {
           return CONVERSION_PROFILE;
        }
        else 
        if (hashCode.equals("contentDistribution.GenericDistributionAction"))
        {
           return GENERIC_DISTRIBUTION_ACTION;
        }
        else 
        if (hashCode.equals("contentDistribution.EntryDistribution"))
        {
           return ENTRY_DISTRIBUTION;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionProfile"))
        {
           return DISTRIBUTION_PROFILE;
        }
        else 
        if (hashCode.equals("emailNotification.EmailNotificationTemplate"))
        {
           return EMAIL_NOTIFICATION_TEMPLATE;
        }
        else 
        {
           return ENTRY;
        }
    }
}
