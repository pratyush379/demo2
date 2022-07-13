package java2;
@FunctionalInterface
interface interfaceFun {
    int add(int a , int b);
}

class Main{
    public static void main(String[] args) {
        interfaceFun fun = (a,b) -> {
            return a+b;

        };
System.out.println(fun.add(5, 6));
        
    }
}
