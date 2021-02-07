package de.sciss.jump3r.mp3;

import java.util.Arrays;

/**
 * allows re-use of previously computed noise values
 */
public class CalcNoiseData {
    int global_gain;
    int sfb_count1;
    int step[] = new int[39];
    float noise[] = new float[39];
    float noise_log[] = new float[39];

    public CalcNoiseData clear() {
        global_gain = 0;
        sfb_count1 = 0;
        Arrays.fill(step, 0);
        Arrays.fill(noise, 0);
        Arrays.fill(noise_log, 0);
        return this;
    }
}