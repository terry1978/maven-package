mvn -v

mvn package

mvn install

Maven Properties Guide
针对用到的每个module，执行mvn install操作，默认将module安装到%HOMEPATH%\.m2\repository下。
一个朋友那的maven项目打包报错，今天没事，就建个项目，跑下看看是否能重现。结果一路顺利。
新建maven项目，新建module: common、framework，不需要选择parent module。

Git基础
git global setup
git config --global user.name ""
git config --global user.email ""
git config --list
git init
git add --all
git commit -m 'Initial Version'
git log
git status

创建裸仓库
git init --bare
git push ./ master
git pull /workspace/IdeaProjects/MyProject master

删除某个分支
git remote remove origin
git remote -v

type nul > a.txt
echo '阿百川' >a.txt

使用@Resource可能出现beanName和类型不匹配导致注入失败的问题，而使用@Autowired根据类型注入则不会出出现@Resource的问题。

跳过单元测试的运行，也跳过测试代码的编译。
mvn package -Dmaven.test.skip=true  

跳过单元测试，但是会继续编译
mvn package -DskipTests