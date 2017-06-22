# VisionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classifyJob**](VisionApi.md#classifyJob) | **PUT** /barcode/0.1/{jobid} | Start classification of a vision job
[**createVisionJob**](VisionApi.md#createVisionJob) | **POST** /barcode/0.1/ | Create a new vision job
[**deleteVisionJob**](VisionApi.md#deleteVisionJob) | **DELETE** /barcode/0.1/{jobid} | Delete a vision job manually
[**getClassificationResult**](VisionApi.md#getClassificationResult) | **GET** /barcode/0.1/{jobid}/result | Get classification response of a vision job
[**getVisionJob**](VisionApi.md#getVisionJob) | **GET** /barcode/0.1/{jobid} | Get a vision job
[**uploadFile**](VisionApi.md#uploadFile) | **POST** /barcode/0.1/{jobid} | Upload an image for a vision job


<a name="classifyJob"></a>
# **classifyJob**
> VisionJob classifyJob(jobid)

Start classification of a vision job

Start classification of a vision job

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
String jobid = "jobid_example"; // String | jobid
try {
    VisionJob result = apiInstance.classifyJob(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#classifyJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createVisionJob"></a>
# **createVisionJob**
> VisionJob createVisionJob(visionSettings)

Create a new vision job

Create a new job for the vision operation

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
> VisionJob deleteVisionJob(jobid)

Delete a vision job manually

Delete a vision job manually

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
String jobid = "jobid_example"; // String | jobid
try {
    VisionJob result = apiInstance.deleteVisionJob(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#deleteVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getClassificationResult"></a>
# **getClassificationResult**
> ClassificationResponse getClassificationResult(jobid)

Get classification response of a vision job

Get classification response of a vision job that completed the classification

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
String jobid = "jobid_example"; // String | jobid
try {
    ClassificationResponse result = apiInstance.getClassificationResult(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#getClassificationResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getVisionJob"></a>
# **getVisionJob**
> VisionJob getVisionJob(jobid)

Get a vision job

Get a Vision job

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
String jobid = "jobid_example"; // String | jobid
try {
    VisionJob result = apiInstance.getVisionJob(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#getVisionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="uploadFile"></a>
# **uploadFile**
> VisionJob uploadFile(jobid, stream)

Upload an image for a vision job

Upload an image for a vision job. Processing will not be started yet.

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
String jobid = "jobid_example"; // String | jobid
File stream = new File("/path/to/file.txt"); // File | The binary image to upload for a vision job
try {
    VisionJob result = apiInstance.uploadFile(jobid, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |
 **stream** | **File**| The binary image to upload for a vision job |

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

