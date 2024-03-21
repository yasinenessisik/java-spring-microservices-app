package com.yasinenessisik.service.imp;

import com.yasinenessisik.client.AccountServiceClient;
import com.yasinenessisik.contract.AccountDto;
import com.yasinenessisik.dto.TicketDto;
import com.yasinenessisik.entity.PriorityType;
import com.yasinenessisik.entity.Ticket;
import com.yasinenessisik.entity.TicketStatus;
import com.yasinenessisik.entity.es.TicketModel;
import com.yasinenessisik.repository.TicketRepository;
import com.yasinenessisik.repository.es.TicketElasticRepository;
import com.yasinenessisik.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;


@Service
public class TicketServiceImp implements TicketService {
    private final TicketElasticRepository ticketElascitRepository;
    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;
    private final AccountServiceClient accountServiceClient;

    public TicketServiceImp(TicketElasticRepository ticketElascitRepository, TicketRepository ticketRepository, ModelMapper modelMapper, AccountServiceClient accountServiceClient) {
        this.ticketElascitRepository = ticketElascitRepository;
        this.ticketRepository = ticketRepository;
        this.modelMapper = modelMapper;
        this.accountServiceClient = accountServiceClient;
    }

    @Transactional
    @Override
    public TicketDto save(TicketDto ticketDto) {
        // ticket model ticket dönüşümü, Mysql kaydet, elastiğe kaydet,
        Ticket ticket = new Ticket();
        //TODO Account API dogrula
        ResponseEntity<AccountDto> accountDtoResponseEntity = accountServiceClient.get(ticketDto.getAssignee());
        accountDtoResponseEntity.getBody().getNameSurname();
        if (ticketDto.getDescription() == null)
            throw new IllegalArgumentException("Description bos olamaz");
        ticket.setDescription(ticketDto.getDescription());
        ticket.setNotes(ticketDto.getNotes());
        ticket.setTicketDate(ticketDto.getTicketDate());
        ticket.setStatus(TicketStatus.valueOf(ticketDto.getStatus()));
        ticket.setPriority(PriorityType.valueOf((ticketDto.getPriority())));
        ticket.setAssignee(accountDtoResponseEntity.getBody().getId());
        ticket = ticketRepository.save(ticket);

        TicketModel model = TicketModel.builder().description(ticket.getDescription())
                .notes(ticket.getNotes())
                .id(ticket.getId())
                .assignee(accountDtoResponseEntity.getBody().getNameSurname())
                .priorityType(ticket.getPriority().toString())
                .ticketStatus(ticket.getStatus().toString())
                .ticketDate(ticket.getTicketDate()).build();

        ticketElascitRepository.save(model);
        ticketDto.setId(ticket.getId());
        return null;
    }

    @Override
    public TicketDto update(String id, TicketDto ticketDto) {
        return null;
    }

    @Override
    public TicketDto getById(String ticketId) {
        return null;
    }

    @Override
    public Page<TicketDto> getPagination(Pageable pageable) {
        return null;
    }
}
