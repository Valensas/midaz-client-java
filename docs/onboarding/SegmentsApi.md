# SegmentsApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments | List all segments |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments/{id} | Delete a segment |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments/{id} | Retrieve a specific segment |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments/{id} | Update a segment |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead) | **HEAD** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments/metrics/count | Count segments |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost**](SegmentsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/segments | Create a new segment |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet**
> InlineResponse2006 v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all segments

Returns a paginated list of segments within the specified ledger, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter segments by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter segments created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter segments created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse2006 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter segments by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter segments created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter segments created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)

Delete a segment

Permanently removes a segment from the specified ledger. This operation cannot be undone.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Segment ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Segment ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet**
> Segment v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific segment

Returns detailed information about a segment identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Segment ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Segment = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Segment ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Segment**](Segment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch**
> Segment v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch(authorization, organizationId, ledgerId, id, segment, xRequestId)

Update a segment

Updates an existing segment&#39;s properties such as name, status, and metadata within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Segment ID in UUID format
val segment : UpdateSegmentInput =  // UpdateSegmentInput | Segment properties to update including name, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Segment = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch(authorization, organizationId, ledgerId, id, segment, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Segment ID in UUID format | |
| **segment** | [**UpdateSegmentInput**](UpdateSegmentInput.md)| Segment properties to update including name, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Segment**](Segment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead**
> v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)

Count segments

Returns the total count of segments for the specified organization and ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsMetricsCountHead")
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost**
> Segment v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost(authorization, organizationId, ledgerId, segment, xRequestId)

Create a new segment

Creates a new segment within the specified ledger. Segments represent logical divisions within a ledger, such as business areas, product lines, or customer categories.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = SegmentsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val segment : CreateSegmentInput =  // CreateSegmentInput | Segment details including name, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Segment = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost(authorization, organizationId, ledgerId, segment, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#v1OrganizationsOrganizationIdLedgersLedgerIdSegmentsPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **segment** | [**CreateSegmentInput**](CreateSegmentInput.md)| Segment details including name, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Segment**](Segment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

