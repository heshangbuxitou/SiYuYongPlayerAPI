# 技术选型

项目中曾使用 Gson 和 hutool 中的 Json 工具，这样令人比较迷惑，随统一使用 FastJson 作为通用的 Json解析库，有以下几点原因：
1. FastJson 国内开源使用人多，国内很多项目都用了 FastJson。
2. 背靠阿里，有国内文档优势，现在还在不断更新。
3. JSONField 多种使用方式，
    * 例如标注字段的 name。
    * @JSONField(format="yyyy-MM-dd HH:mm") 标注输出方式
    * @JSONField(serialize=false) 是否需要序列化属性
    
 # 重写 Spring Cache
Example：
* 在配置文件中编写对应的缓存时间和自动刷新时间
```
select.cache.timeout=300
select.cache.refresh=150
``` 
* 在@Cacheable注解中直接引入
```$xslt
 @Cacheable(value = "playlist#${select.cache.timeout}#${select.cache.refresh}")
```

# Json的Map返回值改为JaveBean

* Java 中可以用 `Map` 返回 `Json` 对象，虽然很方便把 `Map` 对象转为 `JSON`,但是会对严谨的项目产生
坏的影响。
* 用 Map<String,Obj> 作为返回值，开发人员不能一眼看到会返回什么对象，也就无法确认这儿会返回什么，这是非常糟糕的，
更糟糕的是 Map 一层层传递下来，对象在函数中发生着怎么样的改变不容易发现，这将会是很糟糕的代码。
* 在 Java 中，一个函数的返回值应该是很轻易就能看到`返回`什么东西，和这个东西的属性是什么，这样方便开发和维护（可参考Clean Code）。 


