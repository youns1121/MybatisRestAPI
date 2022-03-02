package com.mybatisrestapi.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("BoardDto")
@Getter
@Setter
public class BoardDto {

    private Long id;

    private String title;

    private String contents;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String delYn;

    private Integer viewCount;

    private Integer likeCount;


    @Builder
    public BoardDto(String title, String contents, LocalDateTime createTime, LocalDateTime updateTime, String delYn, Integer viewCount, Integer likeCount) {
        this.title = title;
        this.contents = contents;
        this.createTime = createTime.now();
        this.updateTime = updateTime.now();
        this.delYn = delYn;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
    }

    public BoardDto() {
    }

}
