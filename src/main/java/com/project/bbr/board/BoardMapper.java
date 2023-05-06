package com.project.bbr.board;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM board")
    List<Board> selectAll();
    @Insert("INSERT INTO board (title, content) VALUES (#{title}, #{content})")
    void insert(Board board);
}
