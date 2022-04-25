package com.myepark.apartment.service.openapi

import com.myepark.apartment.model.request.ApartmentRentRequest
import com.myepark.apartment.model.request.ApartmentResaleRightRequest
import com.myepark.apartment.model.request.ApartmentSalesDetailRequest
import com.myepark.apartment.model.request.ApartmentSalesRequest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.boot.test.context.SpringBootTest

// 참고 : https://github.com/daggerok/feign-client-examples/blob/0917758d1a39bc7ac5d6ecdb93ee16300613069f/user-json-feign-client-spring-cloud/src/test/kotlin/com/github/daggerok/openfeign/userjsonfeignclientspringcloud/UserClientTests.kt
// https://github.com/fideism/gitee/blob/febda8ace2ca571534084b571004c674312446d1/archguard/archguard/src/test/kotlin/com/thoughtworks/archguard/code/module/domain/springcloud/feignclient/FeignClientServiceTest.kt

@TestInstance(PER_CLASS)
@AutoConfigureWireMock(port = 0)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class ApartmentGovernmentApiTest(@Autowired constructor(val apartmentGovernmentApi: ApartmentGovernmentApi)) {

    @Test
    fun `정상적으로 아파트 전월세 내역 API를 호출하는지 확인`() {
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
    fun `정상적으로 아파트 분양권전매 내역 API를 호출하는지 확인`() {
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
    fun `정상적으로 아파트 매매 내역 API를 호출하는지 확인`() {
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
    fun `정상적으로 아파트 상세매매 내역 API를 호출하는지 확인`() {
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