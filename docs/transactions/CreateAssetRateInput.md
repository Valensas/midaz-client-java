
# CreateAssetRateInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **from** | **kotlin.String** | Source asset code (required) example: USD required: true minLength: 2 maxLength: 10 |  |
| **rate** | **kotlin.Int** | Conversion rate value (required) example: 100 required: true |  |
| **to** | **kotlin.String** | Target asset code (required) example: BRL required: true minLength: 2 maxLength: 10 |  |
| **externalId** | [**java.util.UUID**](java.util.UUID.md) | External identifier for integration (optional) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes (optional) example: {\&quot;provider\&quot;: \&quot;Central Bank\&quot;, \&quot;rateName\&quot;: \&quot;Official Exchange Rate\&quot;} |  [optional] |
| **scale** | **kotlin.Int** | Decimal places for the rate (optional) example: 2 minimum: 0 |  [optional] |
| **source** | **kotlin.String** | Source of rate information (optional) example: External System maxLength: 200 |  [optional] |
| **ttl** | **kotlin.Int** | Time-to-live in seconds (optional) example: 3600 minimum: 0 |  [optional] |



