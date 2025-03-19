

# GetStatementsResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | **String** | the data type of the value after decoding |  [optional] |
|**encoding** | **String** | encoding used for the value |  [optional] |
|**value** | **String** | Base 64 encoded String of byte[]. Byte[] represents compressed data when gzip is true |  [optional] |
|**mimeType** | **String** | mimeType of document after decoding and serializing the value |  [optional] |
|**gzip** | **Boolean** | content encoding flag. Represents whether the response is compressed |  [optional] |
|**accept** | **String** | specify response media types that are acceptable |  [optional] |



