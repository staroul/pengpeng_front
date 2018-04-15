package com.greenarrow.staroul.chat_front;

/**
 * Created by Staroul on 2018/3/30.
 */

public class PersonalState {        //动态类
    private String nickname;        //昵称
    private String school;          //学校
    private String content;         //动态内容
    private String location;        //定位
    private String state_time;      //时间
    private int like;               //点赞数
    private int comment;            //评论
    private int profileID;          //头像
    private int image1ID;           //图片一
    private int image2ID;           //图片一
    private int image3ID;           //图片一
    private int pictureID;          //点赞图片的样式 这个是实现点赞按钮的动画效果的
    private int img_type;           ////recyclerview类型 1代表一张图片 以此类推

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getImage1ID() {
        return image1ID;
    }

    public void setImage1ID(int image1ID) {
        this.image1ID = image1ID;
    }

    public int getImage2ID() {
        return image2ID;
    }

    public void setImage2ID(int image2ID) {
        this.image2ID = image2ID;
    }

    public int getImage3ID() {
        return image3ID;
    }

    public void setImage3ID(int image3ID) {
        this.image3ID = image3ID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    public int getImg_type() {
        return img_type;
    }

    public void setImg_type(int img_type) {
        this.img_type = img_type;
    }

    public String getState_time() {
        return state_time;
    }

    public void setState_time(String state_time) {
        this.state_time = state_time;
    }
}
