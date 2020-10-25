INSERT INTO admins ( admin_user_name, admin_password) VALUES
  ('admin', 'qwerty');

INSERT INTO products ( category, manufacturer, name, price) VALUES
  ('Running Shoes', 'Reebok', 'Rebook Runner Plus', 2000),
  ('Tennis Shoes', 'Reebok', 'Rebook Tennis Plus', 5000),
  ('Running Shoes', 'Reebok', 'Rebook Runner', 1000),
  ('Trekking Shoes', 'Reebok', 'Rebook Trekker Plus', 2000),
  ('Trekking Shoes', 'Woodland', 'Trekker',5000) ;

INSERT INTO users ( address, email_id, name) VALUES
  ('Delhi','amit@xyz.com','Amit'),
  ('Mumbai','prasanth@xyz.com','Prasanth'),
  ('Chennai','venkat@abc.com','Venkat'),
  ('Hyderabad','anil@fgh.com','Anil');


INSERT INTO purchase_records( category, product_id, purchase_date, user_id) VALUES
  ('Running Shoes', 1, '2020-10-12', 1),
  ('Tennis Shoes', 2, '2020-10-5', 2),
  ('Running Shoes', 3, '2020-10-4', 1),
  ('Trekking Shoes', 4, '2020-09-20', 3),
  ('Running Shoes', 3, '2020-09-8', 4),
  ('Running Shoes', 1, '2020-09-8', 4);

