public class quadrant{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int x = io.getInt();
        int y = io.getInt();
        
        while(x>0){
            if(y< 0 ){
                System.out.println("4");
            }else{
                System.out.println("1");
            }
            break;
        }
        while(x<0){
            if(y<0){
                System.out.println("3");
            }else{
                System.out.println("2");
            }
            break;
        }
        
        io.close();
    }
}