    import java.util.Scanner;

    public class p2_StarTriangle {
        // конструктор
        private int n;
        public p2_StarTriangle(int n) {
            this.n = n;
        }

        // строитель
        public String toString(){
            String triangle = "";
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    triangle+="[*]";
                }
                triangle+="\n";
            }
            return triangle;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the triangle: ");
            int n = sc.nextInt();
            p2_StarTriangle small = new p2_StarTriangle(n);
            System.out.println(small.toString());
            }

        }
