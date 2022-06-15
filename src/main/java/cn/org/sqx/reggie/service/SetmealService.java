package cn.org.sqx.reggie.service;

import cn.org.sqx.reggie.dto.SetmealDto;
import cn.org.sqx.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
}
