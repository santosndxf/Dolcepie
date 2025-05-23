
-- Cadastro de Usuários
INSERT INTO usuarios (nome, email, senha) 
VALUES 
('Francisco', 'francisco12@gmail.com', MD5('senha123')),
('Ana Souza', 'ana.souza@gmail.com', MD5('senha456')),
('Carlos Silva', 'carlos.silva@gmail.com', MD5('senha789')),
('João Oliveira', 'joao@example.com', MD5('senha321')),
('Maria Costa', 'maria.costa@gmail.com', MD5('senha654')),
('Lucas Almeida', 'lucas.almeida@gmail.com', MD5('senha987')),
('Fernanda Lima', 'fernanda.lima@gmail.com', MD5('senha123')),
('Rafael Santos', 'rafael.santos@gmail.com', MD5('senha456')),
('Camila Pereira', 'camila.pereira@gmail.com', MD5('senha789')),
('Ricardo Rocha', 'ricardo.rocha@gmail.com', MD5('senha000'));

-- Cadastro de Produtos
INSERT INTO produtos (nome, descricao, preco, estoque, categoria)
VALUES 
('Torta de Morango', 'Deliciosa torta de morango feita com ingredientes frescos.', 35.50, 100, 'Sobremesa'),
('Bolo de Chocolate', 'Bolo de chocolate com cobertura de ganache.', 40.00, 50, 'Sobremesa'),
('Coxinha', 'Coxinha de frango com massa crocante.', 5.00, 200, 'Lanche'),
('Pizza de Calabresa', 'Pizza de calabresa com mussarela e azeitonas.', 30.00, 75, 'Pizza'),
('Pão de Queijo', 'Pão de queijo quentinho e saboroso.', 3.00, 500, 'Lanche'),
('Hambúrguer', 'Hambúrguer artesanal com queijo e bacon.', 18.00, 150, 'Lanche'),
('Suco Natural', 'Suco de laranja natural e refrescante.', 6.50, 300, 'Bebida'),
('Torta Alemã', 'Torta alemã com creme de leite e chocolate.', 25.00, 80, 'Sobremesa'),
('Salgado de Carne', 'Salgado frito de carne moída temperada.', 4.50, 400, 'Lanche'),
('Café Expresso', 'Café expresso forte e saboroso.', 8.00, 150, 'Bebida');

-- Adicionar Produto ao Carrinho de Compras
INSERT INTO cart (cliente_id, produto_id, quantidade, preco_unitario)
VALUES 
(1, 2, 1, 40.00),
(2, 3, 2, 5.00),
(3, 4, 1, 30.00),
(4, 5, 3, 3.00),
(5, 6, 1, 18.00),
(6, 7, 2, 6.50),
(7, 8, 1, 25.00),
(8, 9, 4, 4.50),
(9, 10, 2, 8.00),
(10, 1, 5, 35.50);


-- Adicionar Produto aos Favoritos
INSERT INTO favoritos (id_usuario, id_produto)
VALUES 
(1, 2), 
(2, 3), 
(3, 4), 
(4, 5), 
(5, 6), 
(6, 7), 
(7, 8), 
(8, 9), 
(9, 10), 
(10, 1);

-- Atualizar Senha de um Usuário (Recuperação de Senha)
UPDATE usuarios
SET senha = MD5('nova_senha_segura')
WHERE email = 'joao@example.com';

-- Visualizar Pedidos de um Usuário
SELECT * FROM pedidos
WHERE id_usuario = 1;

-- Registrar Pagamento
INSERT INTO pay (id_produto, id_cliente, valor_total, metodo_pagamento, status_pagamento, codigo_transacao)
VALUES 
(1, 1, 100.00, 'Cartão de Crédito', 'Pago', 'ABC123XYZ'),
(2, 2, 40.00, 'Boleto Bancário', 'Pago', 'DEF456ABC'),
(3, 3, 10.00, 'PayPal', 'Pendente', 'GHI789DEF'),
(4, 4, 60.00, 'Cartão de Crédito', 'Pago', 'JKL012GHI'),
(5, 5, 90.00, 'Cartão de Crédito', 'Pago', 'MNO345JKL'),
(6, 6, 36.50, 'Cartão de Crédito', 'Pendente', 'PQR678MNO'),
(7, 7, 52.50, 'Boleto Bancário', 'Pago', 'STU901PQR'),
(8, 8, 100.00, 'Cartão de Crédito', 'Pago', 'VWX234STU'),
(9, 9, 50.00, 'PayPal', 'Pendente', 'YZ012VWX'),
(10, 10, 35.50, 'Cartão de Crédito', 'Pago', 'ABC456YZ');

