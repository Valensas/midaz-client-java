
# CreateOrganizationInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **legalDocument** | **kotlin.String** | Official tax ID, company registration number, or other legal identification required: true example: 123456789012345 maxLength: 256 |  |
| **legalName** | **kotlin.String** | Official legal name of the organization required: true example: Lerian Financial Services Ltd. maxLength: 256 |  |
| **address** | [**Address**](Address.md) | Physical address of the organization required: false |  [optional] |
| **doingBusinessAs** | **kotlin.String** | Trading or brand name of the organization, if different from legal name required: false example: Lerian FS maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the organization information required: false example: {\&quot;industry\&quot;: \&quot;Financial Services\&quot;, \&quot;founded\&quot;: 2020, \&quot;employees\&quot;: 150} |  [optional] |
| **parentOrganizationId** | [**java.util.UUID**](java.util.UUID.md) | UUID of the parent organization if this is a child organization required: false format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the organization (defaults to ACTIVE if not specified) required: false |  [optional] |



