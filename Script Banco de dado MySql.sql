drop database if exists confeitaria; -- excluir database

create database if not exists confeitaria
default character set utf8 -- uft8 (8-bit Unicode Transformation Format - Pode representar qualquer caracter universal padrão do Unicode, sendo também compatível com o ASCII)
default collate utf8_general_ci;

use confeitaria;-- selecionar banco de dados
/*
Outros comandos:
show database; -- lista os banco de dados criados
show tables;  -- lista as tabelas do database
describe ou desc "nome da tabela"; -- descreve os itens da tabela
*/

CREATE TABLE IF NOT EXISTS telefone ( -- criar tabela
    id INT NOT NULL AUTO_INCREMENT,
    numero VARCHAR(12) NOT NULL UNIQUE,
    ddd VARCHAR(3) NOT NULL,
    observacao VARCHAR(50),
    tipo ENUM('CEL', 'RES', 'COM') NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS endereco (
    id INT NOT NULL AUTO_INCREMENT,
    logradouro VARCHAR(100) NOT NULL,
    quadra VARCHAR(100) NOT NULL,
    lote VARCHAR(100),
    cidade VARCHAR(100) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    cep VARCHAR(8) NOT NULL,
    observacao VARCHAR(50),
    bairro VARCHAR(100) NOT NULL,
    complemento VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS usuario (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    cpf VARCHAR(100) NOT NULL UNIQUE,
    observacao VARCHAR(50),
    rg VARCHAR(100),
    senha VARCHAR(50) NOT NULL,
    id_endereco INT,
    id_telefone INT,
    tipo ENUM('CONF', 'CLIE') NOT NULL,
    FOREIGN KEY (id_endereco)
        REFERENCES endereco (id),
	FOREIGN KEY (id_telefone)
        REFERENCES telefone (id),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS pedido (
    id INT NOT NULL AUTO_INCREMENT,
    id_usuario INT NOT NULL, 
    data_pedido VARCHAR(50) NOT NULL,
    data_entrega VARCHAR(50) NOT NULL,
    aprovado boolean not null default false,
    FOREIGN KEY (id_usuario)
        REFERENCES usuario (id),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS fatura (
	id INT NOT NULL AUTO_INCREMENT,
	id_usuario INT NOT NULL,
    numero_fatura int not null,
    vencimento date NOT NULL,
    id_pedido INT NOT NULL,
    FOREIGN KEY (id_usuario)
        REFERENCES usuario (id),
	FOREIGN KEY (id_pedido)
        REFERENCES pedido (id),
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tipo_pagamento (
    id INT NOT NULL AUTO_INCREMENT,
    pix boolean NOT NULL,
    cartao boolean NOT NULL,
    boleto boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS pagamento (
	id INT NOT NULL AUTO_INCREMENT,
	id_fatura INT NOT NULL,
    data_vencimento date not null,
    data_pagamento date NOT NULL,
    valor double NOT NULL,
    id_tipo_pag INT NOT NULL,
    FOREIGN KEY (id_fatura)
        REFERENCES fatura (id),
	FOREIGN KEY (id_tipo_pag)
        REFERENCES tipo_pagamento (id),
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS produto (
    id INT NOT NULL AUTO_INCREMENT,
    com_recheio boolean NOT NULL,
    tem_massa boolean NOT NULL,
    tem_cobertura boolean NOT NULL,
    unidade INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS itens_pedido (
    id INT NOT NULL AUTO_INCREMENT,
    id_pedido int not null,
    id_produto int not null,
    massa VARCHAR(50),
    recheio VARCHAR(50) ,
    cobertura VARCHAR(50) ,
    tamanho VARCHAR(50) ,
    descricao VARCHAR(200),
	FOREIGN KEY (id_pedido)
        REFERENCES pedido (id),
	FOREIGN KEY (id_pedido)
        REFERENCES pedido (id),
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS status (
    id INT NOT NULL AUTO_INCREMENT,
	descricao varchar(50) not null,
	PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS historico_pedido (
    id INT NOT NULL AUTO_INCREMENT,
	id_pedido int not null,
    	id_status int not null,
	data date not null,
	FOREIGN KEY (id_pedido)
        REFERENCES pedido (id),
	FOREIGN KEY (id_status)
        REFERENCES status (id),
	PRIMARY KEY (id)
);