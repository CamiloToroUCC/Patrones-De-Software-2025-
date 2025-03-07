public class EuropeStoreConfiguration implements StoreConfiguration {
    private static EuropeStoreConfiguration instance;
    private String currency;
    private String[] products;
    private String[] paymentMethods;

    // Private constructor prevents external instantiation.
    private EuropeStoreConfiguration() {
        // Default configuration for Europe
        this.currency = "Euro";
        this.products = new String[]{"(Car)", "(Camara)0", "(Laptop)"};
        this.paymentMethods = new String[]{"(Credit Card)8", "(SEPA)", "(PayPal)"};
    }

    public static EuropeStoreConfiguration getInstance() {
        if (instance == null) {
            instance = new EuropeStoreConfiguration();
        }
        return instance;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String[] getProducts() {
        return products;
    }

    @Override
    public String[] getPaymentMethods() {
        return paymentMethods;
    }
}
