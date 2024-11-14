# UploadSession


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                              | *Optional\<String>*                                                                                                               | :heavy_minus_sign:                                                                                                                | A unique identifier for an object.                                                                                                | 12345                                                                                                                             |
| `success`                                                                                                                         | *Optional\<Boolean>*                                                                                                              | :heavy_minus_sign:                                                                                                                | Indicates if the upload session was completed successfully.                                                                       | true                                                                                                                              |
| `partSize`                                                                                                                        | *Optional\<Double>*                                                                                                               | :heavy_minus_sign:                                                                                                                | Size in bytes of each part of the file that you will upload. Uploaded parts need to be this size for the upload to be successful. | 1000000                                                                                                                           |
| `parallelUploadSupported`                                                                                                         | *Optional\<Boolean>*                                                                                                              | :heavy_minus_sign:                                                                                                                | Indicates if parts of the file can uploaded in parallel.                                                                          | true                                                                                                                              |
| `uploadedByteRange`                                                                                                               | *Optional\<String>*                                                                                                               | :heavy_minus_sign:                                                                                                                | The range of bytes that was successfully uploaded.                                                                                | 0-42                                                                                                                              |
| `expiresAt`                                                                                                                       | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                         | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               | 2022-09-30T07:43:32.000Z                                                                                                          |