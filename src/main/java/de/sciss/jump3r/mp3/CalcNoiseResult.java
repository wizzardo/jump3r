package de.sciss.jump3r.mp3;

public class CalcNoiseResult {
	/**
	 * sum of quantization noise > masking
	 */
	float over_noise;
	/**
	 * sum of all quantization noise
	 */
	float tot_noise;
	/**
	 * max quantization noise
	 */
	float max_noise;
	/**
	 * number of quantization noise > masking
	 */
	int over_count;
	/**
	 * SSD-like cost of distorted bands
	 */
	int over_SSD;
	int bits;

	public CalcNoiseResult clear() {
		over_noise = 0;
		tot_noise = 0;
		max_noise = 0;
		over_count = 0;
		over_SSD = 0;
		bits = 0;
		return this;
	}

	public void copyInto(CalcNoiseResult dst) {
		dst.over_noise = over_noise;
		dst.tot_noise = tot_noise;
		dst.max_noise = max_noise;
		dst.over_count = over_count;
		dst.over_SSD = over_SSD;
		dst.bits = bits;
	}
}