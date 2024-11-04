package Prototype;

public class IntelligentStudent extends Student{
    int IQ;

    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.IQ = intelligentStudent.IQ;
    }

    @Override
    public IntelligentStudent clone(){
        //InteligentStudent st = new InteligentStudent();
//        st.setName(this.getName());
//        st.setAge(this.getAge());
//        st.setBatchName(this.getBatchName());
//        st.setAverageBatchPsp(this.getAverageBatchPsp());
//        st.setPsp(this.getPsp());
//        st.IQ = this.IQ;
//        return st;
        return new IntelligentStudent(this);
    }
}
