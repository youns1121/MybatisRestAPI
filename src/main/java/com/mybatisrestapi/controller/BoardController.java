package com.mybatisrestapi.controller;

import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Board API", tags = "Board API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v2/api/board")
public class BoardController {

    private final BoardService boardService;


    @ApiOperation(value = "게시판 전체 조회", notes = "게시판을 전체 조회합니다.")
    @GetMapping("/list")
    public List<BoardDto> getBoard(){

        return boardService.getBoardList();
    }

    @ApiOperation(value = "특정 게시판 조회", notes = "특정 게시판을 조회합니다.")
    @GetMapping("/choicelist")
    public BoardDto getBoardChoice(int param){

        return boardService.getBoard(param);
    }

    @ApiOperation(value = "게시판 생성", notes = "게시판을 생성합니다.")
    @PostMapping("/create")
    public Integer createBoard(@RequestBody BoardDto boardDto){

        return boardService.newBoard(boardDto);
    }

}
