package com.aidata.movieinfo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListDto {
    private String colname = "mname";
    private String keyword = "";
    private int pageNum = 1;
    private int listCnt = 5;
    private int totalPage;
}
