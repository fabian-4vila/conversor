package com.fabianavila.conversorDeDivisas.modelo;

public record DatosDeConversion(String baseCode, String targetCode, double conversionRate) {
}
