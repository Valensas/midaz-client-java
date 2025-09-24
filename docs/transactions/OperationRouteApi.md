# OperationRouteApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet**](OperationRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/operation-routes | Retrieve all operation routes |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet**](OperationRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/operation-routes/{id} | Retrieve a specific operation route |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete**](OperationRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/operation-routes/{operation_route_id} | Delete an operation route |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch**](OperationRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/operation-routes/{operation_route_id} | Update an operation route |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost**](OperationRouteApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/operation-routes | Create Operation Route |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet**
> InlineResponse2003 v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)

Retrieve all operation routes

Returns a list of all operation routes within the specified ledger with cursor-based pagination

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationRouteApi()
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
    val result : InlineResponse2003 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesGet")
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet**
> OperationRoute v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific operation route

Returns detailed information about an operation route identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Operation Route ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : OperationRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Operation Route ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**OperationRoute**](OperationRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete(authorization, organizationId, ledgerId, operationRouteId, xRequestId)

Delete an operation route

Deletes an existing operation route identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val operationRouteId : kotlin.String = operationRouteId_example // kotlin.String | Operation Route ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete(authorization, organizationId, ledgerId, operationRouteId, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **operationRouteId** | **kotlin.String**| Operation Route ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch**
> OperationRoute v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch(authorization, organizationId, ledgerId, operationRouteId, operationRoute, xRequestId)

Update an operation route

Updates an existing operation route&#39;s properties such as title, description, and type within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val operationRouteId : kotlin.String = operationRouteId_example // kotlin.String | Operation Route ID in UUID format
val operationRoute : UpdateOperationRouteInput =  // UpdateOperationRouteInput | Operation Route Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : OperationRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch(authorization, organizationId, ledgerId, operationRouteId, operationRoute, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesOperationRouteIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **operationRouteId** | **kotlin.String**| Operation Route ID in UUID format | |
| **operationRoute** | [**UpdateOperationRouteInput**](UpdateOperationRouteInput.md)| Operation Route Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**OperationRoute**](OperationRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost**
> OperationRoute v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost(authorization, organizationId, ledgerId, operationRoute, xRequestId)

Create Operation Route

Endpoint to create a new Operation Route.

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationRouteApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val operationRoute : kotlin.Any = Object // kotlin.Any | Operation Route Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : OperationRoute = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost(authorization, organizationId, ledgerId, operationRoute, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationRouteApi#v1OrganizationsOrganizationIdLedgersLedgerIdOperationRoutesPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **operationRoute** | **kotlin.Any**| Operation Route Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**OperationRoute**](OperationRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

