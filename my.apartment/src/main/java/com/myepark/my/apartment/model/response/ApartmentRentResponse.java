package com.myepark.my.apartment.model.response;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 아파트 전월세
 */
@Data
@OpenAPIDefinition
public class ApartmentRentResponse {
    @Schema(description = "결과코드", example = "00")
    private int resultCode;

    @Schema(description = "결과메시지", example = "NORMAL SERVICE")
    private String resultMsg;

    @Schema(description = "건축년도", example = "2015")
    private int buildYear;

    @Schema(description = "계약년도", example = "2015")
    private int dealYear;

    @Schema(description = "법정동", example = "필운동")
    private String dong;

    @Schema(description = "보증금(만원)", example = "65000")
    private String deposit;

    @Schema(description = "아파트명", example = "신동아블루아광화문의꿈")
    private String apartmentName;

    @Schema(description = "계약월", example = "12")
    private int dealMonth;

    @Schema(description = "월세(만원)", example = "0")
    private int monthlyRent;

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
}
