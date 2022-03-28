package com.myepark.apartment.model.request

data class ApartmentRentRequest(
    val lawdCd: Int,
    val dealYmd: Int,
    val serviceKey: String
)
