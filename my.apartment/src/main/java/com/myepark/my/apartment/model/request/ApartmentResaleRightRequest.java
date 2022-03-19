package com.myepark.my.apartment.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ApartmentResaleRightRequest {
    @Schema(description = "지역코드", example = "11110")
    private int lawdCd;

    @Schema(description = "계약월", example = "201512")
    private int dealYmd;

    @Schema(description = "인증키")
    private String serviceKey;
}
