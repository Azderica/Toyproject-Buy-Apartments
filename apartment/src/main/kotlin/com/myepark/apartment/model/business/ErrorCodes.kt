package com.myepark.apartment.model.business

enum class ErrorCodes(val value: Int, val description: String) {
    ApplicationError(1, "제공기관 서비스 제공 상태가 원활하지 않음"),
    DBError(2, "제공기관 서비스 제공 상태가 원활하지 않음"),
    NoData(3, "데이터없음 에러"),
    HttpError(4, "제공기관 서비스 제공 상태가 원활하지 않음"),
    ServiceTimeOut(5, "제공기관 서비스 제공 상태가 원활하지 않음"),
    ErrorRequestParameters(10, "잘못된 요청 파라미터 에러"),
    MissingRequiredRequestParameters(11, "요청하신 OpenApi의 필수 파라미터가 누락됨"),
    ErrorOpenApiServiceOrDiscard(12, "OpenApi 호출시 URL이 잘못됨"),
    DenialOfServiceAccess(20, "활용승인이 되지 않은 OpenApi 호출"),
    ServiceRequestLimitError(22, "일일 활용건수가 초과"),
    UnregisteredServiceKey(30, "잘못된 서비스키를 사용하였거나 서비스키를 URL 인코딩하지 않음"),
    ExpiredServiceKey(31, "OpenApi 사용기간이 만료됨"),
    UnregisteredDomainNameOrIpAddress(32, "활용신청한 서버의 IP와 실제 OpenAPI 호출한 서버가 다른 경우");
}