package org.example.core.services.logic;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.domain.data_Structures.Impl.TupleImpl;
import org.example.core.domain.data_Structures.Tuple;
import org.example.core.domain.valueObjects.Entry;
import org.example.core.domain.valueObjects.Item;
import org.example.core.domain.valueObjects.RaffleEvent;
import org.example.core.domain.valueObjects.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class Calculations {

    private static final Logger logger = LogManager.getLogger();

    //<editor-fold desc="======== Ticket Calculation ========">
    public int calculateUsersTickets(User user, RaffleEvent event) {
        int tickets = calculateStandardTickets(user.getGold(), event);
        tickets += calculateBonusTickets(user.getGold(), event);
        return tickets;
    }

    private int calculateStandardTickets(int gold, RaffleEvent event) {
        return Math.floorDiv(gold, event.getCostPerTicket());
    }

    private int calculateBonusTickets(int gold, RaffleEvent event) {
        return Math.multiplyExact(event.getBonusTicketAmount(),
                Math.floorDiv(gold, event.getBonusTicketCost()));
    }
    //</editor-fold>

    //<editor-fold desc="======== Raffle ========">
    public Tuple<Item, Entry> raffleItems(List<Item> items, List<Entry> entries) {
        Item item = pullItem(items);
        Entry entry = pullEntry(entries);

        logger.log(Level.INFO, "User '{}' has won '{}'.", entry.getUser().getName(), item.getName());
        return new TupleImpl<>(item, entry);
    }

    private Item pullItem(List<Item> items) {
        Item item = items.stream().filter(Item::isAvailable).toList()
                .get(new Random().nextInt(items.size()));
        item.markAsSold();

        logger.log(Level.DEBUG, "Item pulled: [ Item UUID: {}; Item-Name: {}; Time Created: {}; Item-Value: {} ]",
                item.getId(), item.getName(), item.getCreationDate(), item.getValue());
        return item;
    }

    private Entry pullEntry(List<Entry> entries) {
        Entry entry = entries.stream().filter((Entry predicateEntry) -> predicateEntry.getTicket().isValid())
                .toList().get(new Random().nextInt(entries.size()));
        entry.getTicket().markAsUsed();

        logger.log(Level.DEBUG, "entry pulled: [ Entry UUID: {}; User UUID: {}; User-Name: {}; Ticket UUID: {}; Ticket Time Created: {} ]",
                entry.getId(), entry.getUser().getId(), entry.getUser().getName(), entry.getTicket().getId(), entry.getTicket().getCreationDate());
        return entry;
    }
    //</editor-fold>
}
