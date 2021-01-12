package com.springboot.spring;

import com.springboot.spring.entity.Person;
import com.springboot.spring.mapper.PersonMapper;
import com.springboot.spring.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void mapperTest(){
        List<Person> personList = personMapper.personList();
        System.out.println(personList);
    }

    @Test
    public void repositoryTest(){
        List<Person> personList = personRepository.findAll();
        System.out.println(personList);
    }
}
