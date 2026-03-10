# SharedLinkTarget


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *Optional\<String>*                                            | :heavy_minus_sign:                                             | A unique identifier for an object.                             | 12345                                                          |
| `name`                                                         | *JsonNullable\<String>*                                        | :heavy_minus_sign:                                             | The name of the file                                           | sample.jpg                                                     |
| `type`                                                         | [JsonNullable\<FileType>](../../models/components/FileType.md) | :heavy_minus_sign:                                             | The type of resource. Could be file, folder or url             | file                                                           |
| `additionalProperties`                                         | Map\<String, *Object*>                                         | :heavy_minus_sign:                                             | N/A                                                            |                                                                |