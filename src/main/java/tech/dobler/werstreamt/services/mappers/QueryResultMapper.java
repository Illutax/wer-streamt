package tech.dobler.werstreamt.services.mappers;

import lombok.NonNull;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.dobler.werstreamt.entities.QueryResult;
import tech.dobler.werstreamt.persistence.QueryResultDB;

@Mapper(componentModel = "spring")
public interface QueryResultMapper {
    @NonNull
    QueryResultMapper INSTANCE = Mappers.getMapper(QueryResultMapper.class);

    QueryResultDB entityToDto(QueryResult queryResult);
    QueryResult dtoToEntity(QueryResultDB db);
}
