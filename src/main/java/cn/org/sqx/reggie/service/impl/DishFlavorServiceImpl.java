package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.DishFlavor;
import cn.org.sqx.reggie.mapper.DishFlavorMapper;
import cn.org.sqx.reggie.service.DishFlavorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
