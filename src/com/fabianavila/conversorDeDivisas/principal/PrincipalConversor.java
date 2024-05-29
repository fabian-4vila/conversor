package com.fabianavila.conversorDeDivisas.principal;

import com.fabianavila.conversorDeDivisas.metodo.ServicioConvertidorDeDivisas;
import com.fabianavila.conversorDeDivisas.modelo.DatosDeConversion;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalConversor {
    public static final String API_KEY = "7188301df8d995d6eb6fdb57";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String menu =
                """
                        *********************************************
                        *  Sea bienvenido/a al Conversor de Moneda  =]
                        *********************************************
                        1) Dólar => Peso argentino
                        2) Peso argentino => Dólar
                        3) Dólar => Real brasileño
                        4) Real brasileño => Dólar
                        5) Dólar => Peso colombiano
                        6) Peso colombiano => Dólar
                        7) Salir
                        *********************************************
                        Elija una opción válida:""";


        boolean continuar = true;
        while (continuar) {
            System.out.println(menu);
            int option = entrada.nextInt();
            if (option >= 1 && option <= 6) {
                System.out.println("Ingrese el monto a convertir:");
                double monto = entrada.nextDouble();
                switch (option) {
                    case 1:
                        convertirMoneda("USD", "ARS", monto);
                        break;
                    case 2:
                        convertirMoneda("ARS", "USD", monto);
                        break;
                    case 3:
                        convertirMoneda("USD", "BRL", monto);
                        break;
                    case 4:
                        convertirMoneda("BRL", "USD", monto);
                        break;
                    case 5:
                        convertirMoneda("USD", "COP", monto);
                        break;
                    case 6:
                        convertirMoneda("COP", "USD", monto);
                        break;
                }
            } else if (option == 7) {
                continuar = false;
            } else {
                System.out.println("Opción no válida.\nElija una opción del 1 al 7.");
            }
        }
        entrada.close();
    }

    public static void convertirMoneda(String baseCurrency, String targetCurrency, double monto) {
        try {
            DatosDeConversion datosDeConversion = ServicioConvertidorDeDivisas.convertirMoneda(baseCurrency, targetCurrency);
            double montoConvertido = monto * datosDeConversion.conversionRate();
            System.out.println("Conversión de " + datosDeConversion.baseCode() + " a " + datosDeConversion.targetCode());
            System.out.println("Tasa de conversión: " + datosDeConversion.conversionRate());
            System.out.println("Monto convertido: " + montoConvertido + " " + datosDeConversion.targetCode());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al llamar a la API: " + e.getMessage());
        }
    }
}