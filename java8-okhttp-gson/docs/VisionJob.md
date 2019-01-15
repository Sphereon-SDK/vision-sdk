
# VisionJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The completion date/time of this tests in ISO 8601 format. |  [optional]
**jobId** | **String** | The job id |  [optional]
**settings** | [**VisionSettings**](VisionSettings.md) | The settings used during execution of the vision task. |  [optional]
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date/time of this tests in ISO 8601 format. |  [optional]
**inputs** | [**List&lt;InputResource&gt;**](InputResource.md) | The input images. Currently supported inputs are: jpeg, png, bmp. | 
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The last update date/time of this tests in ISO 8601 format. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The status of the vision job, |  [optional]
**results** | [**Map&lt;String, Result&gt;**](Result.md) | The tags that are predicted for each input. |  [optional]
**queueTime** | [**OffsetDateTime**](OffsetDateTime.md) | The queue date/time of this tests in ISO 8601 format. |  [optional]
**status** | [**List&lt;StatusMessage&gt;**](StatusMessage.md) | A list of status messages. A status message, which can be informational, warning or error. A message here does not indicate an error perse. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UPLOAD_RESOURCES | &quot;UPLOAD_RESOURCES&quot;
PROCESSING | &quot;PROCESSING&quot;
DONE | &quot;DONE&quot;
ERROR | &quot;ERROR&quot;
DELETED | &quot;DELETED&quot;



