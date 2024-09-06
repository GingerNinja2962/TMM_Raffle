CREATE SCHEMA IF NOT EXISTS TMM_Raffle;

SET SCHEMA TMM_Raffle;

CREATE TABLE TMM_Users (
        ID UUID NOT NULL PRIMARY KEY,
        Name VARCHAR(50) NOT NULL,
        Gold BIGINT NOT NULL,
        CreationDate TIMESTAMP NOT NULL
);

CREATE TABLE TMM_Tickets (
        ID UUID NOT NULL PRIMARY KEY,
        Validity BIT NOT NULL,
        CreationDate TIMESTAMP NOT NULL
);

CREATE TABLE TMM_Event
(
        ID UUID NOT NULL PRIMARY KEY,
        CostPerTicket BIGINT NOT NULL,
        BonusTicketCost BIGINT NOT NULL,
        BonusTicketAmount BIGINT NOT NULL,
        MaxTicketCount BIGINT NOT NULL,
        maxRewardsPerUser BIGINT NOT NULL
);

CREATE TABLE TMM_Entries (
        ID UUID NOT NULL PRIMARY KEY,
        UserID UUID NOT NULL,
        TicketID UUID NOT NULL,
        RaffleID UUID NOT NULL,
        FOREIGN KEY (UserID) REFERENCES TMM_Users(ID),
        FOREIGN KEY (TicketID) REFERENCES TMM_Tickets(ID),
        FOREIGN KEY (RaffleID) REFERENCES TMM_Event (ID)
);

CREATE TABLE TMM_Items (
        ID UUID NOT NULL PRIMARY KEY,
        Name VARCHAR(50) NOT NULL,
        GoldValue BIGINT NOT NULL,
        Validity     BIT       NOT NULL,
        CreationDate TIMESTAMP NOT NULL
);

COMMIT;

// Historic version.
--
-- CREATE SCHEMA IF NOT EXISTS TMM_Raffle;
--
-- SET SCHEMA TMM_Raffle;
--
-- CREATE TABLE TMM_Users (
--                            ID UUID NOT NULL PRIMARY KEY,
--                            Name VARCHAR(50) NOT NULL,
--                            Gold BIGINT NOT NULL,
--                            CreationDate TIMESTAMP NOT NULL,
--                            LastUpdated TIMESTAMP NOT NULL
-- );
--
-- CREATE TABLE TMM_Tickets (
--                              ID UUID NOT NULL PRIMARY KEY,
--                              Validity BIT NOT NULL,
--                              CreationDate TIMESTAMP NOT NULL,
--                              LastUpdated TIMESTAMP NOT NULL
-- );
--
-- CREATE TABLE TMM_Event (
--                            ID UUID NOT NULL PRIMARY KEY,
--                            CostPerTicket BIGINT NOT NULL,
--                            BonusTicketCost BIGINT NOT NULL,
--                            BonusTicketAmount BIGINT NOT NULL,
--                            MaxTicketCount BIGINT NOT NULL,
--                            maxRewardsPerUser BIGINT NOT NULL,
--                            CreationDate TIMESTAMP NOT NULL,
--                            LastUpdated TIMESTAMP NOT NULL
-- );
--
-- CREATE TABLE TMM_Entries (
--                              ID UUID NOT NULL PRIMARY KEY,
--                              UserID UUID NOT NULL,
--                              TicketID UUID NOT NULL,
--                              RaffleID UUID NOT NULL,
--                              CreationDate TIMESTAMP NOT NULL,
--                              LastUpdated TIMESTAMP NOT NULL,
--                              FOREIGN KEY (UserID) REFERENCES TMM_Users(ID),
--                              FOREIGN KEY (TicketID) REFERENCES TMM_Tickets(ID),
--                              FOREIGN KEY (RaffleID) REFERENCES TMM_Event(ID)
-- );
--
-- CREATE TABLE TMM_Items (
--                            ID UUID NOT NULL PRIMARY KEY,
--                            Name VARCHAR(50) NOT NULL,
--                            GoldValue BIGINT NOT NULL,
--                            Validity BIT NOT NULL,
--                            CreationDate TIMESTAMP NOT NULL,
--                            LastUpdated TIMESTAMP NOT NULL
-- );
--
-- COMMIT;