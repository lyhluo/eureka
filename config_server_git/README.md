# 使用Git管理配置内容的分布式配置中心
我们就可以通过浏览器、POSTMAN或CURL等工具直接来访问到我们的配置内容了。访问配置信息的URL与配置文件的映射关系如下：

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
上面的url会映射{application}-{profile}.properties对应的配置文件，
其中{label}对应Git上不同的分支，默认为master。我们可以尝试构造不同的url来访问不同的配置内容，
比如，要访问master分支，config-client应用的dev环境，
就可以访问这个url：http://localhost:10091/config-client/dev/master
我们可以看到该Json中返回了应用名：config-client，环境名：dev，分支名：master，以及default环境和dev环境的配置内容。