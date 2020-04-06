CREATE TABLE Vaccines(Id int auto_increment primary key , Name varchar(50) NOT NULL, Type varchar(50) );
INSERT INTO vaccines VALUES (1,'Poliomyelitis','Type1');
INSERT INTO vaccines VALUES (2,'Difterie','Type1');
INSERT INTO vaccines VALUES (3,'Tetanus','Type1');
INSERT INTO vaccines VALUES (4,'Pertussis','Type1');
INSERT INTO vaccines VALUES (5,'Haemophilus influenzae B','Type1');
INSERT INTO vaccines VALUES (6,'Hepatitis B','Type1');
INSERT INTO vaccines VALUES (7,'Pneumokokken 13-serotypes','Type2');
INSERT INTO vaccines VALUES (8,'Rotavirus','Type3');
INSERT INTO vaccines VALUES (9,'Mazelen','Type4');
INSERT INTO vaccines VALUES (10,'Bof','Type4');
INSERT INTO vaccines VALUES (11,'Rodehond','Type4');
INSERT INTO vaccines VALUES (12,'Meningokokken type C','Type5');

CREATE TABLE Client (Id int auto_increment primary key, Name varchar(50), Date_of_Birth DATE, PassportNR varchar(50), Gender varchar(50));
INSERT INTO Client VALUES (1,'Child 1','2015-07-01','54647837','Male');
INSERT INTO Client VALUES (2,'Child 2','2015-08-05','65346778','Female');

CREATE TABLE Registration (Id int auto_increment primary key, Id_Vaccine int, CONSTRAINT fk_Vaccine_Id FOREIGN KEY (Id_Vaccine)
    REFERENCES Vaccines(Id) ON UPDATE CASCADE, Id_Client int, CONSTRAINT fk_Client_Id FOREIGN KEY (Id_Client) REFERENCES Client(Id) ON UPDATE CASCADE ,Vaccination_2months date, Vaccination_3months date, Vaccination_4months date,
    Vaccination_12months date, Vaccination_15months date, Vaccination_6yrs date, Vaccination_12yrs date, Vaccination_14yrs date);


CREATE TABLE Stock (Stock_Id int auto_increment primary key,
Id_Vaccine int, CONSTRAINT fk_Vaccine_Client_ID_2 FOREIGN KEY (Id_Vaccine) REFERENCES Vaccines(Id)
                   ON UPDATE CASCADE,
Quantity int);
INSERT INTO Stock VALUES (1,1,50);
INSERT INTO Stock VALUES (2,2,88);
INSERT INTO Stock VALUES (3,3,45);
INSERT INTO Stock VALUES (4,4,2);
INSERT INTO Stock VALUES (5,5,34);
INSERT INTO Stock VALUES (6,6,56);
INSERT INTO Stock VALUES (7,7,50);
INSERT INTO Stock VALUES (8,8,88);
INSERT INTO Stock VALUES (9,9,67);
INSERT INTO Stock VALUES (10,10,10);
INSERT INTO Stock VALUES (11,11,64);
INSERT INTO Stock VALUES (12,12,99);