package always.program;

public class SequenceGetA1 {
    static Sequence sequence = new Sequence(20, 1);

    public static Sequence getNumberA1(int an, int value) {
        if (an == 1) {
            return new Sequence(1, value);
        } else {
            if (an % 2 == 0) {
                return getNumberA1(an / 2, value + 1);
            } else {
                return getNumberA1((an - 1) / 2, (value - 1) / 2);
            }
        }
    }

    public static int getCount(int n,int a1){
        int a=0,b=0;
        if(n%2==0){
            a=3*(n*a1/2-n^2/8-n/4)+(n-1)/2;
        }else{
            a=3*(n*a1/2-n^2/8-n/4)+(n-1)/2+a1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a=getNumberA1(sequence.getAn(),sequence.getValue()).getValue();
        System.out.println(a);
        System.out.println(getCount(63,a));
    }
}
