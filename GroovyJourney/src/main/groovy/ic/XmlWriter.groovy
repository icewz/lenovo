package ic
import groovy.xml.MarkupBuilder
class XmlWriter {
    static main(def args){
        def strXml = new StringWriter()
        MarkupBuilder mb  = new MarkupBuilder(strXml)

        //mb.'?xml'(version:"1.0", encoding:"UTF-8")
        mb.interview{
            data{
                person(id:"05891", comments:"social recruitment"){
                    title{
                        position(code:"P7","Staff SE")
                    }
                    age("29")
                    assessment(interviewer:"manager1", "tech is ok")
                    experience{
                        phase(from:"2012", to:"now", "CompanyA")
                        phase(from:"2010", to:"2012", "CompanyB")
                    }
                }
                person(id:"05892", comments:"campus recruitment"){
                    title{
                        position(code:"P6","SE")
                    }
                    age("25")
                    assessment(interviewer:"manager2", "tech is ok")
                    experience{
                        phase(from:"2012", to:"now", "UniversityA")
                        phase(from:"2011", to:"2012", "CompanyB")
                    }
                }
            }
            interviewInfo{
                date("2016-10-12")
                address("meetingroom 402")
                organizator(dept:"cloud","ZhangSan")
            }
        }
        print strXml

        def xmlFile = "output.xml"
        PrintWriter pw = new PrintWriter(xmlFile)
        pw.write(strXml.toString())
        pw.close()

    }
}
