package com.example.puzzle.hibernatecollectioninvalueobject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@DataJpaTest
@RunWith(SpringRunner.class)
@Import(TestConfiguration.class)
public class CollectionInValueObjectTest {
    private @Resource EntityRepository entityRepository;
    private @Resource TestEntityManager entityManager;

    @Test
    public void should_persist_entity_with_value_objects_contain_collections() {
        Entity entity = new Entity("id", new ValueObject("a", "b"));
        entityRepository.save(entity);
        assertEquals(entity, entityManager.find(Entity.class, "id"));
    }
}