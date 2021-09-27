import util.control._
object use extends App
{
	check()
	def check()
	{
		val breakObj1,breakObj2=new Breaks
		breakObj1.breakable // will break while loop
		{
			while(true)
			{
				print("enter the number: ")
				var num=scala.io.StdIn.readInt()
				if(num==3)
				{
					println("Yes, entered number "+num+" is equal to 3...so break")
					breakObj1.break // loop break
				}
				breakObj2.breakable // continue while loop
				{
					if(num!=3)
					{
						println("No, entered number "+num+" is not equal to 3...so continue")
						breakObj2.break // loop continue
					}
				}
			}
		}
	}	
}