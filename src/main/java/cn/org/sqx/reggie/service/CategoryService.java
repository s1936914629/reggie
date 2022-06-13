package cn.org.sqx.reggie.service;

import cn.org.sqx.reggie.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
