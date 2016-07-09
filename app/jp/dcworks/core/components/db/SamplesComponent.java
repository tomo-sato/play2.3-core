package jp.dcworks.core.components.db;

import java.util.List;

import jp.dcworks.core.components.db.dao.SamplesDao;
import jp.dcworks.core.models.Samples;

/**
 * サンプル（samples）モデルの操作を行うコンポーネントクラス。
 * @author tomo-sato
 */
public class SamplesComponent extends SamplesDao {

	/**
	 * 未削除のサンプル（samples）情報一覧を返す。
	 * @return 未削除のサンプル（samples）情報一覧を返す。
	 */
	protected static List<Samples> getSamplesList() {
		List<Samples> retList =
				Samples.find.where()
					.eq("delete_flg", false)
					.orderBy("id ASC")
					.findList();

		return retList;
	}

	/**
	 * すべてのサンプル（samples）情報一覧をID降順で返す。
	 * @return すべてのサンプル（samples）情報一覧（ID降順）を返す。
	 */
	protected static List<Samples> getAllSamplesList() {
		List<Samples> retList =
				Samples.find.where()
					.orderBy("id DESC")
					.findList();

		return retList;
	}

	/**
	 * IDを指定しサンプル（samples）情報を取得する。
	 * @param id サンプルID
	 * @return サンプル（samples）情報を返す。
	 */
	protected static Samples getSamplesById(Long id) {
		Samples ret = Samples.find.byId(id);
		return ret;
	}
}
