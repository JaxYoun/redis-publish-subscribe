# redis-publish-subscribe
## 在spring-boot项目中集成了redis的订阅发布功能
## 项目启动后订阅者向redis订阅指定频道主题
## 用户通过浏览器访问controller方法，通过发布者向指定频道主题发送消息
## 订阅者接到消息后触发器onMessage方法执行后续操作