
# UpdateAccountInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String** | Optional external identifier for linking to external systems required: false example: EXT-ACC-12345 maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Updated custom key-value pairs for extending the account information required: false example: {\&quot;department\&quot;: \&quot;Global Treasury\&quot;, \&quot;purpose\&quot;: \&quot;Primary Operations\&quot;, \&quot;region\&quot;: \&quot;Global\&quot;} |  [optional] |
| **name** | **kotlin.String** | Updated name of the account required: false example: Primary Corporate Checking Account maxLength: 256 |  [optional] |
| **portfolioId** | [**java.util.UUID**](java.util.UUID.md) | Updated portfolio ID for the account required: false format: uuid |  [optional] |
| **segmentId** | [**java.util.UUID**](java.util.UUID.md) | Updated segment ID for the account required: false format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Updated status of the account required: false |  [optional] |



