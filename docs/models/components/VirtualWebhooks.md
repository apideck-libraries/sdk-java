# VirtualWebhooks

Virtual webhook config for the connector.


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `requestRate`                                                                               | [RequestRate](../../models/components/RequestRate.md)                                       | :heavy_check_mark:                                                                          | The rate at which requests for resources will be made to downstream.                        |
| `resources`                                                                                 | Map\<String, [WebhookSupportResources](../../models/components/WebhookSupportResources.md)> | :heavy_minus_sign:                                                                          | The resources that will be requested from downstream.                                       |