package com.myepark.my.apartment.model.response;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 아파트 분양권 전매
 */
@Data
@OpenAPIDefinition
public class ApartmentResaleRightResponse {
    @Schema(description = "결과코드", example = "00")
    private int resultCode;

    @Schema(description = "결과메시지", example = "NORMAL SERVICE")
    private String resultMsg;

    @Schema(description = "거래금액(만원)", example = "82,500")
    private String dealAmount;

    @Schema(description = "구분, 분양권 및 입주권", example = "입")
    private String classificationOfOwnership;

    @Schema(description = "계약년도", example = "2015")
    private int dealYear;

    @Schema(description = "단지", example = "종로 포레스트힐")
    private String apartmentName;

    @Schema(description = "법정동", example = "필운동")
    private String dong;

    @Schema(description = "시군구", example = "종로구")
    private String sigungu;

    @Schema(description = "계약월", example = "12")
    private int dealMonth;

    @Schema(description = "일", example = "1")
    private int dealDay;

    @Schema(description = "전용면적(m^2)", example = "111.97")
    private double areaForExclusiveUse;

    @Schema(description = "지번", example = "254")
    private int jibun;

    @Schema(description = "결과코드", example = "11110")
    private int regionalCode;

    @Schema(description = "층", example = "7")
    private int floor;

    @Schema(description = "해제여부", example = "O")
    private char cancelDealType;

    @Schema(description = "해제사유발생일", example = "21.01.27")
    private String cancelDealDay;

    @Schema(description = "거래유형, 중개 및 직거래 여부", example = "중개거래")
    private String reqGbn;

    @Schema(description = "중개업소주소", example = "서울 서초구")
    private String rdealerLawdnm;
}
