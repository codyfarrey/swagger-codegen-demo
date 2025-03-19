

# SsoValidateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**USER_ID** | **Integer** | Internal user identifier. |  [optional] |
|**USER_NAME** | **String** | current username logged in for the session. |  [optional] |
|**RESULT** | **Boolean** | Confirms if validation was successful. True if session was validated; false if not. |  [optional] |
|**AUTH_TIME** | **Integer** | Returns the time of authentication in epoch time. |  [optional] |
|**SF_ENABLED** | **Boolean** | (Internal use only) |  [optional] |
|**IS_FREE_TRIAL** | **Boolean** | Returns if the account is a trial account or a funded account. |  [optional] |
|**CREDENTIAL** | **String** | Returns the underlying username of the account. |  [optional] |
|**IP** | **String** | Internal use only. Does not reflect the IP address of the user. |  [optional] |
|**EXPIRES** | **Integer** | Returns the time until SSO session expiration in milliseconds. |  [optional] |
|**QUALIFIED_FOR_MOBILE_AUTH** | **Boolean** | Returns if the customer requires two factor authentication. |  [optional] |
|**LANDING_APP** | **String** | Used for Client Portal (Internal use only) |  [optional] |
|**IS_MASTER** | **Boolean** | Returns whether the account is a master account (true) or subaccount (false). |  [optional] |
|**lastAccessed** | **Integer** | Returns the last time the user was accessed in epoch time. |  [optional] |
|**loginType** | **Integer** | Returns the login type. 1 for Live, 2 for Paper |  [optional] |
|**PAPER_USER_NAME** | **String** | Returns the paper username for the account. |  [optional] |
|**features** | [**SsoValidateResponseFeatures**](SsoValidateResponseFeatures.md) |  |  [optional] |
|**region** | **String** | Returns the region connected to internally. |  [optional] |



