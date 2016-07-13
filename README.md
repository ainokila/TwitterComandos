# TwitterComandos
Aplicacion para manejar tu Ordenador mediante Tweets. 

Lo unico necesario es crear un nueva aplicacion para tu usuario de Twitter en 
https://dev.twitter.com/overview/documentation , en el apartado Manage My Apps  y rellenar los 5 campos del main:

      consumerKey = "";
      consumerSecret = "";
      acessToken = "";
      secretToken = "";
      usuario = "";

Una vez rellenados con los datos de la aplicacion para poder comunicarnos con la API de Twitter , se podra usar tal que asi:

    1º Escribir un Tweet -> @TUUSUARIO OrdenAEjecutar
    2º Publicara un Tweet con la salida -> Salida : CodigoDeLaEjecucion...

Algunos ejemplo de las ejecuciones : 

    TweetOrdenando: @CristianVeRu cmd /c dir
    TweetRespuesta: Salida: El volumen de la unidad D es Datos El n�mero de serie del volumen es: 4264-D6BE Directorio de D:\Archivos de Sistema\Usu...

  Tweets : https://twitter.com/CristianVeRu/status/753353252159229952
  
  Tweets : https://twitter.com/CristianVeRu/status/753353333436473345

Tambien se pueden lanzar aplicaciones , sin necesidad de que estas generen una salida como puede ser lanzar calculadora o apagar el equipo mediante comandos.

Advertencia : Para lanzar algunas aplicaciones se debe poner su ruta absoluta.

Para el funcionamiento de esta aplicacion hace uso de la Libreria Twitter4j.

Cristian Vélez Ruiz
