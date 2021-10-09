class StringHandling
{
	def compareString(arg1:String,arg2:String)
	{
		var compare=arg1.compareTo(arg2)
		if(compare==0)
		{
			println("Both strings are equal")
		}
		else if(compare>0)
		{
			println("First string is greater than second string")
		}
		else
		{
			println("First string is less than second string")	
		}
	}
	def converToUpper(arg1:String)
	{
		var str=arg1.toUpperCase()
		println("Converted upper case string is: "+str)
	}
	def charIndex(arg1:String,arg2:Char)
	{
		var index=arg1.indexOf(arg2)
		if(index>=0)
		{
			println("Inedx of given character in given string is: "+index)
		}
		else
		{
			println("Given character doesnot exist in given string")
		}
	}
	def subStringIndex(arg1:String,arg2:String)
	{
		var index=arg1.indexOf(arg2)
		if(index>=0)
		{
			println("Inedx of given substring in given string is: "+index)
		}
		else
		{
			println("Given substring doesnot exist in given string")
		}
	}
	def charArray(arg1:Array[Char])
	{
		var store:String=" "
		store=String.copyValueOf(arg1)
		println("Character value stored in string is: "+store)
	}
}
object string
{
	def main(args:Array[String])
	{
		var str1:String="ABC"
		var str2:String="ABC"

		var str3:String="scala programming"

		var ch:Char='m'

		var subStr:String="ram"

		var arr=Array('s','c','a','l','a')


		val obj=new StringHandling()

		obj.compareString(str1,str2)        // Task1
		obj.converToUpper(str3)            // Task2
		obj.charIndex(str3,ch)            // Task3    
		obj.subStringIndex(str3,subStr)  // Task4
		obj.charArray(arr)              // Task1
	}
}