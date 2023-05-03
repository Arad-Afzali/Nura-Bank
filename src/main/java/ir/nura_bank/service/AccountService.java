package ir.nura_bank.service;

import ir.nura_bank.base.service.BaseService;
import ir.nura_bank.domain.Account;

import java.util.List;

public interface AccountService extends BaseService<Account, Long> {

    Account findByAccountNumber(String accountNumber);

    List<String> getTopAccountNumber();

}
