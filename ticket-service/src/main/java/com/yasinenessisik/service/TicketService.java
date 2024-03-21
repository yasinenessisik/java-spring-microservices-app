package com.yasinenessisik.service;

import com.yasinenessisik.dto.TicketDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

public interface TicketService {
    TicketDto save(TicketDto ticketDto);
    TicketDto update(String id,TicketDto ticketDto);
    TicketDto getById(String ticketId);
    Page<TicketDto> getPagination(Pageable pageable);
}
