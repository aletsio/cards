package com.redi.test;

import com.redi.Admin;
import com.redi.User;
import org.junit.jupiter.api.Test;

public class TestAdmin {
    @Test
    public void Test(){
        Admin admin = new Admin();
        admin.addAdminSentences();
        User user = new User("A","Italian","English");
        admin.printWordQuestion(2);
    }
}
