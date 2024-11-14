# ConnectorResource


## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *Optional\<String>*                                                                                      | :heavy_minus_sign:                                                                                       | ID of the resource, typically a lowercased version of name.                                              | companies                                                                                                |
| `name`                                                                                                   | *Optional\<String>*                                                                                      | :heavy_minus_sign:                                                                                       | Name of the resource (plural)                                                                            | Companies                                                                                                |
| `downstreamId`                                                                                           | *Optional\<String>*                                                                                      | :heavy_minus_sign:                                                                                       | ID of the resource in the Connector's API (downstream)                                                   | accounts                                                                                                 |
| `downstreamName`                                                                                         | *Optional\<String>*                                                                                      | :heavy_minus_sign:                                                                                       | Name of the resource in the Connector's API (downstream)                                                 | Accounts                                                                                                 |
| `status`                                                                                                 | [Optional\<ResourceStatus>](../../models/components/ResourceStatus.md)                                   | :heavy_minus_sign:                                                                                       | Status of the resource. Resources with status live or beta are callable.                                 |                                                                                                          |
| `paginationSupported`                                                                                    | *Optional\<Boolean>*                                                                                     | :heavy_minus_sign:                                                                                       | Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource. |                                                                                                          |
| `pagination`                                                                                             | [Optional\<PaginationCoverage>](../../models/components/PaginationCoverage.md)                           | :heavy_minus_sign:                                                                                       | N/A                                                                                                      |                                                                                                          |
| `customFieldsSupported`                                                                                  | *Optional\<Boolean>*                                                                                     | :heavy_minus_sign:                                                                                       | Indicates if custom fields are supported on this resource.                                               |                                                                                                          |
| `supportedOperations`                                                                                    | List\<*String*>                                                                                          | :heavy_minus_sign:                                                                                       | List of supported operations on the resource.                                                            | [<br/>"all",<br/>"one",<br/>"add",<br/>"update",<br/>"delete"<br/>]                                      |
| `downstreamUnsupportedOperations`                                                                        | List\<*String*>                                                                                          | :heavy_minus_sign:                                                                                       | List of operations that are not supported on the downstream.                                             | [<br/>"upload"<br/>]                                                                                     |
| `supportedFilters`                                                                                       | List\<*String*>                                                                                          | :heavy_minus_sign:                                                                                       | Supported filters on the list endpoint of the resource.                                                  | [<br/>"name",<br/>"email"<br/>]                                                                          |
| `supportedSortBy`                                                                                        | List\<*String*>                                                                                          | :heavy_minus_sign:                                                                                       | Supported sorting properties on the list endpoint of the resource.                                       | [<br/>"updated_at",<br/>"created_at",<br/>"name"<br/>]                                                   |
| `supportedFields`                                                                                        | List\<[SupportedProperty](../../models/components/SupportedProperty.md)>                                 | :heavy_minus_sign:                                                                                       | Supported fields on the detail endpoint.                                                                 |                                                                                                          |
| `supportedListFields`                                                                                    | List\<[SupportedProperty](../../models/components/SupportedProperty.md)>                                 | :heavy_minus_sign:                                                                                       | Supported fields on the list endpoint.                                                                   |                                                                                                          |