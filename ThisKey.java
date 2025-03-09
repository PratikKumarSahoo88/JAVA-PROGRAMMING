public class ThisKey {
    int roll;
    String name;

    public ThisKey(int roll,String name) {
        this.roll=roll;
        this.name=name;

    }
    void show(){
        System.out.println("Name is"+name+" "+"Roll is"+roll);
    }
    public static void main(String[] args) {
        ThisKey p=new ThisKey(18, "Pratik");
        p.show();
    }
    
}
