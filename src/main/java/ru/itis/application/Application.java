package ru.itis.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
@EnableAutoConfiguration
@ComponentScan("ru.itis")
public class Application {
    public static void main(String[] args) {
        Twitter twitter = new TwitterTemplate("26kGNWWj1OsGkyOdjaR4nhtX1",
                "SVW07BSWTYWP9DkelBFRrEbJeGlifLEgD0FmLhv3WkQl9tfsLS",
                "1618997786-J3BauFMjdGwalFImcs7YGfE5H6COmtycdx5SIez",
                "7z3Sq6taGmdf7oNTSovIiA6Y6Z85FnphQ6lpJ1ikAVStm");
        TwitterProfile twitterProfile = twitter.userOperations().getUserProfile();
        System.out.println("Profile name: " + twitterProfile.getName());

        SpringApplication.run(Application.class, args);
    }
}
