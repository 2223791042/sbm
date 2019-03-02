package mr.s.sbm.service.impl;

import mr.s.sbm.dao.UserMapper;
import mr.s.sbm.entity.User;
import mr.s.sbm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
