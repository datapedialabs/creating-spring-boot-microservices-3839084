package com.example.explorecalijpa.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.explorecalijpa.model.TourPackage;
import com.example.explorecalijpa.repo.TourPackageRepository;

@Service
public class TourPackageService {
  private TourPackageRepository tourPackageRepository;

  public TourPackageService(TourPackageRepository tourPackageRepository) {
    this.tourPackageRepository = tourPackageRepository;
  }

  public TourPackage createTourPackage(String code, String name) {
    return new TourPackage(code, name);
  }

  public List<TourPackage> lookupAll() {
    return null;
  }

  public long total() {
    return 0;
  }
}