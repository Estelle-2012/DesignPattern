package com.estelle.pattern.prototype.normalprototype;

import com.estelle.pattern.prototype.normalprototype.Mail;

import java.text.MessageFormat;

public class MailUtil {

    public static void sendMail(Mail mail) {
        /**
         * {num} 占位符
         */
        String outputContent = "向{0},邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
