package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Role;
import ir.nura_bank.repository.RoleRepository;
import ir.nura_bank.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl extends BaseServiceImpl<Role, Long, RoleRepository>
        implements RoleService {

    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role findByName(String name) {
        return repository.findByName(name);
    }

}
