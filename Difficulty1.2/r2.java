public class r2{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int num1 = io.getInt();
        int mean = io.getInt();
        int num2 = mean*2 - num1;
        System.out.println(num2);
        io.close();
    }
}