# TransactionRouteApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet**](TransactionRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transaction-routes | Get all Transaction Routes |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost**](TransactionRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transaction-routes | Create Transaction Route |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete**](TransactionRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transaction-routes/{transaction_route_id} | Delete Transaction Route by ID |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet**](TransactionRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transaction-routes/{transaction_route_id} | Get Transaction Route by ID |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch**](TransactionRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transaction-routes/{transaction_route_id} | Update Transaction Route |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet**
> InlineResponse2004 v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)

Get all Transaction Routes

Endpoint to get all Transaction Routes with optional metadata filtering.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val startDate : kotlin.String = startDate_example // kotlin.String | Start Date
val endDate : kotlin.String = endDate_example // kotlin.String | End Date
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort Order
val cursor : kotlin.String = cursor_example // kotlin.String | Cursor
try {
    val result : InlineResponse2004 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **limit** | **kotlin.Int**| Limit | [optional] [default to 10] |
| **startDate** | **kotlin.String**| Start Date | [optional] |
| **endDate** | **kotlin.String**| End Date | [optional] |
| **sortOrder** | **kotlin.String**| Sort Order | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Cursor | [optional] |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost**
> TransactionRoute v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost(authorization, organizationId, ledgerId, transactionRoute, xRequestId)

Create Transaction Route

Endpoint to create a new Transaction Route.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val transactionRoute : CreateTransactionRouteInput =  // CreateTransactionRouteInput | Transaction Route Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : TransactionRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost(authorization, organizationId, ledgerId, transactionRoute, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **transactionRoute** | [**CreateTransactionRouteInput**](CreateTransactionRouteInput.md)| Transaction Route Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**TransactionRoute**](TransactionRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete(authorization, organizationId, ledgerId, transactionRouteId, xRequestId)

Delete Transaction Route by ID

Endpoint to delete a Transaction Route by its ID.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val transactionRouteId : kotlin.String = transactionRouteId_example // kotlin.String | Transaction Route ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete(authorization, organizationId, ledgerId, transactionRouteId, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **transactionRouteId** | **kotlin.String**| Transaction Route ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet**
> TransactionRoute v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet(authorization, organizationId, ledgerId, transactionRouteId, xRequestId)

Get Transaction Route by ID

Endpoint to get a Transaction Route by its ID.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val transactionRouteId : kotlin.String = transactionRouteId_example // kotlin.String | Transaction Route ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : TransactionRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet(authorization, organizationId, ledgerId, transactionRouteId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **transactionRouteId** | **kotlin.String**| Transaction Route ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**TransactionRoute**](TransactionRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch**
> TransactionRoute v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch(authorization, organizationId, ledgerId, transactionRouteId, transactionRoute, xRequestId)

Update Transaction Route

Endpoint to update a Transaction Route by its ID.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val transactionRouteId : kotlin.String = transactionRouteId_example // kotlin.String | Transaction Route ID in UUID format
val transactionRoute : UpdateTransactionRouteInput =  // UpdateTransactionRouteInput | Transaction Route Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : TransactionRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch(authorization, organizationId, ledgerId, transactionRouteId, transactionRoute, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionRoutesTransactionRouteIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **transactionRouteId** | **kotlin.String**| Transaction Route ID in UUID format | |
| **transactionRoute** | [**UpdateTransactionRouteInput**](UpdateTransactionRouteInput.md)| Transaction Route Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**TransactionRoute**](TransactionRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

