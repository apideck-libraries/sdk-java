# ConnectorDoc


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `id`                                                                            | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | A unique identifier for an object.                                              | 12345                                                                           |
| `name`                                                                          | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | Name of the doc.                                                                | connection                                                                      |
| `audience`                                                                      | [Optional\<Audience>](../../models/components/Audience.md)                      | :heavy_minus_sign:                                                              | Audience for the doc.                                                           |                                                                                 |
| `format`                                                                        | [Optional\<Format>](../../models/components/Format.md)                          | :heavy_minus_sign:                                                              | Format of the doc.                                                              |                                                                                 |
| `url`                                                                           | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | Link to fetch the content of the doc.                                           | https://unify.apideck.com/connector/connectors/workday/docs/consumer+connection |