package com.example.puzzle.hibernatecollectioninvalueobject;

import org.springframework.data.repository.Repository;

public interface JpaEntityRepository extends EntityRepository, Repository<Entity, String> {
}
