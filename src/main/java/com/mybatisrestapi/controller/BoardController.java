package com.mybatisrestapi.controller;


import com.mybatisrestapi.dto.BoardDto;
import com.mybatisrestapi.vo.BoardVo;
import com.mybatisrestapi.service.BoardService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/newBoard")
    public String formBoard(Model model){

        model.addAttribute("BoardDto", new BoardDto());

        return "html/board";
    }

    @PostMapping("/newBoard")
    public String createBoard(BoardVo boardVo, Model model){

        Long successBoard = boardService.createBoard(boardVo);

        model.addAttribute("successBoard", successBoard);

        return "html/board";
    }

//    @PostMapping("/newBoard")
//    public String newBoard(BoardVo boardVo, Model model){
//
//        Long success = boardService.newBoard(boardVo);
//
//        model.addAttribute("success", success);
//
//        return "html/board";
//    }

    @GetMapping("/list")
    public String boardAllList(Model model){

        List<BoardDto> boardList = boardService.findAllByBoard();

        model.addAttribute("boardList", boardList);

        return "html/boardList";
    }





}
