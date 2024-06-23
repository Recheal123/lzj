public class invaliadParameter {
    public static void main(String[] args) {
    LzjMethod lzjMethod=new LzjMethod();
    int res=lzjMethod.sum(1,2,3,4,6,7,8);
        System.out.println("和="+ res);
    }
}
// 可变参数
class LzjMethod{
    public int sum(int... nums){
       //nums是个数组
        System.out.println("接收参数的个数="+nums.length);
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }

        return  sum;
    }
}