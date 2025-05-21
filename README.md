<p align="center">
  <img src="./xd.png" alt="Banner" style="max-width: 100%; height: 250px;">
</p>

# 💱 Conversor de Divisas en Java

Una aplicación de línea de comandos desarrollada en Java que permite convertir entre varias divisas de forma sencilla y en tiempo real utilizando una API externa para obtener las tasas de cambio actualizadas.

---

## 📂 Estructura del Proyecto
```bash
conversor/
├── src/
│   └── com/
│       └── fabianavila/
│            └── conversorDeDivisas
│                ├── llamada
│                    └── LlamadaApi.java 
│                ├── metodo
│                    └── ServicioConvertidorDeDivisas.java   
│                ├── modelo
│                    └── DatosDeConversion.java 
│                └── principal
│                    └── PrincipalConversor.java
├── Conversor.iml
├── xd.png
└── README.md
```

- `PrincipalConversor.java`: punto de entrada del programa.
- `Conversor.java`: lógica principal para mostrar el menú y manejar la interacción.
- `ApiDivisas.java`: clase encargada de hacer las peticiones a la API externa.
- `xd.png`: imagen decorativa usada en el README.
- `README.md`: este documento.

## 📄 Descripción

Este conversor permite realizar conversiones entre los siguientes pares de monedas:

- 🇺🇸 **USD** ➡️ 🇦🇷 **ARS**
- 🇦🇷 **ARS** ➡️ 🇺🇸 **USD**
- 🇺🇸 **USD** ➡️ 🇧🇷 **BRL**
- 🇧🇷 **BRL** ➡️ 🇺🇸 **USD**
- 🇺🇸 **USD** ➡️ 🇨🇴 **COP**
- 🇨🇴 **COP** ➡️ 🇺🇸 **USD**

Cada conversión utiliza tasas actualizadas consultadas a través de una API.

## ✅ Requisitos

- ☕ **Java 8** o superior
- 🌐 **Conexión a Internet** para consultar tasas de cambio
- 🧰 (Opcional) Un IDE como IntelliJ o VSCode con soporte para Java

## 🚀 Instalación y ejecución

1. 📥 Clona este repositorio:

```bash
git clone https://github.com/usuario/repositorio.git
cd repositorio
```
