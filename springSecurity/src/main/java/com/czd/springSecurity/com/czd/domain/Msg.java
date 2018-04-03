package com.czd.springSecurity.com.czd.domain;

/**
 * 消息实体类
 *
 * @author: czd
 * @create: 2018/4/3 10:15
 */
public class Msg {
    private String title;
    private String content;
    private String extraInfo;

    public Msg(){

    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Msg(String title, String content, String extraInfo) {
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }
}
