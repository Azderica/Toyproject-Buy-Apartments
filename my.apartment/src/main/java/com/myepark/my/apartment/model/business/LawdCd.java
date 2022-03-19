package com.myepark.my.apartment.model.business;

/**
 * 지역코드, 5자리
 * 각 이젹별 코드 행정 표준코드관리시스템
 * www.code.go.kr 의 법정동코드 10자리 중 앞 5자리
 */
public enum LawdCd {
    경기도안양시(41170),
    경기도안양시만안구(41171),
    경기도안양시동안구(41173),
    경기도군포시(41410);

    private final int code;

    LawdCd(int code) {
        this.code = code;
    }
}
