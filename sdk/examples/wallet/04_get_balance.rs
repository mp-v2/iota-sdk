// Copyright 2021 IOTA Stiftung
// SPDX-License-Identifier: Apache-2.0

//! cargo run --example get_balance --release
// In this example we sync the account and get the balance
// Rename `.env.example` to `.env` first

use iota_sdk::wallet::{Result, Wallet};

#[tokio::main]
async fn main() -> Result<()> {
    // Create the wallet
    let wallet = Wallet::builder().finish().await?;

    // Get the account we generated with `01_create_wallet`
    let account = wallet.get_account("Alice").await?;

    // Sync and get the balance
    let _account_balance = account.sync(None).await?;
    // If already synced, just get the balance
    let account_balance = account.balance().await?;

    println!("{account_balance:?}");

    Ok(())
}
