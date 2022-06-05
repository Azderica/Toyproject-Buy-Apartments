package com.myepark.apartment.service.feignclient

import com.myepark.apartment.model.request.ApartmentRentRequest
import com.myepark.apartment.model.request.ApartmentResaleRightRequest
import com.myepark.apartment.model.request.ApartmentSalesDetailRequest
import com.myepark.apartment.model.request.ApartmentSalesRequest
import com.myepark.apartment.model.response.ApartmentRentResponse
import com.myepark.apartment.model.response.ApartmentResaleRightResponse
import com.myepark.apartment.model.response.ApartmentSalesDetailResponse
import com.myepark.apartment.model.response.ApartmentSalesResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "apartment-government-openapi")
interface ApartmentGovernmentClient {

    @GetMapping("\${url.apartment-sales}")
    fun getApartmentRent(req: ApartmentRentRequest): ApartmentRentResponse

    @GetMapping("\${url.apartment-detail-sales}")
    fun getApartmentResaleRight(req: ApartmentResaleRightRequest): ApartmentResaleRightResponse

    @GetMapping("\${url.apartment-rent}")
    fun getApartmentSales(req: ApartmentSalesRequest): ApartmentSalesResponse

    @GetMapping("\${url.apartment-resale-right}")
    fun getApartmentSalesDetail(req: ApartmentSalesDetailRequest): ApartmentSalesDetailResponse
}