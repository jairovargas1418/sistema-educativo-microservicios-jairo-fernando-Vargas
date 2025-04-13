# Utiliza una imagen base de Java
FROM openjdk:17-jdk-alpine

# Define el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo .jar generado al contenedor
COPY target/usuarios-servicio-0.0.1-SNAPSHOT.jar usuarios-servicio.jar

# Expone el puerto en el que corre el microservicio (por ejemplo, 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "usuarios-servicio.jar"]