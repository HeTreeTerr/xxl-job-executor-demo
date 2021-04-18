package com.hss.service.impl;

import com.hss.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public void toSayILoveYou() {
        log.info("I Love You!!!");
    }
}
