package com.mybatisrestapi.service.impl;


import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.vo.BoardVo;
import com.mybatisrestapi.repository.BoardRepository;
import com.mybatisrestapi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;


    @Override
    public Long createBoard(BoardVo boardVo) {

        Long success = boardRepository.createBoard(boardVo);

        return success;
    }

    @Override
    public List<BoardDto> findAllByBoard() {

        List<BoardDto> boardList = boardRepository.findAllByBoard();

        return boardList;
    }
}
