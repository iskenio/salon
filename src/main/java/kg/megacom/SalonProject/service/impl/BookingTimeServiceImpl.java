package kg.megacom.SalonProject.service.impl;

import kg.megacom.SalonProject.mapper.BookingTimeMapper;
import kg.megacom.SalonProject.models.dto.BookingTimeDto;
import kg.megacom.SalonProject.repositories.BookingTimeRepository;
import kg.megacom.SalonProject.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingTimeServiceImpl implements BookingTimeService {
    @Autowired
    BookingTimeRepository rep;
    BookingTimeMapper mapper = BookingTimeMapper.INSTANCE;
    @Override
    public BookingTimeDto save(BookingTimeDto bookingTimeDto) {
        return mapper.toDto(rep.save(mapper.toEntity(bookingTimeDto)));
    }

    @Override
    public BookingTimeDto findById(Long id) {
        return BookingTimeMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Не найдена запись с таким временем")));
    }

    @Override
    public List<BookingTimeDto> findAll() {

        return BookingTimeMapper.INSTANCE.toDtos(rep.findAll());
    }
}
