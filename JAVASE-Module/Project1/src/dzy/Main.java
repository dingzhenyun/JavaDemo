package dzy;

public class Main {
    private static int balance=10000;
    private static String details = "收支\t账户金额\t收支金额\t说    明\n";;

    public static void main(String[] args) {
	// write your code here
        index();

    }

    public static void index() {
        // 首页
        System.out.println("----------------------家庭收支记账软件----------------------");
        System.out.println("                 1.收支明细");
        System.out.println("                 2.登记收入");
        System.out.println("                 3.登记支出");
        System.out.println("                 4.退出");
        System.out.print("请选择(1-4):");
        char n=Utility.readMenuSelection();
        switch (n){
            case '1':
                select();
                break;
            case '2':
                addofMoney();
                break;
            case '3':
                oddofMoney();
                break;
            case '4':
                exit();
                break;
            default:
                break;

        }
    }
    public static void select(){
        System.out.println("-----------------当前收支明细记录-----------------");
        System.out.println(details);
        System.out.println("--------------------------------------------------");
        index();
    }
    public static void addofMoney(){
        System.out.print("本次收入金额：");
        int amount1 = Utility.readNumber();
        System.out.print("本次收入说明：");
        String desc1 = Utility.readString();

        balance += amount1;
        details += "收入\t" + balance + "\t\t" +
                amount1 + "\t\t" + desc1 + "\n";
        System.out.println("---------------------登记完成---------------------");
        index();
    }
    public static void oddofMoney(){
        System.out.print("本次支出金额：");
        int amount2 = Utility.readNumber();
        System.out.print("本次支出说明：");
        String desc2 = Utility.readString();

        balance -= amount2;
        details += "支出\t" + balance + "\t\t" +
                amount2 + "\t\t" + desc2 + "\n";
        System.out.println("---------------------登记完成---------------------");
        index();
    }
    public static void exit(){
        System.exit(0);
    }

}
