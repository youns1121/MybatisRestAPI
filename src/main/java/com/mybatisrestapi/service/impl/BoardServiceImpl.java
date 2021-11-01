package com.mybatisrestapi.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisrestapi.dao.BoardDao;
import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDao boardDao;

    @Override
    @Transactional
    public List<BoardDto> getBoardList() {
        return boardDao.getBoardList();
    }

    @Override
    @Transactional
    public Long newBoard(BoardDto boardDto) {
        return boardDao.newBoard(boardDto);
    }

    @Override
    @Transactional
    public BoardDto getBoard(Long param) { // 특정 게시판 조회
        return boardDao.getBoard(param);
    }

    @Override
    @Transactional
    public Long editBoard(BoardDto boardDto) { // 수정
        boardDto.setId(boardDto.getId());

        return boardDao.editBoard(boardDto);

    }

    @Override
    @Transactional
    public void delBoard(Long id) {
        boardDao.delBoard(id);
    }

    @Override
    public PageInfo<BoardDto> findAll(int pageNo, int pageSize) {

        PageHelper.startPage(pageNo, pageSize);
        List<BoardDto> boardDtoList = boardDao.getBoardList();
        PageInfo<BoardDto> pageInfo = new PageInfo<>(boardDtoList);
        return pageInfo;
    }


}
