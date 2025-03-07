public class AmericaStoreConfigurationFactory implements StoreConfigurationFactory {
    @Override
    public StoreConfiguration createConfiguration() {
        return AmericaStoreConfiguration.getInstance();
    }
}
