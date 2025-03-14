package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

@UtilityClass
public class FileUtils {

    public boolean isFileExist(File file) {
        try {
            int waitTime = EnvDataReader.getEnvData().getWait(); // Ensure getWait() exists in EnvData
            Awaitility.await().atMost(waitTime, TimeUnit.SECONDS).until(file::exists);
        } catch (ConditionTimeoutException exception) {
            return false;
        }
        return true;
    }

    public void deleteFileIfExist(File file) {
        if (file.exists() && file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        }
    }
}