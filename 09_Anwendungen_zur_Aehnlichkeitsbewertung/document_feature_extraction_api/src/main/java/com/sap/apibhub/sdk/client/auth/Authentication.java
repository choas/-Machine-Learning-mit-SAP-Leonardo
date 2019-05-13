/*
 * Inference Service for Document Feature Extraction
 * Document Feature Extraction API is capable of extracting feature vectors for any given document which can be used for comparison, informational retrieval, clustering or further processing
 *
 * OpenAPI spec version: Alpha
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.client.auth;

import com.sap.apibhub.sdk.client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
