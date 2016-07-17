package app.utils;

/**
 * Created by Agi.
 */
public enum  ConnectionStatus {
    DISCONNECTED("Disconnected"),
    CONNECTED("Connected");

    String caption;
    private ConnectionStatus(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }
}
