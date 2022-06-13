package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.Employee;
import cn.org.sqx.reggie.mapper.EmployeeMapper;
import cn.org.sqx.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
