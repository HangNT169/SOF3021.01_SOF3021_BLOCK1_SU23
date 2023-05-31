package com.poly.sof3021.B10_DatLich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestSchedule {

    @Autowired
    private TestService testService;

    // https://crontab.guru/
    // https://hocspringboot.net/2020/12/26/spring-batch-la-gi/
    // https://hocspringboot.net/2020/10/29/cron-job-la-gi/
    // https://www.baeldung.com/spring-scheduled-tasks
    // Set thoi gian ham service chay
//    @Scheduled(fixedRate = 2000)  // Tinh theo ms
    @Scheduled(cron = "* * * * * ?")
    public void datChuongBaoThuc() {
        try {
            testService.chuongBaoThuc();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
