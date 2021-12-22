package org.test.payment;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.Socket;

public class PaymentClient {

    private Socket socket;

    public PaymentClient(Integer port) throws Exception{
        this.socket = new Socket("localhost",port);
    }

    public void closeClient() throws Exception {
        if (this.socket != null) {
            this.socket.close();
        }else {
            throw new Exception("The Socket has not initialized");
        }
    }

    private String makePayment(String a1,
                               int a2,
                               BigDecimal a3,
                               String a5,
                               int a6,
                               int a12,
                               String a13,
                               int a18,
                               String a19,
                               BigDecimal a20,
                               boolean a25,
                               boolean a26,
                               int a28,
                               String a30,
                               String a72,
                               String a103,
                               byte a108,
                               int a109,
                               String a110,
                               int a111,
                               boolean a112,
                               byte a99) throws Exception {
        String outStr = "";
        String request = "\n";
        if (Validator.a1(a1)) {
            request = request.concat("1="+a1+"\n");
            if(Validator.a2(a2)){
                request = request.concat("2="+String.valueOf(a2)+"\n");
                if (Validator.a3(a3)) {
                    request = request.concat("3="+a3.setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()+"\n");

                }else {
                    throw new Exception("Amount is invalid");
                }
            }
            else {
                throw new Exception("Transaction type is invalid");
            }
        }
        else {
          throw new Exception("Transaction reference is invalid");
        }



        return outStr;
    }
}
