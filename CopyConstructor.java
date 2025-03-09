public class CopyConstructor {
    int a,b;

    public CopyConstructor(int x,int y) {
        a=x;
        b=y;

    }
    CopyConstructor(CopyConstructor p){
        a=p.a;
        b=p.b;
    }
    void show(){
        int c;
        c=a+b;
        System.out.println("The sum is"+c);
    }
    public static void main(String[] args) {
        CopyConstructor q=new CopyConstructor(10,20);
        q.show();
    }
    
    
}
