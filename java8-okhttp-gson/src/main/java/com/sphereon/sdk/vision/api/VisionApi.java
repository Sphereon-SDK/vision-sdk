/*
 * Vision
 * Sphereon Vision APIs
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.vision.api;

import com.sphereon.sdk.vision.handler.ApiCallback;
import com.sphereon.sdk.vision.handler.ApiClient;
import com.sphereon.sdk.vision.handler.ApiException;
import com.sphereon.sdk.vision.handler.ApiResponse;
import com.sphereon.sdk.vision.handler.Configuration;
import com.sphereon.sdk.vision.handler.Pair;
import com.sphereon.sdk.vision.handler.ProgressRequestBody;
import com.sphereon.sdk.vision.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sphereon.sdk.vision.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.vision.model.InputResource;
import com.sphereon.sdk.vision.model.VisionJob;
import com.sphereon.sdk.vision.model.VisionSettings;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisionApi {
    private ApiClient apiClient;

    public VisionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VisionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createVisionJob
     * @param visionSettings visionSettings (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createVisionJobCall(VisionSettings visionSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = visionSettings;

        // create path and map variables
        String localVarPath = "/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
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

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createVisionJobValidateBeforeCall(VisionSettings visionSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'visionSettings' is set
        if (visionSettings == null) {
            throw new ApiException("Missing the required parameter 'visionSettings' when calling createVisionJob(Async)");
        }
        

        com.squareup.okhttp.Call call = createVisionJobCall(visionSettings, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new vision job
     * Create a new job for the vision operation.
     * @param visionSettings visionSettings (required)
     * @return VisionJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VisionJob createVisionJob(VisionSettings visionSettings) throws ApiException {
        ApiResponse<VisionJob> resp = createVisionJobWithHttpInfo(visionSettings);
        return resp.getData();
    }

    /**
     * Create a new vision job
     * Create a new job for the vision operation.
     * @param visionSettings visionSettings (required)
     * @return ApiResponse&lt;VisionJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VisionJob> createVisionJobWithHttpInfo(VisionSettings visionSettings) throws ApiException {
        com.squareup.okhttp.Call call = createVisionJobValidateBeforeCall(visionSettings, null, null);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new vision job (asynchronously)
     * Create a new job for the vision operation.
     * @param visionSettings visionSettings (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createVisionJobAsync(VisionSettings visionSettings, final ApiCallback<VisionJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createVisionJobValidateBeforeCall(visionSettings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteVisionJob
     * @param jobId jobId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteVisionJobCall(String jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{jobId}"
            .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteVisionJobValidateBeforeCall(String jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling deleteVisionJob(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteVisionJobCall(jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a vision job manually
     * Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.
     * @param jobId jobId (required)
     * @return VisionJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VisionJob deleteVisionJob(String jobId) throws ApiException {
        ApiResponse<VisionJob> resp = deleteVisionJobWithHttpInfo(jobId);
        return resp.getData();
    }

    /**
     * Delete a vision job manually
     * Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.
     * @param jobId jobId (required)
     * @return ApiResponse&lt;VisionJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VisionJob> deleteVisionJobWithHttpInfo(String jobId) throws ApiException {
        com.squareup.okhttp.Call call = deleteVisionJobValidateBeforeCall(jobId, null, null);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a vision job manually (asynchronously)
     * Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.
     * @param jobId jobId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVisionJobAsync(String jobId, final ApiCallback<VisionJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVisionJobValidateBeforeCall(jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVisionJob
     * @param jobId jobId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVisionJobCall(String jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{jobId}"
            .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getVisionJobValidateBeforeCall(String jobId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getVisionJob(Async)");
        }
        

        com.squareup.okhttp.Call call = getVisionJobCall(jobId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a vision job
     * Get a Vision job. After processing the vision job contains the results.
     * @param jobId jobId (required)
     * @return VisionJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VisionJob getVisionJob(String jobId) throws ApiException {
        ApiResponse<VisionJob> resp = getVisionJobWithHttpInfo(jobId);
        return resp.getData();
    }

    /**
     * Get a vision job
     * Get a Vision job. After processing the vision job contains the results.
     * @param jobId jobId (required)
     * @return ApiResponse&lt;VisionJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VisionJob> getVisionJobWithHttpInfo(String jobId) throws ApiException {
        com.squareup.okhttp.Call call = getVisionJobValidateBeforeCall(jobId, null, null);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a vision job (asynchronously)
     * Get a Vision job. After processing the vision job contains the results.
     * @param jobId jobId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVisionJobAsync(String jobId, final ApiCallback<VisionJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVisionJobValidateBeforeCall(jobId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitVisionJob
     * @param jobId jobId (required)
     * @param settings settings (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitVisionJobCall(String jobId, VisionSettings settings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = settings;

        // create path and map variables
        String localVarPath = "/jobs/{jobId}"
            .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitVisionJobValidateBeforeCall(String jobId, VisionSettings settings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling submitVisionJob(Async)");
        }
        
        // verify the required parameter 'settings' is set
        if (settings == null) {
            throw new ApiException("Missing the required parameter 'settings' when calling submitVisionJob(Async)");
        }
        

        com.squareup.okhttp.Call call = submitVisionJobCall(jobId, settings, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Start classification of a vision job
     * Submit a vision job to start classification.
     * @param jobId jobId (required)
     * @param settings settings (required)
     * @return VisionJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VisionJob submitVisionJob(String jobId, VisionSettings settings) throws ApiException {
        ApiResponse<VisionJob> resp = submitVisionJobWithHttpInfo(jobId, settings);
        return resp.getData();
    }

    /**
     * Start classification of a vision job
     * Submit a vision job to start classification.
     * @param jobId jobId (required)
     * @param settings settings (required)
     * @return ApiResponse&lt;VisionJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VisionJob> submitVisionJobWithHttpInfo(String jobId, VisionSettings settings) throws ApiException {
        com.squareup.okhttp.Call call = submitVisionJobValidateBeforeCall(jobId, settings, null, null);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start classification of a vision job (asynchronously)
     * Submit a vision job to start classification.
     * @param jobId jobId (required)
     * @param settings settings (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitVisionJobAsync(String jobId, VisionSettings settings, final ApiCallback<VisionJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = submitVisionJobValidateBeforeCall(jobId, settings, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VisionJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     * @param jobId jobId (required)
     * @param stream The binary image to upload for a vision job (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadFileCall(String jobId, File stream, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{jobId}/streams/multipart"
            .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (stream != null)
        localVarFormParams.put("stream", stream);

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
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

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(String jobId, File stream, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling uploadFile(Async)");
        }
        
        // verify the required parameter 'stream' is set
        if (stream == null) {
            throw new ApiException("Missing the required parameter 'stream' when calling uploadFile(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadFileCall(jobId, stream, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload an image for a vision job
     * Upload an image for a vision job. Processing will start after submitting the job.
     * @param jobId jobId (required)
     * @param stream The binary image to upload for a vision job (required)
     * @return InputResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputResource uploadFile(String jobId, File stream) throws ApiException {
        ApiResponse<InputResource> resp = uploadFileWithHttpInfo(jobId, stream);
        return resp.getData();
    }

    /**
     * Upload an image for a vision job
     * Upload an image for a vision job. Processing will start after submitting the job.
     * @param jobId jobId (required)
     * @param stream The binary image to upload for a vision job (required)
     * @return ApiResponse&lt;InputResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InputResource> uploadFileWithHttpInfo(String jobId, File stream) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(jobId, stream, null, null);
        Type localVarReturnType = new TypeToken<InputResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload an image for a vision job (asynchronously)
     * Upload an image for a vision job. Processing will start after submitting the job.
     * @param jobId jobId (required)
     * @param stream The binary image to upload for a vision job (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(String jobId, File stream, final ApiCallback<InputResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(jobId, stream, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InputResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
