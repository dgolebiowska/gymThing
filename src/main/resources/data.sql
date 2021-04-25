DROP TABLE IF EXISTS exercises;

CREATE TABLE AtlasOfExcercises
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(250) NOT NULL,
    bodyWeighted NUMBER (1) NOT NULL,
    weighted     NUMBER (1) DEFAULT NULL,
    repeats      NUMBER (1) DEFAULT NULL,
    instruments  VARCHAR(250) NOT NULL

);

INSERT INTO AtlasOfExcercises (name, bodyWeighted, weighted, repeats,instruments)
VALUES ('Przysiad',1,0,0,'Sztanga'),
       ('Martwy Ciąg',1,0,0,'Sztanga'),
       ('Wyciskanie', 1,0,0, 'Sztanga, Ławeczka');