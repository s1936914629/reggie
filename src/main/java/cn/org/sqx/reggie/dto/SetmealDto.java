package cn.org.sqx.reggie.dto;

import cn.org.sqx.reggie.entity.Setmeal;
import cn.org.sqx.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

