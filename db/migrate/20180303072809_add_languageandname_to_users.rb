class AddLanguageandnameToUsers < ActiveRecord::Migration[5.1]
  def change
    add_column :users, :first_name, :string
    add_column :users, :last_name, :string
    add_reference :users, :language, foreign_key: true
  end
end
