package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.Setmeal;
import cn.org.sqx.reggie.mapper.SetmealMapper;
import cn.org.sqx.reggie.service.SetmealService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
