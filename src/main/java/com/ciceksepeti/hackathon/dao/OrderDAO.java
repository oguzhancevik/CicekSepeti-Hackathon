package com.ciceksepeti.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciceksepeti.hackathon.pojo.Order;

public class OrderDAO {

	public List<Order> loadOrders() {
		List<Order> orders = new ArrayList<>();

		// siparis bilgileri (id,enlem,boylam) tanimlaniyor.
		{
			orders.add(new Order((short) 100, 41.078260000000, 29.015770000000));
			orders.add(new Order((short) 101, 41.060780000000, 29.010830000000));
			orders.add(new Order((short) 102, 41.064160000000, 29.009970000000));
			orders.add(new Order((short) 103, 41.085290000000, 29.019790000000));
			orders.add(new Order((short) 104, 41.041840000000, 29.002990000000));
			orders.add(new Order((short) 105, 41.085500000000, 29.008710000000));
			orders.add(new Order((short) 106, 41.085040000000, 29.017570000000));
			orders.add(new Order((short) 107, 41.052210000000, 29.033230000000));
			orders.add(new Order((short) 108, 41.081170000000, 29.039800000000));
			orders.add(new Order((short) 109, 41.085960000000, 29.033490000000));
			orders.add(new Order((short) 110, 41.060720000000, 29.011340000000));
			orders.add(new Order((short) 111, 41.070020000000, 29.017650000000));
			orders.add(new Order((short) 112, 41.080520000000, 29.012240000000));
			orders.add(new Order((short) 113, 41.046150000000, 29.012040000000));
			orders.add(new Order((short) 114, 41.051280000000, 29.003100000000));
			orders.add(new Order((short) 115, 41.054340000000, 29.031720000000));
			orders.add(new Order((short) 116, 41.078260000000, 29.015770000000));
			orders.add(new Order((short) 117, 41.061770000000, 29.037880000000));
			orders.add(new Order((short) 118, 41.061480000000, 29.004810000000));
			orders.add(new Order((short) 119, 41.046830000000, 29.003130000000));
			orders.add(new Order((short) 120, 41.042900000000, 29.000040000000));
			orders.add(new Order((short) 121, 41.045500000000, 28.999780000000));
			orders.add(new Order((short) 122, 41.051280000000, 29.003100000000));
			orders.add(new Order((short) 123, 41.045500000000, 28.999780000000));
			orders.add(new Order((short) 124, 41.059380000000, 29.000360000000));
			orders.add(new Order((short) 125, 41.077080000000, 29.031190000000));
			orders.add(new Order((short) 126, 41.047130000000, 29.009110000000));
			orders.add(new Order((short) 127, 41.079980000000, 29.021330000000));
			orders.add(new Order((short) 128, 41.064160000000, 29.009970000000));
			orders.add(new Order((short) 129, 41.070920000000, 29.042000000000));
			orders.add(new Order((short) 130, 41.083220000000, 29.013630000000));
			orders.add(new Order((short) 131, 41.066040000000, 29.007370000000));
			orders.add(new Order((short) 132, 41.080850000000, 29.010360000000));
			orders.add(new Order((short) 133, 41.043780000000, 29.009960000000));
			orders.add(new Order((short) 134, 41.064160000000, 29.009970000000));
			orders.add(new Order((short) 135, 41.066000000000, 29.040690000000));
			orders.add(new Order((short) 136, 41.086880000000, 29.017910000000));
			orders.add(new Order((short) 137, 41.051750000000, 28.990540000000));
			orders.add(new Order((short) 138, 41.059280000000, 29.012050000000));
			orders.add(new Order((short) 139, 41.079220000000, 29.010440000000));
			orders.add(new Order((short) 140, 41.054610000000, 29.027400000000));
			orders.add(new Order((short) 141, 41.063070000000, 29.010960000000));
			orders.add(new Order((short) 142, 41.075950000000, 29.015770000000));
			orders.add(new Order((short) 143, 41.043780000000, 29.009960000000));
			orders.add(new Order((short) 144, 41.067660000000, 29.043050000000));
			orders.add(new Order((short) 145, 41.056190000000, 28.999960000000));
			orders.add(new Order((short) 146, 41.079190000000, 29.045160000000));
			orders.add(new Order((short) 147, 41.077080000000, 29.031190000000));
			orders.add(new Order((short) 148, 41.057970000000, 29.016160000000));
			orders.add(new Order((short) 149, 41.092640000000, 29.018040000000));
			orders.add(new Order((short) 150, 41.060780000000, 29.010830000000));
			orders.add(new Order((short) 151, 41.077360000000, 29.030970000000));
			orders.add(new Order((short) 152, 41.048580000000, 29.021250000000));
			orders.add(new Order((short) 153, 41.053072478048, 28.987209066283));
			orders.add(new Order((short) 154, 41.083100000000, 29.015150000000));
			orders.add(new Order((short) 155, 41.060780000000, 29.010830000000));
			orders.add(new Order((short) 156, 41.052430000000, 28.990450000000));
			orders.add(new Order((short) 157, 41.063710000000, 29.010420000000));
			orders.add(new Order((short) 158, 41.083290000000, 29.028520000000));
			orders.add(new Order((short) 159, 41.053670000000, 28.989390000000));
			orders.add(new Order((short) 160, 41.076840000000, 29.015430000000));
			orders.add(new Order((short) 161, 41.056950000000, 29.012310000000));
			orders.add(new Order((short) 162, 41.078880000000, 29.030180000000));
			orders.add(new Order((short) 163, 41.067730000000, 29.020290000000));
			orders.add(new Order((short) 164, 41.063070000000, 29.010960000000));
			orders.add(new Order((short) 165, 41.063070000000, 29.010960000000));
			orders.add(new Order((short) 166, 41.045950000000, 28.999860000000));
			orders.add(new Order((short) 167, 41.076840000000, 29.015430000000));
			orders.add(new Order((short) 168, 41.061600000000, 29.000460000000));
			orders.add(new Order((short) 169, 41.064380000000, 29.001360000000));
			orders.add(new Order((short) 170, 41.056890000000, 28.987130000000));
			orders.add(new Order((short) 171, 41.074350000000, 29.039250000000));
			orders.add(new Order((short) 172, 41.051820000000, 29.005970000000));
			orders.add(new Order((short) 173, 41.058420000000, 29.007200000000));
			orders.add(new Order((short) 174, 41.052080000000, 29.007210000000));
			orders.add(new Order((short) 175, 41.078910000000, 29.021220000000));
			orders.add(new Order((short) 176, 41.057180000000, 29.030470000000));
			orders.add(new Order((short) 177, 41.066040000000, 29.007370000000));
			orders.add(new Order((short) 178, 41.087650000000, 29.007350000000));
			orders.add(new Order((short) 179, 41.083680000000, 29.014990000000));
			orders.add(new Order((short) 180, 41.089100000000, 29.035370000000));
			orders.add(new Order((short) 181, 41.084760000000, 29.013510000000));
			orders.add(new Order((short) 182, 41.041840000000, 29.002990000000));
			orders.add(new Order((short) 183, 41.061950000000, 29.011850000000));
			orders.add(new Order((short) 184, 41.053340000000, 29.003820000000));
			orders.add(new Order((short) 185, 41.074380000000, 29.018530000000));
			orders.add(new Order((short) 186, 41.080440000000, 29.015540000000));
			orders.add(new Order((short) 187, 41.061130000000, 28.998080000000));
			orders.add(new Order((short) 188, 41.060780000000, 29.010830000000));
			orders.add(new Order((short) 189, 41.075650000000, 29.020470000000));
			orders.add(new Order((short) 190, 41.076840000000, 29.015430000000));
			orders.add(new Order((short) 191, 41.048590000000, 29.021570000000));
			orders.add(new Order((short) 192, 41.066040000000, 29.007370000000));
			orders.add(new Order((short) 193, 41.078476490079, 29.009396156746));
			orders.add(new Order((short) 194, 41.079370000000, 29.011590000000));
			orders.add(new Order((short) 195, 41.084650000000, 29.020610000000));
			orders.add(new Order((short) 196, 41.066040000000, 29.007370000000));
			orders.add(new Order((short) 197, 41.066440000000, 29.004270000000));
			orders.add(new Order((short) 198, 41.072770000000, 29.016660000000));
			orders.add(new Order((short) 199, 41.049030000000, 29.023410000000));
		}

		return orders;
	}

}
