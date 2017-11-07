#! /bin/bash
echo ""$1" "$2" hello world，THIS IS TEST A SHELL"

if [ ! -n "$1" ] ;then
echo 请输入项目名
exit
fi
for arg in "$*"
do
	echo $arg
done

if [ "$1" = "$2" ];
then
	echo "this arg is:"$1""
else
	echo "not eq"
fi

sleep 1s
echo "延时加载"

projectPath="/home/lgq/github/cloud"
  
 cd $projectPath
 echo 当前目录`pwd`

#git pull

if [ $? -eq 0 ];then	 
  	echo $?
 
     echo "项目已更新。。"
   
else
	echo "更新项目错误。。"
fi
echo "项目开始打包。。"

mvn install -DskipTests

targetPath=$projectPath/$1/target
jarPath=$jarPath/$1

echo 进入jar包目录：$targetPath
cd $targetPath
echo 复制jar包到：$jarPath

mkdir -p $jarPath

find $targetPath -name  "*.jar*" -type f | xargs -i cp {} $jarPath
echo "开始部署"

cd $jarPath 
path=$(find $jarPath -name "*.jar" | head -n 1)
java -jar $path &
echo "部署完成"

