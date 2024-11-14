# OrderStatus

Order status. Clover specific: If no value is set, the status defaults to hidden, which indicates a hidden order. A hidden order is not displayed in user interfaces and can only be retrieved by its id. When creating an order via the REST API the value must be manually set to 'open'. More info [https://docs.clover.com/reference/orderupdateorder]()


## Values

| Name        | Value       |
| ----------- | ----------- |
| `OPEN`      | open        |
| `DRAFT`     | draft       |
| `DELIVERED` | delivered   |
| `DELAYED`   | delayed     |
| `VOIDED`    | voided      |
| `COMPLETED` | completed   |
| `HIDDEN`    | hidden      |