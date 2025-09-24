
# Error

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | **kotlin.String** | Error code identifying the specific error condition example: ERR_INVALID_INPUT maxLength: 50 |  [optional] |
| **entityType** | **kotlin.String** | Optional type of entity associated with the error example: Organization maxLength: 100 |  [optional] |
| **fields** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Optional detailed field validations for client-side handling example: {\&quot;name\&quot;: \&quot;Field &#39;name&#39; is required\&quot;} |  [optional] |
| **message** | **kotlin.String** | Detailed error message explaining the issue example: The request contains invalid fields. Please check the field &#39;name&#39; and try again. maxLength: 500 |  [optional] |
| **title** | **kotlin.String** | Short, human-readable error title example: Bad Request maxLength: 100 |  [optional] |



