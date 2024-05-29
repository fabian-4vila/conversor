package com.fabianavila.conversorDeDivisas.metodo;

import com.fabianavila.conversorDeDivisas.llamada.LlamadaApi;
import com.fabianavila.conversorDeDivisas.modelo.DatosDeConversion;
import com.fabianavila.conversorDeDivisas.principal.PrincipalConversor;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class ServicioConvertidorDeDivisas {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final LlamadaApi llamadaApi = new LlamadaApi();
    public static DatosDeConversion convertirMoneda(String baseCurrency, String targetCurrency) throws IOException, InterruptedException {
        String url = BASE_URL + PrincipalConversor.API_KEY +"/pair/"+ baseCurrency + "/" + targetCurrency;
        String response = llamadaApi.get(url);
        Gson gson = new Gson();
        JsonObject jsonRespuesta = gson.fromJson(response, JsonObject.class);
        String baseCode = jsonRespuesta.get("base_code").getAsString();
        String targetCode = jsonRespuesta.get("target_code").getAsString();
        double conversionRate = jsonRespuesta.get("conversion_rate").getAsDouble();
        return new DatosDeConversion(baseCode,targetCode,conversionRate);
    }
}
