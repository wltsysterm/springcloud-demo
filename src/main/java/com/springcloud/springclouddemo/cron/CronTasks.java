package com.springcloud.springclouddemo.cron;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CronTasks {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 2000)//两秒执行一次
    public void cronDemoTasks(){
        System.out.println("CronTask: Hello, this is for test : " + dateFormat.format(new Date()));
    }
}
