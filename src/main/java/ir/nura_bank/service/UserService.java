package ir.nura_bank.service;

import ir.nura_bank.base.service.BaseService;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.User;

import java.util.List;

public interface UserService extends BaseService<User, Long> {

    User findUserBySsn(String ssn);

    List<User> findByFirstNameAndLastNameContaining(String firstName, String lastName);

    User findByAccount(Account account);

    Boolean existsBySsn(String ssn);

    Boolean existsByEmail(String email);

}
