
# Barcode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confidenceLevel** | **Double** | The confidence level of the barcode |  [optional]
**pageNo** | **Integer** | The number of the page the barcode is on |  [optional]
**coordinates** | [**List&lt;BarcodeCoordinate&gt;**](BarcodeCoordinate.md) | The coordinates of the barcode. There are usually 2 coordinates, with an x and y value and an anchor. |  [optional]
**text** | **String** | The text of the barcode |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the barcode |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AZTEC | &quot;AZTEC&quot;
CODABAR | &quot;CODABAR&quot;
CODE_39 | &quot;CODE_39&quot;
CODE_39_EXTENDED | &quot;CODE_39_EXTENDED&quot;
CODE_93 | &quot;CODE_93&quot;
CODE_128 | &quot;CODE_128&quot;
DATA_MATRIX | &quot;DATA_MATRIX&quot;
EAN_8 | &quot;EAN_8&quot;
EAN_13 | &quot;EAN_13&quot;
ITF | &quot;ITF&quot;
MAXICODE | &quot;MAXICODE&quot;
PDF_417 | &quot;PDF_417&quot;
QR_CODE | &quot;QR_CODE&quot;
RSS_14 | &quot;RSS_14&quot;
RSS_EXPANDED | &quot;RSS_EXPANDED&quot;
UPC_A | &quot;UPC_A&quot;
UPC_E | &quot;UPC_E&quot;
UPC_EAN_EXTENSION | &quot;UPC_EAN_EXTENSION&quot;
IDENTCODE | &quot;IDENTCODE&quot;
INTERLEAVED25 | &quot;INTERLEAVED25&quot;



