package be.parkin.api.Service.Impl;

import be.parkin.api.Repository.UserRepository;
import be.parkin.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
