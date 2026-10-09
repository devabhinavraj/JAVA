class PassByReference {

    public void increment (Element el){
        System.out.println("Before Increment : " + el.val);
        el.val = el.val + 10;
        System.out.println("After Increment : " + el.val);
    }
    
}

class Element{
    int val;
}

class  PassByReferenceCall{
    public static void main(String[] args) {
        Element el = new Element();
        el.val = 20;
        PassByReference obj = new PassByReference();
        System.out.println("Before Calling Increment : " + el.val);
        obj.increment(el);
        System.out.println("After Calling Increment : " + el.val);
    }
}