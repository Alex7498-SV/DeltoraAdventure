if not exists (select * from sys.sysdatabases where name = 'DeltoraAdventure')
	create database DeltoraAdventure;
go

use DeltoraAdventure;


if not exists (select * from sys.sysobjects where name = 'dato_usuario')
	create table dato_usuario(
		idUsuario int not null primary key identity,
		usuario varchar(12) not null,
		puntaje int
	);
go

