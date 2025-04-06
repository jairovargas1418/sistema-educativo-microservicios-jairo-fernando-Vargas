# sistema-educativo-microservicios-jairo-fernando-Vargas

# Sistema de Gestión Académica Distribuido

## Descripción General

Este proyecto implementa un sistema distribuido de gestión académica utilizando **microservicios** desarrollados con **Spring Boot**. El sistema está compuesto por tres microservicios principales:

1. **usuarios-servicio**: Gestiona información sobre estudiantes y docentes.
2. **asignaturas-servicio**: Permite realizar operaciones CRUD sobre las materias.
3. **matriculas-servicio**: Maneja el registro de estudiantes en las materias.

Cada microservicio tiene su propia base de datos y configuración independiente, siguiendo principios de descentralización y escalabilidad. El sistema está diseñado para ser altamente modular y facilitar el mantenimiento, actualización y ampliación en función de las necesidades de la institución educativa.

## Enfoque Distribuido

El sistema utiliza el paradigma de arquitectura distribuida basado en microservicios, con las siguientes características:

- **Separación de responsabilidades**: Cada microservicio aborda una funcionalidad específica (usuarios, asignaturas o matrículas) y es independiente de los demás.
- **Bases de datos individuales**: Cada microservicio gestiona su propia base de datos, evitando dependencias directas entre los servicios.
- **Comunicación entre microservicios**: Utilizamos herramientas como **Feign** o **RestTemplate** para permitir que los microservicios se comuniquen entre sí.
- **Registro y descubrimiento**: Se implementa **Spring Cloud Netflix Eureka** para facilitar el descubrimiento y la conexión entre servicios.
- **Escalabilidad y resiliencia**: Gracias a su diseño modular, los microservicios pueden escalarse individualmente para manejar incrementos en la carga de trabajo. Además, se utilizan patrones como **Circuit Breaker** (con Resilience4j) para manejar fallos.
- **Seguridad**: Se implementa autenticación y autorización mediante **JWT** utilizando Spring Security para proteger el acceso a los servicios.

## Estructura del Proyecto

Cada microservicio se organiza como un proyecto independiente, con los siguientes elementos:

- **Entidades**: Modelos de datos representados mediante JPA.
- **Controladores**: Exponen endpoints REST para las operaciones específicas.
- **Repositorios**: Gestionan la interacción con la base de datos.
- **Configuración**: Archivos `application.properties` para cada servicio con sus respectivas credenciales y configuraciones específicas.

## Requisitos Previos

- **Java 17 o superior**
- **Spring Boot 2.7+**
- **MySQL/PostgreSQL**
- **Maven**
- **Docker** (opcional, para despliegue en contenedores)

## Instalación y Ejecución

1. Clonar el repositorio de cada microservicio.
2. Configurar las bases de datos correspondientes en el archivo `application.properties`.
3. Ejecutar cada microservicio de forma individual utilizando un IDE o Maven.
4. Iniciar Eureka Server para el registro y descubrimiento de los microservicios.

