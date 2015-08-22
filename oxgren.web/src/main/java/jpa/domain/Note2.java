package jpa.domain;


import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by YuChao on 2015/8/20.
 */
@Entity
public class Note2 {


    public Note2(Long id,String title,String body,Long tid){

        this.id=id;
        this.title = title;
        this.body = body;
        this.tid= tid;
    }

    @Id
    private Long id;

    private String title;

    private String body;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    private Long  tid;



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}