package yasinenessisik.service;

import com.yasinenessisik.contract.AccountDto;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.transaction.annotation.Transactional;
import yasinenessisik.entity.Account;
import yasinenessisik.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    public AccountService(AccountRepository accountRepository, ModelMapper modelMapper) {
        this.accountRepository = accountRepository;
        this.modelMapper = modelMapper;
    }

    public AccountDto get(String id){
        Account account =accountRepository.findById(id).orElseThrow(()->new IllegalArgumentException());
        return modelMapper.map(account,AccountDto.class);

    }
    @Transactional
    public AccountDto save(AccountDto accountDto){
        Account account = modelMapper.map(accountDto,Account.class);
        account = accountRepository.save(account);
        accountDto.setId(account.getId());
        return accountDto;
    }
    @Transactional

    public AccountDto update(String id, AccountDto accountDto){
        Assert.isNull(id,"Id cannot be null");
        Optional<Account> account = accountRepository.findById(id);
        Account accountToUpdate = account.map(it->{
            it.setBirthDate(accountDto.getBirthDate());
            it.setName(accountDto.getName());
            it.setSurname(accountDto.getSurname());
            return it;
                }).orElseThrow(IllegalAccessError::new);


        return modelMapper.map(accountRepository.save(accountToUpdate),AccountDto.class);
    }
    public void delete(String id){

    }
    public List<Account> findAll(){
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

}
