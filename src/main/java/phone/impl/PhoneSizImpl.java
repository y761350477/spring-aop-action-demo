package phone.impl;

import phone.dao.PhoneSiz;

public class PhoneSizImpl implements PhoneSiz {

    @Override
    public void salePhone(int num) {
        System.out.println("卖了: " + num + "部手机");
    }

    @Override
    public void buyPhone(int num) {
        System.out.println("进了: " + num + "部手机");
    }
}
