# Gerenciador de Ponto 

A quick project to exercise some knowledge about Springboot framework. 

## Plugins and Tools

### Lombok
With this plugin we can make use of specific annotations and avoid code repetition. With these annotations the codes are cleaner which makes maintenance easier.

### Hibernate
*Envers* : Using the annotation @Audited on an entity will create another table to store change information about the modifications ind this table.

### H2dataBase

To avoid complications with configuration an SQL database in memory, [h2Database](https://www.h2database.com/html/main.html) was used to this finality.
### Swagger 2

Like documentation tool was used the [Swagger2](https://swagger.io/), with this tool the user can test and have a better understanding of this application. Just try access http://localhost:8081/swagger-ui.html when the application is running.