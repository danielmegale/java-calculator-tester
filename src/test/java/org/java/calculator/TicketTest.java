package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void testValidTicket() throws Exception {
        Ticket ticket = new Ticket(100, 25);
        assertEquals(21.0, ticket.calculatePrice(), 0.01);
    }

    @Test
    public void testNegativeDistance() {
        assertThrows(Exception.class, () -> new Ticket(-50, 45));
    }

    @Test
    public void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(75, -20));
    }

    @Test
    public void testDiscountForSeniors() throws Exception {
        Ticket ticket = new Ticket(50, 66);
        assertEquals(6.3, ticket.calculatePrice(), 0.01);
    }

    @Test
    public void testNoDiscountForYoung() throws Exception {
        Ticket ticket = new Ticket(80, 16);
        assertEquals(13.44, ticket.calculatePrice(), 0.01);
    }
}
