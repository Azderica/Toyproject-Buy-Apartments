package com.myepark.my.apartment.service.openapi;

import com.myepark.my.apartment.model.request.ApartmentRentRequest;
import com.myepark.my.apartment.model.request.ApartmentResaleRightRequest;
import com.myepark.my.apartment.model.request.ApartmentSalesDetailRequest;
import com.myepark.my.apartment.model.request.ApartmentSalesRequest;
import com.myepark.my.apartment.model.response.ApartmentRentResponse;
import com.myepark.my.apartment.model.response.ApartmentResaleRightResponse;
import com.myepark.my.apartment.model.response.ApartmentSalesDetailResponse;
import com.myepark.my.apartment.model.response.ApartmentSalesResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public interface ApartmentApi {

    @GetMapping(value = "${url.apartment-rent}")
    ApartmentRentResponse getApartmentRent(ApartmentRentRequest req);

    @GetMapping(value = "${url.apartment-resale-right}")
    ApartmentResaleRightResponse getApartmentResaleRight(ApartmentResaleRightRequest req);

    @GetMapping(value = "${url.apartment-sales}")
    ApartmentSalesResponse getApartmentSales(ApartmentSalesRequest req);

    @GetMapping(value = "${url.apartment-detail-sales}")
    ApartmentSalesDetailResponse getApartmentSalesDetail(ApartmentSalesDetailRequest req);
}
