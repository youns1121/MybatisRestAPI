package com.mybatisrestapi.repository;

import com.mybatisrestapi.vo.BoardVo;
import com.mybatisrestapi.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {

    List<BoardDto> findAllByBoard(); //전체 출력

    Long createBoard(BoardVo boardVo); //생성




}
