package com.yasinenessisik.repository.es;

import com.yasinenessisik.entity.es.TicketModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories
public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String> {
}
