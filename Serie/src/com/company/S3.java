package com.company;

public class S3 extends Serie {
    @Override
    protected int operacion(int nro, int i) {
        return (int) Math.pow(i + 1, 2);
    }
}
