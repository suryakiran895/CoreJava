class RelOp
{
	public static void main(String args[])
	{
		int var1 = 20,var2 = 45, sum,pro;
		sum = var1 + var2;	//20+45=65
		pro = var1 * var2;	//20*45=900
		System.out.println("65==900 "+(sum==pro));
		System.out.print("65!=900 ");
		System.out.println(sum!=pro);
		System.out.println(sum>=pro);
		System.out.println(sum<=pro);
		System.out.println(sum<pro);
		System.out.println(sum>pro);
		double mod, div;
		mod = var1 % var2;	//20%45=
		div = var1 / var2;
		System.out.println(mod==div);
		System.out.println(mod!=div);
		System.out.println(mod>=div);
		System.out.println(mod<=div);
		System.out.println(mod<div);
		System.out.println(mod>div);

		
	}
}

