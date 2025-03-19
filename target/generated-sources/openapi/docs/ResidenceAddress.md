

# ResidenceAddress

Provide the residential address where the applicant physically resides. <br><ul><li>If the mailing address is different from the address provided in Residence element, THEN you will also include MailingAddress element.</li><li>Post Office Box is not accepted for Residential Address.</li><li>Our system validates street_1 and street_2 included within Residence attribute to ensure Post Office Box address is not provided.</li><li>An error will be thrown if the below combinations are included within street_1 OR street_2:</li><ul><li>PB</li><li>PO Box</li><li>Post Office Box</li><li>P.O. Box</li><li>In care of</li><li>General Delivery</li><li>Regular Expression to validate street_1 and street_2:</li></ul></ul>English: (?:P(?:ost(?:al)?)?[\\.\\-\\s]*(?:(?:O(?:ffice)?[\\.\\s]*)?B(?:ox|in|\\b|\\d)|o(?:ffice|\\b)(?:[-\\s]*\\d)|code)|box[-\\s]*\\d)<br>Chinese Simplified: PO Box    (?i)\\b((邮政信箱) [0-9]*)\\bChinese Traditional: PO Box   (?i)\\b((郵政信箱) [0-9]*)\\b

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**street1** | **String** | Street which applicant resides |  [optional] |
|**street2** | **String** | Street which applicant resides |  [optional] |
|**city** | **String** | City which the applicant resides. |  [optional] |
|**state** | **String** | State/Province which the applicant resides. |  [optional] |
|**country** | **String** | Country which the applicant resides. |  [optional] |
|**postalCode** | **String** | Postal / Zip code.For countries that do not provide postal code, please enter 00000 |  [optional] |



