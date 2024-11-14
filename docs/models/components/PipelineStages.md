# PipelineStages


## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `name`                                                                                               | *JsonNullable\<String>*                                                                              | :heavy_minus_sign:                                                                                   | The name of the Pipeline Stage.                                                                      | Contract Sent                                                                                        |
| `value`                                                                                              | *JsonNullable\<String>*                                                                              | :heavy_minus_sign:                                                                                   | The value of the Pipeline Stage.                                                                     | CONTRACT_SENT                                                                                        |
| `winProbability`                                                                                     | *JsonNullable\<Long>*                                                                                | :heavy_minus_sign:                                                                                   | The expected probability of winning an Opportunity in this Pipeline Stage. Valid values are [0-100]. | 50                                                                                                   |
| `displayOrder`                                                                                       | *JsonNullable\<Long>*                                                                                | :heavy_minus_sign:                                                                                   | The order in which the Pipeline Stage is displayed in the UI.                                        | 1                                                                                                    |