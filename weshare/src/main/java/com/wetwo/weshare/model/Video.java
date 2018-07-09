package com.wetwo.weshare.model;

public class Video {
    private int id;
    private int messageId;
    private String url;
    private String position;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", messageId=" + messageId +
                ", url='" + url + '\'' +
                ", position='" + position + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
