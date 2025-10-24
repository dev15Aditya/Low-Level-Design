
import java.util.Properties;

public class ConfigManager {
    private static volatile ConfigManager instance;
    private Properties config;

    private ConfigManager() {
        config = new Properties();
        config.setProperty("env", "production");
    }

    public static ConfigManager getInstance(){
        if(instance == null){
            synchronized (ConfigManager.class) {
                if(instance == null) {
                    instance = new ConfigManager();
                }
            }
        }

        return instance;
    }

    public String get(String key) {
        return config.getProperty(key);
    }
}
