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
INSERT INTO Students(id,student_first_name,student_last_name,student_email,supervisor_id)
VALUES (1,'Layla', 'Fenster','layl2014@stud.kea.dk',1),
       (2,'Noah','Jackson','noah0149@stud.kea.dk',2),
       (3,'Hugh','Jass','hugh@stud.kea.dk',5),
       (4,'Gabe','Itch','gabe@stud.kea.dk',4),
       (5,'Jeniffer','Mohde','jenni@stud.kea.dk',10),
       (6,'Cardi','Offset','bardi@stud.kea.dk',9),
       (7,'Nicki','Minaj','nicki@stud.kea.dk',9),
       (8,'Douglas','Jew','doug@stud.kea.dk',9);