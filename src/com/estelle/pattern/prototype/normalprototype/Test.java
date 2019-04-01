package com.estelle.pattern.prototype.normalprototype;

import com.estelle.pattern.prototype.normalprototype.Mail;
import com.estelle.pattern.prototype.normalprototype.MailUtil;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");

        /**
         * 建立多个对象时使用
         */
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@163.com");
            mailTemp.setContent("邮件内容");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
