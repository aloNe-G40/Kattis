
public class faktor{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int num1 = io.getInt();
        int factor = io.getInt() - 1;
        
        System.out.println(factor * num1 + 1);
        
        io.close();
    }
}