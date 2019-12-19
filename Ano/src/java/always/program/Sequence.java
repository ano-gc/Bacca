package always.program;

public class Sequence {
    private Integer An;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public  Sequence(int an,int value){
        this.An=an;
        this.value=value;
    }

    public Integer getAn() {
        return An;
    }

    public void setAn(Integer an) {
        An = an;
    }

}
