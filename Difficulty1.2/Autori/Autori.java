public class Autori{
    public static void main(String[] args){
        Kattio io = new Kattio(System.in);
        
        String name = io.getWord();
        
        for(int i = 0; i< name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(ch);
            }
        }
        io.close();
    }
}