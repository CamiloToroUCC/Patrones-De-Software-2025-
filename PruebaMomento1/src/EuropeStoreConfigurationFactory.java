public class EuropeStoreConfigurationFactory implements StoreConfigurationFactory {
    @Override
    public StoreConfiguration createConfiguration() {
        return EuropeStoreConfiguration.getInstance();
    }
}
