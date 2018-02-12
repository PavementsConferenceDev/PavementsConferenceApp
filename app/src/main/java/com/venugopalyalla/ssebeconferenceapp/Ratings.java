package com.venugopalyalla.ssebeconferenceapp;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

@DynamoDBTable(tableName = "Ratings")
public class Ratings {
    private String uniqueId;
    private String user;
    private String eventName;
    private float rating;
    private String comments;

    @DynamoDBHashKey(attributeName = "unique_id")
    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @DynamoDBAttribute(attributeName = "user")
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @DynamoDBAttribute(attributeName = "eventName")
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @DynamoDBAttribute(attributeName = "rating")
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @DynamoDBAttribute(attributeName = "comments")
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

}