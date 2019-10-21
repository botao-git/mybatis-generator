package com.poter.mybatisgenerator.dao;

import com.poter.mybatisgenerator.MybatisGeneratorApplication;
import com.poter.mybatisgenerator.mapper.PersonMapper;
import com.poter.mybatisgenerator.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisGeneratorApplication.class)
@WebAppConfiguration
public class PersonDao {

    @Autowired
    PersonMapper personMapper;

    @Test
    public void testListParams(){
        List<Person> people = personMapper.selectByIds("1,2,3");
        people.forEach(System.out::println);
    }

}
