package de.sciss.jump3r.mp3;

import java.util.Arrays;

public final class GrInfo {
	float xr[] = new float[576];
	int l3_enc[] = new int[576];
	int scalefac[] = new int[L3Side.SFBMAX];
	float xrpow_max;

	int part2_3_length;
	int big_values;
	int count1;
	int global_gain;
	int scalefac_compress;
	int block_type;
	int mixed_block_flag;
	int table_select[] = new int[3];
	int subblock_gain[] = new int[3 + 1];
	int region0_count;
	int region1_count;
	int preflag;
	int scalefac_scale;
	int count1table_select;

	int part2_length;
	int sfb_lmax;
	int sfb_smin;
	int psy_lmax;
	int sfbmax;
	int psymax;
	int sfbdivide;
	int width[] = new int[L3Side.SFBMAX];
	int window[] = new int[L3Side.SFBMAX];
	int count1bits;
	/**
	 * added for LSF
	 */
	int[] sfb_partition_table;
	int slen[] = new int[4];

	int max_nonzero_coeff;

	public final void assign(final GrInfo other) {
		System.arraycopy(other.xr, 0, xr, 0, xr.length);
		System.arraycopy(other.l3_enc, 0, l3_enc, 0, l3_enc.length);
		System.arraycopy(other.scalefac, 0, scalefac, 0, scalefac.length);
		xrpow_max = other.xrpow_max;

		part2_3_length = other.part2_3_length;
		big_values = other.big_values;
		count1 = other.count1;
		global_gain = other.global_gain;
		scalefac_compress = other.scalefac_compress;
		block_type = other.block_type;
		mixed_block_flag = other.mixed_block_flag;
		System.arraycopy(other.table_select, 0, table_select, 0, table_select.length);
		System.arraycopy(other.subblock_gain, 0, subblock_gain, 0, subblock_gain.length);
		region0_count = other.region0_count;
		region1_count = other.region1_count;
		preflag = other.preflag;
		scalefac_scale = other.scalefac_scale;
		count1table_select = other.count1table_select;

		part2_length = other.part2_length;
		sfb_lmax = other.sfb_lmax;
		sfb_smin = other.sfb_smin;
		psy_lmax = other.psy_lmax;
		sfbmax = other.sfbmax;
		psymax = other.psymax;
		sfbdivide = other.sfbdivide;
		System.arraycopy(other.width, 0, width, 0, width.length);
		System.arraycopy(other.window, 0, window, 0, window.length);
		count1bits = other.count1bits;

		if (sfb_partition_table != null && other.sfb_partition_table.length == sfb_partition_table.length) {
			System.arraycopy(other.sfb_partition_table, 0, sfb_partition_table, 0, sfb_partition_table.length);
		} else {
			sfb_partition_table = other.sfb_partition_table.clone();
		}
		System.arraycopy(other.slen, 0, slen, 0, slen.length);
		max_nonzero_coeff = other.max_nonzero_coeff;
	}

	public GrInfo clear() {
		Arrays.fill(xr, 0f);
		Arrays.fill(l3_enc, 0);
		Arrays.fill(scalefac, 0);
		xrpow_max = 0;

		part2_3_length = 0;
		big_values = 0;
		count1 = 0;
		global_gain = 0;
		scalefac_compress = 0;
		block_type = 0;
		mixed_block_flag = 0;
		Arrays.fill(table_select, 0);
		Arrays.fill(subblock_gain, 0);
		region0_count = 0;
		region1_count = 0;
		preflag = 0;
		scalefac_scale = 0;
		count1table_select = 0;

		part2_length = 0;
		sfb_lmax = 0;
		sfb_smin = 0;
		psy_lmax = 0;
		sfbmax = 0;
		psymax = 0;
		sfbdivide = 0;
		Arrays.fill(width, 0);
		Arrays.fill(window, 0);
		count1bits = 0;

		if (sfb_partition_table != null)
			Arrays.fill(sfb_partition_table, 0);
		Arrays.fill(slen, 0);
		max_nonzero_coeff = 0;
		return this;
	}
}