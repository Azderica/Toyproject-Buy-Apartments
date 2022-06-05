package com.myepark.apartment.model.request

data class ApartmentResaleRightRequest(
    val lawdCd: Int,
    val dealYmd: Int,
    val serviceKey: String
)
