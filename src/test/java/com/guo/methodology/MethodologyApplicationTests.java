package com.guo.methodology;

import com.guo.methodology.domain.CompanyItem;
import com.guo.methodology.service.CompanyItemService;
import com.guo.methodology.timewheel.TimeTask;
import com.guo.methodology.timewheel.TimeWheel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class MethodologyApplicationTests {

    @Resource
    public CompanyItemService companyItemService;

    @Test
    void contextLoads() {
//        CompanyItem record = new CompanyItem();
//        record.setCreatedBy(1);
//        record.setName("一双绣花鞋");
//        record.setDescription("鞋子");
//        companyItemService.addCompanyItem(record);
        System.out.println(5%8);
        System.out.println(3/8);
    }

    @Test
    void testTimeWheel() throws InterruptedException {
        TimeWheel timeWheel = new TimeWheel();
        timeWheel.start();

        TimeTask timeTask = new TimeTask();
        timeTask.setDelay(15);
        timeTask.setContent("test");

        TimeUnit.SECONDS.sleep(1);
        timeWheel.putTask(timeTask);

        Thread.sleep(Integer.MAX_VALUE);
    }

}
