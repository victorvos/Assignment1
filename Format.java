import java.lang.reflect.Method;

/**
 * Created by Eigenaar on 21-11-2016.
 */
public class Format {
    private String name, saveMark;
    public int index;


    public Format(String name, String saveMark, int index){
        this.name = name;
        this.saveMark = saveMark;
        this.index = index;
    }

    public Format() {
    }


    public String getFormat(){
        return name;
    }

    public Integer getIndex(){
        return index;
    }

    public String toString(){
        return "- Saved as " + name + " index: " + index + "\n";
    }
}
