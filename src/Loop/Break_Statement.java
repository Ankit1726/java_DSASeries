package Loop;

public class Break_Statement {
    public static void main(String[] args) {
        int n = 7;
        for (int i=1;i<=n;i++){
            if ( i == 5){
                break;
            }
            System.out.println(i+ " ");
        }
        System.out.println("Out of the loop");
    }
}
