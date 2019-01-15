# Vision.VisionSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageProvider** | **String** | The provider of the storage. | [optional] 
**storageSettings** | [**StorageSettings**](StorageSettings.md) | The settings of which storage is used to store images. The settings should be provided dependent on the StorageProvider setting. | [optional] 
**vendor** | **String** |  | [optional] 
**detectionTypes** | **[String]** | The type of vision detection that should be performed on images. Different vendors support different detection types. All vendors support at least label detection. | [optional] 


<a name="StorageProviderEnum"></a>
## Enum: StorageProviderEnum


* `SUPPLIER` (value: `"API_SUPPLIER"`)




<a name="VendorEnum"></a>
## Enum: VendorEnum


* `GOOGLE_VISION` (value: `"GOOGLE_VISION"`)

* `MS_AZURE_VISION` (value: `"MS_AZURE_VISION"`)

* `CLARIFAI` (value: `"CLARIFAI"`)

* `AWS` (value: `"AWS"`)




<a name="[DetectionTypesEnum]"></a>
## Enum: [DetectionTypesEnum]


* `LABEL` (value: `"LABEL"`)

* `TEXT` (value: `"TEXT"`)

* `FACIAL` (value: `"FACIAL"`)

* `LOGO` (value: `"LOGO"`)

* `HANDWRITTEN` (value: `"HANDWRITTEN"`)




