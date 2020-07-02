package com.nowcoder.community.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * 封装帖子对象类
 */
@Document(indexName = "discusspost", type = "_doc", shards = 6, replicas = 3)
public class DiscussPost {

    // 帖子ID
    @Id
    private int id;

    // 帖子发布者ID
    @Field(type = FieldType.Integer)
    private int userId;

    // 帖子标题 如：互联网校招
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String title;

    // 帖子内容
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String content;

    // 帖子类型
    @Field(type = FieldType.Integer)
    private int type;

    // 帖子状态
    @Field(type = FieldType.Integer)
    private int status;

    // 帖子创建时间
    @Field(type = FieldType.Date)
    private Date createTime;

    // 帖子评论数量
    @Field(type = FieldType.Integer)
    private int commentCount;

    // 帖子得分
    @Field(type = FieldType.Double)
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "DiscussPost{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", createTime=" + createTime +
                ", commentCount=" + commentCount +
                ", score=" + score +
                '}';
    }
}
