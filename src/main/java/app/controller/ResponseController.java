package app.controller;

import app.utils.TweetsMap;
import app.dto.UserDTO;
import app.dto.UserDetailedDTO;
import twitter4j.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agi.
 */
public class ResponseController {
    public UserDTO getUserData(String userName){
       return new UserDTO.UserBuilder(userName)
               .setUserTweetsAmount(TweetsMap.getUserTweets(userName).size())
               .build();
    }

    public List<UserDTO> getAllUsersData() {
        List<UserDTO> usersDTO = new ArrayList<>();
        for(String userName: TweetsMap.getInstance().keySet()) {
            usersDTO.add(getUserData(userName));
        }
        return usersDTO;
    }

    public UserDetailedDTO getDetailedUserData(String userName) {
        List<Status> tweets = TweetsMap.getUserTweets(userName);
        if(tweets.isEmpty()) {
            return new UserDetailedDTO.UserDetailedBuilder(userName).build();
        }

        return new UserDetailedDTO.UserDetailedBuilder(userName)
                .setUserTweetsAmount(tweets.size())
                .setAccountCreationDate(tweets.get(0).getUser().getCreatedAt())
                .setFollowersAmount(tweets.get(tweets.size() - 1).getUser().getFollowersCount())
                .setLanguage(tweets.get(tweets.size() - 1).getUser().getLang())
                .setAmountOfWritterWords(countWrittenWords(tweets))
                .build();

    }

    public List<UserDetailedDTO> getAllDetailedUsersData() {
        List<UserDetailedDTO> usersDetailedDTO = new ArrayList<>();
        for(String userName : TweetsMap.getInstance().keySet()) {
            usersDetailedDTO.add(getDetailedUserData(userName));
        }
        return  usersDetailedDTO;
    }

    private int countWrittenWords(List<Status> tweets) {
        int wordsCounter = 0;
        for(Status tweet : tweets) {
            wordsCounter += tweet.getText().split(" ").length;
        }
        return wordsCounter;
    }
}
