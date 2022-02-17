# qr-barcode-generator
RESTFul service to generate barcodes and qr codes writen in Java with Spring Boot Framework.

# Endpoints

## [GET] /barcodes/{type}/{barcodeText}

Generates a barcode taking the following parameters into consideration:

**Type** is one of the following standards:
* EAN13
* EAN128
* UPC
* CODE128
* CODE39
* USPS
* SCC14
* GTIN
* PDF417

**barcodeText** is any text you'd like

```
*Example:* http://localhost:8088/barcodes/PDF417/313131
```

## [GET] /qrcodes/{qrCodeText}/{width}/{height}

Generates a QRCode taking the following parameters into consideration:

**qrCodeText** is the text you'd like to encode in the text

**width** the resulting image width

**height** the resulting inage height
```

*Example:* http://localhost:8088/qrcodes/www.googe.com/350/350
```

This code is referenced in my recent blog entry:

https://ricardogeek.com/como-generar-codigos-de-barras-y-qr-en-java/

## Run

```
* mvn spring-boot:run
```

# Doc API
```
* http://localhost:8088/swagger-ui/index.html
```
- https://editor.swagger.io/  to generate client and server

## Get image QRCODE With Curl

```
curl -X "GET" "http://localhost:8088/qrcodes/cie/350/350" -H "accept: image/png"  --output myqrcode.png
```
