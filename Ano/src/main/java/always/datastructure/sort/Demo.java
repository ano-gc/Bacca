package always.datastructure.sort;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-27 18:36
 **/
public class Demo {
    public static void main(String[] args) {
        int[] data1 = {5, 4, 6, 2, 2, 5, 8, 5, 8, 6, 2};
        int[] data2 = {5, 4, 6, 2, 2, 5, 8, 5, 8, 6, 2};
        int[] data3 = {5, 4, 6, 2, 2, 5, 8, 5, 8, 6, 2};
        int n = data1.length;
        Demo demo=new Demo();
        demo.insertSort(data1,n);
        for (int i = 0; i < n; i++) {
            System.out.println(data1[i]);
        }
        demo.selectSort(data2,n);
        for (int i = 0; i < n; i++) {
            System.out.println(data2[i]);
        }
        demo.quickSort(data3,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(data3[i]);
        }
    }

    public void selectSort(int[] data, int n) {
        int i, j, k, temp;
        for (i = 0; i < n - 1; i++) {
            k=i;
            for (j=i+1;j<n;j++){
                if(data[k]>data[j]){
                    k=j;
                }
                if(k!=i){
                    temp=data[i];
                    data[i]=data[k];
                    data[k]=temp;
                }
            }
        }
    }

    public void insertSort(int []data,int n){
        int i,j,temp;
        for (i=1;i<n;i++){
            if(data[i-1]>data[i]){
                temp=data[i];
                for (j=i-1;j>=0&&temp<data[j];j--){
                    data[j+1]=data[j];
                }
                data[j+1]=temp;
            }
        }
    }

    public void quickSort(int []data,int low,int high){
        if(low>high)return;;
        int i,j,k,temp;
        i=low;j=high;
        temp=data[low];
        while(i<j){
            while(i<j&&temp<=data[j]){
                j--;
            }
            while(i<j&&temp>=data[i]){
                i++;
            }
            if(i<j){
                k=data[j];
                data[j]=data[i];
                data[i]=k;
            }
        }
        data[low]=data[i];
        data[i]=temp;
        quickSort(data,low,j-1);
        quickSort(data,j+1,high);
    }
}
