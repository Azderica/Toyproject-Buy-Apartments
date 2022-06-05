package com.myepark.apartment.model.response

data class ApartmentRentResponse(
    val resultCode: Int,
    val resultMsg: String,
    val buildYear: Int,
    val dealYear: Int,
    val dong: String,
    val deposit: String? = null,
    val apartmentName: String? = null,
    val dealMonth: Int,
    val monthlyRent: Int,
    val dealDay: Int,
    val areaForExclusiveUse: Int,
    val jibun: Int,
    val regionalCode: Int,
    val floor: Int,
)