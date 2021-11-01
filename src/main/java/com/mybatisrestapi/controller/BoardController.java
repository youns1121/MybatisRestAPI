package com.mybatisrestapi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(value = "Board API", tags = "Board API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v2/api/board")
public class BoardController {

    private final BoardService boardService;

    @ApiOperation(value = "게시판 페이징 조회", notes = "게시판 페이징 조회합니다.")
    @GetMapping("/page")
    public PageInfo<BoardDto> findPage(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10")
                                       int pageSize){
        PageInfo<BoardDto> page = boardService.findAll(pageNo, pageSize);
        return page;
    }


    @ApiOperation(value = "게시판 전체 조회", notes = "게시판을 전체 조회합니다.")
    @GetMapping("/list")
    public List<BoardDto> getBoard(){

        return boardService.getBoardList();
    }

    @ApiOperation(value = "특정 게시판 조회", notes = "특정 게시판을 조회합니다.")
    @GetMapping(value = "/{param}")
    public BoardDto getBoardChoice(@PathVariable("param") Long param){

        return boardService.getBoard(param);
    }

    @ApiOperation(value = "게시판 생성", notes = "게시판을 생성합니다.")
    @PostMapping
    public Long createBoard(@RequestBody BoardDto boardDto){

        return boardService.newBoard(boardDto);
    }

    @ApiOperation(value = "게시판 수정", notes = "특정 게시판을 수정합니다.")
    @PostMapping("/{id}")
    public Long updateBoard(@PathVariable("id") Long id, @RequestBody BoardDto boardDto){

        boardDto.setId(id);

       return boardService.editBoard(boardDto);
    }

    @ApiOperation(value = "게시판 삭제", notes = "특정 게시판을 삭제합니다.")
    @PostMapping("/del/{id}")
    public void delBoard(@PathVariable("id") Long id){


         boardService.delBoard(id);
    }



}
