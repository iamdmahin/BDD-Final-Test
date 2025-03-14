package utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import lombok.experimental.UtilityClass;
import models.EnvData;

@UtilityClass
public class EnvDataReader {
    private static final String ENVIRONMENT_PATH = JsonReader.getResourcesPath() + "environment/";
    private static final ISettingsFile ENVIRONMENT_CONFIG = new JsonSettingsFile("env.json");

    private static String getCurrentEnvironment() {
        return ENVIRONMENT_CONFIG.getValue("/env").toString();
    }

    public static EnvData getEnvData() {
        String envConfigPath = String.format("%s%s.json", ENVIRONMENT_PATH, getCurrentEnvironment());
        return JsonReader.deserializeJson(envConfigPath, EnvData.class);
    }
}