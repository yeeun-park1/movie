CREATE TABLE movietbl (
  mcode bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  mactor varchar(100) NOT NULL,
  mdirector varchar(50) NOT NULL,
  mgenre varchar(100) NOT NULL,
  mname varchar(50) NOT NULL,
  mnation varchar(50) NOT NULL,
  mopen varchar(10) NOT NULL,
  moriname varchar(50) DEFAULT NULL,
  msynopsis varchar(2000) DEFAULT NULL,
  msysname varchar(50) DEFAULT NULL
);

CREATE TABLE tagtbl (
  tcode bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  tcount int NOT NULL,
  tid double NOT NULL,
  tmcode bigint NOT NULL,
  ttype varchar(20) NOT NULL,
  tword varchar(20) NOT NULL,
  FOREIGN KEY (tmcode) REFERENCES movietbl(mcode)
);