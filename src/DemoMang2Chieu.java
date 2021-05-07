public class DemoMang2Chieu {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6}};
        System.out.println(a.length);
        int sum=0;
        for (int i=0;i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
