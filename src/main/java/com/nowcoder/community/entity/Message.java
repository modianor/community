package com.nowcoder.community.entity;

import java.util.Date;

/**
 * 封装站内消息实体类
 */
public class Message {

    // 消息ID
    private int id;
    // 消息发送实体ID
    private int fromId;
    // 消息接收实体ID
    private int toId;
    // 对话分组ID
    private String conversationId;

    /**
     * 消息内容:
     * 1. 非Json数组字符串
     *  当fromId为非系统用户时（fromID != 1），消息内容为普通字符串
     * 2. Json数组字符串
     *  当fromId为系统用户时（fromID = 1），消息内容为Json数组字符串，应当反序列化为Event实体对象
     */
    private String content;
    // 消息状态
    private int status;
    // 创建时间
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", conversationId='" + conversationId + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
