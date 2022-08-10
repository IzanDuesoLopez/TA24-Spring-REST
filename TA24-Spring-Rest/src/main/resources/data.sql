DROP table IF EXISTS trabajadores;

create table trabajadores(
    id int auto_increment,
    nombre varchar(250),
    trabajo varchar(250),
    salario int
);

insert into trabajadores (nombre, trabajo)values('Izan', 'CAMARERO');
