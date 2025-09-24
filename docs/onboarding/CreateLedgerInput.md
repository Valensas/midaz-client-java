
# CreateLedgerInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Display name of the ledger required: true maxLength: 256 |  |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the ledger information required: false example: {\&quot;department\&quot;: \&quot;Finance\&quot;, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;region\&quot;: \&quot;North America\&quot;} |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the ledger (defaults to ACTIVE if not specified) required: false |  [optional] |



