
# Operation

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountAlias** | **kotlin.String** | Human-readable alias for the account example: @person1 maxLength: 256 |  [optional] |
| **accountId** | [**java.util.UUID**](java.util.UUID.md) | Account identifier associated with this operation example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **amount** | [**Amount**](Amount.md) | Operation amount information |  [optional] |
| **assetCode** | **kotlin.String** | Asset code for the operation example: BRL minLength: 2 maxLength: 10 |  [optional] |
| **balance** | [**Balance**](Balance.md) | Balance before the operation |  [optional] |
| **balanceAfter** | [**Balance**](Balance.md) | Balance after the operation |  [optional] |
| **balanceId** | [**java.util.UUID**](java.util.UUID.md) | Balance identifier affected by this operation example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **chartOfAccounts** | **kotlin.String** | Chart of accounts code for accounting purposes example: 1000 maxLength: 20 |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the operation was created example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the operation was deleted (if soft-deleted) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **description** | **kotlin.String** | Human-readable description of the operation example: Credit card operation maxLength: 256 |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the operation example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | Ledger identifier example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes example: {\&quot;reason\&quot;: \&quot;Purchase refund\&quot;, \&quot;reference\&quot;: \&quot;INV-12345\&quot;} |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | Organization identifier example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **route** | **kotlin.String** | Route example: 00000000-0000-0000-0000-000000000000 format: string |  [optional] |
| **status** | [**Status**](Status.md) | Operation status information |  [optional] |
| **transactionId** | [**java.util.UUID**](java.util.UUID.md) | Parent transaction identifier example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **type** | **kotlin.String** | Type of operation (e.g., DEBIT, CREDIT) example: DEBIT maxLength: 50 |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the operation was last updated example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



