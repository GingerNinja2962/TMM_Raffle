CREATE TABLE TMM_Users (
        ID UUID NOT NULL PRIMARY KEY,
        Name VARCHAR(50) NOT NULL,
        Gold BIGINT NOT NULL,
        CreationDate TIMESTAMP NOT NULL,
        LastUpdated TIMESTAMP NOT NULL
);

CREATE TABLE TMM_Tickets (
        ID UUID NOT NULL PRIMARY KEY,
        Validity BIT NOT NULL,
        CreationDate TIMESTAMP NOT NULL,
        LastUpdated TIMESTAMP NOT NULL
);

CREATE TABLE TMM_Raffles (
        ID UUID NOT NULL PRIMARY KEY,
        CostPerTicket BIGINT NOT NULL,
        BonusTicketCost BIGINT NOT NULL,
        BonusTicketAmount BIGINT NOT NULL,
        MaxTicketCount BIGINT NOT NULL,
        maxRewardsPerUser BIGINT NOT NULL,
        CreationDate TIMESTAMP NOT NULL,
        LastUpdated TIMESTAMP NOT NULL
);

CREATE TABLE TMM_Entries (
        ID UUID NOT NULL PRIMARY KEY,
        UserID UUID NOT NULL,
        TicketID UUID NOT NULL,
        RaffleID UUID NOT NULL,
        CreationDate TIMESTAMP NOT NULL,
        LastUpdated TIMESTAMP NOT NULL,
        FOREIGN KEY (UserID) REFERENCES TMM_Users(ID),
        FOREIGN KEY (TicketID) REFERENCES TMM_Tickets(ID),
        FOREIGN KEY (RaffleID) REFERENCES TMM_Raffles(ID)
);

CREATE TABLE TMM_Items (
        ID UUID NOT NULL PRIMARY KEY,
        Name VARCHAR(50) NOT NULL,
        GoldValue BIGINT NOT NULL,
        Available BIT NOT NULL,
        CreationDate TIMESTAMP NOT NULL,
        LastUpdated TIMESTAMP NOT NULL
);