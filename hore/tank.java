package hero_class;

public class tank extends hero{
    public tank(String name,int blood,int defense,int commonAttack,int skill1,int skill2){
        this.name=name;
        this.blood=blood;
        this.defense=defense;
        this.commonAttack=commonAttack;
        this.skill1=skill1;
        this.skill2=skill2;
    }
    @Override
    public void commonAttack(hero player) {
        super.commonAttack(player);
        player.blood= player.blood+defense-commonAttack;
        if(player.blood>0){
            System.out.println(player.name+"现在还剩下血量"+player.blood);
        }
        if(player.blood<0){
            System.out.println(player.name+"死亡"+","+name+"获胜");
        }
    }

    @Override
    public void skillOne(hero player) {
        super.skillOne(player);
        player.blood= player.blood+defense-skill1;
        if(player.blood>0){
            System.out.println(player.name+"现在还剩下血量"+player.blood);
        }
        if(player.blood<0){
            System.out.println(player.name+"死亡"+","+name+"获胜");
        }
    }

    @Override
    public void skillTwo(hero player) {
        super.skillTwo(player);
        player.blood= player.blood+defense-skill2;
        if(player.blood>0){
            System.out.println(player.name+"现在还剩下血量"+player.blood);
        }
        if(player.blood<0){
            System.out.println(player.name+"死亡"+","+name+"获胜");
        }
    }
}
