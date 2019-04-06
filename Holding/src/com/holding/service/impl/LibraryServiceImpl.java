package com.holding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holding.mapper.LibraryMapper;
import com.holding.po.Library;
import com.holding.po.LibraryExample;
import com.holding.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	private LibraryMapper libraryMapper;

	@Override
	public List<Library> getLibraryList(int provinceId, int cityId) {
		LibraryExample libraryExample = new LibraryExample();
		LibraryExample.Criteria criteria = libraryExample.createCriteria();
		criteria.andProvinceidEqualTo(provinceId);
		criteria.andCityidEqualTo(cityId);
		return libraryMapper.selectByExample(libraryExample);
	}
	
	
	
}
