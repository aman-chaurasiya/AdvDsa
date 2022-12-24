import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] n={10,20,10,10,50,10};
        Arrays.sort(n);



        int[] ans=new int[n.length];
        int j=0;

        for(int i=0;i<n.length;i++){
            if(n[i]==n[i+1]){
                continue;
            }else{
                ans[j++]=n[i];
            }
        }
        System.out.println(ans.toString());
    }
}
