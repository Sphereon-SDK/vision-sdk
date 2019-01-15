# Sphereon.SDK.Vision.Model.VisionJob
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTime** | **DateTime?** | The completion date/time of this tests in ISO 8601 format. | [optional] 
**JobId** | **string** | The job id | [optional] 
**Settings** | [**VisionSettings**](VisionSettings.md) | The settings used during execution of the vision task. | [optional] 
**CreationTime** | **DateTime?** | The creation date/time of this tests in ISO 8601 format. | [optional] 
**Inputs** | [**List&lt;InputResource&gt;**](InputResource.md) | The input images. Currently supported inputs are: jpeg, png, bmp. | 
**UpdateTime** | **DateTime?** | The last update date/time of this tests in ISO 8601 format. | [optional] 
**State** | **string** | The status of the vision job, | [optional] 
**Results** | [**Dictionary&lt;string, Result&gt;**](Result.md) | The tags that are predicted for each input. | [optional] 
**QueueTime** | **DateTime?** | The queue date/time of this tests in ISO 8601 format. | [optional] 
**Status** | [**List&lt;StatusMessage&gt;**](StatusMessage.md) | A list of status messages. A status message, which can be informational, warning or error. A message here does not indicate an error perse. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

