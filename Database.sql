DROP SCHEMA IF EXISTS yatzy CASCADE;
CREATE SCHEMA yatzy;
SET search_path = yatzy;

CREATE TABLE spiller
(
    brukernavn VARCHAR(20),
    navn VARCHAR(50),
    epost VARCHAR(50),
    pwd_hash VARCHAR,
    pwd_salt VARCHAR,
   PRIMARY KEY (brukernavn)
);

INSERT INTO spiller VALUES
(
    'ispinhd',
    'Torstein',
    'torstein.sin@hotmail.com',
    'DF32FB5C3D132F276CA0E9B582ADA7E7B72CA1E5DE58C35D86C378A9446EE005',
    '38943AF5CA14AE5C1B9438FBB20233CA'
);
