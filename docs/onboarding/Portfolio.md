
# Portfolio

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the portfolio was created |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the portfolio was deleted (null if not deleted) |  [optional] |
| **entityId** | **kotlin.String** | Optional external entity identifier (max length 256 characters) |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the portfolio (UUID format) |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | ID of the ledger this portfolio belongs to (UUID format) |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes for the portfolio |  [optional] |
| **name** | **kotlin.String** | Name of the portfolio (max length 256 characters) |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | ID of the organization that owns this portfolio (UUID format) |  [optional] |
| **status** | [**Status**](Status.md) | Status of the portfolio (active, inactive, pending) |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the portfolio was last updated |  [optional] |



