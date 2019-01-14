
# VisionSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageProvider** | [**StorageProviderEnum**](#StorageProviderEnum) | The provider of the storage. |  [optional]
**storageSettings** | [**StorageSettings**](StorageSettings.md) | The settings of which storage is used to store images. The settings should be provided dependent on the StorageProvider setting. |  [optional]
**vendor** | [**VendorEnum**](#VendorEnum) |  |  [optional]
**detectionTypes** | [**List&lt;DetectionTypesEnum&gt;**](#List&lt;DetectionTypesEnum&gt;) | The type of vision detection that should be performed on images. Different vendors support different detection types. All vendors support at least label detection. |  [optional]


<a name="StorageProviderEnum"></a>
## Enum: StorageProviderEnum
Name | Value
---- | -----
SUPPLIER | &quot;API_SUPPLIER&quot;


<a name="VendorEnum"></a>
## Enum: VendorEnum
Name | Value
---- | -----
GOOGLE_VISION | &quot;GOOGLE_VISION&quot;
MS_AZURE_VISION | &quot;MS_AZURE_VISION&quot;
CLARIFAI | &quot;CLARIFAI&quot;
AWS | &quot;AWS&quot;


<a name="List<DetectionTypesEnum>"></a>
## Enum: List&lt;DetectionTypesEnum&gt;
Name | Value
---- | -----
LABEL | &quot;LABEL&quot;
TEXT | &quot;TEXT&quot;
FACIAL | &quot;FACIAL&quot;
LOGO | &quot;LOGO&quot;
HANDWRITTEN | &quot;HANDWRITTEN&quot;



