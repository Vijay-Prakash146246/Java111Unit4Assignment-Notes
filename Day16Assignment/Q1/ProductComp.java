package Day16Assignment.Q1;

import java.util.Comparator;

 class ProductComp implements Comparator<Product>{
	 int choice;
	@Override
	public int compare(Product o1, Product o2) 
	{
			if(this.choice==1)
			{
			if(o1.getProductId()>o2.getProductPrice())
				return +1;
			else if(o1.getProductId()<o2.getProductPrice())
				return -1;
			else
			return 0;
			}
			else if(this.choice==2)
			{
				return o1.getProductName().compareTo(o2.getProductName());
			}
			else if(this.choice==3)
			{
				if(o1.getProductId()>o2.getProductId())
					return +1;
				else if(o1.getProductId()<o2.getProductId())
					return -1;
				else
				return 0;
			}
			else
			{
				if(o1.getProductId()>o2.getProductId())
					return +1;
				else if(o1.getProductId()<o2.getProductId())
					return -1;
				else
				return 0;
			}
	}
	}
