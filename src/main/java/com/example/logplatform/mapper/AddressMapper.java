package com.example.logplatform.mapper;

import com.example.logplatform.entity.Address;
import com.example.logplatform.entity.District;
import com.example.logplatform.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 处理用户数据操作的持久层接口
 */
public interface AddressMapper {

    Integer insert(Address address);

    Integer countByUid(Integer uid);

    List<Address> findByUid(Integer uid);

    Address findByAid(Integer aid);

    Integer updateNonDefaultByUid(Integer uid);

    Integer updateDefaultByAid(
            @Param("aid") Integer aid,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

    Integer deleteByAid(Integer aid);

    Address findLastModified(Integer uid);


}
