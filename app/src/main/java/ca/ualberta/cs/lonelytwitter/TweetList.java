package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by kaixiangzhang on 2018-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    //this part is what we need to change
    public void add(Tweet tweet){
        if (tweets.contains(tweet))
            throw new IllegalArgumentException("there has already exist a same tweet");
        else{
        tweets.add(tweet);}

    }
    public int getSize(){
        return tweets.size();
    }

    public boolean hasTweet(Tweet tweet)
    {
        return tweets.contains(tweet);
    }
    public ArrayList<Tweet> getTweet(){
        return tweets ;
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
}
