package com.holding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holding.po.Library;

@Service
public interface LibraryService {

	public List<Library> getLibraryList(int provinceId,int cityId);
}
