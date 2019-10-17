package com.layman.quartz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName Task
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/17 9:24
 * @Version 3.0
 **/
@Component
@Configurable
@EnableScheduling
public class Task {

    @Scheduled(cron = "0/3 * * * * ?")
    public void test() {
        System.out.println("定时器：1s 钟一次");
    }
}
