# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  firstname                     varchar(255),
  lastname                      varchar(255),
  age                           integer,
  dob                           varchar(255),
  gender                        varchar(255),
  contact                       integer,
  info                          varchar(255)
);


# --- !Downs

drop table if exists user;

