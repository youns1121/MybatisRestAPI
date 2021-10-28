package com.mybatisrestapi.service;

import com.mybatisrestapi.dto.BoardDto;

import java.util.List;


public interface BoardService {

    List<BoardDto> getBoardList();

    Long newBoard(BoardDto boardDto);

    BoardDto getBoard(Long param);

    Long editBoard(BoardDto boardDto); // 수정

    void delBoard(Long id); //삭제, delYn = 'Y';



}
