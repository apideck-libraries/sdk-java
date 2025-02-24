# GetConsumerResponse

Consumer


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `statusCode`                                                            | *long*                                                                  | :heavy_check_mark:                                                      | HTTP Response Status Code                                               | 200                                                                     |
| `status`                                                                | *String*                                                                | :heavy_check_mark:                                                      | HTTP Response Status                                                    | OK                                                                      |
| `data`                                                                  | [Consumer](../../models/components/Consumer.md)                         | :heavy_check_mark:                                                      | N/A                                                                     |                                                                         |
| `raw`                                                                   | Map\<String, *Object*>                                                  | :heavy_minus_sign:                                                      | Raw response from the integration when raw=true query param is provided |                                                                         |