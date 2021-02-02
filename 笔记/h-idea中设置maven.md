## 在idea中设置maven

### 为了让idea和maven联合起来使用，需要在idea中设置

```sql
--idea自身是内置了maven，但是一般不使用内置，理由是使用内置maven修改maven设置时不方便，所以使用自己安装的maven，来覆盖idea中的默认设置。下面设置以让idea指定自己安装的maven位置信息。
可以在两个位置修改：
1、File->Settings：这个位置修改的是针对当前maven工程的设置
2、File->New Projects Settings->Setting For New Projects：在这个位置是针对以后新建的maven工程的设置
--两个位置的设置是一样的，只是前面进入的路口不一样
```

### 看第二个设置：

### File->New Projects Settings->Setting For New Projects

![](F:\Git_Repositories\Maven\截图\idea中设置maven\1.png)

### -> Build, Execution, Deployment ->Build Tools->Maven(点开Maven)

![](F:\Git_Repositories\Maven\截图\idea中设置maven\2.png)

### Maven->Runner

```sql
设置其中的
VM Options（设置虚拟机参数的）：-DarchetypeCatalog=internal
--archetype翻译为骨架，maven项目创建时默认联网下载项目模板，非常慢，上面的设置表示使用内部的模板，不需要下载
JRE：选择JDK1.8安装路径
```

![](F:\Git_Repositories\Maven\截图\idea中设置maven\3.png)

### 在当前工程中设置Settings也是和上面一样的，就不做笔记了。