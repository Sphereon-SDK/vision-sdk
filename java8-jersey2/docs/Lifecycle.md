
# Lifecycle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the job and files will be deleted, regardless of whether it has been retrieved or not. Maximal time is 1 day from job creation |  [optional]
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
DELETE | &quot;DELETE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
RETRIEVAL | &quot;RETRIEVAL&quot;
TIME | &quot;TIME&quot;



