package Loop;

public class Continue_Statement {
    public static void main(String[] args) {
        int n = 10;
        for (int i=1;i<n;i++){
            if (i == 4){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
