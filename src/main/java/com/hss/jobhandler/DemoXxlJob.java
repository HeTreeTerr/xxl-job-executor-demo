package com.hss.jobhandler;

import com.hss.service.DemoService;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoXxlJob {

    private static Logger logger = LoggerFactory.getLogger(DemoXxlJob.class);

    @Autowired
    private DemoService demoService;

    @XxlJob("demoJobHandler")
    public void demoJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, demoJobHandler-START.");

        logger.info("XXL-JOB, demoJobHandler-START.");
        // 获取xxljob admin界面传参
        String param = XxlJobHelper.getJobParam();
        logger.info("参数接收:{}",param);
        for (int i = 0; i < 5; i++) {
            XxlJobHelper.log("beat at:" + i);
            demoService.toSayILoveYou();
        }
        //返回处理成功
        XxlJobHelper.handleSuccess("XXL-JOB, demoJobHandler-SUCCESS.");
        logger.info("XXL-JOB, demoJobHandler-SUCCESS.");
    }
}
