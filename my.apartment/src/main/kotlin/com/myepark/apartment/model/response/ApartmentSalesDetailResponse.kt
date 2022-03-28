package com.myepark.apartment.model.response

data class ApartmentSalesDetailResponse(
    val resultCode: Int,
    val resultMsg: String,
    val dealAmount: String,
    val buildYear: Int,
    val dealYear: Int,
    val dong: String,
    val apartmentName: String,
    val dealMonth: Int,
    val dealDay: Int,
    val areaForExclusiveUse: Int,
    val jibun: Int,
    val regionalCode: Int,
    val floor: Int,
    val cancelDealType: Char,
    val cancelDealDay: String,
    val reqGbn: String,
    val rdealerLawdnm: String,
)