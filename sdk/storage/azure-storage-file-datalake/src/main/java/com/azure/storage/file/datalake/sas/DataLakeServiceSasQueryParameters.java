// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.sas;

import com.azure.storage.common.Utility;
import com.azure.storage.common.implementation.Constants;
import com.azure.storage.common.sas.BaseSasQueryParameters;
import com.azure.storage.common.sas.SasIpRange;
import com.azure.storage.common.sas.SasProtocol;
import com.azure.storage.file.datalake.DataLakePathClientBuilder;
import com.azure.storage.file.datalake.models.UserDelegationKey;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link DataLakeServiceSasSignatureValues} type. Once generated, it can be
 * encoded to a {@code String} and set on a {@link DataLakePathClientBuilder} object to be constructed as part of a URL
 * or appended to a URL directly (though caution should be taken here in case there are existing query parameters,
 * which might affect the appropriate means of appending these query parameters). NOTE: Instances of this class are
 * immutable to ensure thread safety.
 */
public final class DataLakeServiceSasQueryParameters extends BaseSasQueryParameters {

    private final String identifier;

    private final String keyObjectId;

    private final String keyTenantId;

    private final OffsetDateTime keyStart;

    private final OffsetDateTime keyExpiry;

    private final String keyService;

    private final String keyVersion;

    private final String resource;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    /**
     * Creates a new {@link DataLakeServiceSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSasParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    public DataLakeServiceSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSasParametersFromMap) {
        super(queryParamsMap, removeSasParametersFromMap);
        this.identifier = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER,
            removeSasParametersFromMap);
        this.keyObjectId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID,
            removeSasParametersFromMap);
        this.keyTenantId = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_TENANT_ID,
            removeSasParametersFromMap);
        this.keyStart = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            removeSasParametersFromMap, Utility::parseDate);
        this.keyExpiry = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            removeSasParametersFromMap, Utility::parseDate);
        this.keyService = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE,
            removeSasParametersFromMap);
        this.keyVersion = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION,
            removeSasParametersFromMap);
        this.resource = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_RESOURCE,
            removeSasParametersFromMap);
        this.cacheControl = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CACHE_CONTROL,
            removeSasParametersFromMap);
        this.contentDisposition = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_DISPOSITION,
            removeSasParametersFromMap);
        this.contentEncoding = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_ENCODING,
            removeSasParametersFromMap);
        this.contentLanguage = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_LANGUAGE,
            removeSasParametersFromMap);
        this.contentType = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_TYPE,
            removeSasParametersFromMap);
    }

    /**
     * Creates a new {@link DataLakeServiceSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param sasIpRange A {@link SasIpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param identifier A {@code String} representing the signed identifier (only for Service SAS) or {@code null}.
     * @param resource A {@code String} representing the storage file system or path (only for Service SAS).
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     */
    DataLakeServiceSasQueryParameters(String version, SasProtocol protocol, OffsetDateTime startTime,
        OffsetDateTime expiryTime, SasIpRange sasIpRange, String identifier, String resource, String permissions,
        String signature, String cacheControl, String contentDisposition, String contentEncoding,
        String contentLanguage, String contentType, UserDelegationKey key) {
        super(version, protocol, startTime, expiryTime, sasIpRange, permissions, signature);

        this.identifier = identifier;
        this.resource = resource;
        this.cacheControl = cacheControl;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;

        if (key != null) {
            this.keyObjectId = key.getSignedObjectId();
            this.keyTenantId = key.getSignedTenantId();
            this.keyStart = key.getSignedStart();
            this.keyExpiry = key.getSignedExpiry();
            this.keyService = key.getSignedService();
            this.keyVersion = key.getSignedVersion();
        } else {
            this.keyObjectId = null;
            this.keyTenantId = null;
            this.keyStart = null;
            this.keyExpiry = null;
            this.keyService = null;
            this.keyVersion = null;
        }
    }

    /**
     * @return The signed identifier (only for {@link DataLakeServiceSasSignatureValues}) or {@code null}. Please see
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return The storage file system or path (only for {@link DataLakeServiceSasSignatureValues}).
     */
    public String getResource() {
        return resource;
    }

    /**
     * @return The Cache-Control header value when a client accesses the resource with this sas token.
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * @return The Content-Disposition header value when a client accesses the resource with this sas token.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * @return The Content-Encoding header value when a client accesses the resource with this sas token.
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * @return The Content-Language header value when a client accesses the resource with this sas token.
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * @return The Content-Type header value when a client accesses the resource with this sas token.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @return the object ID of the key.
     */
    public String getKeyObjectId() {
        return keyObjectId;
    }

    /**
     * @return the tenant ID of the key.
     */
    public String getKeyTenantId() {
        return keyTenantId;
    }

    /**
     * @return the datetime when the key becomes active.
     */
    public OffsetDateTime getKeyStart() {
        return keyStart;
    }

    /**
     * @return the datetime when the key expires.
     */
    public OffsetDateTime getKeyExpiry() {
        return keyExpiry;
    }

    /**
     * @return the services that are permitted by the key.
     */
    public String getKeyService() {
        return keyService;
    }

    /**
     * @return the service version that created the key.
     */
    public String getKeyVersion() {
        return keyVersion;
    }

    UserDelegationKey userDelegationKey() {
        return new UserDelegationKey()
            .setSignedExpiry(this.keyExpiry)
            .setSignedObjectId(this.keyObjectId)
            .setSignedService(this.keyService)
            .setSignedStart(this.keyStart)
            .setSignedTenantId(this.keyTenantId)
            .setSignedVersion(this.keyVersion);
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     */
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME, formatQueryParameterDate(this.startTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME, formatQueryParameterDate(this.expiryTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.sasIpRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID, this.keyObjectId);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_TENANT_ID, this.keyTenantId);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            formatQueryParameterDate(this.keyStart));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            formatQueryParameterDate(this.keyExpiry));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE, this.keyService);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION, this.keyVersion);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_RESOURCE, this.resource);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CACHE_CONTROL, this.cacheControl);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_DISPOSITION, this.contentDisposition);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_ENCODING, this.contentEncoding);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_LANGUAGE, this.contentLanguage);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_TYPE, this.contentType);

        return sb.toString();
    }
}
