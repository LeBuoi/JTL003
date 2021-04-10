/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author HP
 */
public class MathUtility {

    //hàm tính n! = 1.2.3...n
    //0! = 1! = 1
    //âm giai thừa ko hợp lệ
    //long: tối đa 18 con số 0, 21! tràn kiểu long, tức là 21! long ko đc 
    //do đó hàm này ta chỉ chấp nhận n đầu vào từ 0...20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("U wrong u gay! It must be between 0..20");
        

        if (n == 0 || n == 1) 
            return 1;
      

        return n * getFactorial(n - 1);
    } //còn 1 cách khác, dùng for nhân dồn vào biến product = 1;
      //for 2...n, product = product * i;
}
