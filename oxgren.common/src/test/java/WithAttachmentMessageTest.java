import Mail.SimpleMailSender;
import Mail.WithAttachmentMessage;
import org.junit.Test;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by YuChao on 2015/8/21.
 */
public class WithAttachmentMessageTest {

    @Test
    public void sendMessage() throws Exception {
        WithAttachmentMessage mail = new WithAttachmentMessage();
        Session session = Session.getDefaultInstance(new Properties());
        MimeMessage message = mail.createMessage(session);

        SimpleMailSender sms =new SimpleMailSender("smtp.qq.com","yuchaoonline@qq.com","resharper3");
        sms.send("yuchaoonline@qq.com","测试内容");
    }

}
