package de.sciss.jump3r;


import java.util.Arrays;

public class ThreadLocals {

    static public ThreadLocal<int[]> createIntArray(int[] init) {
        return new ThreadLocal<int[]>() {
            @Override
            protected int[] initialValue() {
                return init;
            }

            @Override
            public int[] get() {
                int[] v = super.get();
                Arrays.fill(v, 0);
                return v;
            }
        };
    }

    static public ThreadLocal<int[][]> createIntArray2(int[][] init) {
        return new ThreadLocal<int[][]>() {
            @Override
            protected int[][] initialValue() {
                return init;
            }

            @Override
            public int[][] get() {
                int[][] arrs = super.get();
                for (int[] v : arrs) {
                    Arrays.fill(v, 0);
                }
                return arrs;
            }
        };
    }

    static public ThreadLocal<int[][][]> createIntArray3(int[][][] init) {
        return new ThreadLocal<int[][][]>() {
            @Override
            protected int[][][] initialValue() {
                return init;
            }

            @Override
            public int[][][] get() {
                int[][][] arrs = super.get();
                for (int[][] floats : arrs) {
                    for (int[] v : floats) {
                        Arrays.fill(v, 0);
                    }
                }
                return arrs;
            }
        };
    }
    static public ThreadLocal<float[]> createFloatArray(float[] init) {
        return new ThreadLocal<float[]>() {
            @Override
            protected float[] initialValue() {
                return init;
            }

            @Override
            public float[] get() {
                float[] v = super.get();
                Arrays.fill(v, 0f);
                return v;
            }
        };
    }

    static public ThreadLocal<float[][]> createFloatArray2(float[][] init) {
        return new ThreadLocal<float[][]>() {
            @Override
            protected float[][] initialValue() {
                return init;
            }

            @Override
            public float[][] get() {
                float[][] arrs = super.get();
                for (float[] v : arrs) {
                    Arrays.fill(v, 0f);
                }
                return arrs;
            }
        };
    }

    static public ThreadLocal<float[][][]> createFloatArray3(float[][][] init) {
        return new ThreadLocal<float[][][]>() {
            @Override
            protected float[][][] initialValue() {
                return init;
            }

            @Override
            public float[][][] get() {
                float[][][] arrs = super.get();
                for (float[][] floats : arrs) {
                    for (float[] v : floats) {
                        Arrays.fill(v, 0);
                    }
                }
                return arrs;
            }
        };
    }
}
