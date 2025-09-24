
# CreateAccountInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetCode** | **kotlin.String** | Asset code that this account will use for balances and transactions required: true example: USD maxLength: 100 |  |
| **type** | **kotlin.String** | Type of the account required: true example: deposit maxLength: 256 |  |
| **alias** | **kotlin.String** | Unique alias for the account (optional, must follow alias format rules) required: false example: @treasury_checking maxLength: 100 |  [optional] |
| **entityId** | **kotlin.String** | Optional external identifier for linking to external systems required: false example: EXT-ACC-12345 maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the account information required: false example: {\&quot;department\&quot;: \&quot;Treasury\&quot;, \&quot;purpose\&quot;: \&quot;Operating Expenses\&quot;, \&quot;region\&quot;: \&quot;Global\&quot;} |  [optional] |
| **name** | **kotlin.String** | Human-readable name of the account required: false example: Corporate Checking Account maxLength: 256 |  [optional] |
| **parentAccountId** | [**java.util.UUID**](java.util.UUID.md) | ID of the parent account if this is a subaccount (optional) required: false format: uuid |  [optional] |
| **portfolioId** | [**java.util.UUID**](java.util.UUID.md) | ID of the portfolio this account belongs to (optional) required: false format: uuid |  [optional] |
| **segmentId** | [**java.util.UUID**](java.util.UUID.md) | ID of the segment this account belongs to (optional) required: false format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the account required: false |  [optional] |



