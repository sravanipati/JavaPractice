

CREATE TABLE merchant_tbl (
    ext_merchant_id serial,
    merchant_id VARCHAR(32) PRIMARY KEY,
    name VARCHAR(32),
    email VARCHAR(32),
    business_type VARCHAR(32),
    address VARCHAR(100),
    phone VARCHAR(10)
);

CREATE TABLE payments_tbl (
    ext_payment_id serial,
    payment_id VARCHAR(50) PRIMARY KEY,
    merchant_id VARCHAR(50),
    amount DECIMAL(10, 2),
    currency VARCHAR(3),
    order_id VARCHAR(50),
    payment_status VARCHAR(20),
    CONSTRAINT PAYMENTS_TBL_FK1 FOREIGN KEY (merchant_id) REFERENCES merchant_tbl(merchant_id)
);
