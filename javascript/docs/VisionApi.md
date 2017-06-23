# Vision.VisionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVisionJob**](VisionApi.md#createVisionJob) | **POST** /vision/0.1/ | Create a new vision job
[**deleteVisionJob**](VisionApi.md#deleteVisionJob) | **DELETE** /vision/0.1/{jobid} | Delete a vision job manually
[**getClassificationResult**](VisionApi.md#getClassificationResult) | **GET** /vision/0.1/{jobid}/result | Get classification result of a vision job
[**getVisionJob**](VisionApi.md#getVisionJob) | **GET** /vision/0.1/{jobid} | Get a vision job
[**submitVisionJob**](VisionApi.md#submitVisionJob) | **PUT** /vision/0.1/{jobid} | Start classification of a vision job
[**uploadFile**](VisionApi.md#uploadFile) | **POST** /vision/0.1/{jobid} | Upload an image for a vision job


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

Get classification result of a vision job

Get classification result of a vision job that completed the classification

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

<a name="submitVisionJob"></a>
# **submitVisionJob**
> VisionJob submitVisionJob(jobid, settings)

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

var settings = new Vision.VisionSettings(); // VisionSettings | settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitVisionJob(jobid, settings, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **String**| jobid | 
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

