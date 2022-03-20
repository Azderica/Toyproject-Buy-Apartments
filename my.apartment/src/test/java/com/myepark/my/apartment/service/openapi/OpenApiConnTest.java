package com.myepark.my.apartment.service.openapi;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class OpenApiConnTest {

    @Test
    public void connectionTest() throws IOException {
        // given
        StringBuilder urlBuilder = new StringBuilder("http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTrade");
        urlBuilder.append("?" + URLEncoder.encode("LAWD_CD", "UTF-8") + "=11110");
        urlBuilder.append("&" + URLEncoder.encode("DEAL_YMD", "UTF-8") + "=202003");
        urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8") + "=SAoBybfAXGnk%2BqWahSvfF0FDPVCoTMKY5HYwk44%2FaFId4tvUYrkw9pPckTbVlrGqbTlI0rD0dkkowmCo%2FA3QmQ%3D%3D");
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        ;
        conn.setRequestProperty("Content-type", "application/json");

        // when
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }

        // then
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
