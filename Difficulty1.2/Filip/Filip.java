public class Filip{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        String num1 = new StringBuffer(io.getWord()).reverse().toString();
        String num2 = new StringBuffer(io.getWord()).reverse().toString();
        System.out.println(Math.max(Integer.parseInt(num1),Integer.parseInt(num2)));
        io.close();
    }
}