# ListType

Whether the List is static (a fixed set of records) or dynamic (a saved segment that is automatically kept up to date based on filter criteria).

## Example Usage

```java
import com.apideck.unify.models.components.ListType;

ListType value = ListType.STATIC;

// Open enum: use .of() to create instances from custom string values
ListType custom = ListType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `STATIC`  | static    |
| `DYNAMIC` | dynamic   |