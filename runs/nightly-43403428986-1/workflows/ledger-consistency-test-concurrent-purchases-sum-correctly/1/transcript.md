# Transcript: Ten concurrent purchases are all counted, exactly once

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#concurrentPurchasesSumCorrectly` |
| Features | FEAT-LEDGER-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 25 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 523 | `qa-624994eb-9b93-424a-8b75-0bb8ef66bdf5` |
| 11 | `POST /v1/auth/token` | 200 | 61 | `qa-7f93e8dd-2012-47f8-9541-3421dcf33b4a` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-a57b43fa-1a43-443e-8927-ffa3f60007a8` |
| 10 | `POST /v1/auth/token` | 200 | 72 | `qa-cbe66a82-f678-4c2d-b1f2-aafe3f1ffec6` |
| 8 | `POST /v1/auth/token` | 200 | 77 | `qa-0d8c5964-15ac-4cba-9a7e-73e0409aabbb` |
| 6 | `POST /v1/auth/token` | 200 | 85 | `qa-7e45a194-404c-4187-9f7b-9648a8bef38f` |
| 9 | `POST /v1/auth/token` | 200 | 84 | `qa-3eef61da-84ce-4d5c-a14e-6ea489de5bab` |
| 4 | `POST /v1/auth/token` | 200 | 95 | `qa-59a59ab4-1395-4593-8c50-87c9d672d892` |
| 5 | `POST /v1/auth/token` | 200 | 90 | `qa-4a0bf2c4-c462-4d55-9eb2-d5beb129d64d` |
| 3 | `POST /v1/auth/token` | 200 | 113 | `qa-8c7c73ff-79f6-483e-a365-3e6cdff5f9e6` |
| 7 | `POST /v1/auth/token` | 200 | 93 | `qa-92376579-6488-4585-9b0f-a737c6180578` |
| 13 | `POST /v1/credits/purchases` | 201 | 67 | `qa-550c6606-818a-4722-9b57-648e0f2d3296` |
| 12 | `POST /v1/credits/purchases` | 201 | 77 | `qa-a2ff4318-8402-47e0-827d-22cde79673ca` |
| 17 | `POST /v1/credits/purchases` | 201 | 55 | `qa-188fd7a4-8826-432c-bf15-e863c93e12bb` |
| 20 | `POST /v1/credits/purchases` | 201 | 43 | `qa-56a1076c-f964-45c9-afc3-546460757a91` |
| 14 | `POST /v1/credits/purchases` | 201 | 66 | `qa-7b0a6dea-fafe-4ef4-b5ba-ab3106073c33` |
| 18 | `POST /v1/credits/purchases` | 201 | 53 | `qa-7ea2259f-0e69-4376-9231-777ce0470bde` |
| 15 | `POST /v1/credits/purchases` | 201 | 67 | `qa-70f5f796-48b8-4673-a6e3-367a03024627` |
| 21 | `POST /v1/credits/purchases` | 201 | 44 | `qa-73b2df0a-13d9-4703-bdc5-60d52e0ab375` |
| 19 | `POST /v1/credits/purchases` | 201 | 58 | `qa-c1750e8c-d1ac-49d7-9e33-7ba83b68c7ea` |
| 16 | `POST /v1/credits/purchases` | 201 | 81 | `qa-f2d91314-4d07-4805-b504-ad791c7b819f` |
| 22 | `POST /v1/auth/token` | 200 | 41 | `qa-509c498c-6811-4d88-a359-3232ef92beba` |
| 23 | `GET /v1/credits/ledger` | 200 | 84 | `qa-986c4886-dbdd-4d10-8a51-b5bcf4b0e9ca` |
| 24 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-136ff1a7-fc97-4b4b-90ac-d145b6599ead` |
| 25 | `POST /v1/auth/token` | 401 | 43 | `qa-bf90a182-e142-42f0-8a50-1d0d1558cb30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-624994eb-9b93-424a-8b75-0bb8ef66bdf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624994eb-9b93-424a-8b75-0bb8ef66bdf5
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","displayName":"QA ff86ae963c26","password":"****","region":"us"}

--- response: 201 in 523 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-624994eb-9b93-424a-8b75-0bb8ef66bdf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-ff86ae963c26
X-Served-Region: us
Content-Length: 181

{"id":"acc_65595278-8d83-4e28-8811-52a04e0bb397","handle":"qa-ff86ae963c26","displayName":"QA ff86ae963c26","region":"us","role":"user","createdAt":"2026-11-13T09:42:11.307970340Z"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-7f93e8dd-2012-47f8-9541-3421dcf33b4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f93e8dd-2012-47f8-9541-3421dcf33b4a
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f93e8dd-2012-47f8-9541-3421dcf33b4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a57b43fa-1a43-443e-8927-ffa3f60007a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a57b43fa-1a43-443e-8927-ffa3f60007a8
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 81 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a57b43fa-1a43-443e-8927-ffa3f60007a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cbe66a82-f678-4c2d-b1f2-aafe3f1ffec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe66a82-f678-4c2d-b1f2-aafe3f1ffec6
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbe66a82-f678-4c2d-b1f2-aafe3f1ffec6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-0d8c5964-15ac-4cba-9a7e-73e0409aabbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8c5964-15ac-4cba-9a7e-73e0409aabbb
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 77 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8c5964-15ac-4cba-9a7e-73e0409aabbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7e45a194-404c-4187-9f7b-9648a8bef38f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e45a194-404c-4187-9f7b-9648a8bef38f
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 85 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e45a194-404c-4187-9f7b-9648a8bef38f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3eef61da-84ce-4d5c-a14e-6ea489de5bab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eef61da-84ce-4d5c-a14e-6ea489de5bab
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 84 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eef61da-84ce-4d5c-a14e-6ea489de5bab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-59a59ab4-1395-4593-8c50-87c9d672d892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59a59ab4-1395-4593-8c50-87c9d672d892
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 95 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-59a59ab4-1395-4593-8c50-87c9d672d892
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4a0bf2c4-c462-4d55-9eb2-d5beb129d64d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a0bf2c4-c462-4d55-9eb2-d5beb129d64d
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 90 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a0bf2c4-c462-4d55-9eb2-d5beb129d64d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c7c73ff-79f6-483e-a365-3e6cdff5f9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c7c73ff-79f6-483e-a365-3e6cdff5f9e6
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 113 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c7c73ff-79f6-483e-a365-3e6cdff5f9e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-92376579-6488-4585-9b0f-a737c6180578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92376579-6488-4585-9b0f-a737c6180578
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 93 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-92376579-6488-4585-9b0f-a737c6180578
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-550c6606-818a-4722-9b57-648e0f2d3296

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ea93a90ee4bd476582d2f5110b76f270
X-Correlation-Id: qa-550c6606-818a-4722-9b57-648e0f2d3296
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-550c6606-818a-4722-9b57-648e0f2d3296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_08b0356f-604c-4fd3-a137-b018df43fb25
Content-Length: 144

{"id":"pur_08b0356f-604c-4fd3-a137-b018df43fb25","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-13T09:42:12.048721211Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a2ff4318-8402-47e0-827d-22cde79673ca

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0de6723784ae4871a298d61e348124d5
X-Correlation-Id: qa-a2ff4318-8402-47e0-827d-22cde79673ca
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 77 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2ff4318-8402-47e0-827d-22cde79673ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_6f4b59e3-b84a-4059-b95c-7a45462e10e9
Content-Length: 144

{"id":"pur_6f4b59e3-b84a-4059-b95c-7a45462e10e9","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-13T09:42:12.048996905Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-188fd7a4-8826-432c-bf15-e863c93e12bb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c9f0967d678644c9ac12e10a792feef7
X-Correlation-Id: qa-188fd7a4-8826-432c-bf15-e863c93e12bb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-188fd7a4-8826-432c-bf15-e863c93e12bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_1ce11907-4682-4798-9349-84393ee0164b
Content-Length: 144

{"id":"pur_1ce11907-4682-4798-9349-84393ee0164b","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-13T09:42:12.049885203Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-56a1076c-f964-45c9-afc3-546460757a91

--- request headers ---
Accept: application/json
Idempotency-Key: qa-62136ebfda8e48229de22bb68aac9417
X-Correlation-Id: qa-56a1076c-f964-45c9-afc3-546460757a91
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-56a1076c-f964-45c9-afc3-546460757a91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_242b065d-6544-4155-bf55-843acd99bff6
Content-Length: 144

{"id":"pur_242b065d-6544-4155-bf55-843acd99bff6","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-13T09:42:12.049340007Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7b0a6dea-fafe-4ef4-b5ba-ab3106073c33

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ad083d47bf13432daeefef0ce0ddf083
X-Correlation-Id: qa-7b0a6dea-fafe-4ef4-b5ba-ab3106073c33
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 66 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b0a6dea-fafe-4ef4-b5ba-ab3106073c33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_5fd1bde0-9626-4bab-8d31-df8e7474e5db
Content-Length: 144

{"id":"pur_5fd1bde0-9626-4bab-8d31-df8e7474e5db","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-13T09:42:12.059170616Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7ea2259f-0e69-4376-9231-777ce0470bde

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e9e6625104014adc85566200e910a393
X-Correlation-Id: qa-7ea2259f-0e69-4376-9231-777ce0470bde
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 53 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ea2259f-0e69-4376-9231-777ce0470bde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_d8e2207f-9fcd-4efd-b774-08bf4fa3ae23
Content-Length: 144

{"id":"pur_d8e2207f-9fcd-4efd-b774-08bf4fa3ae23","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-13T09:42:12.048585364Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-70f5f796-48b8-4673-a6e3-367a03024627

--- request headers ---
Accept: application/json
Idempotency-Key: qa-442a2a77711747a6a67abe293d473e9b
X-Correlation-Id: qa-70f5f796-48b8-4673-a6e3-367a03024627
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 67 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f5f796-48b8-4673-a6e3-367a03024627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_5f3db154-55ac-4551-934b-416f5300c959
Content-Length: 144

{"id":"pur_5f3db154-55ac-4551-934b-416f5300c959","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:12.048585530Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-73b2df0a-13d9-4703-bdc5-60d52e0ab375

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6d1e369085254279bbcc8271da707d0b
X-Correlation-Id: qa-73b2df0a-13d9-4703-bdc5-60d52e0ab375
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 44 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-73b2df0a-13d9-4703-bdc5-60d52e0ab375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_4720d316-93e2-492d-9092-10873d7af3c3
Content-Length: 144

{"id":"pur_4720d316-93e2-492d-9092-10873d7af3c3","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-13T09:42:12.065683797Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c1750e8c-d1ac-49d7-9e33-7ba83b68c7ea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dfacded23285402f820f737063f8dcec
X-Correlation-Id: qa-c1750e8c-d1ac-49d7-9e33-7ba83b68c7ea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1750e8c-d1ac-49d7-9e33-7ba83b68c7ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_1321af2e-0281-43bd-a6c7-80aa7170d89e
Content-Length: 144

{"id":"pur_1321af2e-0281-43bd-a6c7-80aa7170d89e","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-13T09:42:12.048648873Z"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f2d91314-4d07-4805-b504-ad791c7b819f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bf271b2b31a84b5195eae948f7f5b588
X-Correlation-Id: qa-f2d91314-4d07-4805-b504-ad791c7b819f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2d91314-4d07-4805-b504-ad791c7b819f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_7cbd2ada-8b71-486f-8c17-cd0c0422f045
Content-Length: 145

{"id":"pur_7cbd2ada-8b71-486f-8c17-cd0c0422f045","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-13T09:42:12.073395655Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-509c498c-6811-4d88-a359-3232ef92beba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509c498c-6811-4d88-a359-3232ef92beba
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-509c498c-6811-4d88-a359-3232ef92beba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65595278-8d83-4e28-8811-52a04e0bb397"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-986c4886-dbdd-4d10-8a51-b5bcf4b0e9ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-986c4886-dbdd-4d10-8a51-b5bcf4b0e9ca
Content-Type: application/json

--- response: 200 in 84 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-986c4886-dbdd-4d10-8a51-b5bcf4b0e9ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Encoding: gzip
Content-Length: 759

{"items":[{"id":"led_bb8c24ad-b512-49ee-8d4e-4fe28338e7bd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:11.307987462Z"},{"id":"led_ae7358ed-1e1b-4704-9ea5-d3c5088766e3","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_5f3db154-55ac-4551-934b-416f5300c959","createdAt":"2026-11-13T09:42:12.048585530Z"},{"id":"led_4b4914b8-3ba7-48f5-850f-0c96d14ace46","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_1321af2e-0281-43bd-a6c7-80aa7170d89e","createdAt":"2026-11-13T09:42:12.048648873Z"},{"id":"led_3c05736a-ea07-4ace-b679-56bb98b3ebf0","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_08b0356f-604c-4fd3-a137-b018df43fb25","createdAt":"2026-11-13T09:42:12.048721211Z"},{"id":"led_62378ef5-8b10-4c75-966e-aa62ea100ea9","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_6f4b59e3-b84a-4059-b95c-7a45462e10e9","createdAt":"2026-11-13T09:42:12.048996905Z"},{"id":"led_02721a6c-dd93-4b7a-aaba-0965ef1a6e35","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_d8e2207f-9fcd-4efd-b774-08bf4fa3ae23","createdAt":"2026-11-13T09:42:12.048585364Z"},{"id":"led_094df8a8-dc26-4b3d-95db-9557f64c7e0e","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_242b065d-6544-4155-bf55-843acd99bff6","createdAt":"2026-11-13T09:42:12.049340007Z"},{"id":"led_d0641f10-3b6a-4c17-81d5-6a6cfdf7b9b3","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_1ce11907-4682-4798-9349-84393ee0164b","createdAt":"2026-11-13T09:42:12.049885203Z"},{"id":"led_1164cde0-699a-4a5a-8321-fc72e4f75744","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_5fd1bde0-9626-4bab-8d31-df8e7474e5db","createdAt":"2026-11-13T09:42:12.059170616Z"},{"id":"led_5b8ba292-0667-4e4e-8c06-aaaa6cedb207","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_4720d316-93e2-492d-9092-10873d7af3c3","createdAt":"2026-11-13T09:42:12.065683797Z"},{"id":"led_c9174411-4ab8-4290-b003-80832c94aac6","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_7cbd2ada-8b71-486f-8c17-cd0c0422f045","createdAt":"2026-11-13T09:42:12.073395655Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-136ff1a7-fc97-4b4b-90ac-d145b6599ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136ff1a7-fc97-4b4b-90ac-d145b6599ead
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-136ff1a7-fc97-4b4b-90ac-d145b6599ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 25. POST /v1/auth/token

```text
#25 POST http://localhost:7070/v1/auth/token
correlation: qa-bf90a182-e142-42f0-8a50-1d0d1558cb30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf90a182-e142-42f0-8a50-1d0d1558cb30
Content-Type: application/json

--- request body ---
{"handle":"qa-ff86ae963c26","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf90a182-e142-42f0-8a50-1d0d1558cb30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf90a182-e142-42f0-8a50-1d0d1558cb30"}
```
