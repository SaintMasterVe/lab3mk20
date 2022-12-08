public class FunctionM {
    private static int x;

    // y = x^2 + 2x+ 5
    public FunctionM(int x){
        this.x = x;
    }
    public  int mathfunc(){
        int y = 0;
        y = (int) (Math.pow(x, 2) + 2 * x + 5);
        return y;
    }
    public int squarex(){
        return (int) Math.pow(x, 2);
    }
    public  int secondx(){
        return 2 * x;
    }
}