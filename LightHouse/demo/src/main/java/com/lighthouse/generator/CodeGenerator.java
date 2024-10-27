package com.lighthouse.generator;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {

//        // 数据库连接信息
//        String url = "jdbc:mysql://localhost:3306/light_house?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//        String username = "root";
//        String password = "root";
//
//        // 测试数据库连接
//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            if (connection != null) {
//                System.out.println("成功连接到数据库！");
//            } else {
//                System.out.println("连接失败！");
//            }
//        } catch (SQLException e) {
//            System.out.println("数据库连接错误: " + e.getMessage());
//        }

        FastAutoGenerator.create(new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/light_house?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "root")).globalConfig(builder -> {
                    builder.author("ysc") // 设置作者
                            .outputDir(System.getProperty("user.dir") + "/LightHouse/demo/src/main/java/"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.lighthouse") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/LightHouse/demo/src/main/resources/mapper")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.addInclude("posts").addInclude("tags").addInclude("users")// 设置需要生成的表名
                            .entityBuilder().naming(NamingStrategy.underline_to_camel).enableLombok() // 生成的实体类使用Lombok
                            .controllerBuilder().enableRestStyle() // 生成 @RestController 控制器
                            .mapperBuilder().enableBaseResultMap(); // 启用 BaseResultMap
                }).templateEngine(new VelocityTemplateEngine()) // 使用Velocity模板引擎
                .execute();
    }
}
