package com.teamname.bookservice.wish.service;

import com.teamname.bookservice.wish.model.WishDto;
import com.teamname.bookservice.wish.model.WishPostDto;
import com.teamname.bookservice.wish.model.dao.WishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WishService {

    @Autowired
    WishDao wishDao;

    WishDto findById(Long id) {
        return WishDto.build(wishDao.findById(id));
    }

    List<WishDto> findByUserId(Long id) {
        return wishDao.findByUserId(id).stream().map(WishDto::build).collect(Collectors.toList());
    }

    WishDto save(WishPostDto wishPostDto) {
        return null;
    }
}
