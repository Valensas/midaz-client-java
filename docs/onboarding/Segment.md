
# Segment

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the segment was created |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the segment was deleted (null if not deleted) |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the segment (UUID format) |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | ID of the ledger this segment belongs to (UUID format) |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes for the segment |  [optional] |
| **name** | **kotlin.String** | Name of the segment (max length 256 characters) |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | ID of the organization that owns this segment (UUID format) |  [optional] |
| **status** | [**Status**](Status.md) | Status of the segment (active, inactive, pending) |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the segment was last updated |  [optional] |



