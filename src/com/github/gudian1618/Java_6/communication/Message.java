package com.github.gudian1618.Java_6.communication;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 19:55
 * 消息包
 */
public class Message implements Serializable {
    private String from; // 发送者
    private String to; // 接受者
    private int type; // 接收消息类型
    private String info; // 消息

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Message() {
    }

    public Message(String from, String to, int type, String info) {
        this.from = from;
        this.to = to;
        this.type = type;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Message{" +
            "from='" + from + '\'' +
            ", to='" + to + '\'' +
            ", type=" + type +
            ", info='" + info + '\'' +
            '}';
    }
}
