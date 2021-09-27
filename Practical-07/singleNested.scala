object singleNested
{
	def main(args: Array[String])
	{
		val (l,s)=findMaxMin(188,-234)
		println("=== using single nested method ===")
		println("Maximum number : "+l)
		println("Minimum number : "+s)
	}
	def findMaxMin(arg1:Int,arg2:Int):(Int,Int)= // method will return tuple
	{
		def max():Int= // method will return single value (larger number)
		{
			if(arg1>arg2)
			{
				return arg1
			}
			else
			{
				return arg2
			}
		}
		def min():Int= // method will return single value (smaller number)
		{
			if(arg1>arg2)
			{
				return arg2
			}
			else
			{
				return arg1
			}
		}
		var a=max()
		var b=min()
		return (a,b) // returning tuple
	}
}