# guli  电商项目，采用分布式，微服务进行开发，最新cloud-alibaba

## 2020-7-19 
 使用前端vue项目进行联调测试注册中心api;
 
 将nacos注册中心部署到服务器中，减少自己的内存;
 
 将docker从本地迁移到服务器中，减少本地运行内存;
 
 开放安全组，挂载mysql以及redis接口进行端口映射，实现容器隔离;
 
 解决cros全局跨域问题，采用gateway网关进行路由重写转发对应的服务;
 
 前端初步实现商品管理的三级封层视图;
 
 后端商品管理采用stream流的方式进行筛选一级，以递归的形式进行多级分组。
