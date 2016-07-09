package jp.dcworks.core.components.db.dao;

import com.avaje.ebean.Ebean;

import jp.dcworks.core.components.db.AdminUsersComponent;
import jp.dcworks.core.models.AdminUsers;

/**
 * 管理ユーザ（admin_users）モデルのネイティブクエリによる操作クラス。
 * <p>アプリケーションとは祖結合としたい為、直接の参照は行わない。
 * <br>利用する場合、{@link AdminUsersComponent}を経由しアクセスする。
 * @author tomo-sato
 * @see jp.dcworks.core.components.db.AdminUsersComponent
 */
public class AdminUsersDao {

	/**
	 * メールアドレス、パスワードより管理ユーザ（admin_users）情報を取得する。
	 * @param email メールアドレス
	 * @param password パスワード
	 * @return メールアドレス、パスワードより取得した管理ユーザ（admin_users）情報を返す。
	 */
	protected static AdminUsers getAdminUsersByEmailPassword(String email, String password) {
		String oql = new StringBuffer(" find admin_users")
				.append(" WHERE ")
				.append("     delete_flg = " + false)
				.append("     AND email = :email")
				.append("     AND password = PASSWORD(:password)")
				.toString();

		AdminUsers ret = Ebean.createQuery(AdminUsers.class, oql)
				.setParameter("email", email)
				.setParameter("password", password)
				.findUnique();

		return ret;
	}
}
