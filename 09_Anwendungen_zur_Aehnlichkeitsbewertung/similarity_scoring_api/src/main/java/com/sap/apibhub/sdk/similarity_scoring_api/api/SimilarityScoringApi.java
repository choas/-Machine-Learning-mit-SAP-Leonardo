/*
 * Inference Service for Similarity Scoring
 * Similarity Scoring API compares vectors using a similarity score (cosine distance) ranging from -1 to 1. The similarity score is calculated based on the cosine similarity of the vectors. The vectors retrieved from the “image feature extraction” and “document feature extraction” services can be used as inputs for this service.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.similarity_scoring_api.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import com.sap.apibhub.sdk.similarity_scoring_api.model.ResponseError;
import com.sap.apibhub.sdk.similarity_scoring_api.model.ResponseOk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarityScoringApi {
    private ApiClient apiClient;

    public SimilarityScoringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SimilarityScoringApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for similarityScoringPost */
    private com.squareup.okhttp.Call similarityScoringPostCall(String options, File files, String texts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/similarity-scoring".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (files != null)
        localVarFormParams.put("files", files);
        if (texts != null)
        localVarFormParams.put("texts", texts);
        if (options != null)
        localVarFormParams.put("options", options);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "Oauth2_ClientCredentials" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call similarityScoringPostValidateBeforeCall(String options, File files, String texts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'options' is set
        if (options == null) {
            throw new ApiException("Missing the required parameter 'options' when calling similarityScoringPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = similarityScoringPostCall(options, files, texts, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Compare vectors synchronously.
     * Compare vectors with respect to cosine similarity synchronously. Result is a value [-1,1].
     * @param options Options parameters must be in json format. Possible values are:    - numSimilarVectors - Required. Number of most similar vectors to return in response &lt;ul&gt;   Example: {\&quot;numSimilarVectors\&quot;:2} (required)
     * @param files The set of vectors which should be compared. Must be either one archive file, or two archive files which include vector files (text file containing a vector). In case of a single archive file, each vector file will be compared to each other. In case of two files, vector files in first archive file will be reference vectors and will be compared to each vector in the second archive file. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt; Accepted file extensions:**  &lt;li&gt;Archive file: zip tar gz tgz   &lt;li&gt;Vector files in archive file: &lt;None&gt; txt  &lt;li&gt;What a vector file should include: [number, number, number, ..., number]  &lt;li&gt;Example: [0.20161056518554688, 1.0347602367401123, ..., 1.5012381076812744]** (optional)
     * @param texts This is a json format string which represents the set(s) of vectors which should be compared. Must include either one or two sets of vectors.  Each vector is represented as an object which includes two key-value pairs; id, and vector.  The id is a string, and vector is an array of numbers.  A set of vectors is simply represented as an array of vector objects.  The input json object should include one or two key-value pairs. If one set will be provided, the object should include one key-value pair, where name is &#39;0&#39;, and value is a set of vectors. In this case each vector in the set will be compared to the other vectors in this set.  If two sets are provided, the object should include two key-value pairs, where the names are &#39;0&#39; and &#39;1&#39; and with both values being sets of vectors. In this case, for each vector from set &#39;0&#39; top numSimilarVectors similar vectors from set &#39;1&#39; will be found. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt;   ** Example: {\&quot;0\&quot;: [{\&quot;id\&quot;: \&quot;v0\&quot;, \&quot;vector\&quot;: [0.22, ..., 0.93]}, {\&quot;id\&quot;: \&quot;v1\&quot;, \&quot;vector\&quot;: [0.39, ..., 0.69]}]}** (optional)
     * @return ResponseOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseOk similarityScoringPost(String options, File files, String texts) throws ApiException {
        ApiResponse<ResponseOk> resp = similarityScoringPostWithHttpInfo(options, files, texts);
        return resp.getData();
    }

    /**
     * Compare vectors synchronously.
     * Compare vectors with respect to cosine similarity synchronously. Result is a value [-1,1].
     * @param options Options parameters must be in json format. Possible values are:    - numSimilarVectors - Required. Number of most similar vectors to return in response &lt;ul&gt;   Example: {\&quot;numSimilarVectors\&quot;:2} (required)
     * @param files The set of vectors which should be compared. Must be either one archive file, or two archive files which include vector files (text file containing a vector). In case of a single archive file, each vector file will be compared to each other. In case of two files, vector files in first archive file will be reference vectors and will be compared to each vector in the second archive file. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt; Accepted file extensions:**  &lt;li&gt;Archive file: zip tar gz tgz   &lt;li&gt;Vector files in archive file: &lt;None&gt; txt  &lt;li&gt;What a vector file should include: [number, number, number, ..., number]  &lt;li&gt;Example: [0.20161056518554688, 1.0347602367401123, ..., 1.5012381076812744]** (optional)
     * @param texts This is a json format string which represents the set(s) of vectors which should be compared. Must include either one or two sets of vectors.  Each vector is represented as an object which includes two key-value pairs; id, and vector.  The id is a string, and vector is an array of numbers.  A set of vectors is simply represented as an array of vector objects.  The input json object should include one or two key-value pairs. If one set will be provided, the object should include one key-value pair, where name is &#39;0&#39;, and value is a set of vectors. In this case each vector in the set will be compared to the other vectors in this set.  If two sets are provided, the object should include two key-value pairs, where the names are &#39;0&#39; and &#39;1&#39; and with both values being sets of vectors. In this case, for each vector from set &#39;0&#39; top numSimilarVectors similar vectors from set &#39;1&#39; will be found. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt;   ** Example: {\&quot;0\&quot;: [{\&quot;id\&quot;: \&quot;v0\&quot;, \&quot;vector\&quot;: [0.22, ..., 0.93]}, {\&quot;id\&quot;: \&quot;v1\&quot;, \&quot;vector\&quot;: [0.39, ..., 0.69]}]}** (optional)
     * @return ApiResponse&lt;ResponseOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseOk> similarityScoringPostWithHttpInfo(String options, File files, String texts) throws ApiException {
        com.squareup.okhttp.Call call = similarityScoringPostValidateBeforeCall(options, files, texts, null, null);
        Type localVarReturnType = new TypeToken<ResponseOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Compare vectors synchronously. (asynchronously)
     * Compare vectors with respect to cosine similarity synchronously. Result is a value [-1,1].
     * @param options Options parameters must be in json format. Possible values are:    - numSimilarVectors - Required. Number of most similar vectors to return in response &lt;ul&gt;   Example: {\&quot;numSimilarVectors\&quot;:2} (required)
     * @param files The set of vectors which should be compared. Must be either one archive file, or two archive files which include vector files (text file containing a vector). In case of a single archive file, each vector file will be compared to each other. In case of two files, vector files in first archive file will be reference vectors and will be compared to each vector in the second archive file. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt; Accepted file extensions:**  &lt;li&gt;Archive file: zip tar gz tgz   &lt;li&gt;Vector files in archive file: &lt;None&gt; txt  &lt;li&gt;What a vector file should include: [number, number, number, ..., number]  &lt;li&gt;Example: [0.20161056518554688, 1.0347602367401123, ..., 1.5012381076812744]** (optional)
     * @param texts This is a json format string which represents the set(s) of vectors which should be compared. Must include either one or two sets of vectors.  Each vector is represented as an object which includes two key-value pairs; id, and vector.  The id is a string, and vector is an array of numbers.  A set of vectors is simply represented as an array of vector objects.  The input json object should include one or two key-value pairs. If one set will be provided, the object should include one key-value pair, where name is &#39;0&#39;, and value is a set of vectors. In this case each vector in the set will be compared to the other vectors in this set.  If two sets are provided, the object should include two key-value pairs, where the names are &#39;0&#39; and &#39;1&#39; and with both values being sets of vectors. In this case, for each vector from set &#39;0&#39; top numSimilarVectors similar vectors from set &#39;1&#39; will be found. Either files input, or texts input should be provided. Exactly one of them, not both. &lt;ul&gt;   ** Example: {\&quot;0\&quot;: [{\&quot;id\&quot;: \&quot;v0\&quot;, \&quot;vector\&quot;: [0.22, ..., 0.93]}, {\&quot;id\&quot;: \&quot;v1\&quot;, \&quot;vector\&quot;: [0.39, ..., 0.69]}]}** (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call similarityScoringPostAsync(String options, File files, String texts, final ApiCallback<ResponseOk> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = similarityScoringPostValidateBeforeCall(options, files, texts, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
