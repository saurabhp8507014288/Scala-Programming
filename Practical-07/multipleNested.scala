object multipleNested
{
	def main(args: Array[String])
	{
		val (l,s)=findMaxMin(188,-234)
		println("=== using multiple nested method ===")
		println("Maximum number : "+l)
		println("Minimum number : "+s)
	}
	def findMaxMin(arg1:Int,arg2:Int):(Int,Int)= // method will return tuple
	{
		
		def max(arg1:Int,arg2:Int):(Int,Int)= // method will return tuple 
		{
			def min(arg:Int):Int= // method will return single value (smaller number)
			{
				return arg
			}
			if(arg1>arg2)
			{
				var s=min(arg2);
				return (arg1,s)
			}
			else
			{
				var s=min(arg1);
				return (arg2,s)
			}
		}
		val (la,sm)=max(arg1,arg2)
		return (la,sm)
	}
}