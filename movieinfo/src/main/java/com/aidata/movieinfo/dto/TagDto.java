package com.aidata.movieinfo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagDto {
    private Long tcode;
    private Long tmcode;
    private double tid;
    private String tword;
    private String ttype;
    private int tcount;
}
