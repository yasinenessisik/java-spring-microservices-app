package com.yasinenessisik.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {
    private String id;
    private String description;
    private String notes;
    private String assignee;
    private Date ticketDate;
    private String priority;
    private String status;

}
