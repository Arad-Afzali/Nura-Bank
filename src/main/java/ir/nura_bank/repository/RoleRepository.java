package ir.nura_bank.repository;

import ir.nura_bank.base.repository.BaseRepository;
import ir.nura_bank.domain.Role;

public interface RoleRepository extends BaseRepository<Role, Long> {

    Role findByName(String name);

}
