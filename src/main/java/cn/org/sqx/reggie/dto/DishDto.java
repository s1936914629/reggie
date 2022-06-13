package cn.org.sqx.reggie.dto;


import cn.org.sqx.reggie.entity.Dish;
import cn.org.sqx.reggie.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
