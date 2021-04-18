# springboot集成xxl-job

## 1.任务调度中心地址
* http://127.0.0.1:8080/xxl-job-admin
* 默认用户名、密码：admin/123456

## 2.官方文档地址  
* https://www.xuxueli.com/xxl-job/

## 3.本代码为执行器
* appName:xxl-job-executor-demo  
* 与调度中心通讯地址：本机ip:9996

## 4.xxlJob核心模块
1. 执行器触发数据库  
2. 任务调度中心  
3. 执行器(需要执行的代码逻辑)  
4. 触发器(CRON：0/5 * * * * ? ,执行的触发策略)