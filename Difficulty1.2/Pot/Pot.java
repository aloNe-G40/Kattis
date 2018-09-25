public class Pot{
    public static int sum = 0;
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int total = io.getInt();
        
        for (int i = 0; i <total; i++){
            String num = io.getWord();
            String num1 = num.substring(0,num.length()-1);
            String power = num.substring(num.length() - 1);
            sum += Math.pow(Integer.parseInt(num1),Integer.parseInt(power));
        }
        System.out.println(sum);
        
        io.close();
    }
}