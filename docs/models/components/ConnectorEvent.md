# ConnectorEvent

Unify event that is supported on the connector. Events are delivered via Webhooks.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `eventType`                                                      | *Optional\<String>*                                              | :heavy_minus_sign:                                               | Unify event type                                                 | employee.created                                                 |
| `eventSource`                                                    | [Optional\<EventSource>](../../models/components/EventSource.md) | :heavy_minus_sign:                                               | Unify event source                                               | native                                                           |
| `downstreamEventType`                                            | *Optional\<String>*                                              | :heavy_minus_sign:                                               | Downstream event type                                            | person_created                                                   |
| `resources`                                                      | List\<*String*>                                                  | :heavy_minus_sign:                                               | N/A                                                              |                                                                  |
| `entityType`                                                     | *Optional\<String>*                                              | :heavy_minus_sign:                                               | Unify entity type                                                | employee                                                         |