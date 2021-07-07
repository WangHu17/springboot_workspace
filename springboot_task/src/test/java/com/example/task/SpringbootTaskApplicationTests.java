package com.example.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {
    //邮件任务
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test //发送简单邮件
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("虎哥驾到");
        message.setText("快快接驾");
        message.setTo("17378693948@163.com");
        message.setFrom("1936749601@qq.com");
        javaMailSender.send(message);
    }

    @Test //发送带附件的邮件
    void test() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("虎哥驾到");
        helper.setText("<h2>快快接驾</h2>",true);
        helper.setTo("17378693948@163.com");
        helper.setFrom("1936749601@qq.com");

        helper.addAttachment("1.ipg",new File("D:\\壁纸\\头像\\sooyaaa___20200715_203614_0.jpg"));
        javaMailSender.send(mimeMessage);
    }

}
