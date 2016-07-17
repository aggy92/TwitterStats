package app.dto;

import java.util.Date;

/**
 * Created by Agi.
 */

public class UserDetailedDTO {
    private String userName;

    private int tweetsAmount;

    private Date accountCreationDate;

    private int followersAmount;

    private String language;

    private int amountOfWrittenWords;

    public String getUserName() {
        return userName;
    }

    public int getTweetsAmount() {
        return tweetsAmount;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public int getFollowersAmount() {
        return followersAmount;
    }

    public String getLanguage() {
        return language;
    }

    public int getAmountOfWrittenWords() {
        return amountOfWrittenWords;
    }

    private UserDetailedDTO (UserDetailedBuilder builder) {
        this.userName = builder.userName;
        this.tweetsAmount = builder.tweetsAmount;
        this.accountCreationDate = builder.accountCreationDate;
        this.followersAmount = builder.followersAmount;
        this.language = builder.language;
        this.amountOfWrittenWords = builder.amountOfWrittenWords;
    }

    public static class UserDetailedBuilder {
        private String userName;

        private int tweetsAmount;

        private Date accountCreationDate;

        private int followersAmount;

        private String language;

        private int amountOfWrittenWords;


        public UserDetailedBuilder(String userName) {
            this.userName = userName;
        }

        public UserDetailedBuilder setUserTweetsAmount(int amount) {
            this.tweetsAmount = amount;
            return this;
        }

        public UserDetailedBuilder setAccountCreationDate(Date creationDate) {
            this.accountCreationDate = creationDate;
            return this;
        }

        public UserDetailedBuilder setFollowersAmount(int followersAmount) {
            this.followersAmount = followersAmount;
            return this;
        }

        public UserDetailedBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public  UserDetailedBuilder setAmountOfWritterWords(int amountOfWrittenWords) {
            this.amountOfWrittenWords = amountOfWrittenWords;
            return this;
        }

        public UserDetailedDTO build() {
            return new UserDetailedDTO(this);
        }

    }


}
