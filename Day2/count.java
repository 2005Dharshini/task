class Main {
    public static void main(String[] args) {
        
    
       
       String name="Dharshini";
       int n=name.length();
       int count =0;
       for(int i=0;i<n;i++)
           {
               System.out.println(name.charAt(i));
           
           if(name.charAt(i)=='a'||name.charAt(i)=='e'|| name.charAt(i)=='o'|| name.charAt(i)=='u'|| name.charAt(i)=='i')
           count++;
           }
           
           System.out.println(count);
    }
           
}