package com.greenarrow.staroul.chat_front;

/**
 * Created by Staroul on 2018/4/6.
 */

public class Message {              //最近联系人类
    private String nickname;        //昵称
    private String latest_content;  //最新一条信息的内容
    private String latest_time;     //最新一条信息的时间
    private int profileID;          //头像

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public String getLatest_content() {
        return latest_content;
    }

    public void setLatest_content(String latest_content) {
        this.latest_content = latest_content;
    }

    public String getLatest_time() {
        return latest_time;
    }

    public void setLatest_time(String latest_time) {
        this.latest_time = latest_time;
    }
}
