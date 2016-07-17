package app;

import app.twitter.client.TwitterClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * Created by Agi.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Logger.getLogger(Main.class.getName()).info("Obtaining user data...");
        new TwitterClient();
    }

}
