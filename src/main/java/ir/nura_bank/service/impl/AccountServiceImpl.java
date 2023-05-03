package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Account;
import ir.nura_bank.repository.AccountRepository;
import ir.nura_bank.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AccountServiceImpl extends BaseServiceImpl<Account, Long, AccountRepository>
        implements AccountService {


    public AccountServiceImpl(AccountRepository repository) {
        super(repository);
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }

    @Override
    public List<String> getTopAccountNumber() {
        return repository.getTopAccountNumber();
    }


}
