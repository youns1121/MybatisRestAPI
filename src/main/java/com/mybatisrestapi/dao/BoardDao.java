package com.mybatisrestapi.dao;

import com.mybatisrestapi.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    List<BoardDto> getBoardList();

    int newBoard(BoardDto boardDto); // 키를 반환하기 위해 int

}
