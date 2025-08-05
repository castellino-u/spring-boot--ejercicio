# spring-boot--ejercicio
Ejercicio de spring boot para las pasantías de la UTN

# 📘 Spring Boot - Proyecciones (Spring Data Projections)

Este es un proyecto de ejemplo construido con **Spring Boot** que implementa el patrón de **Proyecciones** utilizando **Spring Data JPA**.

Las **proyecciones** permiten seleccionar solo los campos necesarios de una entidad en las consultas, mejorando el rendimiento y reduciendo la transferencia de datos innecesarios.

---

## 🧠 ¿Qué es una Proyección?

En Spring Data JPA, una **proyección** es una técnica para definir qué datos queremos recuperar de una entidad sin traerla completamente. Esto es útil cuando solo necesitamos una parte de los datos, por ejemplo para mostrar en una tabla, resumen, vista previa, etc.

Por ejemplo, en vez de obtener una entidad `Book` completa con todos sus atributos, podemos crear una interfaz como `BookSummary` que solo recupere el `title`, `author` y `price`.

---

## 🧱 Tecnologías utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (en memoria)
- Maven
- Postman (para pruebas de API)

---

## 📦 Estructura del proyecto

  projections-demo/
  ├── entity/
  │ └── Book.java
  ├── projection/
  │ └── BookSummary.java
  ├── repository/
  │ └── BookRepository.java
  ├── controller/
  │ └── BookController.java
  ├── ProjectionsDemoApplication.java
  └── application.properties

🧪 Cómo probar el proyecto
1. Iniciar el proyecto
Abrí el proyecto en IntelliJ IDEA, asegurate de que esté seleccionado Java 17, y ejecutá la clase:  ProjectionsDemoApplication.java

📮 Endpoints para Postman
➤ Obtener resumen de todos los libros
GET http://localhost:8080/summary

➤ Obtener resumen paginado
GET http://localhost:8080/summary/page?page=0&size=2

💡 Beneficios del uso de proyecciones
✅ Mejora el rendimiento al evitar cargar datos innecesarios
✅ Reduce el tráfico entre base de datos y backend
✅ Ideal para vistas parciales como resúmenes o previews
✅ Compatible con paginación y filtros en Spring Data



