/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-05-04
 */
package org.mc.fsp.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mc.fsp.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-05-04
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> getAllUsers();

    @Delete("delete from user where uid = #{uid}")
    int deleteUser(@Param("uid") String uid);
}
