package com.company;

public class social_media {
    private String messsges;
    private String photo;
    private String tags;

    public social_media(String themesssges, String thephoto, String thetags) {
        messsges = themesssges;
        photo = thephoto;
        tags = thetags;
    }


    public String getMesssges() {
        return messsges;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTags() {
        return tags;
    }

    public void setMesssges(String intermessge) {
        messsges = intermessge;
    }

    public void setPhoto(String interphoto) {
        photo = interphoto;
    }

    public void setTags(String intertags) {
        tags = intertags;
    }


    public void SocialMediaApp() {
        System.out.println(" post in social media app ");
        psotmsg();
        postph();
        posttags();
        System.out.println(" posting to social media ");
    }

    public void psotmsg() {
        if (getMesssges().equals("")) {
            System.out.println(" please enter message ");

        } else {
            System.out.println(" message:  " + getMesssges());
        }
    }

    public void postph() {

        if (!getPhoto().equals("")) {
            System.out.println(" photo : " + getPhoto());

        }
    }
        public void posttags () {

            if (!getTags().equals("")) {
                System.out.println(" tags : " + getTags());

            }

        }
    }
