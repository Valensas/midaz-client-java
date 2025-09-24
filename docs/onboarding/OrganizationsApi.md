# OrganizationsApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsGet**](OrganizationsApi.md#v1OrganizationsGet) | **GET** /v1/organizations | List all organizations |
| [**v1OrganizationsIdDelete**](OrganizationsApi.md#v1OrganizationsIdDelete) | **DELETE** /v1/organizations/{id} | Delete an organization |
| [**v1OrganizationsIdGet**](OrganizationsApi.md#v1OrganizationsIdGet) | **GET** /v1/organizations/{id} | Retrieve a specific organization |
| [**v1OrganizationsIdPatch**](OrganizationsApi.md#v1OrganizationsIdPatch) | **PATCH** /v1/organizations/{id} | Update an existing organization |
| [**v1OrganizationsMetricsCountHead**](OrganizationsApi.md#v1OrganizationsMetricsCountHead) | **HEAD** /v1/organizations/metrics/count | Count total organizations |
| [**v1OrganizationsPost**](OrganizationsApi.md#v1OrganizationsPost) | **POST** /v1/organizations | Create a new organization |


<a id="v1OrganizationsGet"></a>
# **v1OrganizationsGet**
> InlineResponse200 v1OrganizationsGet(authorization, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all organizations

Returns a paginated list of organizations, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter organizations by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter organizations created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter organizations created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse200 = apiInstance.v1OrganizationsGet(authorization, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter organizations by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter organizations created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter organizations created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsIdDelete"></a>
# **v1OrganizationsIdDelete**
> kotlin.String v1OrganizationsIdDelete(authorization, id, xRequestId)

Delete an organization

Permanently removes an organization identified by its UUID. Note: This operation is not available in production environments.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val id : kotlin.String = id_example // kotlin.String | Organization ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : kotlin.String = apiInstance.v1OrganizationsIdDelete(authorization, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **id** | **kotlin.String**| Organization ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a id="v1OrganizationsIdGet"></a>
# **v1OrganizationsIdGet**
> Organization v1OrganizationsIdGet(authorization, id, xRequestId)

Retrieve a specific organization

Returns detailed information about an organization identified by its UUID

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val id : kotlin.String = id_example // kotlin.String | Organization ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Organization = apiInstance.v1OrganizationsIdGet(authorization, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **id** | **kotlin.String**| Organization ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsIdPatch"></a>
# **v1OrganizationsIdPatch**
> Organization v1OrganizationsIdPatch(authorization, id, organization, xRequestId)

Update an existing organization

Updates an organization&#39;s information such as legal name, address, or status. Only supplied fields will be updated.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val id : kotlin.String = id_example // kotlin.String | Organization ID in UUID format
val organization : UpdateOrganizationInput =  // UpdateOrganizationInput | Organization fields to update. Only supplied fields will be modified.
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Organization = apiInstance.v1OrganizationsIdPatch(authorization, id, organization, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **id** | **kotlin.String**| Organization ID in UUID format | |
| **organization** | [**UpdateOrganizationInput**](UpdateOrganizationInput.md)| Organization fields to update. Only supplied fields will be modified. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsMetricsCountHead"></a>
# **v1OrganizationsMetricsCountHead**
> kotlin.String v1OrganizationsMetricsCountHead(authorization, xRequestId)

Count total organizations

Returns the total count of organizations as a header without a response body

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : kotlin.String = apiInstance.v1OrganizationsMetricsCountHead(authorization, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsMetricsCountHead")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a id="v1OrganizationsPost"></a>
# **v1OrganizationsPost**
> Organization v1OrganizationsPost(authorization, organization, xRequestId)

Create a new organization

Creates a new organization with the provided details including legal name, legal document, and optional address information

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = OrganizationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organization : CreateOrganizationInput =  // CreateOrganizationInput | Organization details including legal name, legal document, and optional address information
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Organization = apiInstance.v1OrganizationsPost(authorization, organization, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#v1OrganizationsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#v1OrganizationsPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organization** | [**CreateOrganizationInput**](CreateOrganizationInput.md)| Organization details including legal name, legal document, and optional address information | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

