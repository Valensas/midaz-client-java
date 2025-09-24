
# Transaction

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **amount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Transaction amount value in the smallest unit of the asset example: 1500 minimum: 0 |  [optional] |
| **assetCode** | **kotlin.String** | Asset code for the transaction example: BRL minLength: 2 maxLength: 10 |  [optional] |
| **chartOfAccountsGroupName** | **kotlin.String** | Chart of accounts group name for accounting purposes example: Chart of accounts group name maxLength: 256 |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the transaction was created example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the transaction was deleted (if soft-deleted) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **description** | **kotlin.String** | Human-readable description of the transaction example: Transaction description maxLength: 256 |  [optional] |
| **destination** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of destination account aliases or identifiers example: [\&quot;@person2\&quot;] |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the transaction example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | Ledger identifier example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes example: {\&quot;purpose\&quot;: \&quot;Monthly payment\&quot;, \&quot;category\&quot;: \&quot;Utility\&quot;} |  [optional] |
| **operations** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md) | List of operations associated with this transaction |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | Organization identifier example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **parentTransactionId** | [**java.util.UUID**](java.util.UUID.md) | Parent transaction identifier (for reversals or child transactions) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **route** | **kotlin.String** | Route example: 00000000-0000-0000-0000-000000000000 format: string |  [optional] |
| **source** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of source account aliases or identifiers example: [\&quot;@person1\&quot;] |  [optional] |
| **status** | [**Status**](Status.md) | Transaction status information |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the transaction was last updated example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



