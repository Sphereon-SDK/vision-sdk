package com.sphereon.sdk.vision.api;

import com.sphereon.sdk.vision.handler.ApiException;
import com.sphereon.sdk.vision.handler.ApiClient;
import com.sphereon.sdk.vision.handler.Configuration;
import com.sphereon.sdk.vision.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.vision.model.VisionJob;
import com.sphereon.sdk.vision.model.VisionSettings;
import com.sphereon.sdk.vision.model.ErrorResponse;
import com.sphereon.sdk.vision.model.ClassificationResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-23T03:02:07.831+02:00")
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
   * Create a new vision job
   * Create a new job for the vision operation
   * @param visionSettings visionSettings (required)
   * @return VisionJob
   * @throws ApiException if fails to make API call
   */
  public VisionJob createVisionJob(VisionSettings visionSettings) throws ApiException {
    Object localVarPostBody = visionSettings;
    
    // verify the required parameter 'visionSettings' is set
    if (visionSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'visionSettings' when calling createVisionJob");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/".replaceAll("\\{format\\}","json");

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

    GenericType<VisionJob> localVarReturnType = new GenericType<VisionJob>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a vision job manually
   * Delete a vision job manually
   * @param jobid jobid (required)
   * @return VisionJob
   * @throws ApiException if fails to make API call
   */
  public VisionJob deleteVisionJob(String jobid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling deleteVisionJob");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/{jobid}".replaceAll("\\{format\\}","json")
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

    GenericType<VisionJob> localVarReturnType = new GenericType<VisionJob>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get classification result of a vision job
   * Get classification result of a vision job that completed the classification
   * @param jobid jobid (required)
   * @return ClassificationResponse
   * @throws ApiException if fails to make API call
   */
  public ClassificationResponse getClassificationResult(String jobid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling getClassificationResult");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/{jobid}/result".replaceAll("\\{format\\}","json")
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

    GenericType<ClassificationResponse> localVarReturnType = new GenericType<ClassificationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a vision job
   * Get a Vision job
   * @param jobid jobid (required)
   * @return VisionJob
   * @throws ApiException if fails to make API call
   */
  public VisionJob getVisionJob(String jobid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling getVisionJob");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/{jobid}".replaceAll("\\{format\\}","json")
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

    GenericType<VisionJob> localVarReturnType = new GenericType<VisionJob>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Start classification of a vision job
   * Start classification of a vision job
   * @param jobid jobid (required)
   * @param settings settings (required)
   * @return VisionJob
   * @throws ApiException if fails to make API call
   */
  public VisionJob submitVisionJob(String jobid, VisionSettings settings) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling submitVisionJob");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling submitVisionJob");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/{jobid}".replaceAll("\\{format\\}","json")
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

    GenericType<VisionJob> localVarReturnType = new GenericType<VisionJob>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload an image for a vision job
   * Upload an image for a vision job. Processing will not be started yet.
   * @param jobid jobid (required)
   * @param stream The binary image to upload for a vision job (required)
   * @return VisionJob
   * @throws ApiException if fails to make API call
   */
  public VisionJob uploadFile(String jobid, File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobid' is set
    if (jobid == null) {
      throw new ApiException(400, "Missing the required parameter 'jobid' when calling uploadFile");
    }
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/vision/0.1/{jobid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobid" + "\\}", apiClient.escapeString(jobid.toString()));

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

    GenericType<VisionJob> localVarReturnType = new GenericType<VisionJob>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
