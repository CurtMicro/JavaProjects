CREATE TABLE user (
    username TEXT NOT NULL,
    full_name TEXT NOT NULL,
    password TEXT NOT NULL,
    unique (username)
);

CREATE TABLE product (
    id BigInteger PRIMARY KEY,
    productName TEXT NOT NULL,
    type VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    unique (productName)
);