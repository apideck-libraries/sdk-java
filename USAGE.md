<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.TaxRatesFilter;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingTaxRatesAllRequest;
import com.apideck.unify.models.operations.AccountingTaxRatesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
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

        AccountingTaxRatesAllResponse res = sdk.accounting().taxRates().list()
                .request(req)
                .call();

        if (res.getTaxRatesResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->