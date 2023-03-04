# erp-solved-backend

## Tabla de contenidos
1. [Informacion General](#información-general)
2. [Tecnologias](#tecnologías)
3. [Instalacion](#instalación)
4. [FAQs](#faqs)
### Información general
***
Se trata de una aplicación de control de empleados y stock para una empresa pequeña,
pero con la posibilidad de abaracar muchas cosas ya que aun 
esta en producción.  
Este proyecto junto con el frontend, serian la combinacion para
que a la larga, sea un ERP en el que tengas en control 
todos los aspectos de una empresa.

### Screenshot

[//]: # (![Image text]&#40;https://www.united-internet.de/fileadmin/user_upload/Brands/Downloads/Logo_IONOS_by.jpg&#41;)
## Tecnologías
***
Una lista de las tecnologias utilizadas en el backend:
* [Spring Booot](https://spring.io/): Version 3.0.3
* [Jakarta Persistence](https://jakarta.ee/specifications/persistence/): Version 3.0
* [MySql](https://www.mysql.com/): Version 8.0.32
* [Docker](https://www.docker.com/)

## Instalación
***
Como instalar el backend:
```
$ git clone https://github.com/vigliom/erp-solved-backend.git
$ open it with IntelliJ IDEA
$ run maven proyect
```
Para instalar la base de datos, seria necesiario instalar en ```docker``` la ultima 
version de ```MySql``` con los siguientes parametros: 
 * Nombre de la BD: ERPSolved
 * user de la BD: root
 * password de la BD: root
> Pudes cambiar el nombre de todos los datos, pero sera necesario corregirlo despues en el applicationproperties.

## FAQs
***
A list of frequently asked questions
1. **Donde esta el archivo de application.properties**
   _../src/main/resources/application.properties_
