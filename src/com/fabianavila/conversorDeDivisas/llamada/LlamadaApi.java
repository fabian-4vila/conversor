package com.fabianavila.conversorDeDivisas.llamada;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LlamadaApi {
    private final HttpClient client;

    public LlamadaApi() {
        this.client = HttpClient.newHttpClient();
    }

    public String get(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response =client.send(request,HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
