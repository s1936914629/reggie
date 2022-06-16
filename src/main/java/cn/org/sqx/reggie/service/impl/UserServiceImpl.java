package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.User;
import cn.org.sqx.reggie.mapper.UserMapper;
import cn.org.sqx.reggie.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
