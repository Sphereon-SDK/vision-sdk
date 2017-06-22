# Barcode.ReaderEngineTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | The current job Id | [optional] 
**queueId** | **String** | The queue Id provided by a backend system | [optional] 
**engine** | **String** | The Engine being used | [optional] 
**inputs** | **[String]** | The names of the supplied files/inputs | [optional] 
**documentId** | **String** | The document Id provided by a backend system | [optional] 
**url** | **String** | The URL on the bucketstore for the Barcode file. Only available once the status is DONE | [optional] 
**status** | **String** | The status of the Reader task itself | [optional] 


<a name="EngineEnum"></a>
## Enum: EngineEnum


* `ADVANCED` (value: `"ADVANCED"`)

* `PREMIUM` (value: `"PREMIUM"`)

* `BASIC` (value: `"BASIC"`)




<a name="StatusEnum"></a>
## Enum: StatusEnum


* `REQUESTED` (value: `"REQUESTED"`)

* `QUEUED` (value: `"QUEUED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)




