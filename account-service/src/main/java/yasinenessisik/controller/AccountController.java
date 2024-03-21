package yasinenessisik.controller;

import com.yasinenessisik.contract.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import yasinenessisik.entity.Account;
import yasinenessisik.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> get(@PathVariable("id") String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
        public ResponseEntity<AccountDto> save(@RequestBody AccountDto account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping
    public ResponseEntity<AccountDto> update(@PathVariable("id")String id,@RequestBody AccountDto account){
        return ResponseEntity.ok(accountService.update(id,account));
    }
    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
    }

    @GetMapping()
    public ResponseEntity<List<Account>> findAll(){
        System.out.println("İstek geldi");
        return ResponseEntity.ok(accountService.findAll());
    }

}
