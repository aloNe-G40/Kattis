public class HissingMicrophone{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        String s = io.getWord();
        boolean hiss = false;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == 's' && s.charAt(i) == s.charAt(i+1)){
                System.out.println("hiss");
                hiss = true;
                break;
            }
        }
        if(!hiss){
            System.out.println("no hiss");
        }
        
        io.close();
    }
}
    