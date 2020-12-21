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
                                       student_first_name VARCHAR(200),
                                       student_last_name VARCHAR(200),
                                       student_email VARCHAR(200),
    -- supervisor_id INT(100),
                                       PRIMARY KEY (id));
-- FOREIGN KEY (supervisor_id) REFERENCES Supervisors(id));

-- ALTER TABLE Students ADD FOREIGN KEY (supervisor_id) references Supervisors(id);
-- FOREIGN KEY (supervisor_id) REFERENCES Supervisors(id));

CREATE TABLE IF NOT EXISTS Supervisors(
                                          id INT(100) NOT NULL auto_increment,
                                          supervisor_first_name VARCHAR(200),
                                          supervisor_last_name VARCHAR(200),
                                          supervisor_email VARCHAR(200),
                                          PRIMARY KEY (id));

INSERT INTO Students(id,student_first_name,student_last_name,student_email)
VALUES (1,'Layla', 'Fenster','layl2014@stud.kea.dk'),
       (2,'Noah','Jackson','noah0149@stud.kea.dk'),
       (3,'Hugh','Jass','hugh@stud.kea.dk'),
       (4,'Gabe','Itch','gabe@stud.kea.dk'),
       (5,'Jeniffer','Mohde','jenni@stud.kea.dk'),
       (6,'Cardi','Offset','bardi@stud.kea.dk'),
       (7,'Nicki','Minaj','nicki@stud.kea.dk'),
       (8,'Douglas','Jew','doug@stud.kea.dk');
INSERT INTO Supervisors(id,supervisor_first_name,supervisor_last_name,supervisor_email)
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