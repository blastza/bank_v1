CREATE TABLE IF NOT EXISTS investor (
  id BIGSERIAL primary key,
  firstname varchar(50) NOT NULL,
  lastname varchar(50) NOT NULL,
  birth_date date DEFAULT NULL,
  phone varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  address varchar(50) NOT NULL,
  city varchar(50) NOT NULL,
  state varchar(2) NOT NULL,
);