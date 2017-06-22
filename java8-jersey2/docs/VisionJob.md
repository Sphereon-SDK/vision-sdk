
# VisionJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The completion date/time of this job in ISO 8601 format |  [optional]
**jobId** | **String** |  |  [optional]
**settings** | [**VisionSettings**](VisionSettings.md) |  |  [optional]
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date/time of this job in ISO 8601 format |  [optional]
**inputs** | **Map&lt;String, String&gt;** | The input images. Currently supported inputs are: jpeg, png, bmp | 
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The last update date/time of this job in ISO 8601 format |  [optional]
**state** | [**StateEnum**](#StateEnum) | The status of the job | 
**queueTime** | [**OffsetDateTime**](OffsetDateTime.md) | The queue date/time of this job in ISO 8601 format |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INPUTS_UPLOADED | &quot;INPUTS_UPLOADED&quot;
PROCESSING | &quot;PROCESSING&quot;
DONE | &quot;DONE&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;



