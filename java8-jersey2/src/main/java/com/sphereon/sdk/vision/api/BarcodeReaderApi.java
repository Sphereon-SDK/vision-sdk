package com.sphereon.sdk.vision.api;

import com.sphereon.sdk.vision.handler.ApiException;
import com.sphereon.sdk.vision.handler.ApiClient;
import com.sphereon.sdk.vision.handler.Configuration;
import com.sphereon.sdk.vision.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.vision.model.ReaderJobResponse;
import com.sphereon.sdk.vision.model.ErrorResponse;
import com.sphereon.sdk.vision.model.ReaderResultJobResponse;
import com.sphereon.sdk.vision.model.ReaderJob;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-23T00:30:44.672+02:00")
public class BarcodeReaderApi {
  private ApiClient apiClient;

  public BarcodeReaderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BarcodeReaderApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a job manually
   * Delete the Job and all related files
   * @param jobid jobid (required)
   * @return ReaderJobResponse
   * @throws ApiException if fails to make API call
   */
  public ReaderJobResponse deleteJob(String jobid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling deleteJob");
    }
    
    // create path and map variables
    String localVarPath = "/barcode/0.1.0/reader/{jobid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobid" + "\\}", apiClient.escapeString(jobid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ReaderJobResponse> localVarReturnType = new GenericType<ReaderJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Job definition and state
   * Get the ReadResult response , job definition and current state. Please note that you can differentiate completion based on http response status
   * @param jobid jobid (required)
   * @return ReaderResultJobResponse
   * @throws ApiException if fails to make API call
   */
  public ReaderResultJobResponse getJob(String jobid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling getJob");
    }
    
    // create path and map variables
    String localVarPath = "/barcode/0.1.0/reader/{jobid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobid" + "\\}", apiClient.escapeString(jobid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ReaderResultJobResponse> localVarReturnType = new GenericType<ReaderResultJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Submit job for reading
   * Starts the barcode detection of the uploaded files, using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the jobId in the path must match the jobId in the request
   * @param jobid jobid (required)
   * @param job jobEntity (required)
   * @return ReaderJobResponse
   * @throws ApiException if fails to make API call
   */
  public ReaderJobResponse submitJob(String jobid, ReaderJob job) throws ApiException {
    Object localVarPostBody = job;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling submitJob");
    }
    
    // verify the required parameter 'job' is set
    if (job == null) {
      throw new ApiException(400, "Missing the required parameter 'job' when calling submitJob");
    }
    
    // create path and map variables
    String localVarPath = "/barcode/0.1.0/reader/{jobid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobid" + "\\}", apiClient.escapeString(jobid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ReaderJobResponse> localVarReturnType = new GenericType<ReaderJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload the file
   * Upload the  image.
   * @param stream The first image. (required)
   * @return ReaderJobResponse
   * @throws ApiException if fails to make API call
   */
  public ReaderJobResponse uploadFile(File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/barcode/0.1.0/reader".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (stream != null)
      localVarFormParams.put("stream", stream);

    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ReaderJobResponse> localVarReturnType = new GenericType<ReaderJobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
