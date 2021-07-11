/*
    SCRIPTS DE CRIACAO
*/
DROP TABLE IF EXISTS ARTISTS;




-- Table ARTISTS
CREATE TABLE ARTISTS (
    id int IDENTITY(1,1) primary key,
    name varchar(255) NOT NULL,
    birthday datetime NOT NULL,
    area varchar(12) not null
);

ALTER TABLE ARTISTS ADD CONSTRAINT CHK_AREA CHECK (area in ('Music', 'Writer', 'Painter'));





/*
    SCRIPTS DE CARGA
*/

-- CARGA ARTISTS 

INSERT INTO ARTISTS (name, birthday, area) values ('Amy Winehouse', '1983-09-14', 'Music');
INSERT INTO ARTISTS (name, birthday, area) values ('Kurt Cobain', '1967-02-20', 'Music');
INSERT INTO ARTISTS (name, birthday, area) values ('Vincent van Gogh', '1853-03-30', 'Painter');
INSERT INTO ARTISTS (name, birthday, area) values ('J. R. R. Tolkien', '1853-03-30', 'Painter');
INSERT INTO ARTISTS (name, birthday, area) values ('Vincent van Gogh', '1892-01-01', 'Writer');
INSERT INTO ARTISTS (name, birthday, area) values ('Jane Austen', '1775-12-16', 'Writer');