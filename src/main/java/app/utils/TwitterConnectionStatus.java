package app.utils;

/**
 * Created by Agi.
 */
public class TwitterConnectionStatus {
    private static TwitterConnectionStatus ourInstance = new TwitterConnectionStatus();
    private ConnectionStatus connectionStatus;
    public static TwitterConnectionStatus getInstance() {
        return ourInstance;
    }

    private TwitterConnectionStatus() {
    }

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
}
