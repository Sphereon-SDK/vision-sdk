# VisionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/vision/0.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVisionJob**](VisionApi.md#createVisionJob) | **POST** /jobs | Create a new vision job
[**deleteVisionJob**](VisionApi.md#deleteVisionJob) | **DELETE** /jobs/{jobId} | Delete a vision job manually
[**getVisionJob**](VisionApi.md#getVisionJob) | **GET** /jobs/{jobId} | Get a vision job
[**submitVisionJob**](VisionApi.md#submitVisionJob) | **PUT** /jobs/{jobId} | Start classification of a vision job
[**uploadFile**](VisionApi.md#uploadFile) | **POST** /jobs/{jobId}/streams/multipart | Upload an image for a vision job


<a name="createVisionJob"></a>
# **createVisionJob**
> VisionJob createVisionJob(visionSettings)

Create a new vision job

Create a new job for the vision operation.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VisionApi apiInstance = new VisionApi();
VisionSettings visionSettings = new VisionSettings(); // VisionSettings | visionSettings
try {
    VisionJob result = apiInstance.createVisionJob(visionSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#createVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **visionSettings** | [**VisionSettings**](VisionSettings.md)| visionSettings |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="deleteVisionJob"></a>
# **deleteVisionJob**
> VisionJob deleteVisionJob(jobId)

Delete a vision job manually

Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VisionApi apiInstance = new VisionApi();
String jobId = "jobId_example"; // String | jobId
try {
    VisionJob result = apiInstance.deleteVisionJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#deleteVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getVisionJob"></a>
# **getVisionJob**
> VisionJob getVisionJob(jobId)

Get a vision job

Get a Vision job. After processing the vision job contains the results.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VisionApi apiInstance = new VisionApi();
String jobId = "jobId_example"; // String | jobId
try {
    VisionJob result = apiInstance.getVisionJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#getVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="submitVisionJob"></a>
# **submitVisionJob**
> VisionJob submitVisionJob(jobId, settings)

Start classification of a vision job

Submit a vision job to start classification.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VisionApi apiInstance = new VisionApi();
String jobId = "jobId_example"; // String | jobId
VisionSettings settings = new VisionSettings(); // VisionSettings | settings
try {
    VisionJob result = apiInstance.submitVisionJob(jobId, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#submitVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |
 **settings** | [**VisionSettings**](VisionSettings.md)| settings |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="uploadFile"></a>
# **uploadFile**
> InputResource uploadFile(jobId, stream)

Upload an image for a vision job

Upload an image for a vision job. Processing will start after submitting the job.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VisionApi apiInstance = new VisionApi();
String jobId = "jobId_example"; // String | jobId
File stream = new File("/path/to/file.txt"); // File | The binary image to upload for a vision job
try {
    InputResource result = apiInstance.uploadFile(jobId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| jobId |
 **stream** | **File**| The binary image to upload for a vision job |

### Return type

[**InputResource**](InputResource.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

