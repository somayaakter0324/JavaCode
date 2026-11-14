class Box{
    int height,width,length;
    Box(int h,int w,int l){
        height=h;
        width=w;
        length=l;
    }
    boolean isEqual(Box b){
        return (height==b.height && width==b.width && length==b.length);
    }
}
public class BoxEqual {
    static void main(String[] args) {
      Box b1=new Box(10,20,30);
        Box b2=new Box(10,20,30);
        Box b3=new Box(5,10,15);
        System.out.println("b1==b2?"+b1.isEqual(b2));
        System.out.println("b1==b3?"+b1.isEqual(b3));
    }
}
