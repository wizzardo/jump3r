package de.sciss.jump3r.mp3;

import java.util.Arrays;

public final class III_psy_xmin {
	float[] l = new float[Encoder.SBMAX_l];
	float[][] s = new float[Encoder.SBMAX_s][3];

	public void assign(III_psy_xmin iii_psy_xmin) {
		System.arraycopy(iii_psy_xmin.l, 0, l, 0, Encoder.SBMAX_l);
		for (int i = 0; i < Encoder.SBMAX_s; i++) {
			float[] si = s[i];
			float[] si_other = iii_psy_xmin.s[i];
			for (int j = 0; j < 3; j++) {
				si[j] = si_other[j];
			}
		}
	}

	public void clear() {
		Arrays.fill(l,0);
		for (int i = 0; i < s.length; i++) {
			Arrays.fill(s[i],0);
		}
	}
}