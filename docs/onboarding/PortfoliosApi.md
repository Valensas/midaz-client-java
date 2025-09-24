# PortfoliosApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios | List all portfolios |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios/{id} | Delete a portfolio |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios/{id} | Retrieve a specific portfolio |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios/{id} | Update a portfolio |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead) | **HEAD** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios/metrics/count | Count total portfolios |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost**](PortfoliosApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/portfolios | Create a new portfolio |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet**
> InlineResponse2005 v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all portfolios

Returns a paginated list of portfolios within the specified ledger, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter portfolios by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter portfolios created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter portfolios created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse2005 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter portfolios by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter portfolios created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter portfolios created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete(authorization, organizationId, ledgerId, id, xRequestId)

Delete a portfolio

Permanently removes a portfolio from the specified ledger. This operation cannot be undone.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Portfolio ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete(authorization, organizationId, ledgerId, id, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Portfolio ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet**
> Portfolio v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific portfolio

Returns detailed information about a portfolio identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Portfolio ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Portfolio = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Portfolio ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch**
> Portfolio v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch(authorization, organizationId, ledgerId, id, portfolio, xRequestId)

Update a portfolio

Updates an existing portfolio&#39;s properties such as name, entity ID, status, and metadata within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Portfolio ID in UUID format
val portfolio : UpdatePortfolioInput =  // UpdatePortfolioInput | Portfolio properties to update including name, entity ID, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Portfolio = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch(authorization, organizationId, ledgerId, id, portfolio, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Portfolio ID in UUID format | |
| **portfolio** | [**UpdatePortfolioInput**](UpdatePortfolioInput.md)| Portfolio properties to update including name, entity ID, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead**
> v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)

Count total portfolios

Returns the total count of portfolios for a specific organization and ledger as a header without a response body

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosMetricsCountHead")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost**
> Portfolio v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost(authorization, organizationId, ledgerId, portfolio, xRequestId)

Create a new portfolio

Creates a new portfolio within the specified ledger. Portfolios represent collections of accounts grouped for specific purposes such as business units, departments, or client portfolios.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = PortfoliosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val portfolio : CreatePortfolioInput =  // CreatePortfolioInput | Portfolio details including name, optional entity ID, status, and metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Portfolio = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost(authorization, organizationId, ledgerId, portfolio, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#v1OrganizationsOrganizationIdLedgersLedgerIdPortfoliosPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **portfolio** | [**CreatePortfolioInput**](CreatePortfolioInput.md)| Portfolio details including name, optional entity ID, status, and metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

