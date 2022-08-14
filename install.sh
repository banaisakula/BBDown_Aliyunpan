#!/usr/bin/bash
download_aliyunpan(){
    #tickstep/aliyunpan
    cd ~; mkdir aliyunpan;cd aliyunpan
    aliyunpan_version=`curl 'https://api.github.com/repos/tickstep/aliyunpan/releases/latest' | jq '.tag_name'  | sed 's#"##g' ` 
    wget https://github.com/tickstep/aliyunpan/releases/download/$aliyunpan_version/aliyunpan-$aliyunpan_version-linux-amd64.zip
    unzip *.zip -d ./
    cd aliyunpan-$aliyunpan_version-linux-amd64
    sudo mv aliyunpan /usr/local/bin ;chmod  777 /usr/local/bin/aliyunpan
    rm -rf ~/aliyunpan
    #   aliyunpan login
}
download_BBdown(){
    # nilaoda/BBDown
    cd ~; mkdir BBDown;cd BBDown
    BBDownversion=`curl 'https://api.github.com/repos/nilaoda/BBDown/releases/latest' | jq '.tag_name'  | sed 's#"##g' ` #1.5.3
    time1=`curl 'https://api.github.com/repos/nilaoda/BBDown/releases/latest' | jq '.' | jq '.published_at' | sed 's#"##g'|sed 's#-##g' ` ; time2=${time1%T*}   ;echo $time2 ;echo "https://github.com/nilaoda/BBDown/releases/download/$BBDownversion/BBDown_${BBDownversion}_${time2}_linux-x64.zip" #20220514 
    wget https://github.com/nilaoda/BBDown/releases/download/$BBDownversion/BBDown_${BBDownversion}_${time2}_linux-x64.zip
    unzip *.zip -d ./
    sudo mv BBDown /usr/local/bin ;chmod  777 /usr/local/bin/BBDown
    rm -rf ~/BBDown
    #  BBDown login
}
##主程序开始
rm -rf ~/BBDown ~/aliyunpan
alidrive="/root/阿里云盘"
echo "正在检测aliyunpan命令和BBDown"
##检测关键命令存在
if ! [ -x "$(command -v aliyunpan)" ]; then
  echo 'Error: aliyunpan is not installed.' >&2
  echo "正在自动下载最新版本aliyunpan"
  download_aliyunpan
fi
if ! [ -x "$(command -v BBDown)" ]; then
  echo 'Error: BBDown is not installed.' >&2
 echo "正在自动下载最新版本BBDown" 
download_BBdown
fi
if [ ! -d "$alidrive" ]; then   
    echo "发现不存在阿里云盘目录，已创建缓存目录，目录为："
    echo "$alidrive"
    mkdir -p $alidrive
    echo "请重新运行此命令"
fi
cd /root
git clone https://github.com/banaisakula/BBDown_Aliyunpan.git
cd BBDown_Aliyunpan
chmod 777 ./bb ./bbb
sudo cp bbb bb /usr/local/bin
echo "已经复制文件，请先运行aliyunpan命令登陆阿里云盘"
echo "然后运行BBDown login登陆哔哩哔哩"
echo "此程序主要命令是   bb    和     bbb"
echo "bb命令是主要下载程序命令"
echo "bbb是采用创建文本逐行下载"
echo "此致"
