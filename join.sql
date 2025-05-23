
SELECT 
    u.id_usuarios, 
    u.nome_usuarios, SELECT 
    u.id_usuarios, 
    u.nome_usuarios, 
    p.id_produto, 
    p.nome_produto, 
    f.id_favorito
FROM 
    usuarios u
JOIN 
    favoritos f ON u.id_usuarios = f.id_usuario
JOIN 
    produtos p ON f.id_produto = p.id_produto;

    p.id_produto, 
    p.nome_produto, 
    f.id_favorito
FROM 
    usuarios u
JOIN 
    favoritos f ON u.id_usuarios = f.id_usuario
JOIN 
    produtos p ON f.id_produto = p.id_produto;
--2. Relacionando Pedidos com Produtos e Usuários
Aqui, você vê os pedidos feitos pelos usuários e os produtos associados a esses pedidos.

SELECT 
    p.id_pedido, 
    p.data_pedido, 
    p.total_pedido, 
    u.id_usuarios, 
    u.nome_usuarios, 
    pr.id_produto, 
    pr.nome_produto
FROM 
    pedidos p
JOIN 
    usuarios u ON p.id_usuarios = u.id_usuarios
JOIN 
    cart c ON c.id_usuario = u.id_usuarios
JOIN 
    produtos pr ON c.id_produto = pr.id_produto
WHERE 
    p.id_pedido = c.id_cart;
3. Relacionando Pagamentos com Produtos e Usuários
Aqui, você pode ver os pagamentos feitos pelos usuários e os produtos comprados.

sql
Copiar
SELECT 
    pa.id_pagamento, 
    pa.valor_total, 
    pa.metodo_pagamento, 
    pa.status_pagamento, 
    u.id_usuarios, 
    u.nome_usuarios, 
    pr.id_produto, 
    pr.nome_produto
FROM 
    pay pa
JOIN 
    usuarios u ON pa.id_cliente = u.id_usuarios
JOIN 
    produtos pr ON pa.id_produto = pr.id_produto;
--4. Relacionando Estoque com Pedidos (Produtos no Estoque para Pedidos Realizados)
Aqui, você pode ver os produtos comprados em pedidos e sua quantidade no estoque.


SELECT 
    e.id_produtofornecedor, 
    e.nome_produto, 
    e.quantidade_estoque, 
    e.preco_unitario, 
    p.id_pedido, 
    p.total_pedido, 
    c.quantidade AS quantidade_comprada
FROM 
    estoque e
JOIN 
    produtos p ON e.nome_produto = p.nome_produto
JOIN 
    cart c ON c.id_produto = p.id_produto
JOIN 
    pedidos p ON p.id_pedido = c.id_cart
WHERE 
    p.id_pedido = c.id_cart;
--5. Relacionando Endereços com Usuários
Aqui, você pode ver os endereços cadastrados pelos usuários.

SELECT 
    u.id_usuarios, 
    u.nome_usuarios, 
    e.rua, 
    e.numero, 
    e.cidade, 
    e.estado, 
    e.cep
FROM 
    usuarios u
JOIN 
    endereco e ON u.id_usuarios = e.id_usuario;
--6. Relacionando Cupons com Produtos
Aqui, você pode ver quais produtos têm cupons aplicados.
SELECT 
    c.id_cupom, 
    c.codigo, 
    c.desconto_percentual, 
    p.id_produto, 
    p.nome_produto
FROM 
    cupons c
JOIN 
    produtos p ON p.promocao_produto = 1
WHERE 
    p.id_produto IN (SELECT id_produto FROM produtos WHERE categoria_produto = 'categoria relacionada ao cupom');
--7. Relacionando Pedidos com Cupons
Aqui, você pode ver quais pedidos tiveram cupons aplicados.

SELECT 
    p.id_pedido, 
    p.data_pedido, 
    p.total_pedido, 
    p.desconto_aplicado, 
    c.id_cupom, 
    c.codigo, 
    c.desconto_percentual
FROM 
    pedidos p
LEFT JOIN 
    cupons c ON p.desconto_aplicado > 0 AND c.desconto_percentual = p.desconto_aplicado;
--8. Relacionando Pedidos com Endereços e Usuários
Aqui, você pode ver os pedidos feitos pelos usuários e os endereços associados.

SELECT 
    p.id_pedido, 
    p.data_pedido, 
    p.total_pedido, 
    u.id_usuarios, 
    u.nome_usuarios, 
    e.rua, 
    e.numero, 
    e.cidade, 
    e.estado, 
    e.cep
FROM 
    pedidos p
JOIN 
    usuarios u ON p.id_usuarios = u.id_usuarios
JOIN 
    endereco e ON u.id_usuarios = e.id_usuario;
--9. Relacionando Estoque com Produtos
Aqui, você pode ver os produtos disponíveis no estoque.
SELECT 
    e.id_produtofornecedor, 
    e.nome_produto AS nome_produto_estoque, 
    e.quantidade_estoque, 
    e.preco_unitario, 
    e.fornecedor, 
    p.id_produto, 
    p.nome_produto
FROM 
    estoque e
JOIN 
    produtos p ON e.nome_produto = p.nome_produto;
--10. Relacionando Favoritos com Estoque
Aqui, você pode ver quais produtos favoritados estão disponíveis no estoque.
SELECT 
    f.id_favorito, 
    f.id_usuario, 
    f.id_produto, 
    p.nome_produto, 
    p.preco_produto, 
    e.quantidade_estoque
FROM 
    favoritos f
JOIN 
    produtos p ON f.id_produto = p.id_produto
JOIN 
    estoque e ON p.id_produto = e.id_produto;
--11. Relacionando Cupons com Pedidos
Aqui, você pode ver quais pedidos aplicaram um cupom de desconto.

sql
Copiar
SELECT 
    p.id_pedido, 
    p.data_pedido, 
    p.total_pedido, 
    p.desconto_aplicado, 
    c.id_cupom, 
    c.codigo, 
    c.desconto_percentual
FROM 
    pedidos p
LEFT JOIN 
    cupons c ON p.desconto_aplicado > 0 AND c.desconto_percentual = p.desconto_aplicado;
--12. Relacionando Administradores com Produtos
Aqui, você pode ver quais administradores estão gerenciando quais produtos (presumindo que existe algum campo id_administrador na tabela produtos).

sql
Copiar
SELECT 
    a.id_administrador, 
    a.nome_administrador, 
    p.id_produto, 
    p.nome_produto, 
    p.preco_produto
FROM 
    administrador a
JOIN 
    produtos p ON a.id_administrador = p.id_administrador;  -- Aqui, assume-se que produtos tem a coluna id_administrador
--13. Relacionando Pagamentos com Pedidos e Produtos
Aqui, você pode ver os pagamentos realizados, com os produtos e o pedido.

SELECT 
    pa.id_pagamento, 
    pa.valor_total, 
    pa.metodo_pagamento, 
    pa.status_pagamento, 
    pr.id_produto, 
    pr.nome_produto, 
    p.id_pedido, 
    p.total_pedido
FROM 
    pay pa
JOIN 
    pedidos p ON pa.id_pagamento = p.id_pedido
JOIN 
    cart c ON p.id_pedido = c.id_cart
JOIN 
    produtos pr ON c.id_produto = pr.id_produto;
