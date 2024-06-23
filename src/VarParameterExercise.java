public class VarParameterExercise {
    public static void main(String[] args) {
    Lzjmethod lzjmethod=new Lzjmethod();
        System.out.println( lzjmethod.showScore("lzj",90,89,76,30));

    }
}

class Lzjmethod{
    public String showScore(String name,double... score){
        double total=0;
        for(int i=0;i<score.length;i++){
            total+=score[i];
        }
        // return一个字符串
        return  name+"的"+score.length+"门课的总分是"+total;
    }

}
