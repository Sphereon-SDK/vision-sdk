# Barcode.ReaderResultJobResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Date** | The completion date/time of this job in ISO 8601 format | [optional] 
**jobId** | **String** |  | [optional] 
**creationTime** | **Date** | The creation date/time of this job in ISO 8601 format | [optional] 
**inputs** | **[String]** | The original input files. Currently supported inputs are: tif files | 
**updateTime** | **Date** | The last update date/time of this job in ISO 8601 format | [optional] 
**barcodes** | [**[Barcode]**](Barcode.md) | The returned barcodes | 
**job** | [**ReaderJob**](ReaderJob.md) |  | [optional] 
**statusMessage** | **String** | A status message, which can be informational, warning or error. A message here does not indicate an error perse | [optional] 
**tasks** | [**[ReaderEngineTask]**](ReaderEngineTask.md) | The server supplied reader task(s) | [optional] 
**queueTime** | **Date** | The reader queue date/time of this job in ISO 8601 format | [optional] 
**status** | **String** | The status of the job | 


<a name="StatusEnum"></a>
## Enum: StatusEnum


* `INPUTS_UPLOADED` (value: `"INPUTS_UPLOADED"`)

* `PROCESSING` (value: `"PROCESSING"`)

* `DONE` (value: `"DONE"`)

* `ERROR` (value: `"ERROR"`)

* `DELETED` (value: `"DELETED"`)




