# OperationsApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet**](OperationsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{account_id}/operations | Get all Operations by account |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet**](OperationsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/accounts/{account_id}/operations/{operation_id} | Get Operation |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch**](OperationsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id}/operations/{operation_id} | Update an Operation |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet**
> InlineResponse2001 v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet(authorization, organizationId, ledgerId, accountId, xRequestId, limit, startDate, endDate, sortOrder, cursor, type)

Get all Operations by account

Get all Operations with the input ID

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationsApi()
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
val type : kotlin.String = type_example // kotlin.String | DEBIT, CREDIT
try {
    val result : InlineResponse2001 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet(authorization, organizationId, ledgerId, accountId, xRequestId, limit, startDate, endDate, sortOrder, cursor, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsGet")
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
| **cursor** | **kotlin.String**| Cursor | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| DEBIT, CREDIT | [optional] |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet**
> Operation v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet(authorization, organizationId, ledgerId, accountId, operationId, xRequestId)

Get Operation

Get an Operation with the input ID

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val accountId : kotlin.String = accountId_example // kotlin.String | Account ID
val operationId : kotlin.String = operationId_example // kotlin.String | Operation ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Operation = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet(authorization, organizationId, ledgerId, accountId, operationId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdAccountsAccountIdOperationsOperationIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **accountId** | **kotlin.String**| Account ID | |
| **operationId** | **kotlin.String**| Operation ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch**
> Operation v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch(authorization, organizationId, ledgerId, transactionId, operationId, operation, xRequestId)

Update an Operation

Update an Operation with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = OperationsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val operationId : kotlin.String = operationId_example // kotlin.String | Operation ID
val operation : UpdateOperationInput =  // UpdateOperationInput | Operation Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Operation = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch(authorization, organizationId, ledgerId, transactionId, operationId, operation, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OperationsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdOperationsOperationIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| **operationId** | **kotlin.String**| Operation ID | |
| **operation** | [**UpdateOperationInput**](UpdateOperationInput.md)| Operation Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

