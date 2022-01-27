--tb_user
INSERT INTO tb_user (first_name, last_name, email, password, created_at, status) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', now(), 0);
INSERT INTO tb_user (first_name, last_name, email, password, created_at, status) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', now(), 0);
INSERT INTO tb_user (first_name, last_name, email, password, created_at, status) VALUES ('João', 'Silva', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', now(), 0);
INSERT INTO tb_user (first_name, last_name, email, password, created_at, status) VALUES ('Ana', 'Pereira', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', now(), 0);
INSERT INTO tb_user (first_name, last_name, email, password, created_at, status) VALUES ('Joaquim', 'Ferreira', 'joaquim@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', now(), 0);

--tb_role
INSERT INTO tb_role (authority, created_at, status) VALUES ('ROLE_OPERATOR', now(), 0);
INSERT INTO tb_role (authority, created_at, status) VALUES ('ROLE_STUDENT', now(), 0);
INSERT INTO tb_role (authority, created_at, status) VALUES ('ROLE_INSTRUCTOR', now(), 0);
INSERT INTO tb_role (authority, created_at, status) VALUES ('ROLE_ADMIN', now(), 0);

--tb_user_role
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 4);

--Insert tb_category
INSERT INTO tb_category (name, created_at, status) VALUES ('Books', now(), 0);
INSERT INTO tb_category (name, created_at, status) VALUES ('Eletronics', now(), 0);
INSERT INTO tb_category (name, created_at, status) VALUES ('Computes', now(), 0);

--Insert tb_product
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('The Lord of the Rings', 90.5, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('Smart TV', 2190.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/2-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('Macbook Pro', 1250.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/3-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer', 1200.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/4-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('Rails for Dummies', 100.99, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/5-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Ex', 1350.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/6-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer X', 1350.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/7-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Alfa', 1850.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/8-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Tera', 1950.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/9-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Y', 1700.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/10-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Nitro', 1450.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/11-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Card', 1850.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/12-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Plus', 1350.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/13-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Hera', 2250.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/14-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Weed', 2200.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/15-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Max', 2340.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/16-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Turbo', 1280.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/17-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Hot', 1450.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/18-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Ez', 1750.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/19-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Tr', 1650.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/20-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Tx', 1680.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/21-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Er', 1850.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/22-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Min', 2250.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/23-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Boo', 2350.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/24-big.jpg', 0);
INSERT INTO tb_product (name, price, created_at, description, img_url, status) VALUES ('PC Gamer Foo', 4170.0, NOW(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/25-big.jpg', 0);

--Insert tb_product_category
INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (11, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (13, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (16, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (18, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (19, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (20, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (21, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (22, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (23, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (24, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (25, 3);

----Insert tb_country
--INSERT INTO tb_country (name, name_pt, abbreviation, bacen, created_at) VALUES ('Brazil', 'Brasil', 'BR', 1058, now());
--
----Insert tb_room
--INSERT INTO tb_room (name, seats, status, created_at) VALUES ('Room 1', 2, 0, NOW());
--INSERT INTO tb_room (name, seats, status, created_at) VALUES ('Room 2', 1, 0, NOW());
--INSERT INTO tb_room (name, seats, status, created_at) VALUES ('Room 3', 6, 0, NOW());

----Insert tb_movie
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (4.5, 2, 'The Witcher', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (3.3, 3, 'Venom: Tempo de Carnificina', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/vIgyYkXkg6NC2whRbYjBD7eb3Er.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Shang-Chi e a Lenda dos Dez Anéis', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg', NOW(), 0);
INSERT INTO tb_movie(score, count, title, image, created_at, status) VALUES (0, 0, 'Matrix Resurrections', 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg', NOW(), 0);

----Insert tb_score
INSERT INTO tb_score(movie_id, user_id, value, created_at, status) VALUES (1, 1, 5.0, NOW(), 0);
INSERT INTO tb_score(movie_id, user_id, value, created_at, status) VALUES (1, 2, 4.0, NOW(), 0);
INSERT INTO tb_score(movie_id, user_id, value, created_at, status) VALUES (2, 1, 3.0, NOW(), 0);
INSERT INTO tb_score(movie_id, user_id, value, created_at, status) VALUES (2, 2, 3.0, NOW(), 0);
INSERT INTO tb_score(movie_id, user_id, value, created_at, status) VALUES (2, 3, 4.0, NOW(), 0);

INSERT INTO tb_department(name, created_at, status) VALUES ('Sales', NOW(), 0);
INSERT INTO tb_department(name, created_at, status) VALUES ('Management', NOW(), 0);
INSERT INTO tb_department(name, created_at, status) VALUES ('Training', NOW(), 0);

INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Maria', 'maria@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Ana', 'ana@gmail.com', 2, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Bob', 'bob@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Marco', 'marco@gmail.com', 2, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Alex', 'alex@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Claudia', 'claudia@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Rodrigo', 'rodrigo@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Elisa', 'elisa@gmail.com', 2, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Lucas', 'lucas@gmail.com', 3, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Rafael', 'rafael@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Tiago', 'tiago@gmail.com', 1, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Andressa', 'andressa@gmail.com', 2, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Meire', 'meire@gmail.com', 3, NOW(), 0);
INSERT INTO tb_employee(name, email, department_id, created_at, status) VALUES ('Carol', 'carol@gmail.com', 1, NOW(), 0);

--tb_course
INSERT INTO tb_course (name, img_Uri, img_gray_uri, created_at, status) VALUES ('Bootcamp HTML', 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'https://upload.wikimedia.org/wikipedia/commons/1/1f/Switch-course-book-grey.svg', NOW(), 0);

--tb_offer
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id, created_at, status) VALUES ('1.0', '2020-11-20T03:00:00Z', '2021-11-20T03:00:00Z', 1, NOW(), 0);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id, created_at, status) VALUES ('2.0', '2020-12-20T03:00:00Z', '2021-12-20T03:00:00Z', 1, NOW(), 0);

--tb_resource
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id, created_at, status) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 1, NOW(), 0);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id, created_at, status) VALUES ('Forum', 'Tire suas dúvidas', 2, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 2, 1, NOW(), 0);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id, created_at, status) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 0, 1, NOW(), 0);

--tb_section
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id, created_at, status) VALUES ('Capítulo 1','Neste capítulo vamos começar', 1, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, null, NOW(), 0);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id, created_at, status) VALUES ('Capítulo 2', 'Neste capítulo vamos continuar', 2, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 1, NOW(), 0);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id, created_at, status) VALUES ('Capítulo 3', 'Neste capítulo vamos finalizar', 3, 'https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 1, 2, NOW(), 0);

--tb_enrolment
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update, created_at, status) VALUES (1, 1, '2020-11-20T13:00:00Z', null, 'true', 'false', NOW(), 'true');
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update, created_at, status) VALUES (2, 1, '2020-11-20T13:00:00Z', null, 'true', 'false', NOW(), 'true');

--tb_lesson
INSERT INTO tb_lesson (title, position, section_id, created_at, status) VALUES ('Aula 1 do capítulo 1', 1, 1, NOW(), 'true');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (1, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');

INSERT INTO tb_lesson (title, position, section_id, created_at, status) VALUES ('Aula 2 do capítulo 1', 2, 1, NOW(), 'true');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (2, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');

INSERT INTO tb_lesson (title, position, section_id, created_at, status) VALUES ('Aula 3 do capítulo 1', 3, 1, NOW(), 'true');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (3, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=sqbqoR-lMf8');

INSERT INTO tb_lesson (title, position, section_id, created_at, status) VALUES ('Tarefa do capítulo 1', 4, 1, NOW(), 'true');
INSERT INTO tb_task (id, description, question_count, approval_count, weight, due_date) VALUES (4, 'Fazer um trabalho legal', 5, 4, 1.0, '2020-11-25T13:00:00Z');

INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);

INSERT INTO tb_notification (text, read, route, user_id, created_at, status) VALUES ('Primeiro feedback de tarefa: favor revisar', 'true', '/offers/1/resource/1/sections/1', 1, NOW(), 'true');
INSERT INTO tb_notification (text, read, route, user_id, created_at, status) VALUES ('Segundo feedback: favor revisar', 'true', '/offers/1/resource/1/sections/1', 1, NOW(), 'true');
INSERT INTO tb_notification (text, read, route, user_id, created_at, status) VALUES ('Terceiro feedback: favor revisar', 'true', '/offers/1/resource/1/sections/1', 1, NOW(), 'true');