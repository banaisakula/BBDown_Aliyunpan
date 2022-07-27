clear
alidrive="/root/阿里云盘"
##检测关键命令存在
if ! [ -x "$(command -v aliyunpan)" ]; then
  echo 'Error: aliyunpan is not installed.' >&2
  echo "请先去官方GitHub仓库下载对应系统版本的aliyunpan文件，仓库的地址为：https://github.com/tickstep/aliyunpan"
  exit 1
elif ! [ -x "$(command -v BBDown)" ]; then
  echo 'Error: BBDown is not installed.' >&2
  echo "请先去官方GitHub仓库下载对应系统版本的BBDown文件，仓库的地址为：https://github.com/nilaoda/BBDown"
  exit 1
else
if [ ! -d "$alidrive" ]; then   
    echo "发现不存在阿里云盘目录，已创建缓存目录，目录为："
    echo "$alidrive"
    mkdir -p $alidrive
    echo "请重新运行此命令"
    exit 1
fi
clear
cd $alidrive
rm -rf $alidrive/*
echo "使用之前请先登陆BBDown和阿里云盘
默认下载1080P高帧率视频
直接输入视频连接，将下载到服务器然后转存阿里云盘
如果需要修改存储内容，请编辑源码
默认服务器缓存目录/root/阿里云盘。阿里云盘目录为/share/哔哩哔哩"
echo "###########################"
echo "输入链接开始下载
输入bburl则读取/root/bburl内容
输入bbb则跳转批量添加命令"
read url
    if   [ $url == "bburl" ]
    then
    echo "bburl内链接有："
cat -n /root/bburl
    for line in $(cat /root/bburl)
    do
    BBDown --dfn-priority "1080P 高码率" $line
    done
    cat /dev/null > /root/bburl
elif   [ $url == "bbb" ]
then
/usr/local/bin/bbb
else
BBDown --dfn-priority "1080P 高码率" $url
fi
echo "选择目录,如果没有就输入名字创建新目录"
sleep 1
aliyunpan l /share/哔哩哔哩 2>&1 | awk '{print $1,$5}' | awk 'NR>2{print line}{line=$0} END{print line}' | awk 'NR>1{print line}{line=$0}' | awk 'NR>1{print line}{line=$0}'
read a

if   [ $a == "0" ]
   then
   
   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==2 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "1" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==3 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "2" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==4 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "3" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==5 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "4" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==6 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "5" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==7 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "6" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==8 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "7" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==9 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "8" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==10 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "9" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==11 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "10" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==12 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "11" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==13 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "12" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==14 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "13" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==15 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
elif [ $a == "14" ]
   then

   path=`aliyunpan l /share/哔哩哔哩 2>&1  | awk '{print $5}' | awk 'NR==16 {print $0}'`;echo "你选择的目录是";echo $path
   aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$path
   rm -rf   $alidrive/*
else
    echo "你选择创建的目录为： $a"

    aliyunpan upload -ow $alidrive/* /share/哔哩哔哩/$a
    rm -rf   $alidrive/*
fi
fi
