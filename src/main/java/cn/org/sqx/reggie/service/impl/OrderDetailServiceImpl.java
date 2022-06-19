package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.OrderDetail;
import cn.org.sqx.reggie.mapper.OrderDetailMapper;
import cn.org.sqx.reggie.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
