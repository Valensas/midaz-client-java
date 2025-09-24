
# Account

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **alias** | **kotlin.String** | Unique alias for the account (makes referencing easier) example: @treasury_checking maxLength: 100 |  [optional] |
| **assetCode** | **kotlin.String** | Asset code associated with this account (determines currency/asset type) example: USD maxLength: 100 |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the account was created (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the account was soft deleted, null if not deleted (RFC3339 format) example: null format: date-time |  [optional] |
| **entityId** | **kotlin.String** | Optional external identifier for linking to external systems example: EXT-ACC-12345 maxLength: 256 |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the account (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | ID of the ledger this account belongs to (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the account information example: {\&quot;department\&quot;: \&quot;Treasury\&quot;, \&quot;purpose\&quot;: \&quot;Operating Expenses\&quot;, \&quot;region\&quot;: \&quot;Global\&quot;} |  [optional] |
| **name** | **kotlin.String** | Human-readable name of the account example: Corporate Checking Account maxLength: 256 |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | ID of the organization that owns this account (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **parentAccountId** | [**java.util.UUID**](java.util.UUID.md) | ID of the parent account if this is a sub-account (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **portfolioId** | [**java.util.UUID**](java.util.UUID.md) | ID of the portfolio this account belongs to (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **segmentId** | [**java.util.UUID**](java.util.UUID.md) | ID of the segment this account belongs to (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the account |  [optional] |
| **type** | **kotlin.String** | Type of the account. example: deposit |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the account was last updated (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



