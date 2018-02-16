package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by kaixiangzhang on 2018-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        try{
            tweets.add(tweet);
        }catch(Exception e){
            assertEquals("existed tweet!", e);
        }

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        Tweet tweet1 = new NormalTweet("adding a tweet");
        Tweet tweet2 = new NormalTweet("adding a tweet");
        tweets.add(tweet1);
        tweets.add(tweet2);

        ArrayList<Tweet> returnedTweet = tweets.getTweet();
        assertEquals(returnedTweet,tweetList);

    }
    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }
}

