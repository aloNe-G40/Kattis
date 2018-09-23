public class carrots{
    public static void main(String[] args){
        
        Kattio io = new Kattio(System.in);
        int contestant = io.getInt();
        int problem = io.getInt();
        
            
        while(contestant < 1 || problem > 1000 || problem < 0){
            System.out.println("1.Number of contestant must be greater or equal to 1.\n2.Number of problem must be greater than 1 and smaller than 1000.");
            contestant = io.getInt();
            problem = io.getInt();
        }
            
        for(int i = 0; i < contestant; i++){
            io.getWord();
        }
        System.out.println(problem);
        io.close();
    }
}