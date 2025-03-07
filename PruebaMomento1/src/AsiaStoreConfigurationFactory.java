public class AsiaStoreConfigurationFactory implements StoreConfigurationFactory {
    @Override
    public StoreConfiguration createConfiguration() {
        return AsiaStoreConfiguration.getInstance();
    }
}
