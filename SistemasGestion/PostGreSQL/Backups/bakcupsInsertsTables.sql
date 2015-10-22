create table eje1(
cod_eje1 varchar(20));
create table eje2(
cod_eje2 varchar(20));
create table eje3(
cod_eje3 varchar(20));

insert into eje1 values('polejemplo');
insert into eje2 values('lasrisas');
insert into eje3 values('povalexdxd');

pg_dump -i -h localhost -p 5432 -U damtarde -F c -b -v -f%BACKUP_FILE% prueba01