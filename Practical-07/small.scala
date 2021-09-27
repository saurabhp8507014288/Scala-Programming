import util.control._
object smallest extends App
{
	find()
	def find()
	{
		val breakObj=new Breaks
		var arr=Array(2,9,1,7,5)
		breakObj.breakable
		{
			for(a<-arr)
			{
				var min=a
				for(i<-1 to 4)
				{
					if(arr(i)>=min)
					{
						min=min
					}
					else
					{
						min=arr(i)
					}
				}
				println("smallest number in array is: "+min)
				breakObj.break
			}
		}
	}
}