package com.angelee.community.entity;

import java.util.Date;

public class DiscussPost {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.user_id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.title
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.content
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.type
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.status
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.create_time
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.comment_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.score
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Double score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss_post.like_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    private Integer likeCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.id
     *
     * @return the value of discuss_post.id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.id
     *
     * @param id the value for discuss_post.id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.user_id
     *
     * @return the value of discuss_post.user_id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.user_id
     *
     * @param userId the value for discuss_post.user_id
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.title
     *
     * @return the value of discuss_post.title
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.title
     *
     * @param title the value for discuss_post.title
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.content
     *
     * @return the value of discuss_post.content
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.content
     *
     * @param content the value for discuss_post.content
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.type
     *
     * @return the value of discuss_post.type
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.type
     *
     * @param type the value for discuss_post.type
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.status
     *
     * @return the value of discuss_post.status
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.status
     *
     * @param status the value for discuss_post.status
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.create_time
     *
     * @return the value of discuss_post.create_time
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.create_time
     *
     * @param createTime the value for discuss_post.create_time
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.comment_count
     *
     * @return the value of discuss_post.comment_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.comment_count
     *
     * @param commentCount the value for discuss_post.comment_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.score
     *
     * @return the value of discuss_post.score
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.score
     *
     * @param score the value for discuss_post.score
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss_post.like_count
     *
     * @return the value of discuss_post.like_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss_post.like_count
     *
     * @param likeCount the value for discuss_post.like_count
     *
     * @mbg.generated Sun Aug 06 16:13:27 CST 2023
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}