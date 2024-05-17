package br.com.cursojava.projetofinal.examples;

import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;

// CheckBoxTableCell for creating a CheckBox in a table cell
public class CheckBoxTableCell extends TableCell<Person, Boolean> {

	private final CheckBox checkBox;
	private ObservableValue<Boolean> ov;

	public CheckBoxTableCell() {
		this.checkBox = new CheckBox();
		this.checkBox.setAlignment(Pos.CENTER);
		setAlignment(Pos.CENTER);
		setGraphic(checkBox);
	}

	@Override
	public void updateItem(Boolean item, boolean empty) {

		super.updateItem(item, empty);

		if (empty) {

			setText(null);
			setGraphic(null);

		} else {

			setGraphic(checkBox);

			if (ov instanceof BooleanProperty) {
				checkBox.selectedProperty().unbindBidirectional((BooleanProperty) ov);
			}

			ov = getTableColumn().getCellObservableValue(getIndex());

			if (ov instanceof BooleanProperty) {
				checkBox.selectedProperty().bindBidirectional((BooleanProperty) ov);
			}
		}
	}
}
