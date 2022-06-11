package cn.org.sqx.service.impl;


import cn.org.sqx.entity.Dish;
import cn.org.sqx.mapper.DishMapper;
import cn.org.sqx.service.DishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper,Dish> implements DishService {
}
