

# Identification

Identification information of the associated person.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**citizenship** | **String** | Citizenship of the applicant.&lt;br&gt;If citizenship, citizenship2, OR citizenship3 is classified as a ‘Prohibited Country&#39;, THEN ProhibitedCountryQuestionnaire is required.&lt;br&gt;List of Prohibited Countries an be obtained using /getEnumerations&lt;br&gt;Preferred id document by IssuingCountry |  [optional] |
|**citizenship2** | **String** | If the applicant has multiple citizenship, provide the additional citizenship of the applicant.&lt;br&gt;If citizenship, citizenship2, OR citizenship3 is classified as a ‘Prohibited Country&#39;, THEN ProhibitedCountryQuestionnaire is required.&lt;br&gt;List of Prohibited Countries an be obtained using /getEnumerations&lt;br&gt;Preferred id document by IssuingCountry |  [optional] |
|**citizenship3** | **String** | If the applicant has multiple citizenship, provide the additional citizenship of the applicant.&lt;br&gt;If citizenship, citizenship2, OR citizenship3 is classified as a ‘Prohibited Country&#39;, THEN ProhibitedCountryQuestionnaire is required.&lt;br&gt;List of Prohibited Countries an be obtained using /getEnumerations&lt;br&gt;Preferred id document by IssuingCountry |  [optional] |
|**ssn** | **String** | Social security number, required for US Residents and citizens. |  [optional] |
|**sin** | **String** | Social insurance number, required for Canada Residents and citizens. |  [optional] |
|**driversLicense** | **String** | Drivers License&lt;br&gt;Pattern for AUS: ^.{0,64}$&lt;br&gt;Pattern for NZL: ^[A-Z]{2}\\d{6}$ |  [optional] |
|**passport** | **String** | Passport |  [optional] |
|**alienCard** | **String** | Alien Card |  [optional] |
|**medicareCard** | **String** | Only applicable for Australia residents. |  [optional] |
|**cardColor** | [**CardColorEnum**](#CardColorEnum) | Required if MedicareCard is provided. |  [optional] |
|**medicareReference** | **String** | Required if MedicareCard is provided. |  [optional] |
|**nationalCard** | **String** | National Identification Card&lt;br&gt;Pattern by Country-&lt;br&gt; ARG: ^\\d{8}$&lt;br&gt;AUS: ^(\\d{8}|\\d{9})$&lt;br&gt;BRA: ^\\d{11}$&lt;br&gt;CHN: ^\\d{17}(\\d|X)$&lt;br&gt;DNK: ^\\d{10}$&lt;br&gt;ESP: ^\\d{8}[A-Z]$&lt;br&gt;FRA: ^\\d{15}$&lt;br&gt;FRA: ^\\d{4}([A-Z]|\\d){3}\\d{5}$&lt;br&gt;ITA: ^([A-Z]{2}\\d{7}|\\d{7}[A-Z]{2}|[A-Z]{2}\\d{5}[A-Z]{2})$&lt;br&gt;ITA: ^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$&lt;br&gt;MEX: ^[A-Z]{4}\\d{6}[A-Z]{6}\\d{2}$&lt;br&gt;MYZ: ^\\d{12}$&lt;br&gt;RUS: ^\\d{10}$&lt;br&gt;RUS: ^\\d{9}$&lt;br&gt;SGP: ^[A-Z]\\d{7}[A-Z]$&lt;br&gt;SWE: ^(\\d{10}|\\d{12})$&lt;br&gt;TUR: ^\\d{11}$&lt;br&gt;ZAF: ^\\d{13}$ |  [optional] |
|**issuingCountry** | **String** | Issuing country of the ID document. |  [optional] |
|**issuingState** | **String** | Issuing state of the ID document. |  [optional] |
|**rta** | **String** | Only applicable IF ID_Type&#x3D;DriversLicense AND IssuingCountry&#x3D;AUS |  [optional] |
|**legalResidenceCountry** | **String** |  |  [optional] |
|**legalResidenceState** | **String** |  |  [optional] |
|**educationalQualification** | **String** |  |  [optional] |
|**fathersName** | **String** |  |  [optional] |
|**greenCard** | **Boolean** |  |  [optional] |
|**panNumber** | **String** | India PanCard, required for India Residents and citizens. |  [optional] |
|**taxId** | **String** | Tax ID TIN within &lt;TaxResidencies&gt;foreign_tax_id within &lt;W8Ben&gt; |  [optional] |
|**proofOfAgeCard** | **String** |  |  [optional] |
|**expire** | **Boolean** | Indicate IF ID document has an ExpirationDate. |  [optional] |
|**expirationDate** | **LocalDate** | Provide expiration date of the ID document. Cannot be past date. |  [optional] |



## Enum: CardColorEnum

| Name | Value |
|---- | -----|
| BLUE | &quot;BLUE&quot; |
| GREEN | &quot;GREEN&quot; |
| YELLOW | &quot;YELLOW&quot; |



