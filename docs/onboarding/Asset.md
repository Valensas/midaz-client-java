
# Asset

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | **kotlin.String** | Unique code/symbol for the asset (max length 100 characters) |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the asset was created |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the asset was deleted (null if not deleted) |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the asset (UUID format) |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | ID of the ledger this asset belongs to (UUID format) |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes for the asset |  [optional] |
| **name** | **kotlin.String** | Name of the asset (max length 256 characters) |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | ID of the organization that owns this asset (UUID format) |  [optional] |
| **status** | [**Status**](Status.md) | Status of the asset (active, inactive, pending) |  [optional] |
| **type** | **kotlin.String** | Type of the asset (e.g., currency, cryptocurrency, commodity, stock) |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the asset was last updated |  [optional] |



