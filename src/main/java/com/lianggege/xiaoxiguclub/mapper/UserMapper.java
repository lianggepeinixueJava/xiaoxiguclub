package com.lianggege.xiaoxiguclub.mapper;

import com.lianggege.xiaoxiguclub.model.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Mon Dec 31 17:19:31 CST 2018
     */
    int updateByPrimaryKey(User record);
}