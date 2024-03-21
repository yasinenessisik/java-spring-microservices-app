package com.yasinenessisik.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketNotification {
    private String ticketId;
    private String accountId;
    private String ticketDescription;
}
