package com.holding.mapper;

import com.holding.po.Desk;
import com.holding.po.DeskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskMapper {
    long countByExample(DeskExample example);

    int deleteByExample(DeskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Desk record);

    int insertSelective(Desk record);

    List<Desk> selectByExample(DeskExample example);

    Desk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Desk record, @Param("example") DeskExample example);

    int updateByExample(@Param("record") Desk record, @Param("example") DeskExample example);

    int updateByPrimaryKeySelective(Desk record);

    int updateByPrimaryKey(Desk record);
}