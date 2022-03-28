package com.myepark.apartment.service.openapi

import com.myepark.apartment.model.request.ApartmentRentRequest
import com.myepark.apartment.model.request.ApartmentResaleRightRequest
import com.myepark.apartment.model.request.ApartmentSalesDetailRequest
import com.myepark.apartment.model.request.ApartmentSalesRequest
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApartmentGovernmentApiTest(@Autowired private val apartmentGovernmentApi: ApartmentGovernmentApi: ApartmentGovernmentApi) {

    @Test
    fun getApartmentRent() {
        // given
        val req = ApartmentRentRequest();

        // when
        val res = apartmentGovernmentApi.getApartmentRent()

        // then

    }

    @Test
    fun getApartmentResaleRight() {
        // given
        val req = ApartmentResaleRightRequest();

        // when
        val res = apartmentGovernmentApi.getApartmentResaleRight()

        // then
    }

    @Test
    fun getApartmentSales() {
        // given
        val req = ApartmentSalesRequest();

        // when
        val res = apartmentGovernmentApi.getApartmentSales()

        // then
    }

    @Test
    fun getApartmentSalesDetail() {
        // given
        val req = ApartmentRentRequest();

        // when
        val res = apartmentGovernmentApi.getApartmentSalesDetail()

        // then
    }
}