package com.mybatisrestapi.controller;

import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/list")
    public List<BoardDto> getBoard(){

        return boardService.getBoardList();
    }

    @PostMapping("/create")
    public Integer createBoard(@RequestBody BoardDto boardDto){

        return boardService.newBoard(boardDto);
    }

}
