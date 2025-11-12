package kim.onbidproperty.mapper;

import kim.onbidproperty.domain.PropertyBidHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PropertyBidHistoryMapper {
//    CRUD
//    1.Read:조회
//    특정물건의 전체 회차 조회
    List<PropertyBidHistory> selectHistoriesByPropertyId( Long propertyId);
//     특정 물건의 특정회차 조회
    PropertyBidHistory selectHistoryByPropertyIdAndPbctNo(
            @Param("propertyId") Long propertyId,
            @Param("pbctNo") String pbctNo
    );
//    ID로 조회

    PropertyBidHistory selectHistoryById(Long id);


}
