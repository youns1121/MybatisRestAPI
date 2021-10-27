package com.mybatisrestapi.service;

import com.mybatisrestapi.dto.BoardDto;

import java.util.ArrayList;
import java.util.List;


public interface BoardService {

    List<BoardDto> getBoardList();

    int newBoard(BoardDto boardDto);

    BoardDto getBoard(int param);

}
