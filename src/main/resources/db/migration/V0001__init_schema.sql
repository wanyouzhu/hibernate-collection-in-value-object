create table entities
(
    id varchar(32) not null
);

create table entity_values
(
    entity_id varchar(32)  not null,
    value     varchar(100) not null
);