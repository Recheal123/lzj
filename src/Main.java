//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Methods methods=new Methods();
        System.out.println("两个整数间最大值");
        System.out.println(methods.maxNumber(1,2));
        System.out.println("两个浮点数中最大值");
        System.out.println(methods.maxNumber(1.1,1.2));
        System.out.println("三个浮点数中最大值");
        System.out.println(methods.maxNumber(1.2,1.4,1.5));
        }
    }


class Methods{
    public int maxNumber(int a, int b) {
        int intValues = Math.max(a, b);
        return intValues;
    }

    public  double maxNumber(double a, double b){
        double doubleValues=Math.max(a,b);
        return  doubleValues;
    }

    public  double maxNumber(double a, double b, double c){
        double doubleValues2=Math.max(a,Math.max(c,b));
        return doubleValues2;
        }
}
