
-- Criação do Banco Inicial
CREATE DATABASE DOLCEPIE;
USE DOLCEPIE;

-- Criar a tabela de usuário + ADM (Maria)
CREATE TABLE usuarios (
    id_usuarios INT PRIMARY KEY AUTO_INCREMENT,
    nome_usuarios VARCHAR(256),
    email_usuarios VARCHAR(256),
    senha_usuarios VARCHAR(256) NOT NULL
);

CREATE TABLE administradores (
    id_administrador INT PRIMARY KEY AUTO_INCREMENT,
    nome_administrador VARCHAR(256),
    email_administrador VARCHAR(256) UNIQUE NOT NULL,
    senha_administrador VARCHAR(256) NOT NULL
);

-- Criar a tabela de produtos e tabela favorita (Fernanda)
CREATE TABLE produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(100),
    descricao_produto TEXT,
    preco_unitario DECIMAL(10, 2),
    estoque_produto INT,
    categoria_produto VARCHAR(50)
    promocao_produto tinynt(1)
);


CREATE TABLE favoritos (
    id_favorito INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_produto INT,
    FOREIGN KEY (id_usuarios) REFERENCES usuarios(id),
    FOREIGN KEY (id_produtos) REFERENCES produtos(id_produto)
);

-- Criar a tabela de pedidos (Luiz)
CREATE TABLE pedidos (
  id_pedido INT PRIMARY KEY AUTO_INCREMENT,
  id_usuarios INT,
  data_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
  total_pedido DECIMAL(10, 2) NOT NULL,
  FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
) ENGINE=InnoDB;

-- Criar a tabela de carrinhos e pagamentos (Luna)
CREATE TABLE cart (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT NOT NULL,
    produto_id INT NOT NULL,
    quantidade INT NOT NULL DEFAULT 1,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (cliente_id) REFERENCES usuarios(id),
    FOREIGN KEY (produto_id) REFERENCES produtos(id_produto)
);

-- Criar tabela de pagamentos
CREATE TABLE pay (
    id_pagamento INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_produto INT NOT NULL,
    id_cliente INT NOT NULL,
    valor_total DECIMAL(10, 2),
    metodo_pagamento VARCHAR(50),
    status_pagamento ENUM('Pendente', 'Pago', 'Cancelado'),
    codigo_transacao VARCHAR(100),
    FOREIGN KEY (id_produto) REFERENCES produtos(id_produto),
    FOREIGN KEY (id_cliente) REFERENCES usuarios(id)
    -- Criar a tabela de estoque (Jeferson)
CREATE TABLE estoque (
    id_produtofronecedor INT PRIMARY KEY AUTO_INCREMENT,
    nome_produto VARCHAR(255) NOT NULL,
    descricao_produto TEXT,
    quantidade_estoque INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    categoria_produto VARCHAR(100),
    data_entrada DATE,
    data_validade DATE,
    fornecedor VARCHAR(255),
    status_produto ENUM('ativo', 'inativo') NOT NULL
);

-- Criar a tabela de cupons
CREATE TABLE cupons (
    id_cupom INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(50) UNIQUE NOT NULL,
    desconto_percentual DECIMAL(5, 2) NOT NULL,
    data_validade DATE NOT NULL
);
--Criar a tabela de endereços

CREATE TABLE enderecos (
    id_endereco INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    rua VARCHAR(255) NOT NULL,
    numero VARCHAR(50) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    estado VARCHAR(100) NOT NULL,
    cep VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
) ENGINE = InnoDB;
