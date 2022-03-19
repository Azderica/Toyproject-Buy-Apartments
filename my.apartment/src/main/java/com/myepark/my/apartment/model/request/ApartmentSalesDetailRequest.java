package com.myepark.my.apartment.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ApartmentSalesDetailRequest {
    @Schema(description = "지역코드", example = "11110")
    private int lawdCd;

    @Schema(description = "계약월", example = "201512")
    private int dealYmd;

    @Schema(description = "인증키")
    private String serviceKey;

    @Schema(description = "페이지번호", example = "1")
    private int pageNo;

    @Schema(description = "한 페이지 결과 수", example = "10")
    private String numOfRows;
}
