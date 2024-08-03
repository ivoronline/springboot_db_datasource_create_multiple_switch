package com.ivoronline.springboot_db_datasource_create_multiple_switch.repository;

import com.ivoronline.springboot_db_datasource_create_multiple_switch.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
