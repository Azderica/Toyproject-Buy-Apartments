package com.myepark.apartment.model.request

data class ApartmentSalesDetailRequest(
    val lawdCd: Int,
    val dealYmd: Int,
    val serviceKey: String,
    val pageNo: Int = 1,
    val numOfRows: Int = 10,
)
