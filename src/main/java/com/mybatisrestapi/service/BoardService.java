package com.mybatisrestapi.service;

import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.vo.BoardVo;

import java.util.List;


public interface BoardService {

    Long createBoard(BoardVo boardVo);

    List<BoardDto> findAllByBoard();

}
