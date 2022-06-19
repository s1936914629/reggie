package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.ShoppingCart;
import cn.org.sqx.reggie.mapper.ShoppingCartMapper;
import cn.org.sqx.reggie.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}

