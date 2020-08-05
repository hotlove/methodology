package com.guo.methodology.service.impl;

import com.guo.methodology.dao.CompanyItemMapper;
import com.guo.methodology.domain.CompanyItem;
import com.guo.methodology.service.CompanyItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Date: 2020/8/5 13:44
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
@Service
public class CompanyItemServiceImpl implements CompanyItemService {

    @Resource
    private CompanyItemMapper companyItemMapper;

    @Override
    public void addCompanyItem(CompanyItem companyItem) {
        companyItemMapper.insertSelective(companyItem);
    }
}
