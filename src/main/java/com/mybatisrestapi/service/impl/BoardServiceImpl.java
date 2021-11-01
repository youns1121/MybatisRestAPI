package com.mybatisrestapi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisrestapi.repository.BoardRepository;
import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    @Transactional
    public List<BoardDto> getBoardList() {
        return boardRepository.getBoardList();
    }

    @Override
    @Transactional
    public Long newBoard(BoardDto boardDto) {
        return boardRepository.newBoard(boardDto);
    }

    @Override
    @Transactional
    public BoardDto getBoard(Long param) { // 특정 게시판 조회
        return boardRepository.getBoard(param);
    }

    @Override
    @Transactional
    public Long editBoard(BoardDto boardDto) { // 수정
        boardDto.setId(boardDto.getId());

        return boardRepository.editBoard(boardDto);

    }

    @Override
    @Transactional
    public void delBoard(Long id) {
        boardRepository.delBoard(id);
    }

    @Override
    public PageInfo<BoardDto> findAll(int pageNo, int pageSize) {

        PageHelper.startPage(pageNo, pageSize);
        List<BoardDto> boardDtoList = boardRepository.getBoardList();
        PageInfo<BoardDto> pageInfo = new PageInfo<>(boardDtoList);
        return pageInfo;
    }


}
