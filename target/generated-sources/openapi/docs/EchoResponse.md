

# EchoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestMethod** | [**RequestMethodEnum**](#RequestMethodEnum) |  |  |
|**securityPolicy** | [**SecurityPolicyEnum**](#SecurityPolicyEnum) |  |  |
|**queryParameters** | **Object** |  |  [optional] |



## Enum: RequestMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PATCH | &quot;PATCH&quot; |
| PUT | &quot;PUT&quot; |



## Enum: SecurityPolicyEnum

| Name | Value |
|---- | -----|
| HTTPS | &quot;HTTPS&quot; |
| SIGNED_JWT | &quot;SIGNED_JWT&quot; |
| ENCRYPTED_JWE | &quot;ENCRYPTED_JWE&quot; |



