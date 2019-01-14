# Sphereon.SDK.Vision.Api.VisionApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/vision/0.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateVisionJob**](VisionApi.md#createvisionjob) | **POST** /jobs | Create a new vision job
[**DeleteVisionJob**](VisionApi.md#deletevisionjob) | **DELETE** /jobs/{jobId} | Delete a vision job manually
[**GetVisionJob**](VisionApi.md#getvisionjob) | **GET** /jobs/{jobId} | Get a vision job
[**SubmitVisionJob**](VisionApi.md#submitvisionjob) | **PUT** /jobs/{jobId} | Start classification of a vision job
[**UploadFile**](VisionApi.md#uploadfile) | **POST** /jobs/{jobId}/streams/multipart | Upload an image for a vision job


<a name="createvisionjob"></a>
# **CreateVisionJob**
> VisionJob CreateVisionJob (VisionSettings visionSettings)

Create a new vision job

Create a new job for the vision operation.

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
> VisionJob DeleteVisionJob (string jobId)

Delete a vision job manually

Delete a vision job manually. This will delete the uploaded resources if not yet deleted after the job is complete.

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
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Delete a vision job manually
                VisionJob result = apiInstance.DeleteVisionJob(jobId);
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
 **jobId** | **string**| jobId | 

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvisionjob"></a>
# **GetVisionJob**
> VisionJob GetVisionJob (string jobId)

Get a vision job

Get a Vision job. After processing the vision job contains the results.

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
            var jobId = jobId_example;  // string | jobId

            try
            {
                // Get a vision job
                VisionJob result = apiInstance.GetVisionJob(jobId);
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
 **jobId** | **string**| jobId | 

### Return type

[**VisionJob**](VisionJob.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitvisionjob"></a>
# **SubmitVisionJob**
> VisionJob SubmitVisionJob (string jobId, VisionSettings settings)

Start classification of a vision job

Submit a vision job to start classification.

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
            var jobId = jobId_example;  // string | jobId
            var settings = new VisionSettings(); // VisionSettings | settings

            try
            {
                // Start classification of a vision job
                VisionJob result = apiInstance.SubmitVisionJob(jobId, settings);
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
 **jobId** | **string**| jobId | 
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
> InputResource UploadFile (string jobId, System.IO.Stream stream)

Upload an image for a vision job

Upload an image for a vision job. Processing will start after submitting the job.

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
            var jobId = jobId_example;  // string | jobId
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary image to upload for a vision job

            try
            {
                // Upload an image for a vision job
                InputResource result = apiInstance.UploadFile(jobId, stream);
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
 **jobId** | **string**| jobId | 
 **stream** | **System.IO.Stream**| The binary image to upload for a vision job | 

### Return type

[**InputResource**](InputResource.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

