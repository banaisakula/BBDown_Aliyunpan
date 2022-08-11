echo "正在检测aliyunpan命令和BBDown"
##检测关键命令存在
if ! [ -x "$(command -v aliyunpan)" ]; then
  echo 'Error: aliyunpan is not installed.' >&2
  echo "请先去官方GitHub仓库下载对应系统版本的aliyunpan文件，，并移动到/usr/local/bin目录
  仓库的地址为：https://github.com/tickstep/aliyunpan"
  exit 1
elif ! [ -x "$(command -v BBDown)" ]; then
  echo 'Error: BBDown is not installed.' >&2
  echo "请先去官方GitHub仓库下载对应系统版本的BBDown文件，并移动到/usr/local/bin目录
  仓库的地址为：https://github.com/nilaoda/BBDown"
  exit 1
else
if [ ! -d "$alidrive" ]; then   
    echo "发现不存在阿里云盘目录，已创建缓存目录，目录为："
    echo "$alidrive"
    mkdir -p $alidrive
    echo "请重新运行此命令"
    exit 1
fi
cd /root
git clone https://github.com/banaisakula/BBDown_Aliyunpan.git
cd BBDown_Aliyunpan
chmod 777 bb bbb
cp ./bbb ./bb /usr/local/bin
echo "已经复制文件"
