package jp.dcworks.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 管理ユーザ（admin_users）モデル。
 * @author tomo-sato
 */
@SuppressWarnings("serial")
@Entity
public class AdminUsers extends AppModel {

	/** 名前 */
	@Column(name = "name")
	public String name;

	/** メールアドレス（UK...767 bytesの制約のためascii_bin） */
	@Column(name = "email")
	public String email;

	/** パスワード（暗号化済み） */
	@Column(name = "password")
	public String password;

	/** Finder */
	public static Finder<Long, AdminUsers> find = new Finder<Long, AdminUsers>(
		Long.class, AdminUsers.class
	);
}
