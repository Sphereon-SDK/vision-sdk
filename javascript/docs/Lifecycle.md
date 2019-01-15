# Vision.Lifecycle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually. | [optional] 
**type** | **String** | Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing. | [optional] 


<a name="ActionEnum"></a>
## Enum: ActionEnum


* `DELETE` (value: `"DELETE"`)

* `NONE` (value: `"NONE"`)




<a name="TypeEnum"></a>
## Enum: TypeEnum


* `DONE` (value: `"JOB_DONE"`)




