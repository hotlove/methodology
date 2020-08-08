package com.guo.methodology;

import com.guo.methodology.domain.CompanyItem;
import com.guo.methodology.service.CompanyItemService;
import com.guo.methodology.timewheel.TimeTask;
import com.guo.methodology.timewheel.TimeWheel;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class MethodologyApplicationTests {

    @Resource
    public CompanyItemService companyItemService;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void testLogging() {
        logger.trace("这是trace日志。。。。。。");
        logger.debug("这是debug日志。。。。。。");
        logger.info("这是info日志。。。。。。");
        logger.warn("这是warn日志。。。。。。");
        logger.error("这是error日志。。。。。。");
    }

    @Test
    void contextLoads() {

//        CompanyItem record = new CompanyItem();
//        record.setCreatedBy(1);
//        record.setName("一双绣花鞋");
//        record.setDescription("鞋子");
//        companyItemService.addCompanyItem(record);
        System.out.println(5%8);
        System.out.println(23/8);
    }

    @Test
    void testTimeWheel() throws InterruptedException {
        TimeWheel timeWheel = new TimeWheel();
        timeWheel.start();

        TimeTask timeTask = new TimeTask();
        timeTask.setDelay(17);
        timeTask.setContent("test");
        timeWheel.putTask(timeTask);

        Thread.sleep(Integer.MAX_VALUE);
    }

}
