-- TABLES/DATA TO BE ADDED
CREATE TABLE IF NOT EXISTS Test (
                                    id INT(100) NOT NULL auto_increment,
                                    car_type VARCHAR(200),
                                    first_name VARCHAR(200),
                                    last_name VARCHAR(200),
                                    mail VARCHAR(200),
                                    phone INT(8),
                                    PRIMARY KEY (id));
CREATE TABLE IF NOT EXISTS Students(
                                       id INT(100) NOT NULL auto_increment,
                                       first_name VARCHAR(200),
                                       last_name VARCHAR(200),
                                       email VARCHAR(200),
                                       supervisor_id INT NOT null,
                                       PRIMARY KEY (id));
                                       ALTER TABLE Students ADD FOREIGN KEY (supervisor_id) references Supervisors(id);

CREATE TABLE IF NOT EXISTS Supervisors(
                                       id INT(100) NOT NULL auto_increment,
                                       first_name VARCHAR(200),
                                       last_name VARCHAR(200),
                                       email VARCHAR(200),
                                       PRIMARY KEY (id));

INSERT INTO Students(id,first_name,last_name,email, supervisor_id)
VALUES (1,'Layla', 'Fenster','layl2014@stud.kea.dk',1),
       (2,'Noah','Jackson','noah0149@stud.kea.dk',1),
       (3,'Hugh','Jass','hugh@stud.kea.dk',1),
       (4,'Gabe','Itch','gabe@stud.kea.dk',1),
       (5,'Jeniffer','Mohde','jenni@stud.kea.dk',1),
       (6,'Cardi','Offset','bardi@stud.kea.dk',1),
       (7,'Nicki','Minaj','nicki@stud.kea.dk',1),
       (8,'Douglas','Jew','doug@stud.kea.dk',1);
INSERT INTO Supervisors(id,first_name,last_name,email)
VALUES (1,'Betty', 'Nayz','bn@kea.dk'),
       (2,'Tamanna', 'Clements','tc@kea.dk'),
       (3,'Conner', 'Cabrera','cc@kea.dk'),
       (4,'Brent', 'Coombes','bc@kea.dk'),
       (5,'Bryan', 'Tyson','bt@kea.dk'),
       (6,'Rowan', 'Costa','rc@kea.dk'),
       (7,'Gavin', 'Burgess','gb@kea.dk'),
       (8,'Moses', 'Fitzpatrick','mf@kea.dk'),
       (9,'Sally', 'Dillon','sd@kea.dk'),
       (10,'Montague', 'Mcconnell','mm@kea.dk'),
       (11,'Douglas', 'Sosa','dd@kea.dk');