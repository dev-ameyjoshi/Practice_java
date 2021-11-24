package newcompany;



public class practice {
    int a;

    public practice(int a) {
        this.a = a;
    }
    public static void main(String[] args) {

        practice gl = new practice(10);
        gl = null;
        System.out.println(gl.hashCode());






    }

}







