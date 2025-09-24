# AssetRatesApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet**](AssetRatesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/asset-rates/{external_id} | Get an AssetRate by External ID |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet**](AssetRatesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/asset-rates/from/{asset_code} | Get an AssetRate by the Asset Code |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut**](AssetRatesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut) | **PUT** /v1/organizations/{organization_id}/ledgers/{ledger_id}/asset-rates | Create or Update an AssetRate |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet**
> AssetRate v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet(authorization, organizationId, ledgerId, externalId, xRequestId)

Get an AssetRate by External ID

Get an AssetRate by External ID with the input details

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = AssetRatesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val externalId : kotlin.String = externalId_example // kotlin.String | External ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : AssetRate = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet(authorization, organizationId, ledgerId, externalId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesExternalIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **externalId** | **kotlin.String**| External ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**AssetRate**](AssetRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet**
> InlineResponse2002 v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet(authorization, organizationId, ledgerId, assetCode, xRequestId, to, limit, startDate, endDate, sortOrder, cursor)

Get an AssetRate by the Asset Code

Get an AssetRate by the Asset Code with the input details

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = AssetRatesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val assetCode : kotlin.String = assetCode_example // kotlin.String | From Asset Code
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
val to : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | To Asset Codes
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val startDate : kotlin.String = startDate_example // kotlin.String | Start Date
val endDate : kotlin.String = endDate_example // kotlin.String | End Date
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort Order
val cursor : kotlin.String = cursor_example // kotlin.String | Cursor
try {
    val result : InlineResponse2002 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet(authorization, organizationId, ledgerId, assetCode, xRequestId, to, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesFromAssetCodeGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **assetCode** | **kotlin.String**| From Asset Code | |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |
| **to** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| To Asset Codes | [optional] |
| **limit** | **kotlin.Int**| Limit | [optional] [default to 10] |
| **startDate** | **kotlin.String**| Start Date | [optional] |
| **endDate** | **kotlin.String**| End Date | [optional] |
| **sortOrder** | **kotlin.String**| Sort Order | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Cursor | [optional] |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut**
> AssetRate v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut(authorization, organizationId, ledgerId, assetRate, xRequestId)

Create or Update an AssetRate

Create or Update an AssetRate with the input details

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = AssetRatesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val assetRate : CreateAssetRateInput =  // CreateAssetRateInput | AssetRate Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : AssetRate = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut(authorization, organizationId, ledgerId, assetRate, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetRatesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAssetRatesPut")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **assetRate** | [**CreateAssetRateInput**](CreateAssetRateInput.md)| AssetRate Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**AssetRate**](AssetRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

