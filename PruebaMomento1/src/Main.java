public class Main {
    public static void main(String[] args) {

        // Confi de Europa
        StoreConfigurationFactory europeFactory = new EuropeStoreConfigurationFactory();
        StoreConfiguration europeConfig = europeFactory.createConfiguration();
        System.out.println("Europe Store Configuration:");
        printConfiguration(europeConfig);

        System.out.println("--------------------------------------------------");

        // Confi USA
        StoreConfigurationFactory americaFactory = new AmericaStoreConfigurationFactory();
        StoreConfiguration americaConfig = americaFactory.createConfiguration();
        System.out.println("America Store Configuration:");
        printConfiguration(americaConfig);

        System.out.println("--------------------------------------------------");

        // cConfi Asia
        StoreConfigurationFactory asiaFactory = new AsiaStoreConfigurationFactory();
        StoreConfiguration asiaConfig = asiaFactory.createConfiguration();
        System.out.println("Asia Store Configuration:");
        printConfiguration(asiaConfig);
    }

    private static void printConfiguration(StoreConfiguration config) {
        System.out.println("Currency: " + config.getCurrency());

        System.out.print("Products: ");
        for (String product : config.getProducts()) {
            System.out.print(product + " ");
        }
        System.out.println();

        System.out.print("Payment Methods: ");
        for (String method : config.getPaymentMethods()) {
            System.out.print(method + " ");
        }
        System.out.println("\n");
    }
}
