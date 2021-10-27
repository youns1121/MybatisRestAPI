package com.mybatisrestapi.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardDto {

    private Long id;
    private String title;
    private String content;
    private String author;
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
