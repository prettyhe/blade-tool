/**
 * Copyright (c) 2018-2099, Chill Zhuang 庄骞 (bladejava@qq.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.core.boot.file;

import java.io.File;

/**
 * 文件管理类
 *
 * @author Chill
 */
public class FileProxyManager {
	private IFileProxy defaultFileProxyFactory = new BladeFileProxyFactory();

	private static FileProxyManager me = new FileProxyManager();

	public static FileProxyManager me() {
		return me;
	}

	public IFileProxy getDefaultFileProxyFactory() {
		return defaultFileProxyFactory;
	}

	public void setDefaultFileProxyFactory(IFileProxy defaultFileProxyFactory) {
		this.defaultFileProxyFactory = defaultFileProxyFactory;
	}

	public String[] path(File file, String dir) {
		return defaultFileProxyFactory.path(file, dir);
	}

	public File rename(File file, String path) {
		return defaultFileProxyFactory.rename(file, path);
	}

}
