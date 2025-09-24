
# GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **chartOfAccountsGroupName** | **kotlin.String** | Chart of accounts group name for accounting purposes example: FUNDING maxLength: 256 |  [optional] |
| **code** | **kotlin.String** | Transaction code for reference example: TR12345 maxLength: 100 |  [optional] |
| **description** | **kotlin.String** | Human-readable description of the transaction example: New Transaction maxLength: 256 |  [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional custom attributes example: {\&quot;reference\&quot;: \&quot;TRANSACTION-001\&quot;, \&quot;source\&quot;: \&quot;api\&quot;} |  [optional] |
| **pending** | **kotlin.Boolean** | Whether the transaction should be created in pending state example: true swagger: type boolean |  [optional] |
| **send** | [**GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModelSend**](GithubComLerianStudioMidazV3ComponentsTransactionInternalAdaptersPostgresTransactionCreateTransactionSwaggerModelSend.md) |  |  [optional] |



