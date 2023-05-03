package ir.nura_bank.base.service.impl;

import ir.nura_bank.base.domain.BaseEntity;
import ir.nura_bank.base.repository.BaseRepository;
import ir.nura_bank.base.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseEntity<ID>, ID extends Serializable, R extends BaseRepository<T, ID>>
        implements BaseService<T, ID> {

    protected final R repository;

    @Override
    @Transactional
    public T save(T t) {
        return repository.save(t);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
