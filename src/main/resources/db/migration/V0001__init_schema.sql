create table entities
(
    id                varchar(32)  not null,
    simple_value      varchar(200) not null,
    another_entity_id varchar(32)  not null
);

create table entity_values
(
    entity_id varchar(32)  not null,
    value     varchar(100) not null
);

create table other_entities
(
    id   varchar(32)  not null,
    name varchar(200) not null
);