
CREATE TABLE users(
	cpf int(11) NOT NULL auto_increment primary key,
	name varchar(50) NOT NULL,
    agency int(5) NOT NULL,
    account int(8) NOT NULL
);