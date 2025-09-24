
# UpdateOrganizationInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **address** | [**Address**](Address.md) | Updated physical address of the organization required: false |  [optional] |
| **doingBusinessAs** | **kotlin.String** | Updated trading or brand name of the organization required: false example: Lerian Group maxLength: 256 |  [optional] |
| **legalName** | **kotlin.String** | Updated legal name of the organization required: false example: Lerian Financial Group Ltd. maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Updated custom key-value pairs for extending the organization information required: false example: {\&quot;industry\&quot;: \&quot;Financial Technology\&quot;, \&quot;founded\&quot;: 2020, \&quot;employees\&quot;: 200, \&quot;headquarters\&quot;: \&quot;New York\&quot;} |  [optional] |
| **parentOrganizationId** | [**java.util.UUID**](java.util.UUID.md) | Updated UUID of the parent organization if this is a child organization required: false format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Updated status of the organization required: false |  [optional] |



