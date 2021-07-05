public class A {
    //static member
    public static int staticCount = 0;

    //instance member
    public int instanceCount = 0;

    public A(){
        staticCount++;
        this.instanceCount++;
    }

    public static void main(String[] args){
        A a = new A();
        A.staticCount = 2494;

        System.out.println(a.instanceCount);
        System.out.println(a.staticCount);

        A a2 = new A();

        System.out.println(a2.instanceCount);
        System.out.println(A.staticCount);

        a.instanceCount = 15;

        System.out.println("object a instanceCount: " + a.instanceCount);
        System.out.println("object a2 instanceCount: " + a2.instanceCount);

        System.out.println("class A staticCount: " + A.staticCount);
    }
}
