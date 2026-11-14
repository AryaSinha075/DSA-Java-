class Solution {
    public boolean completePrime(int num) {  
       String n = Integer.toString(num);
       int l = n.length();
       String tem = "";
       for (int i = 0; i<l; i++){
        tem+=n.charAt(i);
        int t = Integer.parseInt(tem);
        if(!isPrime(t))
        return false;
       } 
       
       tem = "";
       for (int i = l-1; i >=0; i--){
        tem=n.charAt(i) + tem;
        int t = Integer.parseInt(tem);
           if(!isPrime(t)){
           return false;
       }}
       return true;
        
    } 
        
        
boolean isPrime(int num){
    int i;
    if(num<=1){
        return false;
    }
    for(i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            return false;
        }
    } return true;
}        }