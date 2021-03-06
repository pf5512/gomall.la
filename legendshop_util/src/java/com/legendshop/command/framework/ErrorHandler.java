/*
 * 
 * LegendShop 多用户商城系统
 * 
 *  版权所有,并保留所有权利。
 * 
 */
package com.legendshop.command.framework;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 
 * LegendShop 版权所有 2009-2011,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得LegendShop商业授权之前，您不能将本软件应用于商业用途，否则LegendShop将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.legendesign.net
 * ----------------------------------------------------------------------------
 */
public interface ErrorHandler extends BeanNameAware {

	/**
	 * Handle error.
	 * 
	 * @param resp
	 *            the resp
	 * @param th
	 *            the th
	 * @throws Exception
	 *             the exception
	 */
	public void handleError(Response resp, Throwable th) throws Exception;

}
