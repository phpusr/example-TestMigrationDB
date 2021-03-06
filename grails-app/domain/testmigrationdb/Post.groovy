package testmigrationdb

/**
 * Пример: http://wpgreenway.com/posts/grails-db-migration-tutorial/
 */
class Post {

    String title
    String body
    String author
    Date dateCreated

    static mapping = {
        body type: 'text'
    }

    static constraints = {
        title(nullable: true)
        body(nullable: true)
        author(nullable: true)
    }

}
