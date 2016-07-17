package app.dto;

/**
 * Created by Agi.
 */

public class UserDTO {

    private String userName;

    private Integer tweetsAmount;

    private UserDTO(UserBuilder builder) {
        this.userName = builder.userName;
        this.tweetsAmount = builder.tweetsAmount;
    }

    public static class UserBuilder {
        private String userName;

        private int tweetsAmount;

        public UserBuilder(String userName) {
            this.userName = userName;
        }

        public UserBuilder setUserTweetsAmount(int tweetsAmount) {
            this.tweetsAmount = tweetsAmount;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }

    }

    public String getUserName() {
        return userName;
    }

    public Integer getTweetsAmount() {
        return tweetsAmount;
    }
}
