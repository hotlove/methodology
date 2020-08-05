package com.guo.methodology.dao;

import com.guo.methodology.domain.CompanyItem;
import com.guo.methodology.domain.CompanyItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int countByExample(CompanyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int deleteByExample(CompanyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int insert(CompanyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int insertSelective(CompanyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    List<CompanyItem> selectByExample(CompanyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    CompanyItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") CompanyItem record, @Param("example") CompanyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int updateByExample(@Param("record") CompanyItem record, @Param("example") CompanyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int updateByPrimaryKeySelective(CompanyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_item
     *
     * @mbggenerated Wed Aug 05 14:01:03 CST 2020
     */
    int updateByPrimaryKey(CompanyItem record);
}