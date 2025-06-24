drop schema if exists practica; 
drop user if exists usuario_practica; 
CREATE SCHEMA practica ; 

create user 'usuario_practica'@'%' identified by 'la_Clave'; 

grant all privileges on practica.* to 'usuario_practica'@'%'; 
flush privileges;

create table practica.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(30) NOT NULL,
  tipo_flor VARCHAR(30) NOT NULL,
  dureza_madera FLOAT NOT NULL,
  ruta_imagen varchar(1024),
  PRIMARY KEY (id_arbol))
ENGINE = InnoDB 
DEFAULT CHARACTER SET = utf8mb4;

/*Se insertan 2 registros en la tabla arbol como ejemplo */
INSERT INTO practica.arbol (id_arbol, nombre_comun,tipo_flor,dureza_madera, ruta_imagen) VALUES 
(1,'Pino','Conos',1.8, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq3FgD3JxN-Xu6wt3EecUnLzjXREJHTfeveA&s'),
(2,'Arbol de cerezo','Flor de cerezo',4.3,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8VYCF6QKGf8ZEUmgzznxzLXmOcXNBQnOKIA&s');


SELECT * FROM practica.arbol;