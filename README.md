# java
```
String str="123";
String str1="123";
String str2=new String("123");
System.out.println(str==str1);
System.out.println(str==str2);;
```
>结果为：true false
str和str1都是字符串，而str2是String类，所以str和str1相等，str和str2不相等
