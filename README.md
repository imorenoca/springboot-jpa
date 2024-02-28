Proyecto en Springboot para aprender persistencia con Hibernate y JPA:
- Configuración de proyecto.
- Creación archivo de conexión a la base de datos.
- Entities y Repositories
Errores encontrados en esta primera fase del proyecto:
- Error de funcionamiento general:
     springboot java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
Este error es debido a que no carga correctamente los drivers de la conexion de la base de datos.
Arreglo: pom.xml dependencias para la base de datos:
  		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version> <!-- transitive vulnerable dependency maven -->
		  </dependency>
Intellij Idea sugiere instalar plugin: Protocol Buffers:
  - detecta vulnerabilidad en código, es la versión de sql <!-- transitive vulnerable dependency maven -->
Arreglo: desde repositorio de maven instalo dependencias actualizadas:

    <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
