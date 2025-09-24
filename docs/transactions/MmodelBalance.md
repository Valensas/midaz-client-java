
# MmodelBalance

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | [**java.util.UUID**](java.util.UUID.md) | Account that holds this balance example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **accountType** | **kotlin.String** | Type of account holding this balance example: creditCard maxLength: 50 |  [optional] |
| **alias** | **kotlin.String** | Alias for the account, used for easy identification or tagging example: @person1 maxLength: 256 |  [optional] |
| **allowReceiving** | **kotlin.Boolean** | Whether the account can receive funds to this balance example: true |  [optional] |
| **allowSending** | **kotlin.Boolean** | Whether the account can send funds from this balance example: true |  [optional] |
| **assetCode** | **kotlin.String** | Asset code identifying the currency or asset type of this balance example: USD minLength: 2 maxLength: 10 |  [optional] |
| **available** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Amount available for transactions (in the smallest unit of the asset, e.g. cents) example: 1500 minimum: 0 |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the balance was created (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the balance was softly deleted, null if not deleted (RFC3339 format) example: null format: date-time |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the balance (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | Ledger containing the account this balance belongs to example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the balance information example: {\&quot;purpose\&quot;: \&quot;Main savings\&quot;, \&quot;category\&quot;: \&quot;Personal\&quot;} |  [optional] |
| **onHold** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Amount currently on hold and unavailable for transactions example: 500 minimum: 0 |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | Organization that owns this balance example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the balance was last updated (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **version** | **kotlin.Int** | Optimistic concurrency control version example: 1 minimum: 1 |  [optional] |



