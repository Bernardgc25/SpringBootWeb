
--Start SQL: 				            	
sudo mysql -u root -p
-show mysql users
SELECT user FROM mysql.user;

--show priveleges for users
SHOW GRANTS FOR <user>;

--create new user:
CREATE USER 'username'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';

--grant priveleges to user
GRANT ALL PRIVILEGES ON *.* TO 'username'@'localhost' WITH GRANT OPTION;

--create new database
create database SpringbootwebDB;

--display table values 
select * from employeed;

--show fields of table
show fields from employeed;

