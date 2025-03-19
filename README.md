### [OpenAPI Generator (formerly known as Swagger Codegen)](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)

1. Clone the project
2. Run the command `./mvnw clean compile`
3. View generated models in `target/generated-sources/openapi/src/main/java`

Ideally, you would add the above generated path (step 3) to your Maven or Gradle classpath in your project so that you can directly import the models in your code.

This may not always be possible especially if the API you want to integrate with doesn't have a valid api-spec.
If you want to still take advantage of OpenAPI Generator functionality, you can use this project to reference the generated models while you manually create yours.

Plugin Configuration, including output directory of generated files, found in [pom.xml (Line 63-70)](https://github.com/codyfarrey/swagger-codegen-demo/blob/main/pom.xml#L63-L70)
