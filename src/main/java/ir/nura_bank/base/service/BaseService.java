package ir.nura_bank.base.service;

import ir.nura_bank.base.domain.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<ID>, ID extends Serializable> {

    T save(T t);

    long count();

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    Page<T> findAll(Pageable pageable);

    boolean existsById(ID id);
}
