package sec03.chap04;

public class ArrayPassing {
    static void replaceSpce(char a[]){
        for(int i=0; i<a.length; i++){
            if(a[i] == ' '){
                a[i] = ',';
            }
        }
    }
    static void printCharArray(char a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'l', 'e', '.'};
        printCharArray(c);
        replaceSpce(c);
        printCharArray(c);

    }
}
