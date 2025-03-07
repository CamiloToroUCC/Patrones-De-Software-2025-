// AsiaStoreConfiguration.java
public class AsiaStoreConfiguration implements StoreConfiguration {
    private static AsiaStoreConfiguration instance;
    private String currency;
    private String[] products;
    private String[] paymentMethods;

    private AsiaStoreConfiguration() {
        // Default configuration for Asia
        this.currency = "Yen";
        this.products = new String[]{"(Sushi)", "(bOOKSÇ)", "(ink)"};
        this.paymentMethods = new String[]{"(Credit Card)", "(Alipay)", "(WeChat Pay)"};
    }

    public static AsiaStoreConfiguration getInstance() {
        if (instance == null) {
            instance = new AsiaStoreConfiguration();
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
