
# Organization

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **address** | [**Address**](Address.md) | Physical address of the organization |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the organization was created (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |
| **deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the organization was soft deleted, null if not deleted (RFC3339 format) example: null format: date-time |  [optional] |
| **doingBusinessAs** | **kotlin.String** | Trading or brand name of the organization, if different from legal name example: Lerian FS maxLength: 256 |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier for the organization (UUID format) example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **legalDocument** | **kotlin.String** | Official tax ID, company registration number, or other legal identification example: 123456789012345 maxLength: 256 |  [optional] |
| **legalName** | **kotlin.String** | Official legal name of the organization example: Lerian Financial Services Ltd. maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom key-value pairs for extending the organization information example: {\&quot;industry\&quot;: \&quot;Financial Services\&quot;, \&quot;founded\&quot;: 2020, \&quot;employees\&quot;: 150} |  [optional] |
| **parentOrganizationId** | [**java.util.UUID**](java.util.UUID.md) | Reference to the parent organization, if this is a child organization example: 00000000-0000-0000-0000-000000000000 format: uuid |  [optional] |
| **status** | [**Status**](Status.md) | Current operating status of the organization |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when the organization was last updated (RFC3339 format) example: 2021-01-01T00:00:00Z format: date-time |  [optional] |



