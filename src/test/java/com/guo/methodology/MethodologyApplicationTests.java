package com.guo.methodology;

import com.guo.methodology.domain.CompanyItem;
import com.guo.methodology.service.CompanyItemService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class MethodologyApplicationTests {

    @Resource
    public CompanyItemService companyItemService;

    @Test
    void contextLoads() {
        CompanyItem record = new CompanyItem();
        record.setCreatedBy(1);
        record.setName("一双绣花鞋");
        record.setDescription("鞋子");
        companyItemService.addCompanyItem(record);
    }

}
