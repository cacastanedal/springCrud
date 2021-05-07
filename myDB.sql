create table product (id int, varchar(20) name, double price);
create table order_bill (id int, customer_name varchar(20));
create table product_bill (id int, product_id int, order_id int, quantity int, total double);