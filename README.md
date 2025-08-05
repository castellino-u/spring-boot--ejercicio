# spring-boot--ejercicio
Ejercicio de spring boot para las pasantías de la UTN


# 📘 Spring Boot - Proyecciones (Projections) Demo

Este proyecto es una demostración del uso de **proyecciones (projections)** en Spring Data JPA, creado con **Spring Boot**. Las proyecciones permiten recuperar solo partes específicas de una entidad desde la base de datos, mejorando el rendimiento y haciendo más eficientes las consultas.

---

## 🔍 ¿Qué son las Proyecciones en Spring?

Las proyecciones permiten seleccionar solo ciertos campos de una entidad en una consulta. En lugar de traer todos los atributos del objeto, podemos elegir traer solo los necesarios usando interfaces o clases específicas.

Spring soporta 3 tipos de proyecciones:

1. **Proyecciones Basadas en Interfaces**: se definen con interfaces que contienen solo los getters de los campos deseados.
2. **Proyecciones Dinámicas**: permiten seleccionar el tipo de proyección en tiempo de ejecución.
3. **Proyecciones Basadas en Clases (DTO)**: devuelven objetos personalizados usando `new` en JPQL o construcciones específicas.

---

## 📦 Estructura del Proyecto

- `Book`: Entidad principal con los campos `id`, `title`, `author`, `genre`, `pages`, `price`.
- `BookRepository`: Repositorio JPA que incluye métodos usando proyecciones.
- `BookSummary`: Interface de proyección (solo `title` y `author`).
- `BookController`: Controlador REST que expone endpoints usando proyecciones.

---

## 🚀 Cómo correr el proyecto

1. Cloná o descargá este repositorio.
2. Abrí el proyecto con **IntelliJ IDEA** o tu IDE preferido.
3. Ejecutá la clase `ProjectionsDemoApplication`.
4. Accedé a los endpoints desde Postman o navegador.

---

## 📫 Endpoints disponibles

### ✅ Obtener todos los libros (entidad completa)
```http
GET http://localhost:8080/books
```

### ✅ Obtener solo título y autor (proyección con interfaz)
```http
GET http://localhost:8080/summary
```

### ✅ Obtener solo título y autor paginado
```http
GET http://localhost:8080/summary/page?page=0&size=2
```

---

## 🧪 Datos precargados (CommandLineRunner)

Al iniciar la app se cargan automáticamente estos libros:

- Clean Code - Robert C. Martin
- Effective Java - Joshua Bloch
- The Pragmatic Programmer - Andrew Hunt

---

## 💡 Ventajas del uso de Proyecciones

- Mejor rendimiento en consultas.
- Menor uso de memoria.
- Códigos más claros y enfocados.
- Útil para APIs donde no se requiere toda la información del objeto.

---

## 🛠 Tecnologías usadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (en memoria)
- Maven

---

💡 Beneficios del uso de proyecciones
✅ Mejora el rendimiento al evitar cargar datos innecesarios
✅ Reduce el tráfico entre base de datos y backend
✅ Ideal para vistas parciales como resúmenes o previews
✅ Compatible con paginación y filtros en Spring Data



