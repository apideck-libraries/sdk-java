# IssuesFilter


## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `status`                                                                                               | List\<*String*>                                                                                        | :heavy_minus_sign:                                                                                     | Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match | [<br/>"closed"<br/>]                                                                                   |
| `since`                                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)              | :heavy_minus_sign:                                                                                     | Only return tickets since a specific date                                                              | 2020-09-30T07:43:32.000Z                                                                               |
| `assigneeId`                                                                                           | *Optional\<String>*                                                                                    | :heavy_minus_sign:                                                                                     | Only return tickets assigned to a specific user                                                        | 2332bd9c2eaaa5dcfa14721c                                                                               |