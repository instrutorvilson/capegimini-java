insert into contato(nome, email) values ('maria','maria@gmail.com');
insert into contato(nome, email) values ('ana','ana@gmail.com');
insert into contato(nome, email) values ('josefa','josefa@gmail.com');
insert into contato(nome, email) values ('ursula','ursula@gmail.com');

insert into compromisso(data, hora, local,idcontato)values('2022-05-19','13:30:00','teste',1);
insert into compromisso(data, hora, local,idcontato)values('2022-05-20','17:30:00','teste',2);
insert into compromisso(data, hora, local,idcontato)values('2022-05-21','08:30:00','teste',3);
insert into compromisso(data, hora, local,idcontato)values('2022-05-21','13:30:00','teste',4);


insert into tb_cliente(nome, email)values('maria','maria@gmail.com');
insert into tb_cliente(nome, email)values('jose','jose@gmail.com');
insert into tb_cliente(nome, email)values('Antonia','antonia@gmail.com');

insert into tb_venda(dia_compra, cliente_id)values('2022-05-24',1);
insert into tb_venda(dia_compra, cliente_id)values('2022-04-24',1);
insert into tb_venda(dia_compra, cliente_id)values('2022-04-01',1); 

insert into tb_venda(dia_compra, cliente_id)values('2022-05-12',2);
insert into tb_venda(dia_compra, cliente_id)values('2022-03-24',2);
insert into tb_venda(dia_compra, cliente_id)values('2022-02-24',2);

insert into tb_venda(dia_compra, cliente_id)values('2022-03-24',3);
insert into tb_venda(dia_compra, cliente_id)values('2022-02-24',3);

insert into autor(nome)values('Machado de Assis');
insert into autor(nome)values('José de Alencar');
insert into autor(nome)values('Clarice Lispector');
insert into autor(nome)values('Aloisio Azevedo');

insert into livro(titulo)values('Dom Casmurro');
insert into livro(titulo)values('O Guarani');
insert into livro(titulo)values('A paixão segundo GH');

insert into livro_autores(livro_id,autores_id)values(1,1);
insert into livro_autores(livro_id,autores_id)values(2,2);
insert into livro_autores(livro_id,autores_id)values(3,3);
insert into livro_autores(livro_id,autores_id)values(1,3);


