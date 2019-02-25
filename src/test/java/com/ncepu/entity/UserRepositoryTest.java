package com.ncepu.entity;

import com.ncepu.SoufunApplicationTests;
import com.ncepu.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Justin
 * 2018/8/16  20:57
 */
public class UserRepositoryTest extends SoufunApplicationTests {
    @Autowired
    private UserRepository userRepository;

 /*   @Test
    public void testFindOne() {
        User user = userRepository.findById(1L).get();
        Assert.assertEquals("waliwali", user.getName());
    }*/
}
