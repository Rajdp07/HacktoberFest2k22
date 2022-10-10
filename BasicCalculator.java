public class BasicCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first number:");
            int n1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int n2 = sc.nextInt();
            System.out.println("Enter the operator:");
            char op = sc.next().charAt(0);
            int result = 0;
            switch(op){
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("The result is " + result);
        }
    }
}
