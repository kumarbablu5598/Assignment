package com.university.controller;

import com.university.model.Events;
import com.university.model.Students;
import com.university.service.EventService;
import com.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/getallevent")
    public List<Events> getAllstudent(){
        return eventService.getallevents();
    }
    @GetMapping("getevent/{id}")
    public Events getevent(@PathVariable int id){
        return eventService.getEventbyId(id);

    }
    @PostMapping("/addstudent")
    public void addevent(@RequestBody Events event){
         eventService.addevent(event);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteevent(@PathVariable int id){
        eventService.deletebyid(id);

    }
    @PutMapping("/update")
    public void updateevent(@PathVariable int id,@RequestBody Events event){
        eventService.updateEvent(event,id);
    }


}
