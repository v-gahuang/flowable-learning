package com.ghuang.dto;

import lombok.Data;

@Data
public class HolidayRequest {

    String empName;

    Long noOfHolidays;

    String requestDescription;


}