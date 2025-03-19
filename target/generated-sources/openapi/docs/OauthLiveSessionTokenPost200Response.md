

# OauthLiveSessionTokenPost200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**diffieHellmanChallenge** | **String** | Diffie-Hellman challenge value used to compute live session token locally by client. |  [optional] |
|**liveSessionTokenSignature** | **String** | Signature value used to validate successful client-side computation of live session token. |  [optional] |
|**liveSessionTokenExpiration** | **Integer** | Unix timestamp in milliseconds of time of live session token computation by IB. Live session tokens are valid for 24 hours from this time. |  [optional] |



