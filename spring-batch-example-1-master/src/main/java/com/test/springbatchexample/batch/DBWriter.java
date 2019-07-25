package com.test.springbatchexample.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.springbatchexample.model.User;
import com.test.springbatchexample.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data Saved for Users: " + users);
        userRepository.save(users);
        
      //  System.out.println("count"+userRepository.count());
     //   userRepository.findAll().forEach((i)->System.out.println(i.getName()+"=>"+i.getTime()+"=>"+i.getId()));
        
    }
}
