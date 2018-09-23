public class Bijele{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        int[] pieces = new int[6];
        int[] perfect = {1,1,2,2,2,8};
        
        for(int i = 0; i < pieces.length; i++){
            pieces[i] = io.getInt();
            if (pieces[i] == 0 ){
                pieces[i] = perfect[i];
            }
            else{
                pieces[i] = perfect[i] - pieces[i];
            }
            System.out.print(pieces[i]+ " ");
        }
        io.close();
    }
}