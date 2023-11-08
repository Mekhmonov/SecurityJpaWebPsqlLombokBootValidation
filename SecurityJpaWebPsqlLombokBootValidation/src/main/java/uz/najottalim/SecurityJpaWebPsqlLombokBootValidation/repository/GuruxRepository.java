package uz.najottalim.SecurityJpaWebPsqlLombokBootValidation.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import uz.najottalim.SecurityJpaWebPsqlLombokBootValidation.entity.Group;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

// PROJECT JAVA-11da qilingan. intelij idea 2018. shunga methodlarni override qildi(menimcha).


public class GuruxRepository implements JpaRepository<Group, Long> {


    @Override
    public List<Group> findAll() {
        return null;
    }

    @Override
    public List<Group> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Group> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Group> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Group entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Group> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Group> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Group> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Group> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Group> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Group> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Group> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Group getOne(Long aLong) {
        return null;
    }

    @Override
    public Group getById(Long aLong) {
        return null;
    }

    @Override
    public Group getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Group> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Group> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Group> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Group> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Group> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Group> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Group, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
