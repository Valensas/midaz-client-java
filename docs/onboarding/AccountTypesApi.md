# AccountTypesApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet**](AccountTypesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/account-types | Get all account types |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete**](AccountTypesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/account-types/{id} | Delete an account type |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet**](AccountTypesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/account-types/{id} | Retrieve a specific account type |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch**](AccountTypesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/account-types/{id} | Update Account Type |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost**](AccountTypesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/account-types | Create Account Type |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet**
> InlineResponse2002 v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, cursor, sortOrder, startDate, endDate)

Get all account types

Returns a paginated list of all account types for the specified organization and ledger, optionally filtered by metadata

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountTypesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter account types by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Limit of account types per page (default: 10, max: 100)
val page : kotlin.Int = 56 // kotlin.Int | Page number for offset pagination (default: 1)
val cursor : kotlin.String = cursor_example // kotlin.String | Cursor for cursor-based pagination
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort order (asc or desc, default: asc)
val startDate : kotlin.String = startDate_example // kotlin.String | Start date for filtering (YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | End date for filtering (YYYY-MM-DD)
try {
    val result : InlineResponse2002 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, cursor, sortOrder, startDate, endDate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter account types by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Limit of account types per page (default: 10, max: 100) | [optional] |
| **page** | **kotlin.Int**| Page number for offset pagination (default: 1) | [optional] |
| **cursor** | **kotlin.String**| Cursor for cursor-based pagination | [optional] |
| **sortOrder** | **kotlin.String**| Sort order (asc or desc, default: asc) | [optional] |
| **startDate** | **kotlin.String**| Start date for filtering (YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endDate** | **kotlin.String**| End date for filtering (YYYY-MM-DD) | [optional] |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete(authorization, organizationId, ledgerId, id, xRequestId)

Delete an account type

Deletes an existing account type identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountTypesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account Type ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete(authorization, organizationId, ledgerId, id, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account Type ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet**
> AccountType v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific account type

Returns detailed information about an account type identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountTypesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account Type ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : AccountType = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account Type ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**AccountType**](AccountType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch**
> AccountType v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch(authorization, organizationId, ledgerId, id, accountType, xRequestId)

Update Account Type

Endpoint to update an existing Account Type.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountTypesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account Type ID in UUID format
val accountType : UpdateAccountTypeInput =  // UpdateAccountTypeInput | Account Type Update Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : AccountType = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch(authorization, organizationId, ledgerId, id, accountType, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account Type ID in UUID format | |
| **accountType** | [**UpdateAccountTypeInput**](UpdateAccountTypeInput.md)| Account Type Update Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**AccountType**](AccountType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost**
> AccountType v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost(authorization, organizationId, ledgerId, accountType, xRequestId)

Create Account Type

Endpoint to create a new Account Type.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountTypesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val accountType : CreateAccountTypeInput =  // CreateAccountTypeInput | Account Type Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : AccountType = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost(authorization, organizationId, ledgerId, accountType, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTypesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountTypesPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **accountType** | [**CreateAccountTypeInput**](CreateAccountTypeInput.md)| Account Type Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**AccountType**](AccountType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

