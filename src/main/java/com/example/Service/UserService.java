package com.example.Service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.*;
import com.example.domain.User;
import com.example.domain.UserMapper;
 
@Service
public class UserService {
    @Autowired
    private UserMapper userMappper;
   
    public void add(){
        userMappper.insert("AAA", 20);
    }
}
