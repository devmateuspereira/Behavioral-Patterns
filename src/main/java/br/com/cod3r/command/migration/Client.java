package br.com.cod3r.command.migration;

import br.com.cod3r.command.migration.commands.ProductTable;
import br.com.cod3r.command.migration.commands.UserTable;
import br.com.cod3r.command.migration.commands.UserTableRoleColumn;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Map<String, List<String>> database = new LinkedHashMap<>();
        MigrationTool tool = new MigrationTool();
        tool.addMigration(new UserTable(database));
        tool.addMigration(new ProductTable(database));
        tool.addMigration(new UserTableRoleColumn(database));

        System.out.println("--------------- START ---------------");

        System.out.println(database);

        System.out.println("--------------- UP ---------------");

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        System.out.println("--------------- DOWN ---------------");

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        System.out.println("--------------- LATEST ---------------");

        tool.latest();
        System.out.println(database);

        System.out.println("--------------- ROOLBACK ---------------");

        tool.roolback();
        System.out.println(database);
    }

}