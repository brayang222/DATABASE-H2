CREATE TABLE IF NOT EXISTS COMPUTADOR (
    serial integer not null AUTO_INCREMENT,
    marca varchar(255) not null,
    modelo varchar(255) not null,

    primary key (serial)
)