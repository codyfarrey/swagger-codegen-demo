

# BrokerageSessionInitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publish** | **Boolean** | publish brokerage session token at the same time when brokerage session initialized. If set false, then session token should be published before calling init. Setting true is preferred way. |  [optional] |
|**compete** | **Boolean** | Determines if other brokerage sessions should be disconnected to prioritize this connection. |  [optional] |



