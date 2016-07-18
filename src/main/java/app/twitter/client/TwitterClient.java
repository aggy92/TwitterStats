package app.twitter.client;

import app.utils.ConnectionStatus;
import app.utils.TwitterConnectionStatus;
import app.utils.TweetsMap;
import app.configuration.OAuthConfiguration;
import twitter4j.*;


/**
 * Created by Agi.
 */
public class TwitterClient {

    private static final String TRACKING_KEYWORD = "java";

    public TwitterClient() {
        listenToStream();
    }

    private void listenToStream() {
        beginListening(createListener());
    }

    private StatusListener createListener() {
        return new StatusListener() {
                @Override
                public void onStatus(Status status) {
                    Logger.getLogger(this.getClass()).info(" -----------------------------------------------------------------");
                    Logger.getLogger(this.getClass()).info(status.getUser().toString());
                    Logger.getLogger(this.getClass()).info(status.getText());
                    Logger.getLogger(this.getClass()).info(" -----------------------------------------------------------------");
                    TweetsMap.addTweet(status);
                    TwitterConnectionStatus.getInstance().setConnectionStatus(ConnectionStatus.CONNECTION_STATUS_OK);
                }

                @Override
                public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {

                }

                @Override
                public void onTrackLimitationNotice(int i) {

                }

                @Override
                public void onScrubGeo(long l, long l1) {

                }

                @Override
                public void onStallWarning(StallWarning stallWarning) {

                }

                @Override
                public void onException(Exception e) {
                    TwitterConnectionStatus.getInstance().setConnectionStatus(ConnectionStatus.CONNECTION_STATUS_BAD_REQUEST);
                    e.printStackTrace();
                }
            };
    }

    private void beginListening(StatusListener listener) {
        TwitterStream stream = new TwitterStreamFactory(OAuthConfiguration.buildOAuthConfiguration()).getInstance();
        stream.addListener(listener);
        stream.filter(TRACKING_KEYWORD);
    }

}
