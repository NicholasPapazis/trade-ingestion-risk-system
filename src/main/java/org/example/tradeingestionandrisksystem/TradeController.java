package org.example.tradeingestionandrisksystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trades")
public class TradeController {
    private final TradeService service;

    public TradeController(TradeService service) {
        this.service = service;
    }

    // POST /trades
    @PostMapping
    public Trade createTrade(@RequestBody Trade trade) {
        return service.saveTrade(trade);
    }

    // GET /trades/{id}
    @GetMapping("/{id}")
    public Trade getTrade(@PathVariable Long id) {
        return service.getTradeById(id);
    }

    // GET /trades
    @GetMapping
    public List<Trade> getAllTrades() {
        return service.getAllTrades();
    }

}
