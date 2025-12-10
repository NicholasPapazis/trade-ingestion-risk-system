package org.example.tradeingestionandrisksystem;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeService {

    private final TradeRepository repository;
    public TradeService(TradeRepository repository) {
        this.repository = repository;
    }
    public Trade saveTrade(Trade trade) {
        return repository.save(trade);
    }
    public Trade getTradeById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public List<Trade> getAllTrades() {
        return repository.findAll();
    }

}
