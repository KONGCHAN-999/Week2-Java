public class greaTer {
/*
* Project java 
* If your weight is greater than 0, you are obese
*  
*
* @By-Kongchan
*
*/
    public static void main(String[] args) {
        int Weight = 70, height = 170;
        int sum = 100;
        sum=Weight+sum-height;
        if(sum<0){
            System.out.println(sum+" = You are in good shape");
        }else{
            System.out.println(sum+" = You are obese");
        }
    }
}
