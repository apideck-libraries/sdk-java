# LinkedTaxDetail


## Fields

| Field                                 | Type                                  | Required                              | Description                           | Example                               |
| ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| `type`                                | *Optional\<String>*                   | :heavy_minus_sign:                    | The type of tax.                      | GST on Purchases                      |
| `number`                              | *JsonNullable\<String>*               | :heavy_minus_sign:                    | The number of the tax.                | 123456                                |
| `isTransactionTax`                    | *Optional\<Boolean>*                  | :heavy_minus_sign:                    | Whether the tax is a transaction tax. | true                                  |
| `isPrimaryTax`                        | *Optional\<Boolean>*                  | :heavy_minus_sign:                    | Whether the tax is a primary tax.     | true                                  |