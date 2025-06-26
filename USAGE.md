<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.TaxRatesFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTaxRatesAllRequest;
import com.apideck.unify.models.operations.AccountingTaxRatesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingTaxRatesAllRequest req = AccountingTaxRatesAllRequest.builder()
                .serviceId("salesforce")
                .filter(TaxRatesFilter.builder()
                    .assets(true)
                    .equity(true)
                    .expenses(true)
                    .liabilities(true)
                    .revenue(true)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().taxRates().list()
                .request(req)
                .callAsStream()
                .forEach((AccountingTaxRatesAllResponse item) -> {
                   // handle page
                });

    }
}
```
<!-- End SDK Example Usage [usage] -->