# BalancesApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{account_id}/balances | Get all balances by account id |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/alias/{alias}/balances | Get Balances using Alias |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/external/{code}/balances | Get External balances using code |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete) | **DELETE** /v1/organizations/{organization_id}/ledgers/{ledger_id}/balances/{balance_id} | Delete Balance by account |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/balances/{balance_id} | Get Balance by id |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/balances/{balance_id} | Update Balance |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet**](BalancesApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/balances | Get all balances |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet**
> InlineResponse200 v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet(authorization, organizationId, ledgerId, accountId, xRequestId, limit, startDate, endDate, sortOrder, cursor)

Get all balances by account id

Get all balances by account id

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val startDate : kotlin.String = startDate_example // kotlin.String | Start Date
val endDate : kotlin.String = endDate_example // kotlin.String | End Date
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort Order
val cursor : kotlin.String = cursor_example // kotlin.String | Cursor
try {
    val result : InlineResponse200 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet(authorization, organizationId, ledgerId, accountId, xRequestId, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdBalancesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **accountId** | **kotlin.String**| Account ID | |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |
| **limit** | **kotlin.Int**| Limit | [optional] [default to 10] |
| **startDate** | **kotlin.String**| Start Date | [optional] |
| **endDate** | **kotlin.String**| End Date | [optional] |
| **sortOrder** | **kotlin.String**| Sort Order | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Cursor | [optional] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet**
> InlineResponse200 v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet(authorization, organizationId, ledgerId, alias, xRequestId)

Get Balances using Alias

Get Balances with alias

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val alias : kotlin.String = alias_example // kotlin.String | Alias (e.g. @person1)
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : InlineResponse200 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet(authorization, organizationId, ledgerId, alias, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAliasAliasBalancesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **alias** | **kotlin.String**| Alias (e.g. @person1) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet**
> InlineResponse200 v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet(authorization, organizationId, ledgerId, code, xRequestId)

Get External balances using code

Get External balances with code

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val code : kotlin.String = code_example // kotlin.String | Code (e.g. BRL)
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : InlineResponse200 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet(authorization, organizationId, ledgerId, code, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsExternalCodeBalancesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **code** | **kotlin.String**| Code (e.g. BRL) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete**
> kotlin.String v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete(authorization, organizationId, ledgerId, balanceId, xRequestId)

Delete Balance by account

Delete a Balance with the input ID

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val balanceId : kotlin.String = balanceId_example // kotlin.String | Balance ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : kotlin.String = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete(authorization, organizationId, ledgerId, balanceId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **balanceId** | **kotlin.String**| Balance ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet**
> MmodelBalance v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet(authorization, organizationId, ledgerId, balanceId, xRequestId)

Get Balance by id

Get a Balance with the input ID

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val balanceId : kotlin.String = balanceId_example // kotlin.String | Balance ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : MmodelBalance = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet(authorization, organizationId, ledgerId, balanceId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **balanceId** | **kotlin.String**| Balance ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**MmodelBalance**](MmodelBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch**
> MmodelBalance v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch(authorization, organizationId, ledgerId, balanceId, balance, xRequestId)

Update Balance

Update a Balance with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val balanceId : kotlin.String = balanceId_example // kotlin.String | Balance ID
val balance : UpdateBalance =  // UpdateBalance | Balance Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : MmodelBalance = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch(authorization, organizationId, ledgerId, balanceId, balance, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesBalanceIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **balanceId** | **kotlin.String**| Balance ID | |
| **balance** | [**UpdateBalance**](UpdateBalance.md)| Balance Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**MmodelBalance**](MmodelBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet**
> InlineResponse200 v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)

Get all balances

Get all balances

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = BalancesApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val startDate : kotlin.String = startDate_example // kotlin.String | Start Date
val endDate : kotlin.String = endDate_example // kotlin.String | End Date
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | Sort Order
val cursor : kotlin.String = cursor_example // kotlin.String | Cursor
try {
    val result : InlineResponse200 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#v1OrganizationsOrganizationIdLedgersLedgerIdBalancesGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |
| **limit** | **kotlin.Int**| Limit | [optional] [default to 10] |
| **startDate** | **kotlin.String**| Start Date | [optional] |
| **endDate** | **kotlin.String**| End Date | [optional] |
| **sortOrder** | **kotlin.String**| Sort Order | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Cursor | [optional] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

