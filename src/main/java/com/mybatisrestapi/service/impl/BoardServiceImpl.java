package com.mybatisrestapi.service.impl;

import com.mybatisrestapi.dao.BoardDao;
import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDao boardDao;

    @Override
    public List<BoardDto> getBoardList() {
        return boardDao.getBoardList();
    }

    @Override
    public int newBoard(BoardDto boardDto) {
        return boardDao.newBoard(boardDto);
    }

    @Override
    public BoardDto getBoard(int param) {
        return boardDao.getBoard(param);
    }


}
