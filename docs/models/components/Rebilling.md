# Rebilling

Rebilling metadata for this line item.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `rebillable`                                                           | *Optional\<Boolean>*                                                   | :heavy_minus_sign:                                                     | Whether this line item is eligible for rebilling.                      | true                                                                   |
| `rebillStatus`                                                         | [JsonNullable\<RebillStatus>](../../models/components/RebillStatus.md) | :heavy_minus_sign:                                                     | Status of the rebilling process for this line item.                    | billed                                                                 |
| `linkedTransactionId`                                                  | *JsonNullable\<String>*                                                | :heavy_minus_sign:                                                     | The ID of the transaction this line item was rebilled to.              | txn_abc123                                                             |
| `linkedTransactionLineId`                                              | *JsonNullable\<String>*                                                | :heavy_minus_sign:                                                     | The ID of the line item in the rebilled transaction.                   | line_xyz789                                                            |