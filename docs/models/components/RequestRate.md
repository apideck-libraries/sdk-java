# RequestRate

The rate at which requests for resources will be made to downstream.


## Fields

| Field                                   | Type                                    | Required                                | Description                             |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `rate`                                  | *long*                                  | :heavy_check_mark:                      | The number of requests per window unit. |
| `size`                                  | *long*                                  | :heavy_check_mark:                      | Size of request window.                 |
| `unit`                                  | [Unit](../../models/components/Unit.md) | :heavy_check_mark:                      | The window unit for the rate.           |