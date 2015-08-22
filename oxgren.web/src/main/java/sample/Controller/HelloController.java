package sample.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sample.jpa.domain.Note;
import sample.jpa.domain.Note2;
import sample.jpa.domain.Tag;
import sample.jpa.repository.NoteRepository;
import sample.jpa.repository.NoteRepository2;
import sample.jpa.repository.TagRepository;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by yuchao on 2015/8/18.
 */
@RestController
public class HelloController {


    @RequestMapping("/base64")
    public @ResponseBody String base64() throws UnsupportedEncodingException {
      return ""; // Base64Hander.urlEncodeStr("进入java世界");
    }


   // @Autowired
  //  NoteRepository repository;

   @RequestMapping("/hello")
    public @ResponseBody
   String   hello()
    {
        List<Note> notes = this.noteRepository.findAll();
        return "dfgdfgdfgdfg"+notes.size();
    }

    @Autowired
    NoteRepository2 noteRepository2;

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private TagRepository tagRepository;

    @RequestMapping("/inder")
    @Transactional(readOnly = true)
    public @ResponseBody List<Note>  index() {
        List<Note> notes = this.noteRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("notes", notes);

        List<Tag> tags = this.tagRepository.findAll();
        modelAndView.addObject("tags", tags);


        return notes;
    }


    @RequestMapping("/save")
    public @ResponseBody String save() {
        Note  note=new Note();

        note.setBody("test-context");
        note.setTitle("fffffff");

        //noteRepository.save(note);

       // Iterable<Note> notes= noteRepository2.findByTitleLike("Spring%");
        List<Note2> note2s = noteRepository2.findTagid();


        for (Note2 not : note2s) {

            System.out.println(not.getTitle());

                      }






        //noteRepository2.save(note);
     // String result = this.noteRepository.save(note);
      //  ModelAndView modelAndView = new ModelAndView("index");
      //  modelAndView.addObject("notes", notes);
      //  return modelAndView;




        return "ok";
    }

}
