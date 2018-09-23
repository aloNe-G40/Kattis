public class cold{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int total = io.getInt();
        int[] temperature = new int[total];
        int count = 0;
        
        for(int i = 0; i< temperature.length; i++){
            temperature[i] = io.getInt();
            if(temperature[i] < 0){
                count++;
            }
        }
        System.out.println(count);
        
        io.close();
    }
}