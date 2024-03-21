package com.yasinenessisik.client;

import com.yasinenessisik.contract.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-service")
public interface AccountServiceClient {
    @RequestMapping("/api/v1/account/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") String id);
}
