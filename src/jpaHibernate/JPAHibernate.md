# JPA HIBERNATE e SPRING DATA
💻 **[Projeto Rasfood](https://github.com/ruan-lopes16/rasfood/tree/master)**
---
# JPA Hibernate

## JDBC
- Conjunto de classes/Biblioteca que facilitam o acesso ao banco de dados(Jav Database Connectivity), utilizando JAVA, independente da tecnologia de persistência (tecnologias relacionais)
- Especificação para que seja possível acessar banco de dados relacionais no JAVA de forma abstrata
- Surgimento do DAO(Data acess Object) - isola as configurações do JDBC em um único pacote
`CONTROLER/SERVICE -> CLASSES DAO -> BANCO DE DADOS`

Ex.: invocando classe DAO
```java
public class CadastrarCursoService {
    private CursoDao cursoDao;
    
    public CadastroProdutoService(CursoDao cursoDao){
        this.cursoDao = cursoDao;
    }
    
    public void cadastrarCurso(Curso curso){
        this.cursoDao.salvar(curso)
    }
}
```

por dentro da classe DAO
```java
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CursoDao {
    private Connection connection;

    public CursoDao(Connection connection) {
        this.connection = connection;

    }

    public void salvar(Curso curso) {
        try {
            String query = "INSERT INTO curso(nome, descricao, horas) VALUES(?,?,?)";

            PreparedStatement ps - this.connection.prepareStatement(query);
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getDescricao());
            ps.setInt(3, curso.getHoras());
            
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o curso", e);
        }
    }
}
```

## JPA
- Alternativa ao JDBC e EJB2
- Mantida pela RedHat
- Projeto engessados por limitação de biblioteca
- padrão ORM(Object Relational Mapping) - mapeamento entre o mundo real e a POO
- logo em seguida, JPA (Java Persistence APO - 2006) como especificação

- Agora não precisa mais importar as clases de outras tecnologias como: Hibernate, OpenJPA ou EclipseLink, basta importar o JPA e as classes irão implementar os métodos do JPA

# Começando um projeto
- Dentro do IntelliJ, ao criar um novo projeto se atentar em criar um projeto **Maven**
- Após criado o projeto é gerado um arquivo `.pom`
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
    <groupId>org.example</groupId>
    <artifactId>rasfood</artifactId>
    <version>1.0-SNAPSHOT</version>
</project> 
```

## DEPENDÊNCIAS
- Inicialmente precisamos instalar as dependências de banco e hibernate
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager --> <!-- HIBERNATE -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.6.15.Final</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.h2database/h2 --> <!-- h2(banco provisório) -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.3.232</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

- Para nosso projeto inicialmente, isso já basta
_ARQUIVO POM COMPLETO_
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>rasfood</artifactId>
    <version>1.0-SNAPSHOT</version>

    <!-- dependencias de projeto - hibernate e h2(banco provisório) -->
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager --> <!-- HIBERNATE -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.6.15.Final</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.h2database/h2 --> <!-- h2(banco provisório) -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.3.232</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <properties>
        <maven.compiler.source>16</maven.compiler.source>
        <maven.compiler.target>16</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>
```

**NOTA-SE que as `dependencies` estão antes das `properties`, e sempre que adicionar novas dependências devem ser colocadas dentro de `dependencies`**

## ENTIDADES
- Cria-se um arquivo chamado `persistence.xml` para configuração de database - indicar qual tipo iremos usar, credênciais, dialeto e etc.
- Caminho "padrão":
    📁 src
      └── 📁 main
        └── 📁 resources
            └── 📁 META-INF
                └── 📄 persistence.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2"
             xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
    <persistence-unit name="rasFood" transaction-type="RESOURCE_LOCAL">
        <properties>
            <property name="javax.persistence.jdbc.driver" value="org.h2.Driver"/> <!-- driver jdbc/banco de dados que iremos usar -->
            <property name="javax.persistence.jdbc.url" value="jdbc:h2:mem:rasfood"/> <!-- url de banco -> nesse caso url em memória -->
            <property name="javax.persistence.jdbc.user" value="rasmoo"/> <!-- usuário -->
            <property name="javax.persistence.jdbc.password" value=""/> <!-- senha -->
            <property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/> <!-- dialeto da tecnologia sql que está usando --> (palavras-chave)
        </properties>
    </persistence-unit>
</persistence>
```