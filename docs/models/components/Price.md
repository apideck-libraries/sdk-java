# Price

Price of the message.


## Fields

| Field                                                                                                                              | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        | Example                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `perUnit`                                                                                                                          | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | 0.01                                                                                                                               |
| `totalAmount`                                                                                                                      | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | 0.01                                                                                                                               |
| `currency`                                                                                                                         | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                     | :heavy_minus_sign:                                                                                                                 | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). | USD                                                                                                                                |