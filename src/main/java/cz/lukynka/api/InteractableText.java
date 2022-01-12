package cz.lukynka.api;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class InteractableText {

    private TextComponent component;


    public InteractableText(String text, HoverEvent hoverEvent, ClickEvent clickEvent) {

        TextComponent textComponent = new TextComponent(text);
        if(clickEvent != null) textComponent.setClickEvent(clickEvent);
        if(hoverEvent != null) textComponent.setHoverEvent(hoverEvent);

        component = textComponent;
    }


    public InteractableText(){
        this("", (HoverEvent) null, null);
    }

    public InteractableText(String text){
        this(text, (HoverEvent) null, null);
    }

    public InteractableText(String text, String hover){
        this(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), null);
    }

    public InteractableText(String text, String hover, ClickEvent clickEvent){
        this(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), clickEvent);
    }

    public InteractableText(String text, String hover, ClickEvent.Action action, String actionString){
        this(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), new ClickEvent(action, actionString));
    }

    public InteractableText(String text, ClickEvent.Action action, String actionString){
        this(text, (HoverEvent) null, new ClickEvent(action, actionString));
    }

    public InteractableText add(String text, HoverEvent hoverEvent, ClickEvent clickEvent){
        TextComponent textComponent = new TextComponent(text);
        if(clickEvent != null) textComponent.setClickEvent(clickEvent);
        if(hoverEvent != null) textComponent.setHoverEvent(hoverEvent);
        component.addExtra(textComponent);
        return this;
    }

    public InteractableText add(String text){
        return add(text, (HoverEvent) null, (ClickEvent) null);
    }

    public InteractableText add(String text, String hover){
        return add(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), null);
    }

    public InteractableText add(String text, String hover, ClickEvent clickEvent){
        return add(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), clickEvent);
    }

    public InteractableText add(String text, ClickEvent.Action action, String actionString){
        return add(text, (HoverEvent) null, new ClickEvent(action, actionString));
    }

    public InteractableText add(String text, String hover, ClickEvent.Action action, String actionString){
        return add(text, new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(hover)), new ClickEvent(action, actionString));
    }

    public TextComponent getTextComponent(){
        return  this.component;
    }

    public InteractableText send(Player player){
        player.spigot().sendMessage(component);
        return this;
    }

    public InteractableText send(CommandSender sender){
        sender.spigot().sendMessage(component);
        return this;
    }


}
