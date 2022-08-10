DROP table IF EXISTS trabajadores;

create table trabajadores(
    id int auto_increment,
    nombre varchar(250),
    trabajo varchar(250),
    salario int
);

insert into trabajadores (nombre, trabajo, salario)values('Izan', 'CAMARERO', 300);
insert into trabajadores (nombre, trabajo, salario)values('Eder', 'CAJERO', 300);
insert into trabajadores (nombre, trabajo, salario)values('Oscar', 'OBRERO', 300);
insert into trabajadores (nombre, trabajo, salario)values('Lander', 'DEVELOPER', 300);
insert into trabajadores (nombre, trabajo, salario)values('Ludex', 'FUTBOLISTA', 300);
