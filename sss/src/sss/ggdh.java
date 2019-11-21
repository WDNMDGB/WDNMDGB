package sss;

import java.util.Scanner;
public class ggdh {
    public int input() {
        System.out.print("请输入一个4位正整数：");
        Scanner k = new Scanner(System.in);
        int num = k.nextInt();
        return num;
    }

    public void change(int num) {
        // 分解出位数
        int x1, x2, x3, x4;
        x1 = num % 10;
        x2 = num / 10 % 10;
        x3 = num / 100 % 10;
        x4 = num / 1000;
        // 代替数字
        x1 = (x1 + 5) % 10;
        x2 = (x2 + 5) % 10;
        x3 = (x3 + 5) % 10;
        x4 = (x4 + 5) % 10;
        // 第一位和第四位交换
        int swop;
        swop = x1;
        x1 = x4;
        x4 = swop;
        // 第二位和第三位交换
        swop = x2;
        x2 = x3;
        x3 = swop;
        System.out.print("加密后的数字为：" + x4 + x3 + x2 + x1);
    }

    public static void main(String[] args) {
        ggdh encrypt = new ggdh();
        int num = encrypt.input();
        encrypt.change(num);
    }
}
