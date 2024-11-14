# BalanceSheetEquityAccount

A balance sheet equity account represents the financial position of a company at a specific point in time.


## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `accountId`                            | *Optional\<String>*                    | :heavy_minus_sign:                     | The unique identifier for the account. | 123456                                 |
| `code`                                 | *Optional\<String>*                    | :heavy_minus_sign:                     | The account code of the account        | 1100                                   |
| `name`                                 | *Optional\<String>*                    | :heavy_minus_sign:                     | The name of the account.               | Current assets                         |
| `value`                                | *Optional\<Double>*                    | :heavy_minus_sign:                     | The amount or value of the item        | 1000                                   |
| `items`                                | *Optional\<Object>*                    | :heavy_minus_sign:                     | A list of balance sheet accounts       |                                        |