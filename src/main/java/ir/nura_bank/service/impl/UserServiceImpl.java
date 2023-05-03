package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.User;
import ir.nura_bank.repository.UserRepository;
import ir.nura_bank.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository>
        implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User findUserBySsn(String ssn) {
        return repository.findUserBySsn(ssn);
    }

    @Override
    public List<User> findByFirstNameAndLastNameContaining(String firstName, String lastName) {

        if (firstName.isBlank())
            firstName = null;
        if (lastName.isBlank())
            lastName = null;
        return repository.findByFirstNameAndLastNameContaining(firstName, lastName);
    }

    @Override
    public User findByAccount(Account account) {
        return repository.findByAccount(account);
    }

    @Override
    public Boolean existsBySsn(String ssn) {
        return repository.existsBySsn(ssn);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }
}
