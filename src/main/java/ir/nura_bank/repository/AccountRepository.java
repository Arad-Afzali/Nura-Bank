package ir.nura_bank.repository;

import ir.nura_bank.base.repository.BaseRepository;
import ir.nura_bank.domain.Account;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends BaseRepository<Account, Long> {

    Account findByAccountNumber(String accountNumber);

    @Query(value = "select a.accountNumber from Account a where a.id in (select max(ac.id) from Account ac) ")
    List<String> getTopAccountNumber();

}
