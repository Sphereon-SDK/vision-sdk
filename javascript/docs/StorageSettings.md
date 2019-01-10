# Vision.StorageSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | **String** | The container id or name in which the files are stored. | [optional] 
**lifecycle** | [**Lifecycle**](Lifecycle.md) | The lifecycle of the stored files. | [optional] 
**credentials** | [**Credentials**](Credentials.md) | The credentials from the backed. | [optional] 
**backendType** | **String** | The backend type that is used to store files. | [optional] 
**backend** | **String** | The backend id or name that is used to store files. | [optional] 


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum


* `SPHEREON_CLOUD_STORAGE` (value: `"SPHEREON_CLOUD_STORAGE"`)

* `AMAZON_S3` (value: `"AMAZON_S3"`)

* `MS_AZURE_BLOB_STORAGE` (value: `"MS_AZURE_BLOB_STORAGE"`)

* `GOOGLE_CLOUD_STORAGE` (value: `"GOOGLE_CLOUD_STORAGE"`)

* `XILLIO_ENGINE` (value: `"XILLIO_ENGINE"`)




