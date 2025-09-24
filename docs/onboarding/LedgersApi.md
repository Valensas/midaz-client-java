# LedgersApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersGet**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersGet) | **GET** /v1/organizations/{organization_id}/ledgers | List all ledgers |
| [**v1OrganizationsOrganizationIdLedgersIdDelete**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{id} | Delete a ledger |
| [**v1OrganizationsOrganizationIdLedgersIdGet**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{id} | Retrieve a specific ledger |
| [**v1OrganizationsOrganizationIdLedgersIdPatch**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{id} | Update an existing ledger |
| [**v1OrganizationsOrganizationIdLedgersMetricsCountHead**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersMetricsCountHead) | **HEAD** /v1/organizations/{organization_id}/ledgers/metrics/count | Count total ledgers |
| [**v1OrganizationsOrganizationIdLedgersPost**](LedgersApi.md#v1OrganizationsOrganizationIdLedgersPost) | **POST** /v1/organizations/{organization_id}/ledgers | Create a new ledger |


<a id="v1OrganizationsOrganizationIdLedgersGet"></a>
# **v1OrganizationsOrganizationIdLedgersGet**
> InlineResponse2001 v1OrganizationsOrganizationIdLedgersGet(authorization, organizationId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all ledgers

Returns a paginated list of ledgers within the specified organization, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter ledgers by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter ledgers created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter ledgers created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse2001 = apiInstance.v1OrganizationsOrganizationIdLedgersGet(authorization, organizationId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter ledgers by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter ledgers created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter ledgers created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersIdDelete**
> kotlin.String v1OrganizationsOrganizationIdLedgersIdDelete(authorization, organizationId, id, xRequestId)

Delete a ledger

Permanently removes a ledger identified by its UUID. Note: This operation is not available in production environments.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : kotlin.String = apiInstance.v1OrganizationsOrganizationIdLedgersIdDelete(authorization, organizationId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **id** | **kotlin.String**| Ledger ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersIdGet**
> Ledger v1OrganizationsOrganizationIdLedgersIdGet(authorization, organizationId, id, xRequestId)

Retrieve a specific ledger

Returns detailed information about a ledger identified by its UUID within the specified organization

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Ledger = apiInstance.v1OrganizationsOrganizationIdLedgersIdGet(authorization, organizationId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **id** | **kotlin.String**| Ledger ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Ledger**](Ledger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersIdPatch**
> Ledger v1OrganizationsOrganizationIdLedgersIdPatch(authorization, organizationId, id, ledger, xRequestId)

Update an existing ledger

Updates a ledger&#39;s information such as name, status, or metadata. Only supplied fields will be updated.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Ledger ID in UUID format
val ledger : UpdateLedgerInput =  // UpdateLedgerInput | Ledger fields to update. Only supplied fields will be modified.
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Ledger = apiInstance.v1OrganizationsOrganizationIdLedgersIdPatch(authorization, organizationId, id, ledger, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **id** | **kotlin.String**| Ledger ID in UUID format | |
| **ledger** | [**UpdateLedgerInput**](UpdateLedgerInput.md)| Ledger fields to update. Only supplied fields will be modified. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Ledger**](Ledger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersMetricsCountHead"></a>
# **v1OrganizationsOrganizationIdLedgersMetricsCountHead**
> kotlin.String v1OrganizationsOrganizationIdLedgersMetricsCountHead(authorization, organizationId, xRequestId)

Count total ledgers

Returns the total count of ledgers for a specific organization as a header without a response body

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : kotlin.String = apiInstance.v1OrganizationsOrganizationIdLedgersMetricsCountHead(authorization, organizationId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersMetricsCountHead")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersPost"></a>
# **v1OrganizationsOrganizationIdLedgersPost**
> Ledger v1OrganizationsOrganizationIdLedgersPost(authorization, organizationId, ledger, xRequestId)

Create a new ledger

Creates a new ledger within the specified organization. A ledger is a financial record-keeping system for tracking assets, accounts, and transactions.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = LedgersApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledger : CreateLedgerInput =  // CreateLedgerInput | Ledger details including name, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Ledger = apiInstance.v1OrganizationsOrganizationIdLedgersPost(authorization, organizationId, ledger, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#v1OrganizationsOrganizationIdLedgersPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledger** | [**CreateLedgerInput**](CreateLedgerInput.md)| Ledger details including name, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Ledger**](Ledger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

