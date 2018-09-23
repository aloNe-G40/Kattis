public class sibice{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        
        int match = io.getInt();
        double width = io.getDouble();
        double height = io.getDouble();
        int length;
        
        while(match < 0 || match > 50){
            System.out.println("The number of matches should be between 1 and 50. Please re-enter the number of matches.");
            match = io.getInt();
        }
        while(width < 1 || width > 100){
            System.out.println("The width should be between 1 and 100.Please re-enter the width.");
            width = io.getDouble();
        }
        while(height < 1 || height > 100){
            System.out.println("The height should be between 1 and 100.Please re-enter the height.");
            height = io.getDouble();
        }
        
        double diagonal = Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
        for(int i = 0; i < match; i++){
            length = io.getInt();
            if(length < 1 || length > 1000){
                System.out.println("The length of a match should be between 1 and 1000.");
                length = io.getInt();
            }
            if(length > diagonal){
                System.out.println("NE");
            }
            else{
                System.out.println("DA");
            }    
        }
        io.close();
    }
}