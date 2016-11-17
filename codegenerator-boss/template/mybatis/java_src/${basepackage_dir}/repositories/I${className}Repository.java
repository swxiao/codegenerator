<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.repositories;

import ${basepackage}.entities.${className};
import org.springframework.stereotype.Repository;
import com.houpix.foundation.mybatis.MybatisRepository;
import com.houpix.foundation.mybatis.page.Page;

<#include "/java_imports.include">
@Repository
public interface I${className}Repository extends MybatisRepository<${className}, ${table.idColumn.javaType}> {

	/**
	 * @param page
	 */
	List<${className}> queryPage(Page<${className}> page);

	/**
	 * @param entity
	 * @return
	 */
	List<${className}> query(${className} entity);
}
