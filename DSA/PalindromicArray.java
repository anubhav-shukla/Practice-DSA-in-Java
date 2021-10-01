package DSA;

public class PalindromicArray {
    int palinArray(int a[], int n){
        int flag = 1;
        for(int j=0;j<n;j++){
            int temp = a[j];
            int rem, sum = 0;
            while(temp>0){
                rem = temp % 10;
                sum = sum * 10 + rem;
                temp /= 10;
            }
        if(a[j]!= sum){
            flag = 0;
            break;
        }
        else{
            flag=1;
        }

        }
        return flag;
    }
    public void main(String ar[]){
        int a[] = {1,2,4,6,7,7,4,3,111};
        int n = a.length;
        palinArray(a,n);
    }
}
