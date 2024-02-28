
## Errores encontrados en esta primera fase del proyecto:

### Error de Funcionamiento General:

Se ha detectado un error general en la aplicación con el siguiente mensaje:
```java
springboot java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
```
Este error es debido a que no carga correctamente los drivers de la conexion de la base de datos.  
Arreglo: pom.xml dependencias para la base de datos:
```xml
   		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version> <!-- transitive vulnerable dependency maven -->
		</dependency>
```


Intellij Idea sugiere instalar plugin: Protocol Buffers: Instalo. Resultado:
- detecta vulnerabilidad en código, es la versión de sql <!-- transitive vulnerable dependency maven -->  
  Arreglo: desde repositorio de maven instalo dependencias actualizadas:
```xml

    <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
```

Se crea la base de datos al lanzar el programa de Springboot, pero no genera el código: listado de registro en la base de datos.  
El error es debido a la persistencia, cada vez que inicio el programa crea la base de datos pero machaca los registros. Se arregla modificando parte del código en el archivo de configuración de conexión a la base de datos "application.properties".
```
spring.jpa.hibernate.ddl-auto=update

```
Cambio la clase padre para poder realizar paginación en PersonRepository.java.
```
public interface PersonRepository extends JpaRepository<Person, Long>
```
En la fase 4 pequeño error detectado, fijarse en el nombre de los atributos de las tablas cuando se hace referencia en una consulta personalizada.
