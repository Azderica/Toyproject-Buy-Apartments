package com.myepark.apartment.model.request

data class ApartmentSalesRequest(
    val lawdCd: Int,
    val dealYmd: Int,
    val serviceKey: String
)
