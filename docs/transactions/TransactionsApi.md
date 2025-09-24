# TransactionsApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/dsl | Create a Transaction using DSL |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions | Get all Transactions |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/inflow | Create a Transaction without passing from source |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/json | Create a Transaction using JSON |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/outflow | Create a Transaction without passing to distribution |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id}/cancel | Cancel a pre transaction |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id}/commit | Commit a Transaction |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet) | **GET** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id} | Get a Transaction by ID |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch) | **PATCH** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id} | Update a Transaction |
| [**v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost**](TransactionsApi.md#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost) | **POST** /v1/organizations/{organization_id}/ledgers/{ledger_id}/transactions/{transaction_id}/revert | Revert a Transaction |


<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost(authorization, organizationId, ledgerId, transaction, xRequestId)

Create a Transaction using DSL

Create a Transaction with the input DSL file

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transaction : java.io.File = BINARY_DATA_HERE // java.io.File | Transaction DSL file
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost(authorization, organizationId, ledgerId, transaction, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsDslPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transaction** | **java.io.File**| Transaction DSL file | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet**
> InlineResponse2005 v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)

Get all Transactions

Get all Transactions with the input metadata or without metadata

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
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
    val result : InlineResponse2005 = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet(authorization, organizationId, ledgerId, xRequestId, limit, startDate, endDate, sortOrder, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsGet")
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
| **sortOrder** | **kotlin.String**| Sort Order | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Cursor | [optional] |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost(authorization, organizationId, ledgerId, transaction, xRequestId)

Create a Transaction without passing from source

Create a Transaction with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transaction : CreateTransactionInflowSwaggerModel =  // CreateTransactionInflowSwaggerModel | Transaction Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost(authorization, organizationId, ledgerId, transaction, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsInflowPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transaction** | [**CreateTransactionInflowSwaggerModel**](CreateTransactionInflowSwaggerModel.md)| Transaction Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost(authorization, organizationId, ledgerId, transaction, xRequestId)

Create a Transaction using JSON

Create a Transaction with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transaction : GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModel =  // GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModel | Transaction Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost(authorization, organizationId, ledgerId, transaction, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsJsonPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transaction** | [**GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModel**](GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModel.md)| Transaction Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost(authorization, organizationId, ledgerId, transaction, xRequestId)

Create a Transaction without passing to distribution

Create a Transaction with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transaction : CreateTransactionOutflowSwaggerModel =  // CreateTransactionOutflowSwaggerModel | Transaction Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost(authorization, organizationId, ledgerId, transaction, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsOutflowPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transaction** | [**CreateTransactionOutflowSwaggerModel**](CreateTransactionOutflowSwaggerModel.md)| Transaction Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost(authorization, organizationId, ledgerId, transactionId, xRequestId)

Cancel a pre transaction

Cancel a previously created pre transaction

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost(authorization, organizationId, ledgerId, transactionId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCancelPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost(authorization, organizationId, ledgerId, transactionId, xRequestId)

Commit a Transaction

Commit a previously created transaction

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost(authorization, organizationId, ledgerId, transactionId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdCommitPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet(authorization, organizationId, ledgerId, transactionId, xRequestId)

Get a Transaction by ID

Get a Transaction with the input ID

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet(authorization, organizationId, ledgerId, transactionId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdGet")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch(authorization, organizationId, ledgerId, transactionId, transaction, xRequestId)

Update a Transaction

Update a Transaction with the input payload

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val transaction : UpdateTransactionInput =  // UpdateTransactionInput | Transaction Input
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch(authorization, organizationId, ledgerId, transactionId, transaction, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| **transaction** | [**UpdateTransactionInput**](UpdateTransactionInput.md)| Transaction Input | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost"></a>
# **v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost**
> Transaction v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost(authorization, organizationId, ledgerId, transactionId, xRequestId)

Revert a Transaction

Revert a Transaction with Transaction ID only

### Example
```kotlin
// Import classes:
//import com.midaz.client.transactions.infrastructure.*
//import com.midaz.client.transactions.models.*

val apiInstance = TransactionsApi()
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization Bearer Token
val organizationId : kotlin.String = organizationId_example // kotlin.String | Organization ID
val ledgerId : kotlin.String = ledgerId_example // kotlin.String | Ledger ID
val transactionId : kotlin.String = transactionId_example // kotlin.String | Transaction ID
val xRequestId : kotlin.String = xRequestId_example // kotlin.String | Request ID
try {
    val result : Transaction = apiInstance.v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost(authorization, organizationId, ledgerId, transactionId, xRequestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#v1OrganizationsOrganizationIdLedgersLedgerIdTransactionsTransactionIdRevertPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**| Authorization Bearer Token | |
| **organizationId** | **kotlin.String**| Organization ID | |
| **ledgerId** | **kotlin.String**| Ledger ID | |
| **transactionId** | **kotlin.String**| Transaction ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xRequestId** | **kotlin.String**| Request ID | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

