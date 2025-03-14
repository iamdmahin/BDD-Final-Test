package utils;

import models.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestDataReader {
    public static final String TEST_DATA_PATH = JsonReader.getResourcesPath() + "testdata/";
    public static final String RESOURCES_FILE_PATH = JsonReader.getResourcesPath() + "files/";
    private static final String USER_FILE_PATH = TEST_DATA_PATH + "userData.json";
    private static final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "dataTableData.json";
    private static final String FILE_DATA_PATH = TEST_DATA_PATH + "fileData.json";

    public static UserData getUserData() {
        return JsonReader.deserializeJson(USER_FILE_PATH, UserData.class);
    }

    public static DataTableData getDataTableData() {
        return JsonReader.deserializeJson(DATA_TABLE_FILE_PATH, DataTableData.class);
    }

    public static FileData getFileData() {
        return JsonReader.deserializeJson(FILE_DATA_PATH, FileData.class);
    }
}