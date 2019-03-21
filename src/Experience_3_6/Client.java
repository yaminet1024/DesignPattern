package Experience_3_6;

/**
 * 状态模式实例之银行转账
 * 在某银行系统中，我们定义了账户的三种状态：
 * （1）如果账户(Account)中余额(balance)大于等于0，此时账户的状态为绿色(GreenState)，即正常状态，表示既可以向该账户存款(deposit)也可以向从该账户取款(whithdraw)。
 * （2）如果该账户中余额小于0，并且大于等于-1000，则该账户的状态为黄色(YellowState)，即欠费状态，此时既可以向该账户存款也可以从该账户取款。
 * （3）如果该账户余额小于-1000，那么该账户的状态为红色(RedState)，即透支状态，此时用户只能向该账户存款，不能在从中取款。
 * 现在用状态模拟来实现状态的转化问题，用户只要执行简单的存款和取款操作，系统根据数量自动转换到相应的状态。
 */

public class Client {
    public static void main(String[] args) {
        Account account = new Account("张三",1000);
        System.out.println("-----------------------------------");
        account.deposit(1000);
        System.out.println("-----------------------------------");
        account.withdraw(1001);
        System.out.println("-----------------------------------");
        account.withdraw(2000);
        System.out.println("-----------------------------------");
        account.withdraw(3000);
    }
}
