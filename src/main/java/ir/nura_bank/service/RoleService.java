package ir.nura_bank.service;

import ir.nura_bank.base.service.BaseService;
import ir.nura_bank.domain.Role;

public interface RoleService extends BaseService<Role, Long> {

    Role findByName(String name);

}
