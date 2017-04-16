package com.mk.listviewobjects.models;

import java.util.List;

/**
 * Created by MK on 14/04/2017.
 */

public class ObjectModel {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    private String objectname;
    private String region;
    private String categoryName;
    private String phone;
    private String dayoff;
    private String startTimeA;
    private String endTimeA;
    private String StartTimeB;
    private String endTimeB;
    private String sreetNumber;
    private String streetName;
    private String besides;
    private float rating;
    private int Image;
    private List<Comment> comments;
    private List<Phone> phones;

    public static class Phone{
        private String phone;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class Comment{
        private String username,email,comment;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDayoff() {
        return dayoff;
    }

    public void setDayoff(String dayoff) {
        this.dayoff = dayoff;
    }

    public String getStartTimeA() {
        return startTimeA;
    }

    public void setStartTimeA(String startTimeA) {
        this.startTimeA = startTimeA;
    }

    public String getEndTimeA() {
        return endTimeA;
    }

    public void setEndTimeA(String endTimeA) {
        this.endTimeA = endTimeA;
    }

    public String getStartTimeB() {
        return StartTimeB;
    }

    public void setStartTimeB(String startTimeB) {
        StartTimeB = startTimeB;
    }

    public String getEndTimeB() {
        return endTimeB;
    }

    public void setEndTimeB(String endTimeB) {
        this.endTimeB = endTimeB;
    }

    public String getSreetNumber() {
        return sreetNumber;
    }

    public void setSreetNumber(String sreetNumber) {
        this.sreetNumber = sreetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBesides() {
        return besides;
    }

    public void setBesides(String besides) {
        this.besides = besides;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Phone> getPhones(int i) {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
