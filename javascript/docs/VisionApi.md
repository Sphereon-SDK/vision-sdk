# Vision.VisionApi

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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.instance;

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
> VisionJob deleteVisionJob(jobId)

Delete a vision job manually

Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.

### Example
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobId = "jobId_example"; // String | jobId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteVisionJob(jobId, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobId = "jobId_example"; // String | jobId


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getVisionJob(jobId, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobId = "jobId_example"; // String | jobId

var settings = new Vision.VisionSettings(); // VisionSettings | settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitVisionJob(jobId, settings, callback);
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
```javascript
var Vision = require('vision');
var defaultClient = Vision.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Vision.VisionApi();

var jobId = "jobId_example"; // String | jobId

var stream = "/path/to/file.txt"; // File | The binary image to upload for a vision job


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.uploadFile(jobId, stream, callback);
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

