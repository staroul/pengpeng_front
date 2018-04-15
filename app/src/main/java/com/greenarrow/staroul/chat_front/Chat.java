package com.greenarrow.staroul.chat_front;

/**
 * Created by Staroul on 2018/4/11.
 */

public class Chat {             //聊天内容类
    private String content;     //聊天内容
    private int image;          //图片内容
    private int profileID;      //头像
    private int type;           //recyclerview类型 0为SENT 1为RECEIVED 2为SENT_IMAGE 3为RECEIVED

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
