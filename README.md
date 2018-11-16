# 技术选型

项目中曾使用 Gson 和 hutool 中的 Json 工具，这样令人比较迷惑，随统一使用 FastJson 作为通用的 Json解析库，有以下几点原因：
1. FastJson 国内开源使用人多，国内很多项目都用了 FastJson。
2. 背靠阿里，有国内文档优势，现在还在不断更新。
3. JSONField 多种使用方式，
    * 例如标注字段的 name。
    * @JSONField(format="yyyy-MM-dd HH:mm") 标注输出方式
    * @JSONField(serialize=false) 是否需要序列化属性
