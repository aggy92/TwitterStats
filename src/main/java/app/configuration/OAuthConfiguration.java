package app.configuration;

import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by Agi.
 */
public class OAuthConfiguration {
    public static final String CONSUMER_KEY = "gvoExdIe2ClwXSSM6xxe1cTys";
    public static final String CONSUMER_KEY_SECRET = "5oPWpHxvdSgPVBAU9g5dgP4NnZE4vZprIXOTNse3vCrQB2mDYH";
    public static final String ACCESS_TOKEN = "265631564-P7bfioZsuBiRJbrHx58nQI3PQlE2tmBo4VgM9NFU";
    public static final String ACCESS_TOKEN_SECRET = "fM6s0igdedvigajqLJehyosI98jOG2DFAP99dUSAl3vvw";


    public static Configuration buildOAuthConfiguration() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey(CONSUMER_KEY);
        cb.setOAuthConsumerSecret(CONSUMER_KEY_SECRET);
        cb.setOAuthAccessToken(ACCESS_TOKEN);
        cb.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        return cb.build();
    }
}
