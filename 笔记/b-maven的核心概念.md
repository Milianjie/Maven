## 1、Maven的核心概念

### 一共有九个：

```sql
1、--POM文件
	POM文件，名称为pom.xml，pom（Project Object Model）翻译过来就是项目对象模型
	maven把项目当作一个模型使用，该文件作用就是控制maven构建项目过程以及管理jar依赖的功能。

2、--约定的目录结构
	表示maven项目的目录和所需各种资源文件存放位置都是规定好的

3、--坐标
	是一个唯一字符串，用来表示资源
	
4、--依赖管理
	管理项目中可以使用的jar包
	
5、--仓库管理（了解）
	资源存放的位置

6、--生命周期（了解）
	maven工具构建项目的过程

7、--插件和目标（了解）
	执行maven构建的时候用的工具是插件

下面两个概念以后学
8、--继承
9、--聚合

```

```
maven的使用学习，先学习maven命令的使用来完成maven的使用，然后学习在idea中使用maven
```

## 2、maven工具的下载与安装

### 1）下载

```
从apache官网下载maven的zip文件安装包apache-maven-3.3.9.zip（用的最多，对应的是JDK1.8），解压到一个maven的文件夹。打开后在bin目录下，如下
```

![](F:\Git_Repositories\Maven\截图\1.png)

```
其中的mvn.cmd就是一个命令，能够执行maven的项目构建功能。
打开conf目录，如下
```

![](F:\Git_Repositories\Maven\截图\2.png)

```
其中的settings.xml是maven工具的配置文件。
然后就是lib目录，里面可以看到很多的jar包，maven是用java语言写的，所以需要配置好JDK才能构使用maven
```

### 2）配置环境变量

```sql
1、在环境变量中创建一个变量名为M2_HOME(很熟悉，跟配置Tomcat一样，称为maven的家)，值路径到解压的maven的bin目录上一级，就是maven的家。
M2_HOME=E:\maven\apache-maven-3.3.9

2、然后在path中新增变量路径，路径为：E:\maven\apache-maven-3.3.9\bin，
也可以用M2_HOME代替，如在path路径前面添加路径：%M2_HOME%\bin

3、--验证
	dos命令窗口执行：mvn -v
成功：
    Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T00:41:47+08:00)
    Maven home: E:\maven\apache-maven-3.3.9
    Java version: 1.8.0_271, vendor: Oracle Corporation
    Java home: E:\JAVASE1.8\jre
    Default locale: zh_CN, platform encoding: GBK
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "dos"
    
--（这样我们在这台计算机中不借助任何工具就可以单独使用maven了）
```

