package jp.dcworks.core.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * サンプル（samples）モデル。
 * @author tomo-sato
 */
@SuppressWarnings("serial")
@Entity
public class Samples extends AppModel {

	/** 名前 */
	@Column(name = "name")
	public String name;

	/** 年齢 */
	@Column(name = "age")
	public Integer age;

	/** 誕生日 */
	@Column(name = "birthday")
	public Date birthday;
}
