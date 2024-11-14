# EcommerceAddress

An object representing a shipping or billing address.


## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `line1`                                 | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Address line 1 of the billing address.  | 123 Main Street                         |
| `line2`                                 | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Address line 2 of the billing address.  | Apt 1                                   |
| `companyName`                           | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Company name of the customer            | Acme Inc.                               |
| `city`                                  | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | City of the billing address.            | New York                                |
| `state`                                 | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | State/province of the billing address.  | NY                                      |
| `postalCode`                            | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Postal/ZIP code of the billing address. | 10001                                   |
| `country`                               | *JsonNullable\<String>*                 | :heavy_minus_sign:                      | Country of the billing address.         | US                                      |