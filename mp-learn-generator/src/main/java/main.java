import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/yan", "root", "13862296703")
                // 全局配置
                .globalConfig(builder -> builder
                        .author("muci")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/mp-learn-generator/target")
                        .commentDate("yyyy-MM-dd")
                )
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .entity("model") // 设置实体类包名
                            .mapper("dao") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .entityBuilder()
                        .enableLombok()
                        .enableTableFieldAnnotation() // 启用字段注解
                        .addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        )
                        .controllerBuilder()
                        .enableRestStyle() // 启用 REST 风格
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
