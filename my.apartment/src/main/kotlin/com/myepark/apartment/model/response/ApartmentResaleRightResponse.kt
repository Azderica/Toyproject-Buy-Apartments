package com.myepark.apartment.model.response

data class ApartmentResaleRightResponse(
    val resultCode: Int,
    val resultMsg: String,
    val dealAmount: String,
    val classificationOfOwnership: String,
    val dealYear: Int,
    val apartmentName: String,
    val dong: String,
    val deposit: String,
    val sigungu: String,
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