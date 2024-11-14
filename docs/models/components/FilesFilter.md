# FilesFilter


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `driveId`                                                          | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | ID of the drive to filter on                                       | 1234                                                               |
| `folderId`                                                         | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | ID of the folder to filter on. The root folder has an alias "root" | root                                                               |
| `shared`                                                           | *Optional\<Boolean>*                                               | :heavy_minus_sign:                                                 | Only return files and folders that are shared                      | true                                                               |