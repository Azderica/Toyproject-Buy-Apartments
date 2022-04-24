package com.myepark.apartment.service.openapi

import com.myepark.apartment.model.request.ApartmentRentRequest
import com.myepark.apartment.model.request.ApartmentResaleRightRequest
import com.myepark.apartment.model.request.ApartmentSalesDetailRequest
import com.myepark.apartment.model.request.ApartmentSalesRequest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApartmentGovernmentApiTest() {
    @Autowired
    private lateinit var apartmentGovernmentApi: ApartmentGovernmentApi

    @Test
    fun getApartmentRent() {
        // given
        val req = ApartmentRentRequest(
            lawdCd = 41171,
            dealYmd = 202202,
            serviceKey = "lcwJO5TpDubkzMOT%2Bzo623QJO5O232P9DwqbbV7OJbPbSPhjcCuaR6CgAKF7vUDTIAL6hNOdJcWNwBw5Dhe%2Blw%3D%3D"
        )

        // when
        val res = apartmentGovernmentApi.getApartmentRent(req)

        // then
        println(res)
    }

    @Test
    fun getApartmentResaleRight() {
        // given
        val req = ApartmentResaleRightRequest(
            lawdCd = 41171,
            dealYmd = 202202,
            serviceKey = "lcwJO5TpDubkzMOT%2Bzo623QJO5O232P9DwqbbV7OJbPbSPhjcCuaR6CgAKF7vUDTIAL6hNOdJcWNwBw5Dhe%2Blw%3D%3D"
        )

        // when
        val res = apartmentGovernmentApi.getApartmentResaleRight(req)

        // then
        println(res)
    }

    @Test
    fun getApartmentSales() {
        // given
        val req = ApartmentSalesRequest(
            lawdCd = 41171,
            dealYmd = 202202,
            serviceKey = "lcwJO5TpDubkzMOT%2Bzo623QJO5O232P9DwqbbV7OJbPbSPhjcCuaR6CgAKF7vUDTIAL6hNOdJcWNwBw5Dhe%2Blw%3D%3D"
        )

        // when
        val res = apartmentGovernmentApi.getApartmentSales(req)

        // then
        println(res)
    }

    @Test
    fun getApartmentSalesDetail() {
        // given
        val req = ApartmentSalesDetailRequest(
            lawdCd = 41171,
            dealYmd = 202202,
            serviceKey = "lcwJO5TpDubkzMOT%2Bzo623QJO5O232P9DwqbbV7OJbPbSPhjcCuaR6CgAKF7vUDTIAL6hNOdJcWNwBw5Dhe%2Blw%3D%3D"
        )

        // when
        val res = apartmentGovernmentApi.getApartmentSalesDetail(req)

        // then
        println(res)
    }
}