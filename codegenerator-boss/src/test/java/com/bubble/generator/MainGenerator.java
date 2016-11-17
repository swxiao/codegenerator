/**
 * Copyright [2015-2017]
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.bubble.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * @author shiwen.xiao<shiwen.xiao@houpix.com>
 * @since 2016年11月1日
 */
public class MainGenerator {

	public static void main(String[] args) {

		try {
			GeneratorFacade generator = new GeneratorFacade();
			generator.deleteOutRootDir(); // 删除生成器的输出目录
			// generator.generateByTable("table_name", "template"); // 通过数据库表生成文件,template为模板的根目录
			generator.generateByAllTable("template"); // 自动搜索数据库中的所有表并生成文件,template为模板的根目录
			// generator.generateByClass(Blog.class, "template_clazz");
			// generator.deleteByTable("table_name", "template");// 删除生成的文件
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
