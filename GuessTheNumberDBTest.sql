DROP DATABASE IF EXISTS GuessTheNumberDBTest;

USE GuessTheNumberDBTest; 

CREATE TABLE Game(
gameID INT PRIMARY KEY AUTO_INCREMENT,
winningNumbers CHAR(4) NOT NULL, 
gameStatus VARCHAR(12) NOT NULL
);

CREATE TABLE Round(
roundID int PRIMARY KEY AUTO_INCREMENT,
gameID int NOT NULL,
guess CHAR(4) NOT NULL,
result VARCHAR(12) NOT NULL, 
guessTime DATETIME NULL
);

ALTER TABLE Round
	ADD CONSTRAINT FK_RoundGame
    FOREIGN KEY FK_RoundGame (GameID)
    REFERENCES Game (GameID);   