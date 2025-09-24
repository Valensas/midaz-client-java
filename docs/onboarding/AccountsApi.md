# AccountsApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/alias/{alias} | Retrieve an account by alias |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/external/{code} | Retrieve an account by alias |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts | List all accounts |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{id} | Delete an account |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{id} | Retrieve a specific account |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{id} | Update an account |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead) | **HEAD** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/metrics/count | Count accounts |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost**](AccountsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts | Create a new account |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet**
> Account v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet(authorization, organizationId, ledgerId, alias, xRequestId)

Retrieve an account by alias

Returns detailed information about an account identified by its alias within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val alias : kotlin.String = alias_example // kotlin.String | Account alias (e.g. @person1)
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Account = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet(authorization, organizationId, ledgerId, alias, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **alias** | **kotlin.String**| Account alias (e.g. @person1) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet**
> Account v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet(authorization, organizationId, ledgerId, code, xRequestId)

Retrieve an account by alias

Returns detailed information about an account identified by its alias within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val code : kotlin.String = code_example // kotlin.String | Account External Code (e.g. BRL)
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Account = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet(authorization, organizationId, ledgerId, code, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **code** | **kotlin.String**| Account External Code (e.g. BRL) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet**
> InlineResponse2003 v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)

List all accounts

Returns a paginated list of accounts within the specified ledger, optionally filtered by metadata, date range, and other criteria

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
val metadata : kotlin.String = metadata_example // kotlin.String | JSON string to filter accounts by metadata fields
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of records to return per page
val page : kotlin.Int = 56 // kotlin.Int | Page number for pagination
val startDate : kotlin.String = startDate_example // kotlin.String | Filter accounts created on or after this date (format: YYYY-MM-DD)
val endDate : kotlin.String = endDate_example // kotlin.String | Filter accounts created on or before this date (format: YYYY-MM-DD)
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort direction for results based on creation date
try {
    val result : InlineResponse2003 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet(authorization, organizationId, ledgerId, xRequestId, metadata, limit, page, startDate, endDate, sortOrder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |
| **metadata** | **kotlin.String**| JSON string to filter accounts by metadata fields | [optional] |
| **limit** | **kotlin.Int**| Maximum number of records to return per page | [optional] [default to 10] |
| **page** | **kotlin.Int**| Page number for pagination | [optional] [default to 1] |
| **startDate** | **kotlin.String**| Filter accounts created on or after this date (format: YYYY-MM-DD) | [optional] |
| **endDate** | **kotlin.String**| Filter accounts created on or before this date (format: YYYY-MM-DD) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| Sort direction for results based on creation date | [optional] [enum: asc, desc] |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete**
> v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)

Delete an account

Permanently removes an account from the specified ledger. This operation cannot be undone.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete(authorization, organizationId, ledgerId, id, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account ID in UUID format | |
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet**
> Account v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet(authorization, organizationId, ledgerId, id, xRequestId)

Retrieve a specific account

Returns detailed information about an account identified by its UUID within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Account = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet(authorization, organizationId, ledgerId, id, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account ID in UUID format | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch**
> Account v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch(authorization, organizationId, ledgerId, id, account, xRequestId)

Update an account

Updates an existing account&#39;s properties such as name, status, portfolio, segment, and metadata within the specified ledger

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val id : kotlin.String = id_example // kotlin.String | Account ID in UUID format
val account : UpdateAccountInput =  // UpdateAccountInput | Account properties to update including name, status, portfolio, segment, and optional metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Account = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch(authorization, organizationId, ledgerId, id, account, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **id** | **kotlin.String**| Account ID in UUID format | |
| **account** | [**UpdateAccountInput**](UpdateAccountInput.md)| Account properties to update including name, status, portfolio, segment, and optional metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead**
> v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)

Count accounts

Returns the total count of accounts for the specified organization, ledger, and optional portfolio

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead(authorization, organizationId, ledgerId, xRequestId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsMetricsCountHead")
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

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost**
> Account v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost(authorization, organizationId, ledgerId, account, xRequestId)

Create a new account

Creates a new account within the specified ledger. Accounts represent individual financial entities like bank accounts, credit cards, or expense categories.

### Example
```kotlin
// Import classes:
//import com.midaz.client.onboarding.infrastructure.*
//import com.midaz.client.onboarding.models.*

val apiInstance = AccountsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token with format: Bearer {token}
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID in UUID format
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID in UUID format
val account : CreateAccountInput =  // CreateAccountInput | Account details including name, type, asset code, and optional parent account, portfolio, segment, and metadata
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID for tracing
try {
    val result : Account = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost(authorization, organizationId, ledgerId, account, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token with format: Bearer {token} | |
| **organizationId** | **kotlin.String**| Organization ID in UUID format | |
| **ledgerId** | **kotlin.String**| Ledger ID in UUID format | |
| **account** | [**CreateAccountInput**](CreateAccountInput.md)| Account details including name, type, asset code, and optional parent account, portfolio, segment, and metadata | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID for tracing | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

