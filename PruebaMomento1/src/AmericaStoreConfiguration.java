public class AmericaStoreConfiguration implements StoreConfiguration {
    private static AmericaStoreConfiguration instance;
    private String currency;
    private String[] products;
    private String[] paymentMethods;

    private AmericaStoreConfiguration() {
        this.currency = "USD";
        this.products = new String[]{"(Hamburger)", "(Gun)", "(Movie)"};
        this.paymentMethods = new String[]{"(Credit Card)", "(PayPal)", "(Apple Pay)"};
    }

    public static AmericaStoreConfiguration getInstance() {
        if (instance == null) {
            instance = new AmericaStoreConfiguration();
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
