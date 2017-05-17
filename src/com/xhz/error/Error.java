package com.xhz.error;

/**
 * Created by zhaoqiang on 2017/5/16.
 * 异常处理
 */
public class Error {

    public static void main(String[] args) {

        new Error();
    }

    public Error() {

        try {
            customError(true);
            System.out.println("Run normally");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("com.xhz.error.Error occurred");
        }finally {
            System.out.println("Finall run");
        }
        custoRuntimeError(true);
        System.out.println("End");
    }

    void customError(boolean willThrow) throws Exception {
        if (willThrow){
            throw new Exception("Custom error");
        }
    }
    void custoRuntimeError (boolean willThrow){
      if (willThrow){
          throw new RuntimeException("Custom runTime error");
      }
    }

}
