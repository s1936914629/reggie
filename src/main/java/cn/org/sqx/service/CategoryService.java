package cn.org.sqx.service;

import cn.org.sqx.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;


public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
