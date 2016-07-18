package app.utils;

/**
 * Created by Agi.
 */
public class TwitterConnectionStatus {
    private static TwitterConnectionStatus ourInstance = new TwitterConnectionStatus();
    private String connectionStatus;
    public static TwitterConnectionStatus getInstance() {
        return ourInstance;
    }

    private TwitterConnectionStatus() {
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
}
