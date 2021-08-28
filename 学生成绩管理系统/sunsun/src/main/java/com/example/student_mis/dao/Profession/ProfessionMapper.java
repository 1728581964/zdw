package com.example.student_mis.dao.Profession;

import com.example.student_mis.domain.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Create by zhengdawei on 2021/6/1 15:10
 * 专业信息 Mapper层
 */
@Mapper
public interface ProfessionMapper {
    /**
     * description: 获取所有专业
     * return: List<Profession>
     */
    List<Profession> getProfessionList();
    /**
     * description: 根据专业名查询专业数量（判断是否存在该专业）
     * @param: String
     * return: Integer
     */
    Integer checkProfessionCount(@Param("name") String name);
    /**
     * description: 新增专业
     * @param: Profession
     * return: void
     */
    void addProfession(Profession profession);
    /**
     * description: 删除专业
     * @param: Integer
     * return: void
     */
    void deleteProfession(@Param("id") Integer id);
    /**
     * description: 根据专业名查询专业信息
     * @param: String
     * return: Profession
     */
    Profession getProfessionIdByName(@Param("name") String name);
}
