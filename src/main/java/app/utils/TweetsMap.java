package app.utils;

import twitter4j.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Agi on 2016-07-17.
 */
public class TweetsMap extends TreeMap<String, List<Status>> {

    private TweetsMap() {}

    private static class TweetsMapHelper {
        private static final TweetsMap TWEET_MAP_INSTANCE = new TweetsMap();
    }

    public static TweetsMap getInstance() {
        return TweetsMapHelper.TWEET_MAP_INSTANCE;
    }

    public static void addTweet(Status status) {
        getInstance().putIfAbsent(status.getUser().getScreenName(), new ArrayList<Status>());
        getInstance().get(status.getUser().getScreenName()).add(status);
    }

    public static List<Status> getUserTweets(String name) {
        if(getInstance().get(name) == null) {
            return new ArrayList<>();
        } else return getInstance().get(name);
    }
 }
