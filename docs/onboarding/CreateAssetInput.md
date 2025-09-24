
# CreateAssetInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | **kotlin.String** | Unique code/symbol for the asset (required, max length 100 characters) |  |
| **name** | **kotlin.String** | Name of the asset (required, max length 256 characters) |  |
| **type** | **kotlin.String** | Type of the asset (e.g., currency, cryptocurrency, commodity, stock) |  |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes for the asset Keys max length: 100 characters, Values max length: 2000 characters |  [optional] |
| **status** | [**Status**](Status.md) | Status of the asset (active, inactive, pending) |  [optional] |



