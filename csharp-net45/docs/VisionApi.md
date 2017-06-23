# Sphereon.SDK.Vision.Api.VisionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateVisionJob**](VisionApi.md#createvisionjob) | **POST** /vision/0.1/ | Create a new vision job
[**DeleteVisionJob**](VisionApi.md#deletevisionjob) | **DELETE** /vision/0.1/{jobid} | Delete a vision job manually
[**GetClassificationResult**](VisionApi.md#getclassificationresult) | **GET** /vision/0.1/{jobid}/result | Get classification result of a vision job
[**GetVisionJob**](VisionApi.md#getvisionjob) | **GET** /vision/0.1/{jobid} | Get a vision job
[**SubmitVisionJob**](VisionApi.md#submitvisionjob) | **PUT** /vision/0.1/{jobid} | Start classification of a vision job
[**UploadFile**](VisionApi.md#uploadfile) | **POST** /vision/0.1/{jobid} | Upload an image for a vision job


<a name="createvisionjob"></a>
# **CreateVisionJob**
> VisionJob CreateVisionJob (VisionSettings visionSettings)

Create a new vision job

Create a new job for the vision operation

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class CreateVisionJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VisionApi();
            var visionSettings = new VisionSettings(); // VisionSettings | visionSettings

            try
            {
                // Create a new vision job
                VisionJob result = apiInstance.CreateVisionJob(visionSettings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.CreateVisionJob: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletevisionjob"></a>
# **DeleteVisionJob**
> VisionJob DeleteVisionJob (string jobid)

Delete a vision job manually

Delete a vision job manually

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class DeleteVisionJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VisionApi();
            var jobid = jobid_example;  // string | jobid

            try
            {
                // Delete a vision job manually
                VisionJob result = apiInstance.DeleteVisionJob(jobid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.DeleteVisionJob: " + e.Message );
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

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getclassificationresult"></a>
# **GetClassificationResult**
> ClassificationResponse GetClassificationResult (string jobid)

Get classification result of a vision job

Get classification result of a vision job that completed the classification

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class GetClassificationResultExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VisionApi();
            var jobid = jobid_example;  // string | jobid

            try
            {
                // Get classification result of a vision job
                ClassificationResponse result = apiInstance.GetClassificationResult(jobid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.GetClassificationResult: " + e.Message );
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

[**ClassificationResponse**](ClassificationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvisionjob"></a>
# **GetVisionJob**
> VisionJob GetVisionJob (string jobid)

Get a vision job

Get a Vision job

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class GetVisionJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VisionApi();
            var jobid = jobid_example;  // string | jobid

            try
            {
                // Get a vision job
                VisionJob result = apiInstance.GetVisionJob(jobid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.GetVisionJob: " + e.Message );
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

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitvisionjob"></a>
# **SubmitVisionJob**
> VisionJob SubmitVisionJob (string jobid, VisionSettings settings)

Start classification of a vision job

Start classification of a vision job

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Client;
using Sphereon.SDK.Vision.Model;

namespace Example
{
    public class SubmitVisionJobExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VisionApi();
            var jobid = jobid_example;  // string | jobid
            var settings = new VisionSettings(); // VisionSettings | settings

            try
            {
                // Start classification of a vision job
                VisionJob result = apiInstance.SubmitVisionJob(jobid, settings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.SubmitVisionJob: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **string**| jobid | 
 **settings** | [**VisionSettings**](VisionSettings.md)| settings | 

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadfile"></a>
# **UploadFile**
> VisionJob UploadFile (string jobid, System.IO.Stream stream)

Upload an image for a vision job

Upload an image for a vision job. Processing will not be started yet.

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

            var apiInstance = new VisionApi();
            var jobid = jobid_example;  // string | jobid
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary image to upload for a vision job

            try
            {
                // Upload an image for a vision job
                VisionJob result = apiInstance.UploadFile(jobid, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VisionApi.UploadFile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobid** | **string**| jobid | 
 **stream** | **System.IO.Stream**| The binary image to upload for a vision job | 

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

