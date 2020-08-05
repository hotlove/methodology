package com.guo.methodology.domain;

import java.util.Date;

public class CompanyItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.id
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.name
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.description
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.created_by
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private Integer createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.created_time
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_item.deleted
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    private Integer deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.id
     *
     * @return the value of company_item.id
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.id
     *
     * @param id the value for company_item.id
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.name
     *
     * @return the value of company_item.name
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.name
     *
     * @param name the value for company_item.name
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.description
     *
     * @return the value of company_item.description
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.description
     *
     * @param description the value for company_item.description
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.created_by
     *
     * @return the value of company_item.created_by
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.created_by
     *
     * @param createdBy the value for company_item.created_by
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.created_time
     *
     * @return the value of company_item.created_time
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.created_time
     *
     * @param createdTime the value for company_item.created_time
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_item.deleted
     *
     * @return the value of company_item.deleted
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_item.deleted
     *
     * @param deleted the value for company_item.deleted
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}