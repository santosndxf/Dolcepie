--CRIAÇÃO do Banco Inicial 
CREATE DOLCEPIE;
SELECT DOLCEPIE;

--Criar a tabela  de usuario(Maria)


--criar a tabela de produtos + tabela favorita (fernanda)


--Criar a tabela de pedidos + Itens do pedido(Luiz)



--Criar a tabela de carrinhos+ pagamentos Luna )
CREATE database cartTable;
USE cartTable;
CREATE TABLE cart(
 id INT primary key auto_increment,
 cliente_id int not null,
 produto_id int not null,
 quantidade int not null default 1,
 preço_unitario decimal(10,2) not null,
 total decimal(10,2) generated alwats as(quantidade * preço_unitario) stored,
 criado em timestamp default current timestamp,
 atualizado_em timestamp default current_timestamp on update current_timestamp,
 FOREIGN key(cliente_id) references clientes(id) on delete cascade,
 FOREIGN key(produto_id) references produto(id) on delete cascade,
 );
--criar tabela pagamentos
CREATE databse payTable;
USE payTable;
CREATE TABLE pay(
 id_pagamento int primary key auto_increment not null,
 id_produto int foreign key not null,
 id_cliente int foreign key  not null,
 valor_total decimal,
 metodo_pagamento varchar,
 status_pagamento ENUM,
 codigo_transaçao varchar
);

--Criar a tabela de Estoque (Jeferson)




