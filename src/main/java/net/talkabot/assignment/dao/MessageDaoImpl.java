package net.talkabot.assignment.dao;
import java.util.List;

import net.talkabot.assignment.model.Message;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("messageDao")
public class MessageDaoImpl extends AbstractDao implements MessageDao{


        public void saveMessage(Message message) {
            persist(message);
        }

        @SuppressWarnings("unchecked")
        public List<Message> findAllMessages() {
            Criteria criteria = getSession().createCriteria(Message.class);
            return (List<Message>) criteria.list();
        }

        public void deleteMessageById(int id) {
            Query query = getSession().createSQLQuery("delete from Employee where id = :id");
            query.setInteger("id", id);
            query.executeUpdate();
        }


        public Message findById(int id){
            Criteria criteria = getSession().createCriteria(Message.class);
            criteria.add(Restrictions.eq("id", id));
            return (Message) criteria.uniqueResult();
        }

        public void updateMessage(Message message){
            getSession().update(message);
        }

}
