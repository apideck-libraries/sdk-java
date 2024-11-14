# CreateFolderRequest


## Fields

| Field                                                                                                                                                                                       | Type                                                                                                                                                                                        | Required                                                                                                                                                                                    | Description                                                                                                                                                                                 | Example                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                                                                      | *String*                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                          | The name of the folder.                                                                                                                                                                     | Documents                                                                                                                                                                                   |
| `description`                                                                                                                                                                               | *Optional\<String>*                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                          | Optional description of the folder.                                                                                                                                                         | My Personal Documents                                                                                                                                                                       |
| `parentFolderId`                                                                                                                                                                            | *String*                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                          | The parent folder to create the new file within. This can be an ID or a path depending on the downstream folder. Please see the connector section below to see downstream specific gotchas. | 1234                                                                                                                                                                                        |
| `driveId`                                                                                                                                                                                   | *Optional\<String>*                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                          | ID of the drive to create the folder in.                                                                                                                                                    | 1234                                                                                                                                                                                        |
| `passThrough`                                                                                                                                                                               | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                          | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.                                     |                                                                                                                                                                                             |