package com.mybatisrestapi.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BoardDto {

    @ApiModelProperty(value = "게시판 아이디", hidden = true)
    private Long id;
    @ApiModelProperty(value = "게시판 제목")
    private String title;
    @ApiModelProperty(value = "게시판 내용")
    private String contents;
    @ApiModelProperty(value = "게시판 작성자")
    private String author;

    @ApiModelProperty(value = "생성시간")

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "수정시간")
    private LocalDateTime updateTime;


    @ApiModelProperty(value = "게시판 삭제여부", hidden = true)
    private String delYn;

    public void setId(Long id) {
        this.id = id;
    }



    public BoardDto() {
    }

    @Builder
    public void createBoard(BoardDto boardDto){
        this.title = boardDto.getTitle();
        this.contents = boardDto.getContents();
        this.author = boardDto.getAuthor();
    }



}
