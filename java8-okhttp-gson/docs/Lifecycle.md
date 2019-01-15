
# Lifecycle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
DELETE | &quot;DELETE&quot;
NONE | &quot;NONE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DONE | &quot;JOB_DONE&quot;



