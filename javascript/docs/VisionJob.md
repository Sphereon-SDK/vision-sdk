# Vision.VisionJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Date** | The completion date/time of this tests in ISO 8601 format. | [optional] 
**jobId** | **String** | The job id | [optional] 
**settings** | [**VisionSettings**](VisionSettings.md) | The settings used during execution of the vision task. | [optional] 
**creationTime** | **Date** | The creation date/time of this tests in ISO 8601 format. | [optional] 
**inputs** | [**[InputResource]**](InputResource.md) | The input images. Currently supported inputs are: jpeg, png, bmp. | 
**updateTime** | **Date** | The last update date/time of this tests in ISO 8601 format. | [optional] 
**state** | **String** | The status of the vision job, | [optional] 
**results** | [**{String: Result}**](Result.md) | The tags that are predicted for each input. | [optional] 
**queueTime** | **Date** | The queue date/time of this tests in ISO 8601 format. | [optional] 
**status** | [**[StatusMessage]**](StatusMessage.md) | A list of status messages. A status message, which can be informational, warning or error. A message here does not indicate an error perse. | [optional] 


<a name="StateEnum"></a>
## Enum: StateEnum


* `UPLOAD_RESOURCES` (value: `"UPLOAD_RESOURCES"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




