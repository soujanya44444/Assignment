package com.cs_is.Assignment_2.module_1.problem_3;

public class StringDemo {
    public static void main(String[] args) {
        long stratTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("Placement ");
        for(int i=0;i<100000000;i++){
            sbf.append("Training");
        }
        System.out.println("Time taken by the string buffer: "+(System.currentTimeMillis()-stratTime)+"ms");

        stratTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("Placement ");
        for(int i=0;i<00000000;i++){
            sbl.append("Taining");
        }
        System.out.println("Time taken by string builder "+(System.currentTimeMillis()-stratTime)+"ms");
    }
}
