# Barcode.BarcodeReaderApi

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
```javascript
var Barcode = require('barcode');
var defaultClient = Barcode.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Barcode.BarcodeReaderApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteJob(jobid, callback);
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
```javascript
var Barcode = require('barcode');
var defaultClient = Barcode.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Barcode.BarcodeReaderApi();

var jobid = "jobid_example"; // String | jobid


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getJob(jobid, callback);
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
```javascript
var Barcode = require('barcode');
var defaultClient = Barcode.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Barcode.BarcodeReaderApi();

var jobid = "jobid_example"; // String | jobid

var job = new Barcode.ReaderJob(); // ReaderJob | jobEntity


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.submitJob(jobid, job, callback);
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
```javascript
var Barcode = require('barcode');
var defaultClient = Barcode.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new Barcode.BarcodeReaderApi();

var stream = "/path/to/file.txt"; // File | The first image.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.uploadFile(stream, callback);
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

