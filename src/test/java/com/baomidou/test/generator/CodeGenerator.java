package com.baomidou.test.generator;

import java.util.HashMap;
import java.util.Map;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 根据模板自动生成controller、entity、server、xml
 * @Auther 
 * @Create 
 */

public class CodeGenerator {
	
	 /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        //new File 为了获取项目路径
//        File file = new File("mode");
//        String path = file.getAbsolutePath();
//        path = path.substring(0, path.lastIndexOf(File.separator)); 
        String path=System.getProperty("user.dir");
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(path+"/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        //gc.setKotlin(true);//是否生成 kotlin 代码
        gc.setAuthor("hao.tone");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);
        
        
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });
        
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        //strategy.setInclude(new String[] { "tcm_business_info" }); // 需要生成的表
        strategy.setInclude(new String[] { "tom_order","tsm_staff" }); // 需要生成的表
        
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
         strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        //strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.dcy");
//        pc.setController("controller");
//        pc.setEntity("model");
        
       pc.setParent("com.baomidou");
       pc.setController("controller");
       pc.setEntity("entity");
       pc.setMapper("mapper");
       pc.setService("service");
       pc.setServiceImpl("service.impl");
        
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】  ${cfg.abc}
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };

    /*    // 自定义 xxListIndex.html 生成
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig("/templatesMybatis/list.html.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return "E://test//html//" + tableInfo.getEntityName() + "ListIndex.html";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 自定义  xxAdd.html 生成
        focList.add(new FileOutConfig("/templatesMybatis/add.html.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return "E://test//html//" + tableInfo.getEntityName() + "Add.html";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        //  自定义 xxUpdate.html生成
        focList.add(new FileOutConfig("/templatesMybatis/update.html.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return "E://test//html//" + tableInfo.getEntityName() + "Update.html";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg); */

        // 关闭默认 xml 生成，调整生成 至 根目录
        /*TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        mpg.setTemplate(tc);*/

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
         TemplateConfig tc = new TemplateConfig();
         tc.setController("/template/controller.java.vm");
         tc.setService("/template/service.java.vm");
         tc.setServiceImpl("/template/serviceImpl.java.vm");
         tc.setEntity("/template/entity.java.vm");
         tc.setMapper("/template/mapper.java.vm");
         tc.setXml("/template/mapper.xml.vm");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
         mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置【可无】
        //System.err.println(mpg.getCfg().getMap().get("abc"));
    }

	
}
