# AssetsApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets | List all assets |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets/{id} | Delete an asset |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets/{id} | Retrieve a specific asset |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets/{id} | Update an asset |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead) | **HEAD** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets/metrics/count | Count total assets |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost**](AssetsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/assets | Create a new asset |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet**
> InlineResponse2004 v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all assets

Returns a paginated list of assets within the specified ledger, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter assets by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter assets created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter assets created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse2004 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter assets by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter assets created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter assets created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)

Delete an asset

Permanently removes an asset from the specified ledger. This operation cannot be undone.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Asset ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Asset ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet**
> Asset v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific asset

Returns detailed information about an asset identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Asset ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Asset = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Asset ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch**
> Asset v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch(authorization, organizationId, ledgerId, id, asset, xRequestId)

Update an asset

Updates an existing asset&#39;s properties such as name, status, and metadata within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Asset ID in UUID format
val asset : UpdateAssetInput =  // UpdateAssetInput | Asset properties to update including name, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Asset = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch(authorization, organizationId, ledgerId, id, asset, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Asset ID in UUID format | |
| **asset** | [**UpdateAssetInput**](UpdateAssetInput.md)| Asset properties to update including name, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead**
> kotlin.String v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)

Count total assets

Returns the total count of assets for a specific ledger in an organization as a header without a response body

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : kotlin.String = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsMetricsCountHead")
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

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost**
> Asset v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost(authorization, organizationId, ledgerId, asset, xRequestId)

Create a new asset

Creates a new asset within the specified ledger. Assets represent currencies, cryptocurrencies, commodities, or other financial instruments tracked in the ledger.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AssetsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val asset : CreateAssetInput =  // CreateAssetInput | Asset details including name, code, type, status, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Asset = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost(authorization, organizationId, ledgerId, asset, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetsPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **asset** | [**CreateAssetInput**](CreateAssetInput.md)| Asset details including name, code, type, status, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

