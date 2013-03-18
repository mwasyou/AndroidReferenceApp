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
public enum KalturaBatchJobType implements KalturaEnumAsString {
    CONVERT ("0"),
    IMPORT ("1"),
    DELETE ("2"),
    FLATTEN ("3"),
    BULKUPLOAD ("4"),
    DVDCREATOR ("5"),
    DOWNLOAD ("6"),
    OOCONVERT ("7"),
    CONVERT_PROFILE ("10"),
    POSTCONVERT ("11"),
    EXTRACT_MEDIA ("14"),
    MAIL ("15"),
    NOTIFICATION ("16"),
    CLEANUP ("17"),
    SCHEDULER_HELPER ("18"),
    BULKDOWNLOAD ("19"),
    DB_CLEANUP ("20"),
    PROVISION_PROVIDE ("21"),
    CONVERT_COLLECTION ("22"),
    STORAGE_EXPORT ("23"),
    PROVISION_DELETE ("24"),
    STORAGE_DELETE ("25"),
    EMAIL_INGESTION ("26"),
    METADATA_IMPORT ("27"),
    METADATA_TRANSFORM ("28"),
    FILESYNC_IMPORT ("29"),
    CAPTURE_THUMB ("30"),
    DELETE_FILE ("31"),
    INDEX ("32"),
    MOVE_CATEGORY_ENTRIES ("33"),
    COPY ("34"),
    VIRUS_SCAN ("virusScan.VirusScan"),
    DISTRIBUTION_SUBMIT ("contentDistribution.DistributionSubmit"),
    DISTRIBUTION_UPDATE ("contentDistribution.DistributionUpdate"),
    DISTRIBUTION_DELETE ("contentDistribution.DistributionDelete"),
    DISTRIBUTION_FETCH_REPORT ("contentDistribution.DistributionFetchReport"),
    DISTRIBUTION_ENABLE ("contentDistribution.DistributionEnable"),
    DISTRIBUTION_DISABLE ("contentDistribution.DistributionDisable"),
    DISTRIBUTION_SYNC ("contentDistribution.DistributionSync"),
    DROP_FOLDER_WATCHER ("dropFolder.DropFolderWatcher"),
    DROP_FOLDER_HANDLER ("dropFolder.DropFolderHandler"),
    PARSE_CAPTION_ASSET ("captionSearch.parseCaptionAsset"),
    EVENT_NOTIFICATION_HANDLER ("eventNotification.EventNotificationHandler");

    public String hashCode;

    KalturaBatchJobType(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public static KalturaBatchJobType get(String hashCode) {
        if (hashCode.equals("0"))
        {
           return CONVERT;
        }
        else 
        if (hashCode.equals("1"))
        {
           return IMPORT;
        }
        else 
        if (hashCode.equals("2"))
        {
           return DELETE;
        }
        else 
        if (hashCode.equals("3"))
        {
           return FLATTEN;
        }
        else 
        if (hashCode.equals("4"))
        {
           return BULKUPLOAD;
        }
        else 
        if (hashCode.equals("5"))
        {
           return DVDCREATOR;
        }
        else 
        if (hashCode.equals("6"))
        {
           return DOWNLOAD;
        }
        else 
        if (hashCode.equals("7"))
        {
           return OOCONVERT;
        }
        else 
        if (hashCode.equals("10"))
        {
           return CONVERT_PROFILE;
        }
        else 
        if (hashCode.equals("11"))
        {
           return POSTCONVERT;
        }
        else 
        if (hashCode.equals("14"))
        {
           return EXTRACT_MEDIA;
        }
        else 
        if (hashCode.equals("15"))
        {
           return MAIL;
        }
        else 
        if (hashCode.equals("16"))
        {
           return NOTIFICATION;
        }
        else 
        if (hashCode.equals("17"))
        {
           return CLEANUP;
        }
        else 
        if (hashCode.equals("18"))
        {
           return SCHEDULER_HELPER;
        }
        else 
        if (hashCode.equals("19"))
        {
           return BULKDOWNLOAD;
        }
        else 
        if (hashCode.equals("20"))
        {
           return DB_CLEANUP;
        }
        else 
        if (hashCode.equals("21"))
        {
           return PROVISION_PROVIDE;
        }
        else 
        if (hashCode.equals("22"))
        {
           return CONVERT_COLLECTION;
        }
        else 
        if (hashCode.equals("23"))
        {
           return STORAGE_EXPORT;
        }
        else 
        if (hashCode.equals("24"))
        {
           return PROVISION_DELETE;
        }
        else 
        if (hashCode.equals("25"))
        {
           return STORAGE_DELETE;
        }
        else 
        if (hashCode.equals("26"))
        {
           return EMAIL_INGESTION;
        }
        else 
        if (hashCode.equals("27"))
        {
           return METADATA_IMPORT;
        }
        else 
        if (hashCode.equals("28"))
        {
           return METADATA_TRANSFORM;
        }
        else 
        if (hashCode.equals("29"))
        {
           return FILESYNC_IMPORT;
        }
        else 
        if (hashCode.equals("30"))
        {
           return CAPTURE_THUMB;
        }
        else 
        if (hashCode.equals("31"))
        {
           return DELETE_FILE;
        }
        else 
        if (hashCode.equals("32"))
        {
           return INDEX;
        }
        else 
        if (hashCode.equals("33"))
        {
           return MOVE_CATEGORY_ENTRIES;
        }
        else 
        if (hashCode.equals("34"))
        {
           return COPY;
        }
        else 
        if (hashCode.equals("virusScan.VirusScan"))
        {
           return VIRUS_SCAN;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionSubmit"))
        {
           return DISTRIBUTION_SUBMIT;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionUpdate"))
        {
           return DISTRIBUTION_UPDATE;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionDelete"))
        {
           return DISTRIBUTION_DELETE;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionFetchReport"))
        {
           return DISTRIBUTION_FETCH_REPORT;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionEnable"))
        {
           return DISTRIBUTION_ENABLE;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionDisable"))
        {
           return DISTRIBUTION_DISABLE;
        }
        else 
        if (hashCode.equals("contentDistribution.DistributionSync"))
        {
           return DISTRIBUTION_SYNC;
        }
        else 
        if (hashCode.equals("dropFolder.DropFolderWatcher"))
        {
           return DROP_FOLDER_WATCHER;
        }
        else 
        if (hashCode.equals("dropFolder.DropFolderHandler"))
        {
           return DROP_FOLDER_HANDLER;
        }
        else 
        if (hashCode.equals("captionSearch.parseCaptionAsset"))
        {
           return PARSE_CAPTION_ASSET;
        }
        else 
        if (hashCode.equals("eventNotification.EventNotificationHandler"))
        {
           return EVENT_NOTIFICATION_HANDLER;
        }
        else 
        {
           return CONVERT;
        }
    }
}