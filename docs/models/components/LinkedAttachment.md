# LinkedAttachment


## Fields

| Field                            | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `name`                           | *JsonNullable\<String>*          | :heavy_minus_sign:               | The name of the file             | sample.jpg                       |
| `mimeType`                       | *JsonNullable\<String>*          | :heavy_minus_sign:               | The MIME type of the file.       | image/jpeg                       |
| `isCompressed`                   | *JsonNullable\<Boolean>*         | :heavy_minus_sign:               | Whether the file is c ompressed. | false                            |
| `encoding`                       | *JsonNullable\<String>*          | :heavy_minus_sign:               | The encoding of the file.        | base64                           |
| `content`                        | *JsonNullable\<String>*          | :heavy_minus_sign:               | The content of the file.         | data:image/jpeg;base64,...       |
| `notes`                          | *JsonNullable\<String>*          | :heavy_minus_sign:               | The notes of the file.           | A sample image                   |