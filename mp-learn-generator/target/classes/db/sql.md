导入脚本指令(linux windows 平台)：mysql -u 用户名 -p 数据库名称 < 导出的sql文件.sql
mysql -u root -p --show-warnings mydatabase < backup.sql
mysql -u root -p --show-warnings yan < C:\Users\Chai\Desktop\mp-learn\mp-learn\res\schema-h2.sql
mysql -u root -p --show-warnings yan < C:\Users\Chai\Desktop\mp-learn\mp-learn\res\data-h2.sql
代码生成器目前支持两种生成方式：

DefaultQuery (元数据查询)

优点： 根据通用接口读取数据库元数据相关信息，对数据库通用性较好。
缺点： 依赖数据库厂商驱动实现。
备注： 默认方式，部分类型处理可能不理想。
SQLQuery (SQL查询)

优点： 需要根据数据库编写对应表、主键、字段获取等查询语句。
缺点： 通用性不强，同数据库厂商不同版本可能会存在兼容问题（例如，H2数据库只支持1.X版本）。
备注： 后期不再维护。