-- Visualizar Estoque de Produtos
SELECT * FROM estoque
WHERE status_produto = 'ativo';

-- Atualizar Produto
UPDATE produtos
SET nome = 'Torta de Chocolate', preco = 40.00, estoque = 150
WHERE id_produto = 1;
-- Cadastro de Endereço de Entrega do Cliente 
INSERT INTO enderecos (id_cliente, rua, numero, cidade, estado, cep)
VALUES 
(1, 'Rua das Flores', '123', 'Manaus', 'AM', '69000-000'),
(2, 'Rua do Sol', '456', 'Manaus', 'AM', '69001-001'),
(3, 'Av. Paulista', '789', 'Manaus', 'AM', '69002-002'),
(4, 'Rua das Acácias', '101', 'Manaus', 'AM', '69003-003'),
(5, 'Rua dos Jasmins', '202', 'Manaus', 'AM', '69004-004'),
(6, 'Rua dos Girassóis', '303', 'Manaus', 'AM', '69005-005'),
(7, 'Av. Rio Branco', '404', 'Manaus', 'AM', '69006-006'),
(8, 'Rua da Paz', '505', 'Manaus', 'AM', '69007-007'),
(9, 'Rua do Comércio', '606', 'Manaus', 'AM', '69008-008'),
(10, 'Rua das Palmeiras', '707', 'Manaus', 'AM', '69009-009');

-- Consultar o Histórico de Compras de um Usuário
SELECT * FROM pedidos
WHERE id_cliente = 1;

-- Atualizar Status do Pedido
UPDATE pedidos
SET status = 'Enviado'
WHERE id_pedido = 1;

-- Cadastro de Cupons de Desconto
INSERT INTO cupons (codigo, desconto_percentual, data_validade)
VALUES 
('DESCONTO10', 10, '2025-12-31'),
('DESCONTO20', 20, '2025-06-30'),
('DESCONTO30', 30, '2025-09-15'),
('DESCONTO50', 50, '2025-05-01'),
('DESCONTO15', 15, '2025-10-25'),
('DESCONTO5', 5, '2025-12-15'),
('DESCONTO25', 25, '2025-07-22'),
('DESCONTO40', 40, '2025-04-18'),
('DESCONTO35', 35, '2025-08-10'),
('DESCONTO60', 60, '2025-11-05');

-- Aplicar Cupom de Desconto ao Pedido
UPDATE pedidos
SET desconto_aplicado = 10
WHERE id_pedido = 1;

-- Remover Produto do Carrinho de Compras
DELETE FROM cart
WHERE cliente_id = 1 AND produto_id = 1;

-- Consultar Produtos em Promoção
SELECT * FROM produtos
WHERE promocao = TRUE;

-- Atualizar Informações de um Usuário
UPDATE usuarios
SET nome = 'Francisco ', email = 'francisco123@gmail.com'
WHERE id_usuario = 1;


-- Consultar Produtos de uma Categoria
SELECT * FROM produtos
WHERE categoria = 'Sobremesa';

--jeferson

INSERT INTO Estoque (produto_nome, categoria, quantidade, preco_unitario, data_entrada)
VALUES ('Teclado Mecânico', 'Periféricos', 50, 120.99, '2025-03-11'),
       ('Mouse Gamer', 'Periféricos', 30, 85.50, '2025-03-10'),
       ('Monitor 24"', 'Monitores', 20, 750.00, '2025-03-09');

SELECT * FROM Estoque;
SELECT * FROM Estoque WHERE produto_nome = 'Mouse Gamer';
UPDATE Estoque SET quantidade = quantidade - 5 WHERE produto_nome = 'Teclado Mecânico';
DELETE FROM Estoque WHERE produto_nome = 'Monitor 24"';
SELECT * FROM Estoque WHERE quantidade < 10;
SELECT SUM(quantidade * preco_unitario) AS valor_total_estoque FROM Estoque;
