# Vision.VisionApi

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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.classifyJob(jobid, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var visionSettings = new Vision.VisionSettings(); // VisionSettings | visionSettings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createVisionJob(visionSettings, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteVisionJob(jobid, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClassificationResult(jobid, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getVisionJob(jobid, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobid = "jobid_example"; // String | jobid

var stream = "/path/to/file.txt"; // File | The binary image to upload for a vision job


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.uploadFile(jobid, stream, callback);
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

