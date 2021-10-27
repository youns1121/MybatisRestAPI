package com.mybatisrestapi.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardDto {

    @ApiModelProperty(value = "게시판 아이디")
    private Long id;
    @ApiModelProperty(value = "게시판 제목")
    private String title;
    @ApiModelProperty(value = "게시판 내용")
    private String content;
    @ApiModelProperty(value = "게시판 작성자")
    private String author;
    @ApiModelProperty(value = "게시판 삭제여부", hidden = true)
    private String del_yn = "N";



    public BoardDto() {
    }

    @Builder
    public BoardDto(Long id, String title, String content, String author, String del_yn) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.del_yn = del_yn;
    }



}
