# openapi-docs-bug
Quarkus Smallrye OpenAPI additional docs native executable bug.  Unit test run in JVM shows the generated OpenAPI spec includes relevant securityScheme values
set via `quarkus.smallrye-openapi.additional-docs-directory` property.  Integration test of native executable shows the generated spec is missing any securityScheme
values.
