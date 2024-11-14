# Variations


## Fields

| Field                                                                                                                              | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        | Example                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                               | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | A unique identifier for an object.                                                                                                 | 12345                                                                                                                              |
| `name`                                                                                                                             | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | Variation                                                                                                                          |
| `sku`                                                                                                                              | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | 11910345                                                                                                                           |
| `itemId`                                                                                                                           | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | A unique identifier for an object.                                                                                                 | 12345                                                                                                                              |
| `sequence`                                                                                                                         | *JsonNullable\<Double>*                                                                                                            | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | 1                                                                                                                                  |
| `pricingType`                                                                                                                      | [Optional\<ItemPricingType>](../../models/components/ItemPricingType.md)                                                           | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | fixed                                                                                                                              |
| `priceAmount`                                                                                                                      | *Optional\<Double>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | 10                                                                                                                                 |
| `priceCurrency`                                                                                                                    | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                     | :heavy_minus_sign:                                                                                                                 | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). | USD                                                                                                                                |
| `stockable`                                                                                                                        | *Optional\<Boolean>*                                                                                                               | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | false                                                                                                                              |
| `presentAtAllLocations`                                                                                                            | *Optional\<Boolean>*                                                                                                               | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                | false                                                                                                                              |
| `version`                                                                                                                          | *JsonNullable\<String>*                                                                                                            | :heavy_minus_sign:                                                                                                                 | The user who last updated the object.                                                                                              | 12345                                                                                                                              |
| `updatedAt`                                                                                                                        | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                          | :heavy_minus_sign:                                                                                                                 | The date and time when the object was last updated.                                                                                | 2020-09-30T07:43:32.000Z                                                                                                           |
| `createdAt`                                                                                                                        | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                          | :heavy_minus_sign:                                                                                                                 | The date and time when the object was created.                                                                                     | 2020-09-30T07:43:32.000Z                                                                                                           |