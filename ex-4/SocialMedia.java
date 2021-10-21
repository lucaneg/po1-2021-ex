abstract class SocialMediaAction {
	private final String author;
	
	protected SocialMediaAction(String author) {
		this.author = author;
	}
	
	public boolean sameAction(SocialMediaAction action) {
		return author.equals(action.author);
	}
}

class Like extends SocialMediaAction {
	private final int likedPostID;

	public Like(String author, int likedPostID) {
		super(author);
		this.likedPostID = likedPostID;
	}
	
	@Override
	public boolean sameAction(SocialMediaAction action) {
		if (!(action instanceof Like))
			return false;
		if (likedPostID != ((Like) action).likedPostID)
			return false;
		return super.sameAction(action);
	}
}

abstract class SocialMediaActionWithText extends SocialMediaAction {
	private final String text;
	
	protected SocialMediaActionWithText(String author, String text) {
		super(author);
		this.text = text;
	}
	
	@Override
	public boolean sameAction(SocialMediaAction action) {
		if (!(action instanceof SocialMediaActionWithText))
			return false;
		if (!text.equals(((SocialMediaActionWithText) action).text))
			return false;
		return super.sameAction(action);
	}
}

class Comment extends SocialMediaActionWithText {
	private final int commentedPostID;
	private final int commentID;

	public Comment(String author, String text, int commentedPostID, int commentID) {
		super(author, text);
		this.commentedPostID = commentedPostID;
		this.commentID = commentID;
	}
	
	@Override
	public boolean sameAction(SocialMediaAction action) {
		if (!(action instanceof Comment))
			return false;
		if (commentedPostID != ((Comment) action).commentedPostID)
			return false;
		if (commentID != ((Comment) action).commentID)
			return false;
		return super.sameAction(action);
	}
}

class Post extends SocialMediaActionWithText {
	private final int postID;

	public Post(String author, String text, int postID) {
		super(author, text);
		this.postID = postID;
	}
	
	@Override
	public boolean sameAction(SocialMediaAction action) {
		if (!(action instanceof Post))
			return false;
		if (postID != ((Post) action).postID)
			return false;
		return super.sameAction(action);
	}
}
