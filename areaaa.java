public class areaaa {
    public float areaofc(float r){
        final float PI=3.14f;
        return PI*r*r;
    }

    public static void main(String[] args) {
        areaaa a=new areaaa();
        float r=a.areaofc(3);
        System.out.println(r);

        // final float PI=3.14f;
        // int r=6;
        // float area=PI*r*r;
      //System.out.println(area);
    }
}
