CREATE TABLE Departamento (
ID_Depto NUMERIC (2) NOT NULL,
NomeDepto VARCHAR (30) NOT NULL,
ID_Gerente NUMERIC (4) NOT NULL,
);

CONSTRAINT pk_depto PRIMARY KEY (ID_Depto),
CONSTRAINT uk_nome UNIQUE (NomeDepto),
);