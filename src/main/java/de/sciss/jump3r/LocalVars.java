package de.sciss.jump3r;


import java.util.Arrays;

public class LocalVars {

    public static class LocalVar<T> {
        protected T value;

        public LocalVar(T value) {
            this.value = value;
        }

        public LocalVar() {
            value = initialValue();
        }

        protected T initialValue() {
            return null;
        }


        public T get() {
            return value;
        }
    }

    static public LocalVar<int[]> createIntArray(int[] init) {
        return new LocalVar<int[]>(init) {

            @Override
            public int[] get() {
                int[] v = super.get();
                Arrays.fill(v, 0);
                return v;
            }
        };
    }

    static public LocalVar<int[][]> createIntArray2(int[][] init) {
        return new LocalVar<int[][]>(init) {

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

    static public LocalVar<int[][][]> createIntArray3(int[][][] init) {
        return new LocalVar<int[][][]>(init) {

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

    static public LocalVar<float[]> createFloatArray(float[] init) {
        return new LocalVar<float[]>(init) {

            @Override
            public float[] get() {
                float[] v = super.get();
                Arrays.fill(v, 0f);
                return v;
            }
        };
    }

    static public LocalVar<float[][]> createFloatArray2(float[][] init) {
        return new LocalVar<float[][]>(init) {

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

    static public LocalVar<float[][][]> createFloatArray3(float[][][] init) {
        return new LocalVar<float[][][]>(init) {

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

    static public LocalVar<short[]> createShortArray(short[] init) {
        return new LocalVar<short[]>(init) {

            @Override
            public short[] get() {
                short[] v = super.get();
                Arrays.fill(v, (short) 0);
                return v;
            }
        };
    }

    static public LocalVar<short[][]> createShortArray2(short[][] init) {
        return new LocalVar<short[][]>(init) {

            @Override
            public short[][] get() {
                short[][] arrs = super.get();
                for (short[] v : arrs) {
                    Arrays.fill(v, (short) 0);
                }
                return arrs;
            }
        };
    }

    static public LocalVar<short[][][]> createShortArray3(short[][][] init) {
        return new LocalVar<short[][][]>(init) {

            @Override
            public short[][][] get() {
                short[][][] arrs = super.get();
                for (short[][] floats : arrs) {
                    for (short[] v : floats) {
                        Arrays.fill(v, (short) 0);
                    }
                }
                return arrs;
            }
        };
    }

    static public LocalVar<byte[]> createByteArray(byte[] init) {
        return new LocalVar<byte[]>(init) {

            @Override
            public byte[] get() {
                byte[] v = super.get();
                Arrays.fill(v, (byte) 0);
                return v;
            }
        };
    }
}
