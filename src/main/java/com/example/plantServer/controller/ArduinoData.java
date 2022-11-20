package com.example.plantServer.controller;


import lombok.Data;

@Data
public class ArduinoData {
    private String serialId;
    private Integer status;
    private Integer humidity;
    private Integer waterLevel;
    private Integer soil_humidity;
    private Integer temper;
}
