package cn.org.sqx.service.impl;

import cn.org.sqx.entity.Employee;
import cn.org.sqx.mapper.EmployeeMapper;
import cn.org.sqx.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author wff
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {
}
