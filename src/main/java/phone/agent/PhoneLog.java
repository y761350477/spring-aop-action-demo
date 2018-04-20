package phone.agent;

import phone.dao.PhoneSiz;
import phone.impl.PhoneSizImpl;
import phone.log.LogUtil;

public class PhoneLog {

    public PhoneSiz phoneSiz = new PhoneSizImpl();
    public LogUtil logUtil = new LogUtil();

    public void sale(int num) {
        phoneSiz.salePhone(num);
//        logUtil.log(num);
    }

    public void buy(int num) {
        phoneSiz.buyPhone(num);
//        logUtil.log(num);
    }
}
