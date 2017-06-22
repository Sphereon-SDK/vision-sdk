
# ReaderEngineTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | The current job Id |  [optional]
**queueId** | **String** | The queue Id provided by a backend system |  [optional]
**engine** | [**EngineEnum**](#EngineEnum) | The Engine being used |  [optional]
**inputs** | **List&lt;String&gt;** | The names of the supplied files/inputs |  [optional]
**documentId** | **String** | The document Id provided by a backend system |  [optional]
**url** | **String** | The URL on the bucketstore for the Barcode file. Only available once the status is DONE |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the Reader task itself |  [optional]


<a name="EngineEnum"></a>
## Enum: EngineEnum
Name | Value
---- | -----
ADVANCED | &quot;ADVANCED&quot;
PREMIUM | &quot;PREMIUM&quot;
BASIC | &quot;BASIC&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REQUESTED | &quot;REQUESTED&quot;
QUEUED | &quot;QUEUED&quot;
PROCESSING | &quot;PROCESSING&quot;
DONE | &quot;DONE&quot;
ERROR | &quot;ERROR&quot;



