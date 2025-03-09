public class Code7 {
    public static void main(String[] args) {
        String s="Java programming";
        System.out.println(s.replace("Java", "phython"));
        System.out.println(s.replaceAll(s, "phython"));
        System.out.println(s.replaceAll("a", "e"));
    }
}