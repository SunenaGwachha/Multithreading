
Multithreading tutorial

  https://www.youtube.com/watch?v=3rJBLFA95Io

Mockdata dinay website

  https://mockaroo.com/

H2 database

  http://localhost:9191/h2-console/login.do?jsessionid=dffaf966b8648a81a2900d5295529e3c

Application.properties

  spring.datasource.url=jdbc:h2:mem:testdb
  
  spring.datasource.driverClassName=org.h2.Driver
  
  spring.datasource.username=sa
  
  spring.datasource.password=sa
  
  spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

Application.yml

    spring:
  
     h2:
    
      console:
      
        enabled: true
            
   server:
  
    port: 9191
    
    
    
    POST http://localhost:9191/users         
    GET    http://localhost:9191/users
    
    http://localhost:9191/h2-console/login.do?jsessionid=dffaf966b8648a81a2900d5295529e3c
    
    http://localhost:9191/getUsersByThread

