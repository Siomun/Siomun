package com;

import com.utils.HammingUtils;
import com.utils.SimHashUtils;
import com.utils.TxtIOUtils;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIOUtils.readTxt("D:/paper/orig.txt");
        str[1] = TxtIOUtils.readTxt("D:/paper/orig_0.8_add.txt");
        str[2] = TxtIOUtils.readTxt("D:/paper/orig_0.8_del.txt");
        str[3] = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_15.txt");
        String ansFileName = "D:/paper/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtils.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String ansFileName = "D:/paper/ansOrigAndOrigTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig_0.8_add.txt");
        String ansFileName = "D:/paper/ansOrigAndAddTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig_0.8_del.txt");
        String ansFileName = "D:/paper/ansOrigAndDelTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_1.txt");
        String ansFileName = "D:/paper/ansOrigAndDis1Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_10.txt");
        String ansFileName = "D:/paper/ansOrigAndDis10Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIOUtils.readTxt("D:/paper/orig.txt");
        String str1 = TxtIOUtils.readTxt("D:/paper/orig_0.8_dis_15.txt");
        String ansFileName = "D:/paper/ansOrigAndDis15Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtils.writeTxt(ans,ansFileName);
    }

}
