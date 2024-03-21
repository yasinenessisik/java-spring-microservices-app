package com.yasinenessisik.entity;

import com.codahale.metrics.MetricRegistryListener;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "ticket")
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id")
    private String id;
    @Column(name="description", length = 600)
    private String description;
    @Column(name="notes",length = 4000)
    private String notes;
    @Column(name="assignee")
    private String assignee;
    @Column(name="ticket_date")
    private Date ticketDate;
    @Enumerated(EnumType.ORDINAL)
    @Column(name="priority")
    private PriorityType priority;
    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private TicketStatus status;


}
