# Sphereon.SDK.Vision.Api.BarcodeReaderApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteJob**](BarcodeReaderApi.md#deletejob) | **DELETE** /barcode/0.1.0/reader/{jobid} | Delete a job manually
[**GetJob**](BarcodeReaderApi.md#getjob) | **GET** /barcode/0.1.0/reader/{jobid} | Job definition and state
[**SubmitJob**](BarcodeReaderApi.md#submitjob) | **PUT** /barcode/0.1.0/reader/{jobid} | Submit job for reading
[**UploadFile**](BarcodeReaderApi.md#uploadfile) | **POST** /barcode/0.1.0/reader | Upload the file


<a name="deletejob"></a>
# **DeleteJob**
> ReaderJobResponse DeleteJob (string jobid)

Delete a job manually

Delete the Job and all related files

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class DeleteJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BarcodeReaderApi();
            var jobid = jobid_example;  // string | jobid

            try
            {
                // Delete a job manually
                ReaderJobResponse result = apiInstance.DeleteJob(jobid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BarcodeReaderApi.DeleteJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **string**| jobid | 

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getjob"></a>
# **GetJob**
> ReaderResultJobResponse GetJob (string jobid)

Job definition and state

Get the ReadResult response , job definition and current state. Please note that you can differentiate completion based on http response status

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class GetJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BarcodeReaderApi();
            var jobid = jobid_example;  // string | jobid

            try
            {
                // Job definition and state
                ReaderResultJobResponse result = apiInstance.GetJob(jobid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BarcodeReaderApi.GetJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **string**| jobid | 

### Return type

[**ReaderResultJobResponse**](ReaderResultJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitjob"></a>
# **SubmitJob**
> ReaderJobResponse SubmitJob (string jobid, ReaderJob job)

Submit job for reading

Starts the barcode detection of the uploaded files, using the supplied settings associated with the job in the request body. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the jobId in the path must match the jobId in the request

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class SubmitJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BarcodeReaderApi();
            var jobid = jobid_example;  // string | jobid
            var job = new ReaderJob(); // ReaderJob | jobEntity

            try
            {
                // Submit job for reading
                ReaderJobResponse result = apiInstance.SubmitJob(jobid, job);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BarcodeReaderApi.SubmitJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **string**| jobid | 
 **job** | [**ReaderJob**](ReaderJob.md)| jobEntity | 

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadfile"></a>
# **UploadFile**
> ReaderJobResponse UploadFile (System.IO.Stream stream)

Upload the file

Upload the  image.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class UploadFileExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BarcodeReaderApi();
            var stream = new System.IO.Stream(); // System.IO.Stream | The first image.

            try
            {
                // Upload the file
                ReaderJobResponse result = apiInstance.UploadFile(stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BarcodeReaderApi.UploadFile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **System.IO.Stream**| The first image. | 

### Return type

[**ReaderJobResponse**](ReaderJobResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

