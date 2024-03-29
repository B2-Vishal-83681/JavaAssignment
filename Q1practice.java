public class Q1practice {
    public static void main(String args[]){
//        String to float
        String s1 = "2.5";
        float f1 = Float.parseFloat(s1);
        System.out.println(f1);

//        String to double
        String s2 = "4.4";
        double d1 = Double.parseDouble(s2);
        System.out.println(d1);

//        Float to float
        Float f2 = new Float(22.4f);
        float f3 = f2.floatValue();
        System.out.println(f3);

//        double to String
        double d2 = 222.34;
        String s3 = Double.toString(d2);
        System.out.println(s3);

//        float to Float
        float f4 = 23.4f;
        Float f5 = Float.valueOf(f4);
        System.out.println(f5);

//        double to Double
        double d3 = 222.333;
        Double d4 = Double.valueOf(d3);

    }

}
