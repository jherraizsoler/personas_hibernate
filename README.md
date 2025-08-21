# Sistemas de Personas con Hibernate CRUD

## 📜 Descripción del Proyecto

Este es un proyecto backend sencillo que demuestra la implementación de las operaciones **CRUD** (Crear, Leer, Actualizar, Borrar) para una entidad `Persona` utilizando **Hibernate ORM** y **Java**. El objetivo principal es proporcionar un ejemplo claro y funcional de cómo interactuar con una base de datos relacional (MySQL) a través de una capa de persistencia gestionada por Hibernate.

---

## 🛠️ Tecnologías y Dependencias

El proyecto se gestiona con **Maven** y utiliza las siguientes tecnologías y librerías:

* **Java 21:** La versión del JDK utilizada para la compilación y ejecución.
* **Hibernate ORM 6.6.9.Final:** El framework de mapeo objeto-relacional (ORM) que simplifica la interacción con la base de datos.
* **MySQL Connector/J 9.2.0:** El controlador JDBC necesario para establecer la conexión con la base de datos MySQL.
* **Log4j 2.24.3:** Librería de logging para el registro de eventos y depuración de la aplicación.

### `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="[http://maven.apache.org/POM/4.0.0](http://maven.apache.org/POM/4.0.0)" xmlns:xsi="[http://www.w3.org/2001/XMLSchema-instance](http://www.w3.org/2001/XMLSchema-instance)" xsi:schemaLocation="[http://maven.apache.org/POM/4.0.0](http://maven.apache.org/POM/4.0.0) [http://maven.apache.org/xsd/maven-4.0.0.xsd](http://maven.apache.org/xsd/maven-4.0.0.xsd)">
    <modelVersion>4.0.0</modelVersion>
    <groupId>gm</groupId>
    <artifactId>HibernateEjemplo1</artifactId>
    <version>1.0</version>
    <packaging>jar</packaging>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.release>21</maven.compiler.release>
        <exec.mainClass>HibernateEjemplo1</exec.mainClass>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.6.9.Final</version>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>9.2.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.24.3</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.24.3</version>
        </dependency>
    </dependencies>
</project>
```

---

## 📂 Estructura del Proyecto

La estructura del proyecto sigue las convenciones de Maven, con las clases de lógica de negocio y las operaciones de persistencia organizadas en paquetes.

```
HibernateEjemplo1/
├── src/main/java/
│   ├── dao/
│   │   └── PersonaDAO.java
│   ├── modelo/
│   │   └── Persona.java
│   └── test/
│       └── OperacionesHibernateJPA.java
└── src/main/resources/
    ├── hibernate.cfg.xml
    └── log4j2.properties
```

---

## 📦 Estructura de la Base de Datos

El proyecto se conecta a una base de datos MySQL llamada test y espera la existencia de una tabla `persona`.

1. Vamos a crear en MySQL Workbench la base de datos llamada test
2. Después vamos a importar la estructura y datos de la base de datos para ello le damos a "Server" en el menu de arriba en el Toolbar
3. Después en "Data Import"
4. Seleccionamos la carpeta importarBD_test que se encuentra en este mismo proyecto en la carpeta Documentation
5. Y le damos en "Start Import" 

---

## 🚀 Uso

La clase principal **`OperacionesHibernateJPA.java`** contiene el punto de entrada para ejecutar las operaciones CRUD. El código está comentado para que puedas habilitar y probar cada funcionalidad (listar, insertar, actualizar y eliminar) de forma individual.

### Ejemplo de uso de la clase principal

```java
package test;

import dao.PersonaDAO;
import modelo.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        try (PersonaDAO personaDao = new PersonaDAO()){
            // 1. Caso listar
            personaDao.imprimirPersonas();

            // 2. Caso insertar
            // Persona persona = new Persona();
            // persona.setNombre("Carlos");
            // persona.setApellido("Lara");
            // persona.setEmail("clara@gmail.com");
            // persona.setTelefono("7412528963");
            // persona.setSaldo(4578.48);
            // personaDao.insertar(persona);

            // 3. Caso actualizar
            // Persona persona = new Persona();
            // persona.setIdPersona(73);
            // persona = personaDao.buscarPersonaPorId(persona);
            // System.out.println("Persona encontrada: " + persona);
            // persona.setApellido("Esparza2");
            // persona.setEmail("cesparza@gmail.com");
            // personaDao.modificar(persona);
            // personaDao.imprimirPersonas();

            // 4. Caso eliminar
            // Persona persona = new Persona();
            // persona.setIdPersona(73);
            // persona = personaDao.buscarPersonaPorId(persona);
            // System.out.println("Persona encontrada: " + persona);
            // personaDao.eliminar(persona);
            // personaDao.imprimirPersonas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
```

---

## 🔧 Configuración Adicional

Asegúrate de configurar los archivos `hibernate.cfg.xml` y `log4j2.properties` en la carpeta `src/main/resources` con los datos de tu base de datos (URL, usuario y contraseña) para que la conexión funcione correctamente.

