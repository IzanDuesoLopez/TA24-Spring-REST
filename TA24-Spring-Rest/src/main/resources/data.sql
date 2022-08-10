DROP table IF EXISTS trabajadores;

create table trabajadores(
    id int auto_increment,
    nombre varchar(250),
    trabajo varchar(250),
    salario int
);

insert into trabajadores (nombre, trabajo)values('Izan', 'CAMARERO');
insert into trabajadores (nombre, trabajo)values('Eder', 'CAJERO');
insert into trabajadores (nombre, trabajo)values('Oscar', 'OBRERO');
insert into trabajadores (nombre, trabajo)values('Lander', 'DEVELOPER');
insert into trabajadores (nombre, trabajo)values('Ludex', 'FUTBOLISTA');
