package com.mybatisrestapi.repository;

import com.github.pagehelper.PageInfo;
import com.mybatisrestapi.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {

    List<BoardDto> getBoardList(); //전체 출력

    Long newBoard(BoardDto boardDto); //생성

    BoardDto getBoard(Long boardDto); // 특정 출력
    Long editBoard(BoardDto boardDto); // 수정

    void delBoard(Long boardDto); //삭제, delYn = 'Y';

    PageInfo<BoardDto> findAll(int pageNo, int pageSize); //페이징;


}
