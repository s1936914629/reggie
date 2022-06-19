package cn.org.sqx.reggie.service.impl;

import cn.org.sqx.reggie.entity.AddressBook;
import cn.org.sqx.reggie.mapper.AddressBookMapper;
import cn.org.sqx.reggie.service.AddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
