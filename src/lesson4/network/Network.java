package lesson4.network;

import java.util.ArrayList;
public class Network {
    public class Member{
        final private String name;
        private ArrayList<Member> friends;

        public Member(String name){
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void leave(){
            //여기까지는 괜춘
            //members.remove(this);이렇게 하면 멤버가 은닉과 캡슐화를 깨버린거라 옳지 않음. network
            unenroll(this);//이게 바른 코드. 실제로는 outer.unenroll~ 인데 outer생략. 캡슐화.
        }
        public boolean belongsTo(Network n){

            return n == Network.this;
        }
    }
    //Network용-----------------------------------
    private ArrayList<Member> members = new ArrayList<>();
    public Member enroll(String name){
        //this == new Network() == net1 == newMember.outer
        Member newMember = this.new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member member){
        members.remove(member);
    }
}
