package com.mybatisrestapi.vo;

import lombok.Builder;
import lombok.Getter;
import org.apache.ibatis.type.Alias;


import java.time.LocalDateTime;

@Getter
public class BoardVo {

    private Long id;

    private String title;

    private String contents;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String delYn;

    private Integer viewCount;

    private Integer likeCount;

    @Builder
    public BoardVo(String title, String contents) {
        this.title = title;
        this.contents = contents;

    }
}
