package com.example.yin.domain;

public class SongList {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.style
     *
     * @mbggenerated
     */
    private String style;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.id
     *
     * @return the value of song_list.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.id
     *
     * @param id the value for song_list.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.title
     *
     * @return the value of song_list.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.title
     *
     * @param title the value for song_list.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.pic
     *
     * @return the value of song_list.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.pic
     *
     * @param pic the value for song_list.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.style
     *
     * @return the value of song_list.style
     *
     * @mbggenerated
     */
    public String getStyle() {
        return style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.style
     *
     * @param style the value for song_list.style
     *
     * @mbggenerated
     */
    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.introduction
     *
     * @return the value of song_list.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.introduction
     *
     * @param introduction the value for song_list.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}