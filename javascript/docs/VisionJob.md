# Vision.VisionJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Date** | The completion date/time of this job in ISO 8601 format | [optional] 
**jobId** | **String** |  | [optional] 
**settings** | [**VisionSettings**](VisionSettings.md) |  | [optional] 
**creationTime** | **Date** | The creation date/time of this job in ISO 8601 format | [optional] 
**inputs** | **{String: String}** | The input images. Currently supported inputs are: jpeg, png, bmp | 
**updateTime** | **Date** | The last update date/time of this job in ISO 8601 format | [optional] 
**state** | **String** | The status of the job | 
**queueTime** | **Date** | The queue date/time of this job in ISO 8601 format | [optional] 


<a name="StateEnum"></a>
## Enum: StateEnum


* `INPUTS_UPLOADED` (value: `"INPUTS_UPLOADED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




