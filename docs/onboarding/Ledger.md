
# Ledger

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the ledger was created (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the ledger was soft deleted, null if not deleted (RFC3339 format) example: null format: date-time |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the ledger (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the ledger information example: {\&quot;department\&quot;: \&quot;Finance\&quot;, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;region\&quot;: \&quot;North America\&quot;} |  [optional] |
| **name** | **kotlin.String** | Display name of the ledger example: Treasury Operations maxLength: 256 |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | Reference to the organization that owns this ledger (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the ledger |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the ledger was last updated (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



