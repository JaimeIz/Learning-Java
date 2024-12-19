CREATE TABLE
    Director (
        id NUMBER (10) PRIMARY KEY,
        nombre VARCHAR (100),
        nacionalidad VARCHAR (100)
    );

CREATE TABLE
    Productora (
        id NUMBER (10) PRIMARY KEY,
        nombre VARCHAR (100),
        pais VARCHAR (100)
    );

CREATE TABLE
    Pelicula (
        id NUMBER (10) PRIMARY KEY,
        titulo VARCHAR (100),
        año NUMBER (5),
        genero VARCHAR (100),
        id_director NUMBER (10),
        id_productora NUMBER (10),
        recaudacion NUMBER (10, 2),
        presupuesto NUMBER (10, 2),
        CONSTRAINT director FOREIGN KEY (id_director) REFERENCES Director (id),
        CONSTRAINT productora FOREIGN KEY (id_productora) REFERENCES Productora (id)
    );

INSERT INTO
    Director
VALUES
    (1, 'Steven Spielberg', 'Estadounidense'),
    (2, 'Patty Jenkins', 'Estadounidense'),
    (3, 'Julius Avery', 'Australiano'),
    (4, 'Guy Ritchie', 'Británico'),
    (5, 'Hermanas Wachowski', 'Estadounidense'),
    (6, 'Santiago Segura', 'Española');

INSERT INTO
    Productora
VALUES
    (1, 'Warner Bros', 'Estados Unidos'),
    (2, 'Paramount Pictures', 'California'),
    (3, '20th Century Fox', 'Estados Unidos');

INSERT INTO
    Pelicula
VALUES
    (1, 'Ready Player One: Comienza el juego', 2018, 'Ciencia Ficción', 1, 1, 582, 175 ),
    (2, 'Mujer Maravilla', 2017, 'Ciencia Ficción', 2, 1, 822, 149),
    (3, 'Overlord', 2018, 'Terror', 3, 2, 84.7, 38),
    (4, 'Snatch, cerdos y diamantes', 2000, 'Acción', 4, 3, 93.6, 6),
    (5, 'Pruebas Varias', 1982, 'Comedia', 2, 3, 35.2, 10),
    (6, 'Otras Pruebas', 2018, 'Comedia', 4, 2, 94.5, 15),
    (7, 'Torrente', 1998, 'Comedia', 6, null, 10.9, 12.7),
    (8, 'Pruebas Null', 2018, 'Comedia', null, null, 100, 30),
    (9, 'E.T', 1982, 'Ciencia Ficción', 1, 1, 730, 10.5),
    (10, 'Matrix', 1999, 'Ciencia Ficción', 5, 1, 464.5, 63),
    (11, 'Jurassic Park', 1993, 'Ciencia Ficción', 1, 1, 1029, 63);
