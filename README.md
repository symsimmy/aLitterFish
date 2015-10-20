# aLitterFish 项目文档
####软件项目管理，实战项目，蔡嘉跃小组。

##### 项目初步打算用J2EE实现。项目结构如下：

```python
├─.metadata         #这个是项目的eclipse配置文件，大家尽量别动里面的内容，这样我们在不同的电脑运行时能保证配置的一致性。
│                   #配置文件太大了，就不上传了。
└─aLitterShark      #熟悉的J2EE目录结构。
    ├─.settings
    ├─lib
    │  ├─Json
    │  ├─junit4.0
    │  └─mysql-jdbc
    ├─src
    └─WebRoot
        ├─META-INF
        └─WEB-INF
            ├─classes
            └─lib
```

一点建议：大家每个人建立一个自己的分支，修改时在自己的分支上修改，<b>master分支不要轻易修改！</b>
