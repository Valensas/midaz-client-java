
# AssetRate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the asset rate was created example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **externalId** | [**java.util.UUID**](java.util.UUID.md) | External identifier for integration with third-party systems example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **from** | **kotlin.String** | Source asset code example: USD minLength: 2 maxLength: 10 |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the asset rate example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **ledgerId** | [**java.util.UUID**](java.util.UUID.md) | Ledger containing this asset rate example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes example: {\&quot;provider\&quot;: \&quot;Central Bank\&quot;, \&quot;rateName\&quot;: \&quot;Official Exchange Rate\&quot;} |  [optional] |
| **organizationId** | [**java.util.UUID**](java.util.UUID.md) | Organization that owns this asset rate example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **rate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Conversion rate value example: 100 |  [optional] |
| **scale** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Decimal places for the rate example: 2 minimum: 0 |  [optional] |
| **source** | **kotlin.String** | Source of rate information example: External System maxLength: 200 |  [optional] |
| **to** | **kotlin.String** | Target asset code example: BRL minLength: 2 maxLength: 10 |  [optional] |
| **ttl** | **kotlin.Int** | Time-to-live in seconds example: 3600 minimum: 0 |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the asset rate was last updated example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



