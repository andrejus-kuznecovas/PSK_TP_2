package lt.vu.mif.MyBatis.Mappers;

import java.util.List;
import lt.vu.mif.MyBatis.ViewModels.Shops;

public interface ShopsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOPS
     *
     * @mbg.generated Fri May 03 15:36:34 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOPS
     *
     * @mbg.generated Fri May 03 15:36:34 EEST 2019
     */
    int insert(Shops record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOPS
     *
     * @mbg.generated Fri May 03 15:36:34 EEST 2019
     */
    Shops selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOPS
     *
     * @mbg.generated Fri May 03 15:36:34 EEST 2019
     */
    List<Shops> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOPS
     *
     * @mbg.generated Fri May 03 15:36:34 EEST 2019
     */
    int updateByPrimaryKey(Shops record);
}