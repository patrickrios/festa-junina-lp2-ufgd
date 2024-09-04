DROP TABLE IF EXISTS Barraca;
DROP TABLE IF EXISTS Salgado;
DROP TABLE IF EXISTS Salgados;
DROP TABLE IF EXISTS Doce;
DROP TABLE IF EXISTS Bebida;
DROP TABLE IF EXISTS Produto;
DROP TABLE IF EXISTS Grupos;

CREATE TABLE Produto(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    Preço FLOAT NOT NULL,
    Quantidade INT NOT NULL
);

CREATE TABLE Salgado(
    Massa VARCHAR(50) NOT NULL,
    Recheio VARCHAR(50) NOT NULL,
    Cozimento VARCHAR(50) NOT NULL,
    SalgadoId INT NOT NULL,
    FOREIGN KEY(SalgadoId) REFERENCES Produto(Sequencial)
);

CREATE TABLE Doce(
    Sabor VARCHAR(50) NOT NULL,
    Recheio VARCHAR(50) NOT NULL,
    DoceId INT NOT NULL,
    FOREIGN KEY(DoceId) REFERENCES Produto(Sequencial)
);

CREATE TABLE Bebida(
    VolumeEmML INT NOT NULL,
    Sabor VARCHAR(50) NOT NULL,
    Alcoolico BOOLEAN NOT NULL,
    Gaseificada BOOLEAN NOT NULL,
    BebidaId INT NOT NULL,
    FOREIGN KEY(BebidaId) REFERENCES Produto(Sequencial)
);

CREATE TABLE Grupos(
    NomeCurso VARCHAR(50) NOT NULL PRIMARY KEY,
    NumeroIntegrantes INT NOT NULL,
    VaiParticiparQuadrilha INT NOT NULL,
    NumeroDeItens INT NOT NULL
);

CREATE TABLE Barraca(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Jogo VARCHAR(50) NOT NULL,
    Grupo VARCHAR(50) NOT NULL,
    ProdutoId INT NOT NULL,
    FOREIGN KEY(Grupo) REFERENCES Grupos(NomeCurso),    
    FOREIGN KEY(ProdutoId) REFERENCES Produto(Sequencial)
);