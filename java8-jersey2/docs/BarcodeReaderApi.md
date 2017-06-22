# BarcodeReaderApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteJob**](BarcodeReaderApi.md#deleteJob) | **DELETE** /barcode/0.1.0/reader/{jobid} | Delete a job manually
[**getJob**](BarcodeReaderApi.md#getJob) | **GET** /barcode/0.1.0/reader/{jobid} | Job definition and state
[**submitJob**](BarcodeReaderApi.md#submitJob) | **PUT** /barcode/0.1.0/reader/{jobid} | Submit job for reading
[**uploadFile**](BarcodeReaderApi.md#uploadFile) | **POST** /barcode/0.1.0/reader | Upload the file


<a name="deleteJob"></a>
# **deleteJob**
> ReaderJobResponse deleteJob(jobid)

Delete a job manually

Delete the Job and all related files

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.BarcodeReaderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BarcodeReaderApi apiInstance = new BarcodeReaderApi();
String jobid = "jobid_example"; // String | jobid
try {
    ReaderJobResponse result = apiInstance.deleteJob(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeReaderApi#deleteJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getJob"></a>
# **getJob**
> ReaderResultJobResponse getJob(jobid)

Job definition and state

Get the ReadResult response , job definition and current state. Please note that you can differentiate completion based on http response status

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.BarcodeReaderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BarcodeReaderApi apiInstance = new BarcodeReaderApi();
String jobid = "jobid_example"; // String | jobid
try {
    ReaderResultJobResponse result = apiInstance.getJob(jobid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeReaderApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |

### Return type

[**ReaderResultJobResponse**](ReaderResultJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="submitJob"></a>
# **submitJob**
> ReaderJobResponse submitJob(jobid, job)

Submit job for reading

Starts the barcode detection of the uploaded files, using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the jobId in the path must match the jobId in the request

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.BarcodeReaderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BarcodeReaderApi apiInstance = new BarcodeReaderApi();
String jobid = "jobid_example"; // String | jobid
ReaderJob job = new ReaderJob(); // ReaderJob | jobEntity
try {
    ReaderJobResponse result = apiInstance.submitJob(jobid, job);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeReaderApi#submitJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid |
 **job** | [**ReaderJob**](ReaderJob.md)| jobEntity |

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="uploadFile"></a>
# **uploadFile**
> ReaderJobResponse uploadFile(stream)

Upload the file

Upload the  image.

### Example
```java
// Import classes:
//import com.sphereon.sdk.vision.handler.ApiClient;
//import com.sphereon.sdk.vision.handler.ApiException;
//import com.sphereon.sdk.vision.handler.Configuration;
//import com.sphereon.sdk.vision.handler.auth.*;
//import com.sphereon.sdk.vision.api.BarcodeReaderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

BarcodeReaderApi apiInstance = new BarcodeReaderApi();
File stream = new File("/path/to/file.txt"); // File | The first image.
try {
    ReaderJobResponse result = apiInstance.uploadFile(stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeReaderApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **File**| The first image. |

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

